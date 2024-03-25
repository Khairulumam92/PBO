import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double sisi;
    
    public Kubus(String string) {
        super.setName(string);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scan.nextDouble();
    }

    @Override
    public void volume(){
        double total = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + total);
    }
    @Override
    public void luasPermukaan(){
        double total = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + total);
    }

}
