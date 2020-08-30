package day17constructors;

public class Constructors01 {

	String isim = "Ali Can";
	int yas = 33;
	
	//Method ile main method ayni class'da ise methodu sadece ismini yazarka kullanabilirsiniz.
	public static void main(String[] args) {
		buyume(33);

	}

	public static void buyume(int yas) {
		yas++;
		System.out.println(yas);
	}
	
	public static void isimDegistirme(String isim) {
		System.out.println(isim);
	}
}
