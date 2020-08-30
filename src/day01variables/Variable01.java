package day01variables;

public class Variable01 {
	
	public static void main(String[] args) {
		
		int maas=3000;
		
		char harf='S'; //char'lara deger atamasi yaparken mutlaka tek tirnak kullanilir
		
		System.out.println(maas); //3000
		System.out.println(harf); //S
		
		boolean isOld=true; //boolean'lar icin sadece true ve false degerlerini kullanilir
		System.out.println(isOld); //true
		
		boolean isNew=false;
		System.out.println(isNew); //false
		
		byte derinlik=-123;
		System.out.println(derinlik); //-123
		
		short sirnakNufus=28000;
		System.out.println(sirnakNufus); //28000
		
		long hucreSayisi=7399048898060620015l; //Integer sinirini asan long variable'larda en sona "l" veya "L" koyulur
		System.out.println(hucreSayisi);
		
		double pi=3.145484654564864; //Java butun ondalik kesirleri otamatik olarak
		                              // double kabul eder. 
		
		System.out.println(pi);
		
		float para=5.25f; //Eger bir ondalik kesri float yapmak isterseniz sonuna
		                  // "f" veya "F" koyunuz.
		System.out.println(para);
		
		String ogrenciIsmi="Ali Can";
		System.out.println(ogrenciIsmi); //Ali Can
		
		
		
	}

}
