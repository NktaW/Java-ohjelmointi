import java.util.Random;
import java.util.Scanner;

/*Kirjoita ohjelma, joka kysyy käyttäjältä vuotta ja ilmoittaa, onko annetttu vuosi karkausvuosi vai ei.

Vuosi on karkausvuosi jos se on tasan jaollinen neljällä. 

Sadalla jaollinen vuosi on kuitenkin karkausvuosi vain silloin, jos se on jaollinen myös neljälläsadalla.

Niinpä esim. vuodet 2000 ja 2004 ovat karkausvuosia, mutta vuosi 1900 ei ole.
 */

public class OnkoKarkausvuosi {
    public static void main(String[] args){
        final Random r = new Random();

        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int year = Integer.valueOf(lukija.nextLine());
        boolean leap = false;
        
        
        if (year % 4 == 0) {
        
            if (year % 100 == 0) {
        
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
              
            else
                leap = true;
        }
            
        else
            leap = false;

        if (leap)
            System.out.println("On karkausvuosi");
        else
            System.out.println("Ei ole karkausvuosi");

    }
}
