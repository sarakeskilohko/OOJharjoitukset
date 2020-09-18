import java.util.*;
public class lotto {
    public static void main(String[] args) {
        System.out.println("Minnan lottorivi: ");
        luoLottoRivi();
        System.out.println("Mikon lottorivi: ");
        luoLottoRivi();
    }

    public static void luoLottoRivi() {
        ArrayList<Integer> lottorivi = new ArrayList<Integer>();
        Random random = new Random();
        /*for (int i = 0 ; i < 7 ; i++) {
            int num = random.nextInt(41);
            lottorivi.add(num);
            //*System.out.println(lottorivi);
            }
        System.out.println(lottorivi); */


        do {
            int num = random.nextInt(41);
            lottorivi.add(num);
        }
        while (lottorivi.size() < 7);
            int numero = random.nextInt(41);
            if (numero != lottorivi.get(0) || numero != lottorivi.get(1) || numero != lottorivi.get(2) || numero != lottorivi.get(3) || numero != lottorivi.get(4) || numero != lottorivi.get(5) || numero != lottorivi.get(6)){
                lottorivi.add(numero);
            }
        System.out.println(lottorivi);
    }
}
