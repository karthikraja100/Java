package oops;

class Student{
	String name;
	int rno;
	String dept;
	
	void display() {
		System.out.println("My Name is "+name);
		System.out.println("My rno is "+rno);
		System.out.println("My dept is "+dept);
		
	}
}

public class ClsObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Karthik";
		s1.dept="M.Sc.SS";
		s1.rno=14;
	
		s1.display();
	}

}
