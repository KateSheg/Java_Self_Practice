package day16.theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
  public static void main(String[] args) {
    String a = "Java is a programming language.";
    
    String[] b = a.split("");
    System.out.println(Arrays.asList(b));
    
    ArrayList<String> d = new ArrayList<>();
    d.addAll(Arrays.asList(b));
    System.out.println(d);
    
    Stack<String> c = new Stack<>();
    //c.addAll(d);
    for (String each: d) c.push(each);
    
    String r = "";
    while (!c.isEmpty()) r += c.pop();
    System.out.println(r);
    
  }
}
