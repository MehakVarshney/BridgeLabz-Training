public class DividePensEqually {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is "+ pensPerStudent+ " and Remaining Pens not distributed are " + remainingPens);
    }
    
}
