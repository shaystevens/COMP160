//stesh969
public class Average{
  public static void main(String[] args){
    int[][] table = {{1,2,3},{4,5,6},{7,8}};
    //for each row in table
    for (int[] row: table){
      int total = 0; //declare varibale named total which will store the sum of the numbers
      // for each number in the row
      for (int num: row){
        System.out.print(num + " "); //print the number and a space
        total += num; // add number to total
      }//end loop 
      System.out.println("\tAverage : " + ((double) total/row.length)); //print tab average then sum of numbers over the amount of numbers
    }//end loop 
  }//end method
}//end class