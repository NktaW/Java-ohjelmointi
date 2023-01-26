import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class LisaaLukuListaan {
    public static void main(String[] args){
        final Random r = new Random();
            
        Scanner lukija = new Scanner(System.in);

            ArrayList<Integer> luvut = new ArrayList<>();
            while(true){
                System.out.print("Anna luku: ");
                int luku = lukija.nextInt();
                if(luku != -1){
                    luvut.add(luku);
                }
                if(luku == -1){
                    System.out.println(luvut);
                    break;
                }

        }
    }    
    
}
