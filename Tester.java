public class Tester{
   static int[] dunedinTemps = {15, 12, 9, 13, 14};
   static int[] aucklandTemps = {17, 15, 18, 14, 17};
   static int[][]temps = {dunedinTemps, aucklandTemps};
   
   public static void show(int row, int col){
      System.out.println(temps[row][col]);
   }
   
   public static void main(String[] args){
      show(1,2);
      for (int[] cityTemps: temps){
         System.out.println(cityTemps[0]);
      }
   }
}