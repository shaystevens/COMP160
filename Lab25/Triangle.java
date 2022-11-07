public class Triangle {
   private int p1x;
   private int p1y;
   private int p2x;
   private int p2y;
   private int p3x;
   private int p3y;
   private String name;
   
   public Triangle(){
      p1x = 0;
      p1y = 0;
      p2x = 3;
      p2y = 0;
      p3x = 3;
      p3y = 4;
      name = "TEST";
   
   }
   
   public Triangle(int ptx1, int pty1, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
      p1x = ptx1;
      p1y = pty1;
      p2x = pt2x;
      p2y = pt2y;
      p3x = pt3x;
      p3y = pt3y;
      name = nameIn;
   }
   
   private double calcSide(int x1, int y1, int x2, int y2){
      double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
      return distance;
   
   }
   
   public double getPerimeter(){
      double perimeter = calcSide(p1x, p1y, p2x, p2y) + calcSide(p2x, p2y, p3x, p3y) + calcSide(p3x, p3y, p1x, p1y);
      return perimeter;
   
   }
   
   public String getName(){
   return name;
   }
}
/* Original app
DecimalFormat twodecimals = new DecimalFormat("0.##");
      Triangle a = new Triangle(0,3,3,4,1,9,"A");
      Triangle test = new Triangle();
      System.out.println("Triangle " + a.getName() + " perimeter is " + twodecimals.format(a.getPerimeter()) + " units");
      System.out.println("Triangle " + test.getName() + " perimeter is " + twodecimals.format(test.getPerimeter()) + " units");
      */ 