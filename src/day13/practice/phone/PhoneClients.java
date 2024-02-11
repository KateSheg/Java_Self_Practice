package day13.practice.phone;

public class PhoneClients {
  
  
  
  public static void main(String[] args) {
    Phone a1 = new Phone("iPhone", "15 Pro", 1000,"Max", "Deep cosmos");
    a1.call("2672505238");
    
    
    Phone ph = new Phone("Nokia","3310", 15, "12", "Blue");
    System.out.println(ph);
    ph.faceTime("2672505233");
    ph.call("2672505238");
    
    Nokia ph2 = new Nokia("redmi",6690, "3", "Green");
    System.out.println(ph2);
    ph2.text("2672505233");
    
    Samsung a4 = new Samsung("Fold 5", 1700,"1", "Black");
    System.out.println(a4);
    a4.faceTime("2672505233");
    
    IPhone a5 = new IPhone ( "12", 700,"Mini", "White");
    System.out.println(a5);
    a5.faceTime("2672505233");
    
    System.out.println();
    System.out.println(IPhone.startColor("green") + "IPhone Color text is here!" );
    System.out.println(Phone.startColor("yellow") + "Phone   Color te\u001B[31mxt is here!" );
    System.out.println(Samsung.startColor("red") + "Samsung Color text is here!" );
    System.out.println(Nokia.startColor("cyan") + "Nokia Color text is here!" );
    
    
  }
}
