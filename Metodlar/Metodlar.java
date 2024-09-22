import java.util.Scanner;
public class Metodlar{
   
    //"public static void" Kalıbında public static bir kalıp iken void kelimesi return olmayacağını gösterir
    public static void Selamlama(){ //Void olmasının sebebi herhangi bir return değeri olmayacak olmasıdır
        System.out.println("Merhaba ben Batuhan");
    }
    
    public static void Faktoriyel(int sayi){
        int sonuc = 1;
        int sayiTutma = sayi;
        while(sayi>0){
            sonuc *= sayi;
            sayi--;
        }
        System.out.println(sayiTutma + " Sayısının Faktoriyeli " + sonuc);
    }
    
    //Bunu yazmanın başka bir yolu
    public static void Faktoriyel2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini hesaplamak istediğiniz sayıyı giriniz...");
        int girilenDeger = sc.nextInt();
        int sonuc = 1;
        int sayiTutma = girilenDeger;
        while(girilenDeger>0){
            sonuc *= girilenDeger;
            girilenDeger--;
        }
        System.out.println(sayiTutma + " Sayısının Faktoriyeli " + sonuc);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Bir kere yazılır ve devamlı yazmak yerine kullanmak için çağırırız
        Selamlama(); //Bu fonskiyonu çağırmak için kullandığımız satır
        System.out.println("Lütfen faktoriyelini hesaplamak istediğiniz sayıyı giriniz...");
        int girilenDeger = sc.nextInt();
        Faktoriyel(girilenDeger); //Buradaki girilenDeğer sayısı yukarıdaki fonksiyondaki "int sayi" olacaktır

        Faktoriyel2(); //Yukarıda bir değer yollarken burada sadece fonksiyonu çağırıyor tüm işlemleri/adımları fonksiyon içerisinde yapıyoruz


    }
}