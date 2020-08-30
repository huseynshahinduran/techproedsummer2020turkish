package day19arrays;

public class Arrays01 {

	
	
	
	public static void main(String[] args) {

	//Ineteger Array olusturalim	
		
		int arr1[]=new int[5];
		
		//System.out.println(arr1[0]); ==> Array'in reference'ini verir.
		//System.out.println(arr1[2]); ==> Array'in index'i 2 olan elamanini ekrana yazdirir
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		

		arr1[0]=12;
		System.out.println(arr1[0]);
		
		arr1[4]=52;
		System.out.println(arr1[4]);
		
		arr1[1]=22;
		System.out.println(arr1[1]);
		
		arr1[2]=32;
		System.out.println(arr1[2]);
		
		arr1[3]=42;
		System.out.println(arr1[3]);
		
		System.out.println("----------------");
		
		//Array'deki elemanlari ekrana yazdirmak icin for dongusu kullaniniz
		
		for(int i=0; i<5; i++) {
			System.out.println(arr1[i]);
		}
		
		//Array'de olamyan index'e deger atamasi yapilirsa "Run Time Error" alinir.
	   //Array'de olmayan indexi kullanmaya calisirsak "ArrayIndexOutOfBoundsException" aliriz.
		
		arr1[5]=62;
		System.out.println(arr1[5]);
		
		
	}
	
	
	

}
