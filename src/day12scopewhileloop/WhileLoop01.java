package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

		//while = iken demektir. 
		//While I go to school. ==> Ben okula gideriken.
		//While I go to Uskudar, it rained.
		
		
		int num = 0;
		
		//num 4 ten kucuk iken 
		while(num<4) {//Parantez icindeki codition true oldugu surece while loop calisir.
			System.out.println("Ali");
			num++; //Bu satiri unutursaniz while loop sonsuz donguye girer. *Unutmayiniz.
		}
		
		//While loop kullanarak 1 den 10 kadar tam sayilari ekrana yazdiriniz.
		
	    int num1 = 1;
	    while(num1<11) {
	    	System.out.print(num1+" ");
	    	num1++;
	    }
	    
	    System.out.println();
		
		//while loop kullanarak 1 den 20 ye kadar cift tamsayilari ekrana yazdiriniz
	    
	    int num2 = 1;
	    
	    while(num2<21) {
	    	if(num2%2==0) {
	    		System.out.print(num2+" ");
	    	}
	    	num2++;
	    }
	    
	    System.out.println();
	    
		//while loop kullanarak 5 den 120 ye kadar 3 ile bolunebilen tamsayilari ekrana yazdiriniz

		int num3 = 5;
		while(num3<121) {
			if(num3%3==0) {
				System.out.print(num3+" ");
			}
			num3++;
		}
		
		
		
		
		
	}

}
