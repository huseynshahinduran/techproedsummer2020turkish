package day21multidimensionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		// Second way
		
		int arr[][] = { {1,2}, {3}, {4,5,6} };
		
		System.out.println(Arrays.deepToString(arr)); //[[1, 2], [3], [4, 5, 6]]
		//2,3 ve 6 nin toplamini ekrana yazdiriniz.
		System.out.println("2+3+6=" + (arr[0][1] + arr[1][0] + arr[2][2])); //11
		
		//arr arrayindeki tum elemanlarin toplamaini veren programi yaziniz.
		System.out.println("1+2+3+4+5+6=" + (arr[0][0] + arr[0][1] + arr[1][0] + arr[2][0] + arr[2][1] + arr[2][2]));
		
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Tum elemanlarin toplami: " + sum);

		
		
		
		
		
		
	}

}
