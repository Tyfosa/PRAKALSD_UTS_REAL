import java.util.Scanner;

public class ManajemenDosen {
    private static Manajemen manajemen = new Manajemen();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\nSistem Pengelolaan Data Dosen Polinema");
            System.out.println("1. Tampilkan Semua Data Dosen");
            System.out.println("2. Urutkan Dosen Berdasarkan NIDN (Ascending)");
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Urutkan Dosen Berdasarkan Masa Kerja (Descending)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    manajemen.tampilkanSemuaDosen();
                    break;
                case 2:
                    manajemen.urutkanBerdasarkanNIDN();
                    manajemen.tampilkanSemuaDosen();
                    break;
                case 3:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCari = scanner.nextLine();
                    Dosen dosen = manajemen.cariBerdasarkanNama(namaCari);
                    if (dosen != null) {
                        System.out.println("\nData Dosen Ditemukan:");
                        dosen.display();
                    } else {
                        System.out.println("Dosen tidak ditemukan.");
                    }
                    break;
                case 4:
                    manajemen.urutkanBerdasarkanMasaKerja();
                    manajemen.tampilkanSemuaDosen();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}