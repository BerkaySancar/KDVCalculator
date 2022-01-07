import java.util.Scanner;

public class KdvCalculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, kdvli, kdv;
        System.out.print("Ürünün fiyatını giriniz: ");
        price = input.nextDouble();
        kdv = (price > 1000) ? 0.8 : 0.18;
        kdvli = price + (price * kdv);
        System.out.println(" Kdv'li tutar: " + kdvli + " TL");
        System.out.println(" Kdv'siz tutar: " + price + " TL");
        System.out.println(" Kdv tutarı: %" + kdv);
    }
}
