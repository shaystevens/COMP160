import java.util.*;
public class Beta{
  public	static void	main(String[] args){
  readInt();

}
	 public static	int readInt() {
 boolean	success;
 int input = 0;
 do {
 success	= true;
 System.out.println("Please enter an integer");
 try {
 Scanner	scan = new Scanner(System.in);
 input =	scan.nextInt();
 }	catch	(java.util.InputMismatchException e) {
 System.out.println("Unexpected input, please try again.");
 success	= false;
 }
 }	while	(!success);
 return input;

}
}