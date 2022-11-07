public class Practise {
  public static void main(String[] args){ 
      try {
int i = 10 / 0; // deliberate error
} catch (ArithmeticException z) {
System.out.println("There was a problem with your maths!");
System.out.println( z ); // calls toString on z
}
     }
         
  
    
    
    
  public static boolean tester(int i1, int i2){
   return (i1 + i2) >= 10;
  }
  
  public static int[] calcRunningTotal(int[] input){
   int inputLength = input.length;
   int[] result = new int[inputLength];
   int total = 0;
   
   for (int count = 0; count < inputLength; count++){
      total += input[count];
      result[count] = total;
   }
   
   
   return result;
   }
   
  public static int maximum(int i1, int i2, int i3){
   int value = 0;
   if (i1 > i2 && i1 > i3) value = i1;
   else if (i2 > i1 && i2 > i3) value = i2;
   else if (i3 > i1 && i3 > i2) value = i3;
   
   if (i1 == i2 || i1 == i3 || i2 == i3) value = 0;
   
   return value;
  }
      
}

    