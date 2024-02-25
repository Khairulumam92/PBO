import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args){
        String NamaAnda;
        String jenisKelamin;
        String TanggalLahirIN;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        NamaAnda = scan.nextLine();
        System.out.print("Jenis kelamin (L/P) : ");
        String JenisKelaminIN = scan.nextLine();
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        TanggalLahirIN = scan.nextLine();

        /*untuk memilih jenis kelamin akan tetapi saya modifikasi sedikit menggunakan operator logika,
        sehingga meskipun pengguna tidak menginput huruf kapital hasilnya akan tetap valid*/
        if (JenisKelaminIN.equals("L") || JenisKelaminIN.equals("l")) {
            jenisKelamin = "Laki-laki";
        } else if (JenisKelaminIN.equals("P") || JenisKelaminIN.equals("p")) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Pilih dengan benar!!!";
        }

        // mengkonversi string tanggal lahir ke objek LocalDate
        LocalDate TanggalLahir = LocalDate.parse(TanggalLahirIN);

        // menghitung selisih antara tanggal lahir dan tanggal sekarang
        LocalDate TanggalSekarang = LocalDate.now();
        Period total = Period.between(TanggalLahir, TanggalSekarang);

        // Untuk mendapatkan tahun, bulan, dan hari dari Period "total"
        int tahun = total.getYears();
        int bulan = total.getMonths();
        int hari = total.getDays();

        //menampilkan output nama, jenis kelamin serta umur
        System.out.println("Nama : " + NamaAnda);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur Anda : " + tahun + " tahun " + bulan + " bulan " + hari + " hari");

        
    }
}
