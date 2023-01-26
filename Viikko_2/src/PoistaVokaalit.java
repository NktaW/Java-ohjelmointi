import java.util.Random;

public class PoistaVokaalit {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] s = "apea koira kissa rankkuri kulkuneuvo rapsakka hilipalihippan testilöinen".split(" ");
        for (String pa : s) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Ilman vokaaleja: " + poistaVokaalit(pa));
            System.out.println("");
        }
        
    }

    public static String poistaVokaalit(String sana){
        sana = sana.replaceAll("[AEIOUÄÖaeiouäö]", "");
        return sana;
    }

    
}
