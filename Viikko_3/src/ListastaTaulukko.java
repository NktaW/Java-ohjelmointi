import java.util.Random;

import javax.print.attribute.standard.RequestingUserName;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Arrays;

public class ListastaTaulukko {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        double[] des = {0, 0.25, 0.5, 0.75};
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            ArrayList<Double> lista = new ArrayList<>();
            int koko = r.nextInt(5) + 5;
            for (int i=0; i<koko; i++) {
                double alkio = r.nextInt(10) + des[r.nextInt(des.length)];
                lista.add(alkio);
            }
            
            System.out.println("Lista: " + lista);
            double[] taulu = uusiTaulukko(lista);
            System.out.println("Taulukko: " + Arrays.toString(taulu));
            System.out.println("");
        }
    }
    
/*Kirjoita metodi

double[] uusiTaulukko(ArrayList<Double> lista)

joka saa paramertikseen liukulukuja sisältävän listan. Metodi luo ja palauttaa liukulukutaulukon, jossa on samat alkiot samassa järjestyksessä kuin listassa.
*/

    public static double[] uusiTaulukko(ArrayList<Double> lista){
        //Luodaan taulukko, ja asetataan taulukon kokoksi listan koko eli käyttämällä lista.size hakasulkeiden sisään.
        double [] taulukko = new double[lista.size()];

        //Iteroidaan, ja muutetaan lista tauloksi, sekä lisätään listan aikioiden arvot taulukkoon käyttämällä get() metodia.
        for(int i = 0; i < lista.size(); i++){
            taulukko[i] = lista.get(i);
        }

        return taulukko;
    }

}
