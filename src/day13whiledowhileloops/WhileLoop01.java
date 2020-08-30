package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args) {

		//while loop kullanarak ilk 5 syama sayisinin toplamini ekrana
		//yazdirin program yaziniz.
		
		
		
		int num1 = 1;
		int sum1 = 0;
		
		while(num1<6) {
			sum1=sum1+num1;
			num1++;
		}
		
		System.out.println(sum1);
	
	}

}
