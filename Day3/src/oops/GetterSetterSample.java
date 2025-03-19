package oops;
class Data{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid");
		}
	}
}
public class GetterSetterSample {
public static void main(String []args) {
	Data d1=new Data();
	d1.setName("Karthik");
	System.out.println("Student Name: "+d1.getName());
}
}
