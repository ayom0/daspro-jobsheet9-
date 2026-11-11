import java.util.Scanner;

public class Tugas1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;

       
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

       
        double rata2 = (double) total / nilaiMhs.length;

        
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

       
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + status + ")");
        }

        System.out.println("---------------------------------");
        System.out.println("Total Nilai    : " + total);
        System.out.println("Rata-rata Nilai: " + rata2);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("=================================");
    }
}