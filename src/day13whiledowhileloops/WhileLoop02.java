package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {

		//Ilk 5 sayma sayisinin carpiminin sonucunu ekrana yazdiran
		//program yazin.
		
		
		int num = 1;
		int product = 1;
		
		while(num<6) {
			product = product*num;
			num++;
		}
		
		System.out.println("Sonuc: "+product);

		
	}

}
