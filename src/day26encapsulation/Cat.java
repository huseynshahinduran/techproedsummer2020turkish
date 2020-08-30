package day26encapsulation;

public class Cat extends Mammal{
	
	public boolean clean=true;

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		
		System.out.println("Animal Class'dan geldi: "+cat.age);
		System.out.println("Animal Class'dan geldi: "+cat.name);
		cat.eat();
		cat.move();
		
		System.out.println();
		
		System.out.println("Mammal Class'dan geldi: "+cat.dogum);
		cat.feed();
		
		System.out.println();
		
		System.out.println("Animal Class'dan geldi: "+cat.clean);
		cat.meow();
		

	}
	
	public void meow() {
		System.out.println("Kediler miyavlar.");
	}

}
