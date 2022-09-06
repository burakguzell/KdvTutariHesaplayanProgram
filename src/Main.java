import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat,kdv,kdvTutari,kdvliFiyat;

        Scanner imp = new Scanner(System.in);

        System.out.print("Fiyat Giriniz : ");
        fiyat = imp.nextDouble();
        System.out.println("KDV'siz Fiyat : "+ fiyat);

        kdv = fiyat <= 1000 ? 0.18 : 0.08 ;
        System.out.println("KDV Oranı : " + kdv);

        kdvTutari = fiyat * kdv;
        System.out.println("KDV Tutarı : " + kdvTutari);

        kdvliFiyat = fiyat + kdvTutari;
        System.out.println("KDV'li Fiyat : " + kdvliFiyat);

    }
}
