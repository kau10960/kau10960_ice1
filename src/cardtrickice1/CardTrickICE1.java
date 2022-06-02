/*
Modifier- Sukhleen Kaur
Date modified- 1 June 2022
Student number- 991645881 
*/
package cardtrickice1;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(2);//use a method to generate random *13
            c1.setSuits("hearts");//random method suit 
        }
        //step 2:take input 
        
        //step 3: match with array 
    }
    
}
