package day14dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {

		//do-while ile while loop'larinin farki
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tamsayi giriniz:");
		
		int num1 = scan.nextInt();
		
		
		while(num1<7) {
			System.out.println("While: "+num1); //6
			num1++;
		}
		
		
		do {
			System.out.println("Do while: "+num1); //6
			num1++;
		}while(num1<7);
		
		scan.close();
	}

}
