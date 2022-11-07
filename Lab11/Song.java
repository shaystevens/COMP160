//stesh969@student.otago.ac.nz
public class Song {
  private String songLine;
  
  /**Constructor method which take a string as a parametrer and sets it to the data field */
  public Song(String sLine){
    songLine = sLine;
  }//end method
  
  /**toString method that returns the value stored in data field*/
  public String toString() {
    return songLine;
  }//end method
  
  /**Void method that prints a series of tasks that manipulates the data field*/
  public void process(){
    //local variables declared which finds first and second space of string
    int index_of_first_space = songLine.indexOf(' ');
    int index_of_second_space = songLine.indexOf(' ', index_of_first_space+1);
    
    System.out.println("Length is: " + songLine.length()); //prints length of string
    System.out.println(songLine.charAt(songLine.length()-1)); //prints last character of string
    System.out.println(songLine.toUpperCase()); //prints string all in upper case
    System.out.println(songLine.replace(' ', '_')); //replaces all spaces in string with underscores and prints new string
    System.out.println(songLine.indexOf('k')); //prints the index of character k in string
    
    //if a second space exists in the string do the next series of maniupulations
    if (index_of_second_space != -1){
    System.out.println(songLine.substring(0,index_of_second_space)); //prints first two words
    System.out.println(songLine.substring(index_of_second_space + 1)); //prints remaining words
    System.out.println(songLine.charAt(index_of_second_space+1)); //prints first character of third word
    }   
   
  }//end method
}//end class