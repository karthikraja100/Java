package stringmethods;

public class SplitExample {

	public static void main(String[] args) {
		// splits the string into an array of substings based on delimiter or regular Expression
		String str="Java,Python,Flask,SpringBoot";
		String[]languages=str.split(",");
		for(String lang:languages) {
			System.out.println(lang);
		}

	}

}
