package day16overloading;

public class Constructor03 {
	
	String name = "Huseyn";
	int age = 33;
	int weight = 85;
	String job = "Automatin Tester";
	boolean emekli = false;
	
	Constructor03(){
		
	}

	
	Constructor03(String name, int age, boolean emekli){
		this.name = name;
		this.age = age;
		this.emekli = emekli;
	}
	
	Constructor03(String name){
		this.name = name;
	}


	public static void main(String[] args) {

		Constructor03 people01 = new Constructor03();
           System.out.println(people01.name);
           
		System.out.println("--------------------");
		
		Constructor03 people02 = new Constructor03("Ayhan Yildiz", 50, true);
		   System.out.println(people02.name);
		   System.out.println(people02.age);
		   System.out.println(people02.emekli);
		   System.out.println(people02.job);
		   System.out.println(people02.weight);
		   
		System.out.println("--------------------");
		   
		Constructor03 people03 = new Constructor03("Ayse Yildiz");
		   System.out.println(people03.name);
		   System.out.println(people03.weight);
		   
		   
		   
		   
		
	}

}
