/*Jos halutaan käydä kaikki alkiot läpi, eikä listaa ole tarvetta muuttaa, on helpointa käyttää ns.
laajennettua for-lausetta. Tämä muistuttaa Pythonin for-lausetta. 

Ideana on, että poimitaan yksi kerrallaan alkiot annetusta listasta ja sijoitetaan ne yksitellen muuttujaan. 
Jokaisen sijoituksen jälkeen suoritetaan lohko.

Esimerkiksi seuraava ohjelma tulostaa listan kaikki alkiot allekkain: */

import java.util.ArrayList;

public class KayKaikkiAlkiot {
    public static void main(String[] args){
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(10);
        luvut.add(5);
        luvut.add(6);
        luvut.add(22);
        luvut.add(-4);

        for (int luku : luvut) {
            System.out.println(luku);
        }
    }
    
}
