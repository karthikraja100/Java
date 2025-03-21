package exceptions;
class Eg2{
	 static void checkAge(int age) {
		if(age <18) {
			throw new IllegalArgumentException("Age must be 18 or older");
		}
		System.out.println("Access granted");
	}
}
public class HandlingExample {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eg2 eg = new Eg2();
		try {
			int num =10/0;
			eg.checkAge(17);
		}catch(ArithmeticException e) {
			System.out.println("Cannot Divisible "+e.getMessage());
		}catch (IllegalArgumentException e1) {
            System.out.println("Error: " + e1.getMessage());
        }finally {
			System.out.println("Excecuted ");
		}

	}

	

}
