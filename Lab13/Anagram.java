//stesh969@student.otago.ac.nz
import java.util.*;
public class Anagram {
  public static void main(String args []){
    Scanner sc = new Scanner(System.in); //create scanner object
    System.out.println("Enter first phrase"); //print telling input what to input
    String s1 = sc.nextLine(); //scan next line and store it as a variable
    String s1Lower = s1.toLowerCase(); //convert string into lowercase
    String s1Alpha = ""; //create a new variable to store string 1 characters in alphabetical order
    
    //for every character from a-z (inclusive)
    for (char c = 'a'; c <= 'z'; c++){
      //for every int from 0 to length of string 1
      for (int i = 0; i < s1.length(); i++){
        if (s1Lower.charAt(i) == c) s1Alpha += s1Lower.charAt(i); //if s1 character at index i equals character c add it to s1Alpha 
      } //end second for loop    
    } //end first for loop
    
    System.out.println("Enter second phrase"); //print a statement user to input another phrase
    String s2 = sc.nextLine(); //scan next line and store it as a variable
    String s2Lower = s2.toLowerCase(); // convert string to lower case
    String s2Alpha = ""; //create a new variable to store string 2 characters in alphabetical order
    
    //for every character from a-z (inclusive)
    for (char c = 'a'; c <= 'z'; c++){
      //for every int from 0 to length of string 2
      for (int i = 0; i < s2.length(); i++){
        if (s2Lower.charAt(i) == c) s2Alpha += s2Lower.charAt(i);//if s2 character at index i equals character c add it to s2Alpha 
      } //end fourth for loop
    } //end third for loop
    
    System.out.println(s1Alpha + " are the s of " + s1 + " in order");
    System.out.println(s2Alpha + " are the s of " + s2 + " in order");
    if (s1Alpha.equals(s2Alpha)) System.out.println(s1 + " is an anagram of " + s2); //if string 1 in alphabetical order is the same as s2  print that s1 is an anagram of s2
    else System.out.println(s1 + " is not an anagram of " + s2); //else print that it is not a anagram
  }//end method
}//end class