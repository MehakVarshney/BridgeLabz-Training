package functionalInterface;

public class BackgroundJobExecution {
	public static void main(String args[]) {
		Runnable bgTask = new Runnable() {
			public void run() {
				System.out.println("Background Task started");
				try {
					Thread.sleep(200);
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Task interrupted");
				}
				System.out.println("Background job completed");
			}
		};

		Thread workThread = new Thread(bgTask);
		workThread.start();
		System.out.println("Thread continue execution.");
	}
}
