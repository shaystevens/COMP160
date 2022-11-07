public class TextBook extends Book{
   double cost;
   
   TextBook(int pagesIn,String titleIn,double costIn){
      super(pagesIn, titleIn);
      cost = costIn;
   }
   
   public String toString(){
      return (super.pages + " " + super.title + " " + cost);
   }
}