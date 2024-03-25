import java.util.Scanner;

public class Tabung extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double tinggi, jari_jari;

    public Tabung(String string) {
        super.setName(string);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input jari-jari : ");
        jari_jari = scan.nextDouble();
        System.out.print("Input tinggi : ");
        tinggi = scan.nextDouble();
    }
    @Override
    public void luasPermukaan(){
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan : " + hasil);
    }
    @Override
    public void volume(){
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        System.out.println("Hasil volume : " + hasil);
    }
}