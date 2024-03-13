import java.util.Scanner;

class Main{
    void menu(){
        System.out.println("\nMenu:\n1. Tambah Data Mahasiswa\n2. Tampilkan Data Mahasiswa\n3. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa = new Mahasiswa();
        Main main = new Main();
        int i = 0;
        while (true) {
            main.menu();
            Scanner scanInt = new Scanner(System.in);
            int pilih = scanInt.nextInt();
            if (pilih == 1) {
                mahasiswa.inputData(i);
                i++;
            } else if (pilih == 2) {
                System.out.print("Data Mahasiswa:\n"+Mahasiswa.tampilUniversitas());
                for (int j = 0; j < i; j++) {
                    System.out.println(mahasiswa.tampilDataMahasiswa(j));
                }
            } else {
                System.out.println("Adios ma bruh!!");
                break;
            }
        }
    }
}

class Mahasiswa{
    public static String[] namaMahasiswa = new String[10];
    public static String[] jurusanMahasiswa = new String[10];
    public static String[] NIM = new String[10];

    void inputData(int i){
        Scanner scanString = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa[i] = scanString.nextLine();

        System.out.print("Masukkan NIM Mahasiswa: ");
        NIM[i] = scanString.nextLine();
        while(true){
            if (String.valueOf(NIM[i]).length() != 15 ) {
                System.out.print("Nim Harus 15 Digit!!\n");
                System.out.print("Masukkan NIM Mahasiswa: ");
                NIM[i] = scanString.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Masukkan Jurusan Mahasiswa: ");
        jurusanMahasiswa[i] = scanString.nextLine();

        System.out.print("Data Mahasiswa Berhasil Ditambahkan.\n");
    }

    static String tampilUniversitas(){
        return "Universitas Muhammadiyah Malang\n";
    }
    String tampilDataMahasiswa(int i){
        return "Nama: "+namaMahasiswa[i]+", NIM: "+(NIM[i])+", Jurusan: "+jurusanMahasiswa[i];
    }
}