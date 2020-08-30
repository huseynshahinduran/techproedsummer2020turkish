package day33interface;

public interface IcAraba {
	
	int price=2000;
	boolean old=true;
	
	public abstract void direksiyon();
	
	public void koltuk();
	
	abstract void klima();
	
	/*
	 * default keyword'unu 
	 */
	public default void doseme() {
		System.out.println("Interface'de default keyword ile doseme yaptim.");
	}
	
	

}
