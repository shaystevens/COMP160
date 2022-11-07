//stesh969@student.otago.ac.nz
import java.util.*;
public class IntCounterApp{
  public static void main(String[] args){
    Scanner sc = new Scanner( System.in ); //create scanner instant
    int counter = 1;
    //while counter is less than or equal to 3 do statments
    while (counter <= 3){
      System.out.println( "Which number do you wish to find? " );
      int target = sc.nextInt();
      IntCounter array = new IntCounter(makeArray());
      array.showTarget(target);
      counter ++;
    }//ends while loop
    System.out.println("Finished");
  }//end method
  
  /**Method with return type of int[] which returns a array of random length between 5-10 and is filled with random ints from 0-4*/
  public static int[] makeArray(){
    int [] array = new int[randomRange(5, 10)];
    for (int index = 0; index < array.length; index++){
      array[index] = randomRange(0, 4);
    }
    return array; 
  }//end method
  
  /**Method that returns random integer between high and low parameters.*/
  public static int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
    
  }//end method
}//end class