//stesh969@student.otago.ac.nz
import java.util.Scanner;
public class EvenSumApp{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in); //create new scanner instance
    System.out.println("Enter an interger greater than 1"); //prints statement of what to input
    int input = scan.nextInt(); //scans input for next interger
    
    while(input < 2) { // loop continues while the condition remains true
      //keep asking for an input until input is greater than or equal to 2
      System.out.println("Input value must not be less than 2");
      input = scan.nextInt(); 
    }
    
    //declare new variables count and sum
    int count = 2;
    int sum = 0;
    while(count <= input) {// loop continues while the condition remains true
      //loop that adds all even numbers between 2 and input inclusive
      if (count % 2 == 0){
        sum += count;
      }
      count ++;
    }
    System.out.println("Sum of even numbers between 2 and " + input + " inclusive is: " + sum);
    
  }//end method
}//end class