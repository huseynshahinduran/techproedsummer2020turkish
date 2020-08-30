package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {

		System.out.println(exceptions());
		
	}
	
	@SuppressWarnings({ "finally", "null" })
	public static String exceptions() {
		
		String result="";
		String v=null;
		
		try {
			try {
				result=result+"before ";
				v.length();
				result=result+"after ";
			}catch(NullPointerException e){
				result=result+"catch ";
				throw new RuntimeException();
			}finally {
				result=result+"finally ";
				throw new Exception();
			}
		}catch(Exception e) {
			result=result+"done";
		}
		return result;
	}
	
	/*
	 * throw ile throws keywordlerinin farki:
	 * 1)throw methodu body'si icine yazilir, throws method parantezi ile curly
	 *   brace'in arasina yazilir.
	 * 2)throw'u method body'si icinde exception almak istedigimiz yerde kullanabiliriz
	 *   throw ise mecburen method isminden sonra bir kere kullanilabilir
	 * 3)1 throw sadece 1 tane exception uretir, 1 throws ile birden cok 
	 *   exception uretebilirsiniz.
	 *   Yani "throws NullPointerException ,ArithmeticException" mumkun
	 * 4)throw icin syntax ==> throw new NullPointerException;
	 *   throws icin syntax ==> throws NullPointerException
	 */

}










