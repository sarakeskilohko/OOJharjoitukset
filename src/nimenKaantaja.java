import java.util.*;
public class nimenKaantaja {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä nimi");
        String nimi = lukija.nextLine();
        //* System.out.println(nimi);
        String kaantynyt = "";

        for (int i = nimi.length() - 1 ; i >= 0 ; i--) {
            kaantynyt = kaantynyt + nimi.charAt(i);
        }
        System.out.println("Nimi toisinpäin on " + kaantynyt);


        nimi = nimi.toLowerCase();
        kaantynyt = kaantynyt.toLowerCase();
        /* if (nimi == kaantynyt) {
            System.out.println("Nimi on palindromi");
        }
        else {
            System.out.println("Nimi ei ole palindromi");
        } <-- ei toimi */

        if (nimi.equals(kaantynyt)) {
            System.out.println("Nimi on palindromi");
        }
        else {
            System.out.println("Nimi ei ole palindromi");
        }
    }
}
