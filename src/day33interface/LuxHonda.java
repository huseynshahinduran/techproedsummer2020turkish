package day33interface;

public class LuxHonda extends Araba implements IcAraba, DisAraba{

	public static void main(String[] args) {

		LuxHonda luxHonda=new LuxHonda();
		luxHonda.benzin();
		luxHonda.direksiyon();
		luxHonda.klima();
		luxHonda.kapi();
		luxHonda.koltuk();
		luxHonda.move();
		System.out.println("Ic tasarim ucreti: "+IcAraba.price);//2000
		System.out.println("Dis tasarim ucreti: "+DisAraba.price);//3000
		System.out.println(old);//Iki tane old isimli variable olmadigindan 
		                       //interface adini kullanmaya gerek yok.
		luxHonda.doseme();
	}

	@Override
	public void kapi() {
		System.out.println("Parmak izi ayarli kapi.");	
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri direksiyon.");	
	}

	@Override
	public void koltuk() {
		System.out.println("Isitmali deri koltuk.");
	}

	@Override
	public void klima() {
		System.out.println("Digital klima");	
	}

	@Override
	public void move() {
		System.out.println("3 saniyede 100km'lik hiza ulasir.");	
	}


	
	

}
