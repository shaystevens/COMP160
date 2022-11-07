public class ArtApp{
   public static void main(String[] args){
      Art[] collection = { new Sculpture(200,500,300,25,25000),
                           new Print(800,900,40,400),
                           new Sculpture(350, 835, 553, 150, 4500)};
      int totalValue = 0;
      for(Art work: collection){
         totalValue += work.value;
      }
      System.out.println("total value $" + totalValue);
   }
}