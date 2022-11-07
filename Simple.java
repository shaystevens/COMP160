public class Simple{
  public	static void	main(String[] args){
	 int cols =	5;
	 int rows =	4;
	 int [] [] table = new int[rows][cols];
    
	 for (int row = 0; row < rows; row++){
		for (int	col =	0;	col <	cols;	col++){
		  table[row][col]	= row	* col;
		}
	 }
    
	 for (int[] row : table){
	   for (int num : row){
         System.out.print(num + "\t");
	 }
    
    System.out.println();
	}
}
}