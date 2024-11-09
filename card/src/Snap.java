import java.util.Objects;

/**
 * Created by abbyr on 08/11/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Snap
{
   public static void main(String[] args){

      Card myCards[] = new Card [100];
      int numSnaps = 0;
      int numSuperSnaps = 0;
      for(int i = 0; i<100; i++){
         myCards[i] = new Card();
         System.out.println(myCards[i]);

         if(i > 0 && Objects.equals(myCards[i].getRankValue(), myCards[i-1].getRankValue())){
            System.out.println("SNAP!!");
            numSnaps++;

            if(Objects.equals(myCards[i].getColour(), myCards[i-1].getColour())){
               System.out.println("SUPERSNAP!!");
               numSuperSnaps++;

            }
         }

      }
      System.out.println("There were " + numSnaps + " snaps & " + numSuperSnaps + " supernaps.");
   }
}//class
