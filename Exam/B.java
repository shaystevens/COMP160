public class B extends A {
 private int a = 3;

 public void fruit() {
 System.out.println("Banana");
 }

 public void fruit(int x) {
 System.out.println("Banana " + x);
 }

 public void fruit(int x, int y) {
 System.out.println(y + " Banana " + x);
 }

 public void test( ) {
 int a = 4;
 System.out.println(a);
 System.out.println(this.a);
 System.out.println(super.a);
 fruit(7);
 this.fruit();
 super.fruit();
 }
}