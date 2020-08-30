package day09switchoperator;

import java.util.Scanner;

public class ArtikYilTernaryInterview {

	public static void main(String[] args) {
		
		//Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil”
		//yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yil giriniz:");
		int year = scan.nextInt();
		int month=scan.nextInt();
		
		String result = (year%400==0) ? (year%100==0 ? "Artik yil" : "Artik yil degil") : (year%4==0 ? "Artik yil" : "Artik yil degil");   
		
//		System.out.println(result);
		
		if(result.equals("Artik yil")){
		  	  switch(month){
		  	    case 1:
		  	      System.out.println(year+" yili Ocak ayi 31 gun");
		  	      break;
		  	   case 2:
		  	      System.out.println(year+" yili Subat ayi 28 gun");
		  	      break;
		  	   case 3:
		  	      System.out.println(year+" yili Mart ayi 31 gun");
		  	      break;
		  	   case 4:
		  	      System.out.println(year+" yili Nisan ayi 30 gun");
		  	      break;
		  	   case 5:
		  	      System.out.println(year+" yili Mayis ayi 31 gun");
		  	      break;
		  	   case 6:
		  	      System.out.println(year+" yili Haziran ayi 30 gun");
		  	      break;
		  	   case 7:
		  	      System.out.println(year+" yili Temmuz ayi 31 gun");
		  	      break;
		  	   case 8:
		  	      System.out.println(year+" yili Agustos ayi 31 gun");
		  	      break;
		  	   case 9:
		  	      System.out.println(year+" yili Eylul ayi 30 gun");
		  	      break; 
		  	   case 10:
		  	      System.out.println(year+" yili Ekim ayi 31 gun");
		  	      break;
		  	   case 11:
		  	      System.out.println(year+" yili Kasim ayi 30 gun");
		  	      break;
		  	   case 12:
		  	      System.out.println(year+" yili Aralik ayi 31 gun");
		  	      break; 
		  	   default:
		  	   System.out.println();
		  	  }
		  	  
		  	}else {
		  	  		  	  switch(month){
		  	    case 1:
		  	      System.out.println(year+" yili Ocak ayi 31 gun");
		  	      break;
		  	   case 2:
		  	      System.out.println(year+" yili Subat ayi 29 gun");
		  	      break;
		  	   case 3:
		  	      System.out.println(year+" yili Mart ayi 31 gun");
		  	      break;
		  	   case 4:
		  	      System.out.println(year+" yili Nisan ayi 30 gun");
		  	      break;
		  	   case 5:
		  	      System.out.println(year+" yili Mayis ayi 31 gun");
		  	      break;
		  	   case 6:
		  	      System.out.println(year+" yili Haziran ayi 30 gun");
		  	      break;
		  	   case 7:
		  	      System.out.println(year+" yili Temmuz ayi 31 gun");
		  	      break;
		  	   case 8:
		  	      System.out.println(year+" yili Agustos ayi 31 gun");
		  	      break;
		  	   case 9:
		  	      System.out.println(year+" yili Eylul ayi 30 gun");
		  	      break; 
		  	   case 10:
		  	      System.out.println(year+" yili Ekim ayi 31 gun");
		  	      break;
		  	   case 11:
		  	      System.out.println(year+" yili Kasim ayi 30 gun");
		  	      break;
		  	   case 12:
		  	      System.out.println(year+" yili Aralik ayi 31 gun");
		  	      break; 
		  	   default:
		  	   System.out.println();
		  	  }
		  	}	
		
		scan.close();

	}

}
