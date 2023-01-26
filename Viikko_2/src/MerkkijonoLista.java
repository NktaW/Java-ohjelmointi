import java.util.ArrayList;

//Luodaan lista ja tallennetaan siihen viisi merkkijonoa.

public class MerkkijonoLista {
    public static void main(String[] args) {
        ArrayList<String> nimet = new ArrayList<>();

        nimet.add("Jarmo Java");
        nimet.add("Pula Python");
        nimet.add("Simo See");
        nimet.add("Raimo Rust");
        nimet.add("Pirjo Peehoopee");

        System.out.println(nimet);

    }
}
