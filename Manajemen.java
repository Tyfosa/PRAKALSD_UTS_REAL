public class Manajemen {
     Dosen[] dosenArray;
     int jumlahDosen;
     final int MAX_DOSEN = 100;
    
        public Manajemen() {
            dosenArray = new Dosen[MAX_DOSEN];
            jumlahDosen = 0;
        }
    
        public void tambahDosen(Dosen dosen) {
            if (jumlahDosen < MAX_DOSEN) {
                dosenArray[jumlahDosen] = dosen;
                jumlahDosen++;
            } else {
                System.out.println("Kapasitas data dosen penuh.");
            }
        }
    
        public void tampilkanSemuaDosen() {
            if (jumlahDosen == 0) {
                System.out.println("Belum ada data dosen.");
                return;
            }
    
            System.out.println("\nDaftar Semua Dosen:");
            for (int i = 0; i < jumlahDosen; i++) {
                dosenArray[i].display();
            }
        }
    
        // Method untuk mengurutkan berdasarkan NIDN (Bubble Sort)
        public void urutkanBerdasarkanNIDN() {
            if (jumlahDosen == 0) {
                System.out.println("Belum ada data dosen.");
                return;
            }
            
            //implementasi bubblesort
            for (int i = 0; i < jumlahDosen - 1; i++) {
                for (int j = 0; j < jumlahDosen - i - 1; j++) {
                    if (dosenArray[j].getNIDN().compareTo(dosenArray[j + 1].getNIDN()) > 0) {
                        Dosen temp = dosenArray[j];
                        dosenArray[j] = dosenArray[j + 1];
                        dosenArray[j + 1] = temp;
                    }
                }
            }
            System.out.println("Data dosen telah diurutkan berdasarkan NIDN (Ascending) menggunakan Bubble Sort.");
        }
    
        // Method untuk mencari berdasarkan nama (Linear Search)
        public Dosen cariBerdasarkanNama(String namaCari) {
            //implementasi Linear Search
            for (int i = 0; i < jumlahDosen; i++) {
                if (dosenArray[i].getNama().equalsIgnoreCase(namaCari)) {
                    return dosenArray[i];
                }
            }
            return null;
        }
    
        // Method untuk mengurutkan berdasarkan masa kerja (Selection Sort)
        public void urutkanBerdasarkanMasaKerja() {
            if (jumlahDosen == 0) {
                System.out.println("Belum ada data dosen.");
                return;
            }
            //implementasi selection sort
            for (int i = 0; i < jumlahDosen - 1; i++) {
                int maxIndex = i;
                for (int j = i + 1; j < jumlahDosen; j++) {
                    if (dosenArray[j].getMasaKerja() > dosenArray[maxIndex].getMasaKerja()) {
                        maxIndex = j;
                    }
                }
                if (maxIndex != i) {
                    Dosen temp = dosenArray[i];
                    dosenArray[i] = dosenArray[maxIndex];
                    dosenArray[maxIndex] = temp;
                }
            }
            System.out.println("Data dosen telah diurutkan berdasarkan Masa Kerja (Descending) menggunakan Selection Sort.");
        }

        public int getJumlahDosen() {
            return jumlahDosen;
        }
    
        public Dosen[] getDosenArray() {
            return dosenArray;
        }
    }
    
