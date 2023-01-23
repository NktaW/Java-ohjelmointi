import java.util.Scanner;

/*Luetaan käyttäjältä kolme liukulukua ja lasketaan ja tulostetaan näiden keskiarvo: */

public class LaskeKeskiarvo {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku 1: ");
        double luku1 = Double.valueOf(lukija.nextLine());

        System.out.println("Anna luku 2: ");
        double luku2 = Double.valueOf(lukija.nextLine());

        System.out.println("Anna luku 3: ");
        double luku3 = Double.valueOf(lukija.nextLine());

        double keskiarvo = (luku1 + luku2 + luku3) / 3;
        System.out.println("Lukujen keskiarvo: " + keskiarvo);

    }
    
}
