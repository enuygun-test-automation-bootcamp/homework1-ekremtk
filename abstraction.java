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

class Main 
{
  public static void main(String[] args) 
  {
    Garanti mynewBank = new Garanti(); // Create a Garanti Bank object
    mynewBank.WorkingHours();
    mynewBank.Commission();
  }
}


//Enpara mynewBank2 = new Enpara(); // Create a Enpara object
//mynewBank2.WorkingHours();
//mynewBank2.Commission();
    
//Ziraat mynewBank3 = new Ziraat(); // Create a Ziraat Bank object
//mynewBank3.WorkingHours();
//mynewBank3.Commission();
