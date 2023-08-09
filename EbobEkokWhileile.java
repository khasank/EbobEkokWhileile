import java.util.Scanner;

public class EbobEkokWhileile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1;
        int sayi2;
        int ebob = 1;
        int ekok = 1;

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();

        if (sayi1 < sayi2) {
            int i = 1;
            while (i <= sayi1) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            i = sayi1;
            while (i <= sayi1 * sayi2) {
                if (i % sayi1 == 0 && i % sayi2 == 0) {
                    ekok = i;
                    break;
                }
                i += sayi1;
            }
        } else if (sayi2 < sayi1) {
            int i = 1;
            while (i <= sayi2) {
                if (sayi2 % i == 0 && sayi1 % i == 0) {
                    ebob = i;
                }
                i++;
            }

            i = sayi2;
            while (i <= sayi1 * sayi2) {
                if (i % sayi2 == 0 && i % sayi1 == 0) {
                    ekok = i;
                    break;
                }
                i += sayi2;
            }
        } else {
            System.out.println("Bu iki sayı birbirine eşittir.");
            return;
        }

        System.out.println("En büyük ortak bölen: " + ebob);
        System.out.println("En küçük ortak kat: " + ekok);
    }
}
