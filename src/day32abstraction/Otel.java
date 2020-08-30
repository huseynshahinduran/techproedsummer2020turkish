package day32abstraction;

public abstract class Otel {

	public static void main(String[] args) {

		/*
		 * Herhangi bir parent tarafindan override edilen abstract method alttaki 
		 * concrete child’lar tarafindan override edilmese de olur.
		 */
		
	}
	
	public abstract void kahvalti();
	
	public int wifi(int kisiSayisi) {
		return kisiSayisi*2;
		
		
	}

}
