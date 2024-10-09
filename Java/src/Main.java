import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum yılını al
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        // Çin Zodyağı burçları dizisi
        String[] zodyak = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare",
                "Öküz", "Kaplan", "Tavşan", "Ejderha",
                "Yılan", "At", "Koyun"
        };

        // Çin Zodyağı burcunu hesapla
        int zodyakIndex = dogumYili % 12;
        String zodyakBurcu = zodyak[zodyakIndex];

        // Sonucu ekrana yazdır
        System.out.println("Çin Zodyağı burcunuz: " + zodyakBurcu);
    }
}
