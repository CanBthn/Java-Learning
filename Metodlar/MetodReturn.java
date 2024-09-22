import java.util.Scanner;
public class MetodReturn{

    //Bu classta return mantığını öğreneceğiz

    public static int toplama(int a, int b){ //Artık void değil return kullanacağımzıdan dolayı int
        return a+b;
        ///int sayi = 1; //Return sonrası yazılan satırlar okunmayacaktır bundan doayı bu satır boştur ve ulaşılamayacağından dolayı hata olacaktır
    }

    public static int cıkarma(int a, int b){
        return a-b;
    }

    public static int carpma(int a, int b){
        return a*b;
    }

    public static float bölme(float a, float b){ //Double ve float ondalık değerler için kullanılır fakat float 32 bit yer tutarken double 64 bitlik yer tutar
        return a/b;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen istediğiniz 2 sayıyı giriniz...");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        System.out.print("Sayıların toplamı " + toplama(sayi1, sayi2)); //Return kısmı int olduğundan dolayı main fonksiyonunda toplamaları bizim bastırmamız gerekiyor
        System.out.println(" Sayıların farkı " + cıkarma(sayi1, sayi2) + " Sayıların çarpımı " + carpma(sayi1, sayi2) + " Sayıların bölümü " + bölme(sayi1, sayi2));
        //Print kullanma sebebimiz farklı satırlarda yazmak istemiyor oluşumuz

        //Fonskiyonları iç içe kullanabilirz

        System.out.println(toplama(carpma(sayi1, sayi2), cıkarma(sayi1, sayi2)));
        //Önce 10 ile 5 çarpıldı 50 elde edildi ardından farkları olan 5 elde edildi en sonda ise 2 si toplanarak 55 elde ettik
    }
}