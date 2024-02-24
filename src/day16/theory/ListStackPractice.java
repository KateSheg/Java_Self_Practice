package day16.theory;

import java.util.Arrays;
import java.util.Stack;
  
  public class ListStackPractice {
    
    public static void main(String[] args) {
      
      Stack<String> stack = new Stack<>();
      stack.addAll(Arrays.asList(
              "apple", "orange", "banana", "apple", "grape", "banana", "apple", "grape", "banana"
      ));
      
      System.out.println(stack);
      
      stack.push("strawberry");
      
      System.out.println(stack);
      
      String element = stack.peek();
      
      System.out.println(element);
      System.out.println(stack);
      
      element = stack.pop(); //LIFO
      
      System.out.println(stack);
      
      System.out.println("-----------------------------------------");
      
      String str = "Java Programming";
      
      Stack<Character> characters = new Stack<>();
      
      for (char c : str.toCharArray()) {
        characters.push(c);
      }
      
      String reverser = "";
      
      while(!characters.isEmpty()){
        reverser += characters.pop();
      }
      
      System.out.println(reverser);
      
      
    }
    
  
}
