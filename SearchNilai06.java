import java.util.Scanner;

public class SearchNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlahElemen = input.nextInt();

        int[] nilai = new int[jumlahElemen];

       
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

       
        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = input.nextInt();

        int indeksHasil = -1;

       
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                indeksHasil = i;
                break; // Hentikan loop jika nilai ditemukan (Pertanyaan 1)
            }
        }

        
        if (indeksHasil != -1) {
            System.out.println("Nilai " + key + " ditemukan, merupakan elemen ke-" + indeksHasil + " (indeks ke-" + indeksHasil + ")");
        } else {
            System.out.println("Pencarian Gagal: Nilai " + key + " tidak ditemukan di dalam daftar array.");
        }
    }
}