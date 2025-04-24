public class Dosen {
    String NIDN;
    String nama;
    String email;
    int tahunMasuk;
    String programStudi;
    int masaKerja;

    public Dosen(String NIDN, String nama, String email, int tahunMasuk, String programStudi) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.programStudi = programStudi;
        hitungMasaKerja();
    }

    public void hitungMasaKerja() {
        int tahunSekarang = java.time.Year.now().getValue();
        this.masaKerja = tahunSekarang - this.tahunMasuk;
    }

    public String getNIDN() {
        return NIDN;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void display() {
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Program Studi: " + programStudi);
        System.out.println("---------------------------");
    }
}
