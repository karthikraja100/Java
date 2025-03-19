package oops;
class Book{
	int bid;
	String title,author;
	double price;
	
	Book(int bid,String title,String author,double price){
		this.bid=bid;
		this.title=title;
		this.author=author;
		this.price=price;	
	}
	void display() {
		System.out.println("Bid:"+bid+"\nAuthor:"+author+"\nTitle:"+title+"\nPrice:"+price+"\n**********************");
	}
}
public class Library {
public static void main(String[]args) {
	
	Book b1 = new Book(101,"CPP","BalaGuruSwamy",499.9);
	Book b2 = new Book(102,"C","GuruSwamy",499.9);
	Book b3 = new Book(103,"Java","Gopal",499.9);
	System.out.println("Library\n");
	b1.display();
	b2.display();
	b3.display();
}
}
