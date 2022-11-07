//stesh969@student.otago.ac.nz
public class SongApp {
  public static void main(String args[]){
    //creates 1st instance of song and calls tostring and process method on it
    Song song1 = new Song("While my guitar gently weeps");
    System.out.println(song1.toString());
    song1.process();
    
    //creates 2nd instance of song and calls tostring and process method on it
    Song song2 = new Song("Let it be");
    System.out.println(song2.toString());
    song2.process();
    
    //creates 3rd instance of song and calls tostring and process method on it
    Song song3 = new Song("Penny Lane");
    System.out.println(song3.toString());
    song3.process();
    
  } //end method
}// end class