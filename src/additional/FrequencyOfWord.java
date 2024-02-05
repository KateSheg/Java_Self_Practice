package additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfWord {
  public static void main(String[] args) {
    String word = "java";
    String sentence = "Java Java Java JAVA Java";
    System.out.println(sentence);
    ArrayList<String> sentence2= new ArrayList<>(Arrays.asList(sentence.toLowerCase().split(" ")));
    int f = Collections.frequency(sentence2,word.toLowerCase());
    System.out.println("frequency of \"" + word + "\" is " + f);
  }
}
