package stringmethods;

public class InternExample {
		/*Returns the Interned String
			It returns the canonical representation of string
			It can be used to return String from memory if it is created by a new keyword
			It creates an exact copy of the heap string obj in the string constpool*/
	public static void main(String[]args) {
		String s1=new String("JavaDeveloper");
		String s2="JavaDeveloper";
		String s3=s1.intern();
		System.out.println(s1==s2);
		System.out.println(s2==s3);		
	}

}
