class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int completionTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    private ProcessNode head = null;
    private int timeQuantum;
    private int currentTime = 0;
    private int processCount = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // 1. Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        processCount++;

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // 2. Remove process by PID
    private void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr.next == head) {
            head = null;
        } else {
            if (curr == head) {
                head = head.next;
            }
            prev.next = curr.next;
        }
        processCount--;
    }

    // 3. Simulate Round Robin Scheduling
    public void execute() {
        if (head == null) {
            System.out.println("No processes to execute.");
            return;
        }

        ProcessNode curr = head;
        ProcessNode prev = null;

        System.out.println("\n--- Round Robin Scheduling Start ---");

        while (processCount > 0) {
            System.out.println("\nCurrent Time: " + currentTime);
            displayProcesses();

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
                prev = curr;
                curr = curr.next;
            } else {
                currentTime += curr.remainingTime;
                curr.remainingTime = 0;
                curr.completionTime = currentTime;

                System.out.println("Process P" + curr.pid + " completed at time " + currentTime);

                removeProcess(prev, curr);
                curr = (prev == null) ? head : prev.next;
            }
        }

        System.out.println("\n--- Scheduling Completed ---");
    }

    // 4. Display Processes
    private void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("P" + temp.pid +
                    " | Remaining Time: " + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // 5. Calculate Average Times
    public void calculateTimes(ProcessNode[] processes) {
        double totalWT = 0, totalTAT = 0;

        System.out.println("\nPID\tBurst\tCompletion\tTurnaround\tWaiting");

        for (ProcessNode p : processes) {
            int tat = p.completionTime;
            int wt = tat - p.burstTime;

            totalWT += wt;
            totalTAT += tat;

            System.out.println("P" + p.pid + "\t" + p.burstTime + "\t" +
                    p.completionTime + "\t\t" + tat + "\t\t" + wt);
        }

        System.out.println("\nAverage Waiting Time = " + (totalWT / processes.length));
        System.out.println("Average Turnaround Time = " + (totalTAT / processes.length));
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {

        int timeQuantum = 4;
        RoundRobinScheduler scheduler = new RoundRobinScheduler(timeQuantum);

        // Store original processes for calculation
        ProcessNode[] processes = new ProcessNode[]{
                new ProcessNode(1, 10, 1),
                new ProcessNode(2, 5, 2),
                new ProcessNode(3, 8, 1)
        };

        // Add processes to scheduler
        for (ProcessNode p : processes) {
            scheduler.addProcess(p.pid, p.burstTime, p.priority);
        }

        scheduler.execute();
        scheduler.calculateTimes(processes);
    }
}
