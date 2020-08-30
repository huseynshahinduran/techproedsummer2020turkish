package day11stringmethod;

public class ForLoop03 {

	public static void main(String[] args) {

		//Ilk 4 sayma sayisinin carpini veren for loop olusturunuz.
		//1,2,3,4 ==> 1*2*3*4=24
		
		int product = 1;
		for(int i=1; i<5; i++) {
			product = product*i;
		}
		System.out.println("  Carpimi: "+product);
		
		 System.out.println();    
	       System.out.println("--------------------------");
	       
	       //ilk 6 cift sayma sayisinin carpimini veren for loop olusturunuz
	       //2,4,6,8,10,12
	       int product1 = 1;
	       for(int num1=2; num1<13; num1=num1+2) {
	    	   product1 = product1*num1;
	       }
		System.out.println("  Carpimi: "+product1);
		
		 System.out.println();    
	       System.out.println("--------------------------");
	       
	       //Matamatikte 1 er 1 er geri sayim yapip carpmaya faktoryel denir.
	       //6!=6*5*4*3*2*1
	       //Interview lerde sorarlar
	       
	       //9! li hesaplayan programi for loop kullanarak yaziniz.
	       
	       int producter2 = 1;
	       for(int num2=1; num2<10; num2++) {
	    	   producter2 = producter2*num2;
	       }
	       System.out.println("  Carpimi: "+producter2+" ==> 9!");
		
	       System.out.println();    
	       System.out.println("--------------------------");
	       
	       
		
		
	}

}
