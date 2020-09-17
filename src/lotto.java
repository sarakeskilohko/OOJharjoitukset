import java.util.*;
public class lotto {
    public static void main(String[] args) {
        luoLottoRivi();
    }

    public static void luoLottoRivi() {
        ArrayList<Integer> lottorivi = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0 ; i < 7 ; i++) {
            int num = random.nextInt(41);
            lottorivi.add(num);
            //*System.out.println(lottorivi);
            }
        System.out.println(lottorivi);
    }
}
