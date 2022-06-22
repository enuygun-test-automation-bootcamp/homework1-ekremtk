# Internal Keyword (Anahtar Kelime) Araştırılması

Programlama dillerinde kullanılan Classlar(sınıflar) oluşturulduktan sonra güvenlik amacıyla erişilebilirliği kısıtlanabilir.
Farklı biçimlerde erişimler sağlanabilir. 

Örneğin C# programlama dilinde bunlar:
  * Private
  * Public
  * Protected
  * Internal
  * Protected Internal
  olarak belirtilmektedir.
  
Java dilindeki erişim belirleyicilere baktığımız zaman ise:
  * Default	
  * Private	
  * Protected	
  * Public	
  olarak belirtilmektedir.
 
**! Buradan da görüleceği üzerine Java dilinde Internal kullanımı yoktur.**
**Java'da Internal kullanıma benzer olarak Private kullanımı olabileceği belirtilmiştir.**

## Internal Açıklaması

Java dilinde Internal kullanımı olmamasına rağmen yine de açıklamak gerekirse, Internal kelime anlamı olarak dahili, iç, içe özgü gibi anlamları ifade etmektedir.

Bu durumda programlama dilinde Internal olarak tanımlanan bir değer; aynı program içerisinden erişilebilir, fakat farklı bir program içerisinden erişilemez durumdadır. 
Program içerisinde herhangi bir kısıtlaması yoktur.

Internal Class olarak tanımlama yapıldıktan sonra tanımlamanın yapıldığı katmandan erişim sağlanırken bunun dışında geri kalan katmanlar tarafından hiçbir şekilde erişim sağlanamaz.


# References
* [C# dilinde Erişim Belirleyiciler (Access Modifiers)](https://bidb.itu.edu.tr/seyir-defteri/blog/2013/09/06/c-dilinde-eri%C5%9Fim-belirleyiciler-(access-modifiers)#:~:text=Internal%20olarak%20tan%C4%B1mlanan%20bir%20de%C4%9Fer,i%C3%A7erisinde%20herhangi%20bir%20k%C4%B1s%C4%B1tlamas%C4%B1%20yoktur)
* [Java Access Modifiers](https://www.programiz.com/java-programming/access-modifiers)
* [Is there anything like an Internal class in Java?](https://stackoverflow.com/questions/5981107/is-there-anything-like-an-internal-class-in-java#:~:text=there%20is%20not%20any%20exact%20equivalent%20for%20internal%20in%20java.)
