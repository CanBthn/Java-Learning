import java.util.Scanner;
public class Metodlar2{
    public static void Selamlama2(String isim){
        System.out.println("Selam " + isim);
    }
    public static void Selamlama3(String isim){
        System.out.println("Selam " + isim);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim = sc.next();
        //next ile nextLine arasındaki fark nextLine girilen tüm satırı alırken next ilk boşluğa kadar alır
        //Batuhan Can yazarsak next sadece Batuhan alırken nextLine Batuhan Can olarak alır
        //nextLine sürekli kullanım sırasında boşlukları cevap olarak alabilir kodunuzu bug'a sokabilir
        Selamlama2(isim);
        //Veya
        Selamlama3("Batuhan");
        

    }
}