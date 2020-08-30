package day26encapsulation;

public class Dog extends Mammal{
	
	public boolean sadik=true;

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		System.out.println("Animal Class'dan geldi: "+dog.age);//0
		System.out.println("Animal Class'dan geldi: "+dog.name);//null
		dog.eat();//Yemek yer.
		dog.move();//Haraket edebilir.
		
		System.out.println();
		
		System.out.println("Mammal Class'dan geldi: "+dog.dogum);//true
		dog.feed();//Cocuklarini besler.
		
		System.out.println();
		
		System.out.println("Dog Class'dan geldi: "+dog.sadik);//true
		dog.bark();//Kopek havlar.

	}
	
	public void bark() {
		System.out.println("Kopek havlar.");
	}

}
