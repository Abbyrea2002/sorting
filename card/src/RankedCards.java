/**
 * Created by abbyr on 07/11/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class RankedCards
{
   public static void main(String[] args){
      Card myCards[] = new Card [10];
      int biggestValue = -1, biggestPos = -1;
      Card tempcard;

      for (int i = 0; i<10; i++){
         myCards[i] = new Card();
         if(myCards[i].getRankValue() > biggestValue){
            biggestValue = myCards[i].getRankValue();
            biggestPos = i;
         }

      }

         System.out.println("myCards are............");
      for(int i = 0; i<10; i++){
         System.out.println(myCards[i]);
      }
      System.out.println("\nBiggest rank value is at position " + biggestPos);

      tempcard = myCards[9];
      myCards[9] = myCards[biggestPos];
      myCards[biggestPos] = tempcard;

      System.out.println("\nAfter swapping...");
      for(int i = 0; i<10; i++){
         System.out.println(myCards[i]);
      }

   }

}//class
