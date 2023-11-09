import java.util.Scanner;

public class SistemKompensasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pemilihan;

       do {
        System.out.println("Silahkan pilih menu: ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswwa");
        System.out.print("Masukkan pilihan : ");
        pemilihan = input.nextInt();

       if (pemilihan == 1) {
        System.out.println("Anda memilih peran Admin.");
       } else if (pemilihan == 2) {
        System.out.println("Anda memilih peran Mahasiswa.");
       } else {
        System.out.println("Pilihan tidak valid. Silahkan pilih 1 (Admin) atau 2 (Mahasiswa). ");
       }
    } while (pemilihan != 1 && pemilihan != 2);
    
        String[][] akun = {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"}
        };
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        System.out.println("Selamat datang!");

        while (!loggedIn) {
            System.out.print("Masukkan nama pengguna: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan kata sandi: ");
            String password = scanner.nextLine();

            for (int i = 0; i < akun.length; i++) {
                if (username.equals(akun[i][0]) && password.equals(akun[i][1])) {
                    loggedIn = true;
                    System.out.println("Login berhasil. Selamat datang, " + username + "!");
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Login gagal. Nama pengguna atau kata sandi salah. Coba lagi.");
             
            }
        }

        Scanner scanner2 = new Scanner(System.in);
        String[] namaLengkap = new String[50];
        String[] nim = new String[50];
        String[] jurusan = new String[50];
        String[] prodi = new String[50];
        int jumlahMahasiswa = 0;

        System.out.println("======Masukan Data Mahasiswa=====");
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("Masukkan biodata mahasiswa ke-" + (jumlahMahasiswa + 1));
            System.out.print("Nama Lengkap: ");
            namaLengkap[jumlahMahasiswa] = scanner2.nextLine();
            System.out.print("NIM: ");
            nim[jumlahMahasiswa] = scanner2.nextLine();
            System.out.print("Jurusan: ");
            jurusan[jumlahMahasiswa] = scanner2.nextLine();
            System.out.print("Prodi: ");
            prodi[jumlahMahasiswa] = scanner2.nextLine();

            jumlahMahasiswa++;

            System.out.print("Tambahkan biodata mahasiswa lainnya? (Y/T): ");
            String pilihan = scanner2.next();
            if (pilihan.equalsIgnoreCase("T")) {
                lanjut = false;
            }
        }

        System.out.println("===============================");
        System.out.println("====== BIODATA MAHASISWA ======");
        System.out.println("===============================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama Lengkap: " + namaLengkap[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jurusan: " + jurusan[i]);
            System.out.println("Prodi: " + prodi[i]);
            System.out.println();
        }
        Scanner scanner3 = new Scanner(System.in);

        double angka1, angka2, hasil;

        String[] tugas = new String[50];
        int jmlTgs = 0;

        int pilihan = 0;
        int milih;

        do {
            System.out.println("========**PILIH DAFTAR MENU**======= ");
            System.out.println("1. Cek Jam Kompen dan Tugas");
            System.out.println("2. Riwayat Tugas");
            System.out.println("3. Keluar");

            milih = input.nextInt();

            switch (milih) {
                case 1:
                    System.out.println("**PENGHITUNGAN JAM KOMPENSASI**");
                    int jam_alfa;
                    double ketentuan_kompensasi = 2.0, keputusan_jam_kompensasi;
                    

                    System.out.print("Masukkan Jam Alfa: ");
                    jam_alfa = input.nextInt();
                    keputusan_jam_kompensasi = jam_alfa * ketentuan_kompensasi;
                    System.out.println("Keputusan Jam Kompensasi: " + keputusan_jam_kompensasi);

                    System.out.println("===========================");
                    System.out.println("======**DAFTAR TUGAS**======");
                    System.out.println("===========================");
                    int daftarPilihan;

                    do {
                        System.out.println("Silahkan pilih daftar tugas : ");
                        System.out.println("1. Menjaga Kantin");
                        System.out.println("2. Membantu Dosen");
                        System.out.println("3. Membantu OB");
                        System.out.println("4. Membersihkan kamar mandi");
                        System.out.print("Pilih daftar tugas : ");
                        daftarPilihan = input.nextInt();

                        if (daftarPilihan >= 1 && daftarPilihan <= 4) {
                            String tugasTerpilih = "";
                            switch (daftarPilihan) {
                                case 1:
                                    tugasTerpilih = "tugas menjaga kantin. SILAHKAN DILAKUKAN !";
                                    break;
                                case 2:
                                    tugasTerpilih = "tugas membantu dosen. SILAHKAN DILAKUKAN !";
                                    break;
                                case 3:
                                    tugasTerpilih = "tugas membantu OB. SILAHKAN DILAKUKAN !";
                                    break;
                                case 4:
                                    tugasTerpilih = "tugas membersihkan kamar mandi. SILAHKAN DILAKUKAN !";
                                    break;
                            }
                            System.out.println("Anda memilih " + tugasTerpilih);
                        } else {
                            System.out.println("Pilihan tidak valid. Silahkan pilih daftar tugas di atas !");
                        }
                    } while (daftarPilihan < 1 || daftarPilihan > 4);
                    break;
                case 2:
                Scanner scanner4 = new Scanner(System.in);
                    while (jmlTgs < tugas.length) {
                        System.out.print("Masukan Tugas yang harus dilakukan (atau ketik 'selesai' untuk selesai): ");
                        String tugasBaru = scanner4.next();
                        if (tugasBaru.equalsIgnoreCase("selesai")) {
                            break;
                        }
                        tugas[jmlTgs] = tugasBaru;
                        jmlTgs++;
                    }

                    String[][] riwayatTugas = new String[jmlTgs][2];

                    for (int i = 0; i < jmlTgs; i++) {
                        riwayatTugas[i][0] = "Tugas " + (i + 1);
                        riwayatTugas[i][1] = tugas[i];
                    }

                    System.out.print("Masukkan tugas yang ingin dicari: ");
                    input.nextLine();
                    String tugasDicari = scanner4.nextLine().toLowerCase();
                    boolean ditemukan = false;

                    for (int i = 0; i < riwayatTugas.length; i++) {
                        if (riwayatTugas[i][1].toLowerCase().contains(tugasDicari)) {
                            System.out.println("Tugas ditemukan: " + riwayatTugas[i][0] + ": " + riwayatTugas[i][1]);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Tugas tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("Program berhenti.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (milih != 3);
    }
}


