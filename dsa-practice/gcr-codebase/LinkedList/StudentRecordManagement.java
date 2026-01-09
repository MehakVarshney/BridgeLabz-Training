class StudentNode{
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

     StudentNode(int rollNo,String name, int age, char grade) {
         this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }   
}

class StudentLinkedList{
    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int rollNo,String name,int age,char grade){
        StudentNode newNode= new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning");
    }

    //  At at end
    public void addAtEnd(int rollNo,String name,int age,char grade){
        StudentNode newNode= new StudentNode(rollNo, name, age, grade);

        if(head == null){
            head= newNode;
            return;
        }

        StudentNode temp= head;
        while(temp.next != null){
            temp= temp.next;
        }
        temp .next= newNode;
        System.out.println("Student addes at end");
    }


// Add at specific postion 
 
 public void addAtPosition(int position, int rollNo, String name, int age, char grade){
    if(position ==1){
        addAtBeginning(rollNo,name,age,grade);
        return;
    }

    StudentNode newNode= new StudentNode(rollNo, name, age, grade);
    StudentNode temp= head;

    for(int i =1;i<position-1 && temp != null ;i++){
        temp=temp.next;
    }

    if(temp == null){
        System.out.println("Invalid Position");
        return;
    }
    newNode.next= temp.next;
    temp.next= newNode;
    System.out.println("Student added at position " + position);
 }

 //  Delete by Roll Number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted.");
        }
    }

    // Search by Roll Number
    public void searchStudent(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    
    // Update Grade
    public void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }


   // Display All Students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    // Helper method
    private void displayStudent(StudentNode s) {
        System.out.println("Roll No: " + s.rollNo +
                ", Name: " + s.name +
                ", Age: " + s.age +
                ", Grade: " + s.grade);
    }
}

class StudentRecordManagement{
    public static void main(String[] args) {
    StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Amit", 20, 'A');
        list.addAtEnd(102, "Rohit", 21, 'B');
        list.addAtPosition(2, 103, "Neha", 19, 'A');

        System.out.println("\nAll Students:");
        list.displayAll();

        System.out.println("\nSearch Student:");
        list.searchStudent(102);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(103, 'A');

        System.out.println("\nDelete Student:");
        list.deleteByRollNo(101);

        System.out.println("\nFinal Student List:");
        list.displayAll();
    }
}