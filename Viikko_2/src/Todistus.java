import java.util.Random;

public class Todistus {
    public static void main(String[] args){
        final Random r = new Random();
        
        String[] aineet = "Matematiikka Kemia Äidinkieli Fysiikka Liikunta Uskonto Biologia Maantiede".split(" ");
        String[] as = "neljä viisi kuusi seitsemän kahdeksan".split(" ");
        
        for (int i=1; i<=3; i++) {
            System.out.println("Testi " + i);
            String td = "";
            for (String a : aineet) {
                td += a + ": " + as[r.nextInt(5)];
                td +=", ";
            }
            td = td.substring(0, td.length() -2);
            
            System.out.println("Todistus ennen: ");
            System.out.println("" + td);
            System.out.println("Todistus korjattuna: ");
            System.out.println(korjaa(td));
            System.out.println("");
            
        }
        
    }
    /*Erno on laiskotellut koulussa, eikä todistus näytä siltä että sitä uskaltaisi näyttää vanhemmille.

        Kirjoita metodi 

        String korjaa(String todistus)

        jolla Erno saa korjattua todistuksen salonkikelpoiseksi. Arvosanat tulee korvata seuraavasti:

        neljä --> kahdeksan
        viisi --> yhdeksän
        kuusi --> kymmenen */
    
   public static String korjaa(String todistus){
       todistus = todistus.replace("neljä", "kahdeksan");
       todistus = todistus.replace("viisi", "yhdeksän");
       todistus = todistus.replace("kuusi", "kymmenen");
       return todistus;

   }


}
