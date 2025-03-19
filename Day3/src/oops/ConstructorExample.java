package oops;
class Car{
	String brand;
	/*Car(String s){
		brand="Unique";
	}*/
	Car(String s){
		this.brand=s;
	}
	void display() {
		System.out.println("The Brand Name is "+brand);
	}
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c1 = new Car();
		Car c2 = new Car("helo");
		c2.display();
	}

}
