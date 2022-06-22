# Implement & Extend

Implement ve extend kavramları, Class yani Sınıf ve Interface yani Arayüz kavramları ile bağlantılı olduğu için bu kavramları açıklamakta fayda vardır. 
Class, oluşturulacak objelerin hangi özelliklere ve hangi metotlara sahip olduğunu ve bu metotların nasıl çalışacaklarını tanımladığımız yerdir.
Interface ise yine sınıfa benzer şekilde referans türüdür. Soyut yöntemlerin bir koleksiyonudur. 

Sınıftan farkına baktığımız zaman sınıf, bir nesnenin niteliklerini ve davranışlarını tanımlamak için kullanılır. 
Interface ise sınıfın uyguladığı davranışları içerir. Interface’ler sınıflar tarafından uygulanır.


## Peki sınıfları ve arayüzleri oluşturduktan sonra bunları nasıl kullanılırız? 

İşte bu noktada implement ve extend kavramları işimize yaramaktadır. 
Aslında kelime anlamları buradaki kullanım biçimlerini açıklayacaktır. 
Implement uygulamak anlamına gelmektedir. Interface ile kullanıldığı zaman onun uygulanması için kullanılır. 
Extend ise genişletme anlamına gelmektedir. Benzer bir kullanımda ise sınıfın genişletilmesi için kullanılır. 

Extend kullanımında ilişkili davranış yeniden tanımlanabilir. 
Özetle aşağıdaki görselden de anlaşılacağı üzere bir sınıf başka bir sınıftan genişletilir(extend), benzer şekilde bir arayüz başka bir arayüzden genişletilir(extend) ancak son olarak bir sınıf bir arayüzü uygular(implement).

<p align="center">
<img height=250 src="https://github.com/ekremtk/githubfigures/blob/main/Folder/interfacerelation.jpg"/>
</p>

# Java’da kodu yazarken Implement ve Extend ifadeleri aynı anda kullanılmak istendiğinde ne olur?

Buradaki ilk yanıt tabii ki java sadece bir adet sınıfı genişletebilir ve birden fazla arayüzü uygulayabilir. 
Eğer Extend ifadesi daha sonra uygulanabilir olsaydı çalışmanın derleme süresi fazlasıyla artacaktı. 
Ancak bu durum derleyicilerinin geliştirme süresini düşük tutma mantığına ters olduğundan dolayı zaten mümkün değil.

Bir de neden önce Extend ifadesi kullanılır diye baktığımız zaman herhangi bir arayüzü uygulamadan önce ana sınıfa ait tüm özelliklerin elde edilmesi gerekir. 
Mevcut sınıftan genişletilmiş olan yeni sınıf mevcut sınıfın tüm özelliklerini, türetildiği yerden alacaktır. 
Bu sayede yeni sınıf aslında kendi değişkenlerine ve yöntemlerine ve bunların yanı sıra mevcut sınıftaki değişkenlere ve yöntemleri sahip olacaktır. 

# References
* [Interface’lerin Mantığı Nedir(1)?(Hikayeli)](https://medium.com/codable/interfacelerin-mantigi-nedir-1-hikayeli-f9b960228328)
* [Java – Interfaces](https://www.tutorialspoint.com/java/java_interfaces.htm)
* [Why in Java class is the extend keyword used before the implements keyword?](https://www.quora.com/Why-in-Java-class-is-the-extend-keyword-used-before-the-implements-keyword)
* [Why "extends" precedes "implements" in class declaration [closed]](https://stackoverflow.com/questions/10538010/why-extends-precedes-implements-in-class-declaration)

