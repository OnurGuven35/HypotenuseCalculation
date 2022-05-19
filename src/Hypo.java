import java.util.Scanner;

public class Hypo {
    public static void main(String[] args) {

        int kenarBir, kenarIki;
        double hipotenus;

        Scanner hypo = new Scanner(System.in);

        System.out.print("1. Kenari Giriniz : ");
        kenarBir = hypo.nextInt();
        System.out.print("2. Kenari Giriniz : ");
        kenarIki = hypo.nextInt();

        hipotenus = Math.sqrt((kenarBir * kenarBir) + (kenarIki * kenarIki));
        System.out.print("Hipotenus : " + hipotenus);
    }
}
