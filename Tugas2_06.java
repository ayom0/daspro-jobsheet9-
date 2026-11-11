import java.util.Scanner;

public class Tugas2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

      
        System.out.println("=== DAFTAR MENU KAFE KAMPUS ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
        System.out.println("=================================\n");

       
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); 

       
        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananHarga = new int[jumlahPesanan];
        int totalBiaya = 0;

        
        for (int i = 0; i < jumlahPesanan; i++) {
            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu item ke-" + (i + 1) + ": ");
                String namaCari = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaCari)) {
                        pesananNama[i] = menu[j];
                        pesananHarga[i] = harga[j];
                        totalBiaya += harga[j];
                        ditemukan = true;
                        System.out.println("--> Menu " + menu[j] + " ditemukan! Harga: Rp" + harga[j]);
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("--> [ERROR] Menu '" + namaCari + "' tidak tersedia. Silakan masukkan ulang nama menu yang sesuai!");
                }
            }
            System.out.println();
        }

       
        System.out.println("=== STRUK PEMESANAN ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + " - Rp" + pesananHarga[i]);
        }
        System.out.println("---------------------------------");
        System.out.println("TOTAL BIAYA PESANAN : Rp" + totalBiaya);
        System.out.println("=================================");
    }
}