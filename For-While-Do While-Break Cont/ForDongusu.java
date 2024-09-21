import java.util.Scanner;
public class ForDongusu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){  //9'a kadar sayacaktır
            System.out.println(i); //Buradaki i sadece döngüye aittir
        }

        int b;
        for(b=2; b<5; b++){ //B'yi önce tanımladık ve tekrardan tanımlam
            System.out.println(b);
        }
        System.out.println(b); //B değeri tüm dosya için tanımlandığından dolayı genel bir artış oluyor

        int c = 3;
        for(; c<10; c++){   //Dışarıda tanımladığımız için içeride tekrar tanımlamaya ve değer vermeye gerek duymuyoruz
            System.out.println(c);
        }
    
        for(; b>=5 && c>=0; b++,c--){ //Burada 2 değişkene bağlı olarak yazabiliriz
            System.out.println("B = " + b + " C = " + c); //c++ olsaydı sonsuz bir döngü olacaktı
        }

        //FAKTORİYEL BULMA
        System.out.println("Lütfen faktoriyelini alacağınız sayıyı giriniz...");
        int a = sc.nextInt();
        int d = 1; //Çarptıktan sonra 0 olmamaı için 1 verilmeli
        
        //  YÖNTEM 1
        for(; a>=1; a--){ //a değeri dışarıdan geleceğinden dolayı tanımlama yapılmaz
            d *= a;
        }
        System.out.println(d);

        //  YÖNTEM 2
        for(; d==a; d++){   //d değişkeni a değişkenine eşit olana kadar artacak ve durmadan kendisiyle çarpılacaktır
            d *= d;
        }
        System.out.println(d);
    }
}