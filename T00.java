import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tambah, kali;

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
            if (a < b) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                tambah = a + b;
                System.out.println("Hasil penjumlahan: " + tambah);
            } else {
                System.out.println("Berbeda jenis");
            }
        } else {
            if (b % 2 != 0) {
                kali = a * b;
                System.out.println("Hasil perkalian: " + kali);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
