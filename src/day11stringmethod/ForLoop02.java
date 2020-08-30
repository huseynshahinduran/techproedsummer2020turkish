package day11stringmethod;

public class ForLoop02 {

	public static void main(String[] args) {
         
		//100 den kucuk 3 un kati olan sayma sayilarini ekrana yan yana yazdiran for loop olusturunuz
		
		for(int t=3; t<99; t=t+3) {
			System.out.print(t+" ");
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		
		//Ilk 5 sayma sayisinin toplamini veren programi for loop ile yaziniz
		//1,2,3,4,5
		//int sum=0 0+1 =1 ==> 1+2=3 ==> 3+3=6 ==> 6+4=10 ==> 10+5=15 
		
		int sum = 0;
		for(int i=1; i<6; i++) {
			sum = sum+i; 
					
		}
		    System.out.println("  Toplam: "+sum);
		 System.out.println();    
		       System.out.println("--------------------------");
		
		//10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop yaziniz.
		       
		       int sum2 = 0;
		       for(int a=11; a<14; a++) {
		    	   sum2 = sum2+a;
		       }
		          System.out.println("  Toplam: "+sum2);
		
		          
		          System.out.println();    
			       System.out.println("--------------------------");
		          
		          //220 den buyuk ilk 5 sayma sayisinin toplamini veren for loop olusturunuz.
		          
		          int sum3 = 0;
		          for(int n=21; n<26; n++) {
		        	  sum3 = sum3+n;
		          }
		            System.out.println("  Toplam: "+sum3);
		            
		            System.out.println();    
				       System.out.println("--------------------------");
				       
				 //Ilk 50 sayma sayisinin toplamini ver for loop olusturunuz
				       
				       int sum4 = 0;
				       for(int s=1; s<51; s++) {
				    	   sum4 = sum4+s;
				       }
		      System.out.println("  Toplma: "+sum4);
		
		      System.out.println();    
		       System.out.println("--------------------------");
		      
		      //5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren foor loop olusturunuz
		       
		     int sum5=0;
		     for(int x=5; x<100; x=x+5) {
		    	 sum5=sum5+x;
		     }
		System.out.println("  Toplam: "+sum5);
		
		
		
	}

}
