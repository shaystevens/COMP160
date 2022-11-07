public class Lab3 {
  private static int n;
  
  public static void main(String[] args) {
    methodThree();
    methodOne();
    methodTwo();
    methodOne();
    methodOne();
    System.out.println("n is " + n);
    methodThree();
    System.out.println("n is " + n);
  }
  
  public static void methodOne() {
    n = n * 2;
  }
  
  public static void methodTwo() {
    n = n + 10;
  }
  
  public static void methodThree() {
    n = 3;
  }
}