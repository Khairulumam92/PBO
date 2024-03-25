import java.util.Scanner;

//Class Balok
public class Balok extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double panjang, lebar, tinggi ;
    public Balok(String string) {
        super.setName(string);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scan.nextDouble();

        System.out.print("Input lebar: ");
        lebar = scan.nextDouble();

        System.out.print("Input tinggi: ");
        tinggi = scan.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * ((lebar * panjang ) + (tinggi * panjang ) + (tinggi * lebar ));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan : " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil volume : " + hasil);
    }
}
