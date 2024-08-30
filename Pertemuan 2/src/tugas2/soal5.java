/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input string A dan B
        System.out.print("Masukkan String A = ");
        String A = scanner.nextLine();
        System.out.print("Masukkan String B = ");
        String B = scanner.nextLine();

        // 1. Menjumlahkan panjang A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Menentukan apakah A lebih besar secara leksikografis daripada B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapitalisasi huruf pertama dari A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
