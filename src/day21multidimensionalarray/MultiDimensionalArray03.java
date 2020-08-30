package day21multidimensionalarray;

public class MultiDimensionalArray03 {

	public static void main(String[] args) {
		// arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} } veriliyor.
       // Bu iki array’in tum elemanlarinin toplamini bulan programi yaziniz.		
		
		int arr1[][]= { {1,2}, {3,4,5}, {6} }; //21
		int arr2[][]= { {7,8,9}, {10,11}, {12} }; //57
		
		int sum=0;
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[i].length; j++) {
				sum=sum+arr1[i][j];
			}
			
		}
		
		for(int a=0; a<arr2.length; a++) {
			
			for(int b=0; b<arr2[a].length; b++) {
				sum=sum+arr2[a][b];
			}
			
		}
		
		System.out.println("Tum elemanlarin toplami: " + sum); //78
		
		
		
		
	}

}
