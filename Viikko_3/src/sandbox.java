import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;


public class sandbox {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        HashMap<String, String> nrot = new HashMap<>();
        nrot.put("Pekka", "" + r.nextInt(1000000));
        nrot.put("Leena", "" + r.nextInt(1000000));
        nrot.put("Kimmo", "" + r.nextInt(1000000));
        nrot.put("Lasse", "" + r.nextInt(1000000));
        nrot.put("Liisa", "" + r.nextInt(1000000));
        nrot.put("Zorro", "" + r.nextInt(1000000));
        nrot.put("Tarzan", "" + r.nextInt(1000000));
        
        
        listaa(nrot);
        
    }

    public static void listaa(HashMap<String,String> numerot){
        ArrayList<String> lista = new ArrayList<>(numerot.keySet());

        Collections.sort(lista);

        System.out.println(lista);

        String nimi = "";

        for(int i = 0; i < lista.size(); i++){
            nimi = lista.get(i);
            System.out.println(nimi);
            System.out.println("Nimi: " + nimi + ", " + "numero: " + numerot.get(nimi));
        }
        
    }


    
}
