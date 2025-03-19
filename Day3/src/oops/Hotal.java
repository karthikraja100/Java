package oops;
import java.util.*;
class Recipe{
	void menu() {
		Scanner s1 = new Scanner(System.in); 
		System.out.println("Today Special \n1.Pizza \n2.Burger \n3.Pasta");
		int ch = s1.nextInt();
		switch(ch) {
		case 1:
			int Pizza =200;
			System.out.println("Quantity : ");
			int pqty = s1.nextInt();
			System.out.println("Price : "+(Pizza*pqty));
			break;
		case 2:
			int Burger =150;
			System.out.println("Quantity : ");
			int bqty = s1.nextInt();
			System.out.println("Price : "+(Burger*bqty));
			break;
		case 3:
			int pasta =100;
			System.out.println("Quantity : ");
			int pq = s1.nextInt();
			System.out.println("Price : "+(pasta*pq));
			break;
		default:
			System.out.println("Wrong Choice!!");
		}
		s1.close();
	}
}
public class Hotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe r = new Recipe();
		r.menu();
	}

}
