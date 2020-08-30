package day39lambda;

import java.util.ArrayList;
import java.util.List;

public class L02 {
	
	private static boolean isDivisibleByThree(int t) {
		return t%3==0;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		list.
			stream().
			filter(t->t%2==0).
			map(t->t*t*t).
			forEach(t->System.out.print(t+" "));
		
		System.out.println("\n--------------------------------------------");
		
		int sum=list.
					stream().
					reduce(0, (t,u)->t+u);
		System.out.print(sum);
		
		System.out.println("\n--------------------------------------------");
		
		int product=list.
						stream().
						filter(t->t%2==1).
						reduce(1,(t,u)->t*u);
		System.out.print(product);
		
		System.out.println("\n--------------------------------------------");
		
		int chamber=list.
						stream().
						filter(L02::isDivisibleByThree).
						map(t->t+2).
						reduce(0, (t,u)->t+u);
		System.out.print(chamber);
		
		System.out.println("\n--------------------------------------------");
		
		list.
			stream().
			distinct().
			forEach(System.out::print); /*
										  t->System.out.print(t+" ") ==> Lambda Expression
										  Lambda Expression kullanadilirsiniz ama daha guzeli mumkunse "Method Reference" kullanin
										  Method Reference ==> Class Ismi :: Method Ismi
										*/
		
	}

}
