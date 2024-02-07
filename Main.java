import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kenarGirdisi = new Scanner(System.in);
        System.out.print("Lütfen dikdörtgenin birinci kenarını girin.");
        float ilkKenar = kenarGirdisi.nextFloat();
        System.out.print("Lütfen dikdörtgenin ikinci kenarını girin.");
        float ikinciKenar = kenarGirdisi.nextFloat();

        float dikdörtgenninAlani;
        dikdörtgenninAlani = ilkKenar * ikinciKenar; //Alan hesabı

        System.out.println("Dikdörtgenin alanı " + dikdörtgenninAlani + " dır."); //Alan çıktısı
        System.out.println("Aşağıda bu dikdörtgenin temsili bir görünümü vardır.");
        int i;
        int j;
        for (i = 0; i < ilkKenar; i++) { //Dikdörtgenin yıldızlarla temsili
            for (j = 0; j < ikinciKenar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}