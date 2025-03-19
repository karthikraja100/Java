package oops;
class Stu{
	public String name ="Raja";
	private int age=20;
	protected String grade="A";
	String school ="ABC School";
	
	public void display() {
		System.out.println("Name:"+name+"\nAge:"+age+"\nGrade:"+grade+"\nSchool:"+school);
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1 = new Stu();
		s1.display();
		
		System.out.println("Public Name :"+s1.name);
		System.out.println("Default School :"+s1.school);

	}

}
