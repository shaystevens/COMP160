//stesh969@student.otago.ac.nz
import java.util.Scanner;
public class StringCounterApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //create new scanner instance
    System.out.println("Enter a sentence"); //prints line which tells user what to input
    String input = scan.nextLine(); //scans next line
    
    //declares local variables
    int index = 0; // index number
    int vowelCount = 0; // number of vowels default zero
    int consonantCount = 0; // number of consonants default zero
    int stringLength = input.length(); //length of string
    String lowerCase = input.toLowerCase(); //converts input to lower case
    
    while(index < stringLength){ // loop continues while the condition remains true
      char ch = lowerCase.charAt(index);// creates new variable character at index
      //if ch is a character from a-z initialize switch statement
      if ('a' <= ch && ch <= 'z'){
        switch(ch){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            vowelCount ++; //in the case of a vowel add one to vowel counter
          break;
          default:
            consonantCount ++; //add one to consonant count by default 
        }   
      }
      index ++; 
    }
    //print lines stating sentence, number of vowels in sentence and number of consonants
    System.out.println("Sentence is : " + input);
    System.out.println("VowelCount : " + vowelCount);
    System.out.println("ConsonantCount : " + consonantCount);
  } 
}