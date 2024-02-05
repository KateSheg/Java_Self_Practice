package day10.theory;

public class ConvertTemperature {
  public static void main(String[] args) {
    String f = "68";
    String s = "Today, the weather is sunny and " + f + " degrees. It's a perfect day to practice Java.";
    double ff = Double.parseDouble(f);
    double cc = (ff-28)/2;
    System.out.println(ff +" Fahrenheit is equal to " + cc + " Celsius.");
    
  }
}
