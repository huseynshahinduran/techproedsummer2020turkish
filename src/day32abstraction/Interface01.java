package day32abstraction;

public interface Interface01 {

	 //interface icine concrete method yazarsaniz Compile Time Error alirsiniz.
    //Interface'de method olustururken kesinlikle body yazmayin.
   //Interface'deki method'lar kesinlikle abstract olmalidir.
  //interface'deki abstract methodlari uretirken abstract keyword kullansaniz da olur
 //kullanmasaniz da olur. Cunku Interface kendi icine yazilan methodlari otomatik olarak
//abstract olarak kabul eder.	
	
	public void add();
	public abstract void subtract();
	
	/*
	 * Interface de variable'lar mutlaka: public, static, final olmali ve mutlaka
	 * initialize (deger atanmali) edilmelidirler.
	 * Variabel olusturulurken public, static, final keywordleri kullanilsa da olur
	 * kullanilmasa da olur. public, static, final keywordleri kullanildiginda da 
	 * kullanilmadiginda da variable public, static ve final dir.
	 */
	
	public static final int a=12;
	int b=11;
	public int c=13;
	final int d=14;
	static int e=15;
	
}
