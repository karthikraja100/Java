package exceptions;

public class CustomExample {
	static void checkAge(int age)throws AgeException{
		if(age < 18) {
			throw new AgeException("Wrong age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(17);
		}catch(AgeException e){
			System.out.println("Error "+e.getMessage());
		}
	}

}
