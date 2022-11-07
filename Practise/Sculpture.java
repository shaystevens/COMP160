public class Sculpture extends Art{
   private int weight;
   private int depth;
   public Sculpture(int wd, int ht, int dpth, int wt, int value){
      super(wd, ht, value);
      depth = dpth;
      weight = wt;
   }
}