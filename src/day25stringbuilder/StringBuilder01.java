package day25stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		/*
		 * StringBuilder class'i String uretmeye ve uretilen String'leri manipule 
		 * etmeye yarar.  
	    */
		
		/*
		 * String class'i kullanarak String uretirseniz yaptiginiz degisiklikler
		 * ilk urettiginiz String'i etkilemez. Ama illa ik ilk urettigi String degissin
		 * isterseniz atama yapmak zorundasiniz ==> str = str.substring(1);
		*/
		
		/*
		 * String class'ini kullanarak urettiginiz String'ler atamasiz degitirilmedigi
		 * icin String Class'ina "immutable" denir.
		 */
		
		String str = "Ali";
		str.substring(1);//value'su "li" olan yeni bir object olusturulur.
		                //str hala "Ali" dir.
		System.out.println(str);//Ali
		
		/*
		 * StringBuilder Class'ini kullanarak String uretireseniz yaptiginiz degisiklikler
		 * ilk urettiginiz String'i etkiler. Atama yapmaya gerek yoktur.
		 */
		
		//StringBuilder Class'i degisimi yansittigi icin ona "mutable" denir.
		
		//1. Yol:
		StringBuilder strBld1 = new StringBuilder("Ali");
		strBld1.append("Can");//append() methodu String'e yeni bir String eklemek icin
		                    //kullanilir. Concatenation yapar.
		System.out.println(strBld1);//AliCan
		
		//2. Yol:
		StringBuilder strBld2 = new StringBuilder();//bos bir String uretir ==> ""
		strBld2.append("Ali Can"); //Bos String'e "Ali Can" ekledim.
		
		//3. Yol:
		StringBuilder strBld3 = new StringBuilder(7);//Uzunlugu 7 character olan
		                                            //bir String urettim.
		
		/*
		 * Olusturdugunuz String'in uzunlugu belirledikten sonra o uzunluktan az veya 
		 * cok Stringler ekleyebilirsiniz. StringBuilder problem cikarmaz.
		 */
		strBld3.append("Ali");
		strBld3.append("Kahraman");
	}

}
