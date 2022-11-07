//stesh969
import java.util.Scanner;
public class GuessAnimal{
  static String[] animalGuessList = new String[3]; //declare string array variable which can hold 3 values
  public static void main(String[]args){
    String[] animalLongList = {"aadvark", "ant", "beaver", "Cheetah", "dingo", "elephant", "giraffe", "hippopotamus", "iguana", "Jaguar", "Lion","monkey"};
    Scanner sc = new Scanner( System.in ); //create scanner object
    
    // for 3 tries
    for (int i = 0; i < 3; i++){
      int pick;
      //Issue A fix
      do{
        System.out.println("Pick a number between 0 and " + (animalLongList.length-1));
        pick = sc.nextInt();
        
        //if pick is less than zero or gretater than the animalLongList length
        if (pick < 0 || pick >= animalLongList.length){
          System.out.println("not valid - try again");
        }//end if statement                   
        
      }/*end do-while loop*/ while(pick < 0 || pick >= animalLongList.length); //while pick is less than 1 or pick is greater than or equal to the length of animalLongList, 
      animalGuessList[i] = animalLongList[pick]; //animalGuessList at index i is equal to animalLongList at index pick
    }//end loop
    
    //for each string in animalGuessList
    for (String animal: animalGuessList){
      System.out.print("Guess what animal I am? " + animal.charAt(0) + animal.charAt(1)); //print guess animal and first two letters of animals name
      
      //Issue D fix, for index 0 to the animals name length - 2 add a underscore
      for (int index = 0; index < (animal.length() -2); index ++){
        System.out.print(" _");
      }//end loop
      
      System.out.println();
      
      //Issue C fix
      boolean Incorrect = true; // declare local boolean variable Incorrect and set to true
      //while Incorrect is equal to true get user to keep guessing until correct
      while (Incorrect){
        String guess = sc.next();
        //if the guess is correct end loop
        if ((guess.toLowerCase()).equals(animal.toLowerCase())){
          System.out.println("Correct");
          Incorrect = false;
        }//end if statement
        
        //else print incorrect and loop continues
        else{
          System.out.println("Incorrect");
        }//end else statement
      }//end loop
    }//end loop
  }//end method
}//end class