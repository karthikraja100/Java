package oops;
class Animal{
	void sound() {
		System.out.println("Animal makes Sound");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog Barks");
	}
}

class Puppy extends Animal{
	void puppy() {
		System.out.println("Puppy Cries");
	}
}
public class InheritanceDemo {
public static void main(String[]args) {
	Puppy d1=new Puppy();
	Dog d2=new Dog();
	d1.sound();
	d2 .bark();
	d1.puppy();
}
}
