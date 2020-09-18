import java.util.*;
public class lotto {
    public static void main(String[] args) {
        ArrayList<Integer> Rivi1 = luoLottoRivi();
        System.out.println("Minnan lottorivi: " + Rivi1);
        ArrayList<Integer> Rivi2 = luoLottoRivi();
        System.out.println("Mikon lottorivi: " + Rivi2);

        ArrayList<Integer> samatluvut = onkoSama(Rivi1 , Rivi2);
        if (samatluvut.isEmpty()) {
            System.out.println("Ei samoja lukuja");
        }
        else {
            System.out.println("Samat luvut olivat: " + samatluvut);
        }
    }

    public static ArrayList<Integer> luoLottoRivi() {
        ArrayList<Integer> lottorivi = new ArrayList<>();
        Random random = new Random();
        /*for (int i = 0 ; i < 7 ; i++) {
            int num = random.nextInt(41);
            lottorivi.add(num);
            //*System.out.println(lottorivi);
            }
        System.out.println(lottorivi); <-- ei toimi */


        do {
            int num = random.nextInt(41);
            lottorivi.add(num);
        }
        while (lottorivi.size() < 6);
            int numero = random.nextInt(41);
            if (numero != lottorivi.get(0) || numero != lottorivi.get(1) || numero != lottorivi.get(2) || numero != lottorivi.get(3) || numero != lottorivi.get(4) || numero != lottorivi.get(5) || numero != lottorivi.get(6)){
                lottorivi.add(numero);
            }
        //* System.out.println(lottorivi);
        return lottorivi;
    }
    public static ArrayList<Integer> onkoSama(ArrayList<Integer> a , ArrayList<Integer> b){
        ArrayList<Integer> samat = new ArrayList<>();
        for (int i = 0 ; i < a.size() ; i++) {
            for (int j = 0; j < b.size(); j++) {
                int aAlkio = a.get(i);
                int bAlkio = b.get(j);
                if (aAlkio == bAlkio) {
                    samat.add(bAlkio);
                    break;
                } else {
                    continue;
                }
            }
        }
        return samat;
        }
}