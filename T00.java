// 12S25035-SINTIA GENI AUDI NAINGGOLAN
//12S25059-ERVINNA CHRISTINE DEBORA
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, t1, t2;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b > a) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            t1 = a + b;
            System.out.println("Hasil penjumlahan: " + t1);
        } else {
            if (a % 2 != 0 && b % 2 != 0) {
                t2 = a * b;
                System.out.println("Hasil perkalian: " + t2);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
