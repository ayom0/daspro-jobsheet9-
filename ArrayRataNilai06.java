import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;
        int jmlLulus = 0; 

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        
        rata2 = (double) total / nilaiMhs.length;

        
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

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
        }

        
        
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyaknya mahasiswa yang lulus (> 70): " + jmlLulus);

        
        if (rata2 >= 85) {
            System.out.println("Predikat kelas: SANGAT BAIK");
        } else if (rata2 >= 70) {
            System.out.println("Predikat kelas: BAIK");
        } else {
            System.out.println("Predikat kelas: PERLU PENDAMPINGAN");
        }
    }
}