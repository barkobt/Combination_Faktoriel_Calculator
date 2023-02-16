import java.util.Scanner;

/*
Java ile faktöriyel hesaplayan program yazıyoruz.


 */
public class Combination_Faktoriel_Finder {
    public static void main(String[] args) {
        System.out.println("Kombinasyon hesaplama programına hoşgeldiniz.\nX'in Y'li Kombinasyonu:\nX ve Y değerlerini giriniz:");
        System.out.print("X:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Y:");
        int y = input.nextInt();
        int i;
        int totalx = 1;
        int totaly = 1;
        int totaly2 = 1;
        for (i = 1; i <= x; ++i) {
            totalx *= i;

        }
        for (i = 1; i <= (x - y); ++i) {
            totaly *= i;

        }
        for (i = 1; i <= y; ++i) {
            totaly2 *= i;
        }
        System.out.println("C(" + x + "," + y + ")=" + (totalx / (totaly * totaly2)));






        /*
        int n =1;
        long total=1;
        System.out.print("Faktöriyelinin bulunmasını istediğiniz sayıyı giriniz:");
        Scanner input = new Scanner(System.in);
        int until = input.nextInt();
        while (n<=until) {
            total *= n;
            ++n;


        }System.out.println(until+"!="+total);

                                               Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
    5! / 3! * 2!
    */

    }
}
