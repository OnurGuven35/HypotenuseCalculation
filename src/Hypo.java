// Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

import java.util.Scanner;

public class Hypo {
    public static void main(String[] args) {
        Scanner hypo = new Scanner(System.in);

        int kenarBir, kenarIki;
        double hipotenus;

        // İlk olarak Kullanıcıdan kenar uzunluklarını alıyoruz.

        System.out.println();
        System.out.print("1. Kenari Giriniz : ");
        kenarBir = hypo.nextInt();
        System.out.print("2. Kenari Giriniz : ");
        kenarIki = hypo.nextInt();

        // Daha sonra hipotenüs formülünü yazarak ekrana yazdırıyoruz.

        hipotenus = Math.sqrt((kenarBir * kenarBir) + (kenarIki * kenarIki));
        System.out.println();
        System.out.println("Hipotenus : " + hipotenus);
    }
}