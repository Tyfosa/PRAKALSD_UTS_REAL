public class Manajemen {
        private Dosen[] dosenArray;
        private int jumlahDosen;
    
        public Manajemen() {
            dosenArray = new Dosen[5];
            dosenArray[0] = new Dosen("123456", "Tyfosa", "osa@polinema.ac.id", 2018, "Teknik Informatika");
            dosenArray[1] = new Dosen("234567", "Primayunita", "nita@polinema.ac.id", 2020, "Sistem Informasi");
            dosenArray[2] = new Dosen("345678", "Dessy", "Des@polinema.ac.id", 2015, "Teknik Elektro");
            dosenArray[3] = new Dosen("456789", "Zinky", "zink@polinema.ac.id", 2019, "Akuntansi");
            dosenArray[4] = new Dosen("567890", "Eko", "eko@polinema.ac.id", 2017, "Manajemen");
            jumlahDosen = 5;
        }
    
        public void tampilkanSemuaDosen() {
            System.out.println("\nDaftar Semua Dosen:");
            for (int i = 0; i < jumlahDosen; i++) {
                dosenArray[i].display();
            }
        }
    
        
         //Mengurutkan dosen berdasarkan NIDN secara ascending
         //Menggunakan algoritma Bubble Sort
        public void urutkanBerdasarkanNIDN() {
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
    
         //Mencari data dosen berdasarkan nama
         //Menggunakan algoritma Linear Search
        public Dosen cariBerdasarkanNama(String namaCari) {
            for (int i = 0; i < jumlahDosen; i++) {
                if (dosenArray[i].getNama().equalsIgnoreCase(namaCari)) {
                    return dosenArray[i];
                }
            }
            return null;
        }
    
        
         //Mengurutkan dosen berdasarkan masa kerja secara descending
         //Menggunakan algoritma Selection Sort
        public void urutkanBerdasarkanMasaKerja() {
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
    }