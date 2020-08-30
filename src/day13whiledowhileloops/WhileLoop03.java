package day13whiledowhileloops;

public class WhileLoop03 {

	public static void main(String[] args) {

		//3 un carpim tablosunu ekrana yazdiran programi yaziniz.
	
		
		
	//1. yontem:	
		
		System.out.println("1. Yontem For Loop:");
		for(int i=1; i<11; i++) {
			System.out.println("3x"+i+"="+(3*i));
		}
	
		System.out.println();
		System.out.println("-------------------------");
/////////////////////////////////////////////////////////		
		System.out.println();
		
	//2. yontem:	
		System.out.println("2. Yontem While Loop:");
		
		int num=1;
		while(num<11) {
			System.out.println("3x"+num+"="+(3*num));
           num++;
		}
		
		
		
		
		
		
		
		
	}

}
