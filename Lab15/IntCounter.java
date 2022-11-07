//stesh969@student.otago.ac.nz
public class IntCounter {
  private int[] numArray; //declares array data field of type int[]
  
  /**Constructor method of IntCounter class which sets parameter to data field, displays every element in array and length of array*/
  public IntCounter(int[] numArray){
    this.numArray = numArray; //sets data field to parameter
    //for every element in array
    for(int element:numArray){
      System.out.print(element + " ");
    }//ends for each loop
    System.out.println("Array is of length " + numArray.length);
  }//end method
  
  /**Method that takes a parameter, target, displays the target value and it's index value*/
  public void showTarget(int target){
    for (int index = 0; index < numArray.length; index++){
      //if the element in array is equal to target do statement
      if (numArray[index] == target){
        System.out.println("There is a " + target + " in position position " + index);
      }
    }//ends for loop
    System.out.println("\n");
  }//end method
}//end class