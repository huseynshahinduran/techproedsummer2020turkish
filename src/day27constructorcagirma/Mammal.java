package day27constructorcagirma;

public class Mammal extends Animal{
	
	public boolean dogum=true;

	public static void main(String[] args) {
		
//		Mammal mammal=new Mammal();
		Mammal mammal01=new Mammal(15);

	}
	
	public void feed() {
		System.out.println("Cocuklarini besler.");
	}
	
	Mammal(){
		this(11);
		System.out.println("Mammal parametresiz constructor.");
	}
	
	Mammal(int age){
		super();//Parent'daki parametresiz constructor'i cagir
		       //super() keyword'unu kullanmasaniz da olur ama bazilari kullanir sasirmayin
              //super() kullanilacaksa mutlaka ilk satirda olmalidir
		     //super() ve this() ayni constructor'in icinde ayni anda kullanilamaz.
		    //Cunku ikisininde ilk satirda olma zorunlulugu 
		System.out.println("Mammal parametreli constructor.");
	}
	
   

}
