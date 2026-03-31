package markerInterface;

class Student implements Cloneable{
	String name;
	int id;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return "Student [ Id  : " + id + " , Name :" + name  +" ]";
	}
}
public class CloningObject {
	public static void main(String args[])  throws CloneNotSupportedException{
		Student s1 = new Student(101, "harit");
		Student s2 = (Student) s1.clone();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
