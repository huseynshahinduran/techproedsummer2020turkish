package day11stringmethod;

public class ForLoop01 {

	public static void main(String[] args) {

		//4, 3, ve 2 yi ekrana yazdiran bir for loop olusturunuz.
		
		for(int i=6; i>-2; i--) {
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		//3, 4, 5, 6, 7 sayilarini ekrana yazdirin for loop olusturun
		//Baslangic degeri kucuk bitis degeri buyuk ise n++, aksi durumda n-- kullanin.
		
		for(int n=3; n<8; n++ ) {
			System.out.println(n);
		}
		
		System.out.println("-------------------------");
		
		//Ilk 100 sayma sayisini ekrana yan yana yazdiran ve aralarina bosluk koyan programi
		//for loop kullanarak yazin
		
		for(int a=1; a<101; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		
		for(int b=100; b>0; b--) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
		//ilk 50 cift sayma sayisini ekrana yazdirin for loop olusturunuz
		//2, 4, 6,......100
		
		for(int m=2; m<101; m=m+2) {
			System.out.print(m+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//ilk 50 tek sayma sayisini ekrana yazdirin for loop olusturunuz
         //1,3,5,..........99
		
		for(int t=1; t<100; t=t+2) {
			System.out.print(t+" ");
		}

		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
	}

}
