# Abstraction in Java – Java’da Soyutlama

Java’da "***Abstraction***" kavramını açıklamaya başlamadan önce her zamanki gibi kelimenin anlamını vermekte fayda vardır.
<br/>Abstraction kelime olarak *soyutlama, soyutlama eylemi, soyut kavram* gibi anlamlar için kullanılmaktadır.

## Peki nedir bu Abstraction ve ne için kullanılır?

Soyutlama aslında isminden de anlaşılacağı üzere ilgili verinin, nesnenin ya da o an için ilgilenilen durum ne ise onun sadece temel özelliklerinin gösterilmesi durumudur. 
<br/>Yani karşı taraf için gerekli olmayan özellikler gizlenir. 

<br/>***Bunu gerçek hayattan örnekler ile pekiştirmek gerekirse;***

* Bir araba dendiği zaman tekerler, şase, mekanik ve elektronik akşamların ve geri kalan diğer parçaların bir bütünü olarak anlarız. 
  * Konuşma sırasında benim dört tekerleri ve motoru olan bir ulaşım aracına sahibim demeyiz.

- Ben dört duvarı olan, kolonlarında beton ve demir kullanılmış, camları ve çatısı olan bir yerde yaşıyorum demeyiz.
  - Bunun yerine bir evde yaşıyorum demek yeterlidir.
    - Karşımızdaki insan için önemli değilse evin temelinin kazık mı yoksa ayak temel mi olduğu veya duvarlarında tuğla mı gaz beton mu kullanıldığı önemli değildir.

* Soyutlama kavramının iyice anlaşılabilmesi için bir diğer örnek ise trafik lambası da olabilir.
  * Kullanıcı kırmızı yandığı zaman durması gerektiğini bilir.
    * Kırmızı ışık yanması için lambanın içinde nasıl bir devre olduğu, bu devrede hangi elektronik bileşenler olduğu, ne kadar akıma dayanıklı bir sistem olduğu sürücüyü ilgilendirmez.

<br/>Verilerin soyutlanması ile birlikte nesnenin gerekli özellikleri ön plana alınır ve gereksiz detaylar arka plana alınır. 
<br/>Zaten bir nesnenin özellikleri ve davranışları onu benzer türdeki diğer nesnelerden ayırmak için kullanılır. 
<br/>Ayrıca bu özellikler ve davranışlar sayesinde nesneler sınıflandırılabilir veya gruplandırılabilir.


## Java’da soyutlama nasıl gerçekleştirilir?

Java’da ise soyutlama durumu “***Interfaces (Arayüzler)***” ve “***Abstract Classes (Soyut Sınıflar)***” kullanılarak gerçekleştirilir.
<br/>Buradaki önemli fark ise ***Abstract Class*** kullanıldığı zaman soyutlama ***%0 ile %100*** arasında sağlanırken ***Interface*** kullanıldığı zaman ***%100*** soyutlama gerçekleşir.

## Java'da Abstraction Kullanımı Örneği

Bankaların çalışma saati her banka için değişmeyeceği için bu durum Banka sınıfına eklenir.

https://github.com/ekremtk/Bootcamp_Homework-1/blob/4700509f55e7044618fac19c062969b718b6e5ec/abstraction.java#L1-L17

<!---
```java
// Abstract Class
// Soyut Sınıf
abstract class Bank 
{
  // Abstract Method 
  // Soyut Metot (Herhangi bir gövdesi(body) yoktur)
  public abstract void Commission();
  
  // Regular method
  // Normal Metot
  public void WorkingHours() 
  {
  	System.out.println("The Bank Serves Between 09:00 - 17:00");
    System.out.println("Banka 09:00 - 17:00 Saatleri Arasında Hizmet Vermektedir.");
    System.out.println("************************************************************\n");
  }
}
```
--->

<br/>Ancak her bankanın komisyon oranı bankadan bankaya değişeceğine göre bu her bankanın kendi özelliği olarak eklenmelidir.

https://github.com/ekremtk/Bootcamp_Homework-1/blob/4700509f55e7044618fac19c062969b718b6e5ec/abstraction.java#L20-L56

<!---
```java
// Subclass (inherited from Bank)
// Alt Sınıf (Banka sınıfından çoğaltıldı)
class Garanti extends Bank 
{
  public void Commission() 
  {
    // The body of Commission() is provided here
    // Komisyonun () gövdesi burada sağlanır
    System.out.println("Garanti Bank's EFT commission is 1.55₺ up to 1000₺.");
    System.out.println("Garanti Bankasının EFT komisyonu 1000₺'ye kadar 1.55₺'dir.");
    System.out.println("************************************************************\n");
  }
}

class Ziraat extends Bank 
{
  public void Commission() 
  {
    // The body of Commission() is provided here
    // Komisyonun () gövdesi burada sağlanır
    System.out.println("Ziraat Bank's EFT commission is 1.65₺ up to 1000₺.");
    System.out.println("Ziraat Bankasının EFT komisyonu 1000₺'ye kadar 1.65₺'dir.");
    System.out.println("************************************************************\n");
  }
}

class Enpara extends Bank 
{
  public void Commission() 
  {
    // The body of Commission() is provided here
    // Komisyonun () gövdesi burada sağlanır
    System.out.println("There is no commission for EFT transaction in Enpara.");
    System.out.println("Enpara'da EFT işlemi için herhangi bir komisyon yoktur.");
    System.out.println("************************************************************\n");
  }
}
```
--->

<br/> Daha sonrasında oluşturduğumuz bankalardan Garanti özelinde çıktısını almak için de aşağıdaki kod bloğunu çalıştırılmalıdır.

https://github.com/ekremtk/Bootcamp_Homework-1/blob/4700509f55e7044618fac19c062969b718b6e5ec/abstraction.java#L58-L66

<!---
```java
class Main 
{
  public static void main(String[] args) 
  {
    Garanti mynewBank = new Garanti(); // Create a Garanti Bank object
    mynewBank.WorkingHours();
    mynewBank.Commission();
  }
}
```
--->

### Çıktı

<p align="center">
<img height=250 src="https://github.com/ekremtk/githubfigures/blob/main/Folder/abs.png"/>
</p>

# References 
* [Abstraction in Java ](https://www.geeksforgeeks.org/abstraction-in-java-2/)
* [Java Abstract Class Nedir?](https://emrecelen.com.tr/java-abstract-class-nedir/)
* [Java Abstraction (Soyutlama)](https://ramazanbiyikci.com.tr/java-abstraction-soyutlama/)
* [Abstraction Nedir? Abstract Class ve Interface Kullanımları](https://medium.com/kodcular/abstraction-nedir-abstract-class-ve-interface-kullan%C4%B1mlar%C4%B1-10d19fe47288)
* [Java Abstraction](https://www.mobilhanem.com/java-abstraction/)
* [Abstract class in Java](https://www.javatpoint.com/abstract-class-in-java)
* [Java Abstraction](https://www.w3schools.com/java/java_abstract.asp)
<!---
* https://www.stevemar.net/github-code-in-readme/
--->
