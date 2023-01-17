import java.util.Scanner;

/*Alla olevassa ohjelmassa lasketaan käyttäjän syöttämien lukujen neliöitä (eli luku x luku tai  luku2
 ) kunnes tämä syöttää nollan: */

public class nelioita {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            }

            System.out.println("Luvun neliö on" + (luku * luku));
        }
        System.out.println("Moikka!");
    }
}
