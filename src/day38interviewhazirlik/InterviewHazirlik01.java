package day38interviewhazirlik;

public class InterviewHazirlik01 {
	
   /*
	* 1) Java "Platform Independent" programlama dilidir.
    *    Yani: herhangi bir plaformda yazilan Java kodu diger platformlarda da calisir.
    *    Mesala kodu Mac'de yazdiniz, Windowsda da calisir.
        
     ------------------------------------------------------------------------------------------------------    
    
    * 2) IDE ==> Integrated Development Environment demektir. Eclips ve IntelliJ piyasada 
    *            kullanilan meshur iki IDE dir.
    
     ------------------------------------------------------------------------------------------------------           
    
    * 3) Constructor ==> Yeni bir object uretilirken Constructor aktive olur ve object'i uretir 
    *                    Return type'i yoktur
    *                    Ismi class ismi ile ayni olmalidir
    *                    Object uretmek icin Constructor uretmek zorunda degiliz. Cunku Java
    *                    her class icin default bir constructor uretmistir.
    *                    Default constructor'lar parametresizdir.
    *                    Biz herhangi constructor urettigimizde default constructor;lar yok olur.
    *                    Constructor'lar overload edilebilir.
    *                    Constructor'lar child class'lardan cagrilabilirler, ama override edilemezler.
    
     ------------------------------------------------------------------------------------------------------                 
    
    * 4) OOP Concept nedir?
    *                      ==> OOP concept a) Inheritance b) Encasulation c) Polymorhism
    *                                      d) Abstraction e) Interface icerir.  
    
     ------------------------------------------------------------------------------------------------------                                      
    
    * 5) Inheritance nedir?
    *                      ==> Inheritance parent(super class)-child(sub class) iliskisidir.
    *                          A class'i B class'ina extends ederse A child olur, B parent olur
    *                          A class'i B interface'ina implements ederse A child olur, B parent olur   
    *                          A interface'i B interface'ina extends ederse A child olur, B parent olur
    *                          Child parent'taki kodlarin public ve protected olanlarini kullanabilir.   
    *                          Reusability(Tekrar kullanabilme), short coding (Kodu kisa yazma),
    *                          maintenance(tamir) faydalari vardir. 
    
     ------------------------------------------------------------------------------------------------------
     
    *6) Encapsulation nedir?
    *                       ==> Data hiding(Data gizleme) demektir. Data'lar private yapilarak gizlenir.
    *                           Gizlenen data'lar getter() ile okunur, setter() ile update edilir.
    *                           Degistirilmesini istemediginiz kodlari koruma altina almak icin 
    *                           kullanilir. Maintenance faydasi da vardir.    
    *                           Kodun hic degistirilmesini istemiyor sadece okunmasini istiyorsaniz a zaman
    *                           setter() olusturmayiniz.(Immutable class)
    *                           Kodun ne degistirlimesini ne de okunmasini istemiyorsaniz o zaman getter() da
    *                           setter() da olusturmayiniz.
                              
     ------------------------------------------------------------------------------------------------------
    
    * 7) Polymorphis nedir?  
    *                      ==> Polymorphism(Coklu yapi) overloading ve overriding'dir.
                          
     ------------------------------------------------------------------------------------------------------                                                                                                                           
    
    * 8) Abstract Class nedir?
    *                         ==> Abstract class uretmek icin abstract keyword kullanmaliyiz.
    *                             Abstract class'lardan object uretilemez. (instantiate yapilamaz)
    *                             Abstract class'larda hem abstract hem de concrete method bulunabilir.
    *                             Abstract method'un oldugu class kesinlikle abstract olmalidir.
    *                             Abstract methodlarin(body'siz) concrete child'lar tarafindan override
    *                             edilme zorunlulugu vardir. Concrete'ler override edilmese de olur.
    *           Mutlaka Soyle ==> Abstract class'i child class'lari bazi gorevleri yapmak zorunda 
    *                             birakmak icin olusturunuz. 
                                 
     ------------------------------------------------------------------------------------------------------                                                                                   
    
    * 9) Interface nedir?
    *                 ==> Java normalde multiple inheritance'a musaade emtez bu yuzden Abstract
    *                     class kullandigimizda multiple inheritance yapamayiz. Fakat bazi projelerde
    *                     multiple inheritance kullanmak zorunda kaliriz. Bunu Java bize interface
    *                     kullanma hakki vererek halletmistir. Cunku: interface'latmultiple 
    *                     implements/extends yapilabilir.
    *                     Detaylari Eclips'den bakin.
                         
      ------------------------------------------------------------------------------------------------------                                                                                                        
    
    * 10) Overloading nedir?
    *                       ==>Method ismi ayni tutularak parametreler in sayilari, yerleri veya
    *                          data type'lari degistirilerek methodlar olusturmadir.
    *                          Overloading Compile Time'dir yani overloading'de yaptiginiz hata
    *                          code yazarken belli olur.
    *                          Ayni isme sahip methodlarla farkli islemler yapabilmek icin.
    *                          Mesala substring(4) ve substring(4,7) methodlarinin fonksiyonlari
    *                          esasinda aynidir. Ikisi de bir String'in belli bir bolumunu almaya 
    *                          yarar. Fakat bazi durumlarda bitis indexini soylemek gerekir bazi durumlarda
    *                          gerekmez. Bunun icin parametreleri farklilastiririz. Bu da 
    *                          overloading'i dogurur.
                              
     ------------------------------------------------------------------------------------------------------                                                                                                                                  
                                                                                                                                      
    * 11) Overriding nedir?
    *                      ==>Method Signature'a (Method simi + Parametreler) dokunmuyoruz, sadece body'i
    *                         degistiriyouz. Overriding inheritance olunca olur.                                                                                                            
    *                         Ayni method'un farkli kullanimlari icin overriding gereklidir.
    *                         Animal da ses(){Ses cikarir} ==> Dog(){Havlama} ==> Kedi(){Miyavlama}
    *                         Overriding Run Time Error verir.                                                                                                         
     
     ------------------------------------------------------------------------------------------------------                                                                                                                                  
                                                                                                                                      
    * 12) Array ile ArrayList arasindaki farklar nelerdir?                                                                                                                                 
    *                        ==>Array olusturulurken uzunlugu belli edilmek zorundadir
    *                           ve daha sonra uzunluk degistirilemez. Fakat ArryList'lerde
    *                           baslangicta uzunlugu belirtme zorunlulugumuz yok, eleman ekledikce
    *                           uzunluk artar, eleman sildikce uzunluk azalir.                                                                                                          
                                                                                                                                      
     ------------------------------------------------------------------------------------------------------                                                                                                                                 
                                                                                                                                      
    * 13)String ile StringBuilder arasindaki fark nedir?
    *                       ==>String'ler immutabel'dir. StringBuilder ise mutabel'dir.
    *                          StringBuilder class'i daha fazla kullanisli methodlara sahiptir.
    *                          Mesala: bir String'i tersten yazdirmak icin kullanilan reverse() gibi.                                                                                                                                                                                                                                                               
   */       

}
