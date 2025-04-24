import java.util.Scanner;
    public class main {
    private static Manajemen dosenManager = new Manajemen();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); 
            switch (pilihan) {
                case 1:
                    tambahDosen();
                    break;
                case 2:
                    tampilkanSemuaDosen();
                    break;
                case 3:
                    urutkanDanTampilkanNIDN();
                    break;
                case 4:
                    cariDanTampilkanNama();
                    break;
                case 5:
                    urutkanDanTampilkanMasaKerja();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private static void tampilkanMenu() {
        System.out.println("\nSistem Pengelolaan Data Dosen Polinema");
        System.out.println("1. Tambah Data Dosen");
        System.out.println("2. Tampilkan Semua Data Dosen");
        System.out.println("3. Urutkan Dosen Berdasarkan NIDN (Ascending)");
        System.out.println("4. Cari Dosen Berdasarkan Nama");
        System.out.println("5. Urutkan Dosen Berdasarkan Masa Kerja (Descending)");
        System.out.println("0. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    private static void tambahDosen() {
        System.out.println("\nTambah Data Dosen Baru");
        System.out.print("NIDN: ");
        String nidn = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Program Studi: ");
        String programStudi = scanner.nextLine();

        Dosen dosenBaru = new Dosen(nidn, nama, email, tahunMasuk, programStudi);
        dosenManager.tambahDosen(dosenBaru);
        System.out.println("Data dosen berhasil ditambahkan.");
    }

    private static void tampilkanSemuaDosen() {
        dosenManager.tampilkanSemuaDosen();
    }

    private static void urutkanDanTampilkanNIDN() {
        dosenManager.urutkanBerdasarkanNIDN();
        dosenManager.tampilkanSemuaDosen();
    }

    private static void cariDanTampilkanNama() {
        System.out.print("Masukkan nama dosen yang dicari: ");
        String namaCari = scanner.nextLine();
        Dosen dosen = dosenManager.cariBerdasarkanNama(namaCari);

        if (dosen != null) {
            System.out.println("\nData Dosen Ditemukan:");
            dosen.display();
        } else {
            System.out.println("Dosen dengan nama '" + namaCari + "' tidak ditemukan menggunakan Linear Search.");
        }
    }

    private static void urutkanDanTampilkanMasaKerja() {
        dosenManager.urutkanBerdasarkanMasaKerja();
        dosenManager.tampilkanSemuaDosen();
    }
}
    

