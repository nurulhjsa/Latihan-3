import java.util.Scanner;
import java.lang.Math;

public class Scanner1
{
    public static void HitungPersegi()
    {
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan nilai sisi persegi :");
        Double sisi = tes.nextDouble();

        System.out.println("Dengan sisi " +sisi+ "cm , Maka Luas Persegi tersebut adalah " +((sisi*sisi)/100)+"m");
    }

    public static void HitungPersegiPanjang()
    {
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan nilai pajang :");
        Double panjang = tes.nextDouble();
        System.out.print("Masukkan nilai lebar :");
        Double lebar = tes.nextDouble();

        System.out.println("Dengan panjang " +panjang+ "m dan lebar " +lebar+ "m, Maka luas persegi panjang tersebut adalah " +(panjang*lebar)+"m");
    }
    
    public static void HitungLingkaran(){
        Scanner tes = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari :");
        Double jariJari = tes.nextDouble();

        System.out.println("Dengan jari-jari " +jariJari+ "m dan nilai phi " +Math.PI+ ", Maka keliling lingkaran tersebut adalah " +((2*jariJari)*Math.PI)+"m");
    }
    
    public static void main(String[] args)
    {
            Scanner tes = new Scanner(System.in);
            System.out.println("Masukkan Pilihan : ");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi Panjang ");
            System.out.println("3. Lingkaran ");
            Integer baru = tes.nextInt();
            if (baru==1){
                HitungPersegi();
            } else if(baru==2){
                HitungPersegiPanjang();
            } else if (baru==3){
                HitungLingkaran();
            } else {
                System.out.println("Pilihan Salah");
            }
            
        }
}