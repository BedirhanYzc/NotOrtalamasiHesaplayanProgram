import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, turkce, kimya, tarih, muzik;
        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);
        // Kullanıcıdan veri alalım

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + turkce + kimya + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Not Ortalamanız :" + sonuc);
        String str = sonuc >= 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";
        System.out.println("Durum :" + str);
    }
}