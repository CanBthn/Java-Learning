import java.util.Scanner;
public class WhileDongusu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //While ile yazılan döngülerde for döngüsü gibi otomatik azaltma olmayacaktır
        //While döngüsü içerisinde azaltma yapılmalı aksi taktirde sonsuz döngüler oluşacaktır

        int a =10;
        while(a <= 10 && a >= 0){
            System.out.println(a);
            a--;
        }

        // KODLAMA YAPARKEN DİKKAT EDİLMESİ GEREKENLER PART 1 HATIRLATMA
        // for ve while yazarken f ve w küçük yazılacaktır
        // a = a+a yazmak yerine a += a yazılabilir buradaki önemli husus + işaretini = den önce gelmesi
        // büyüktür küçüktür işaretleri kullanırken önce büyük veya küçük ardından eşittir gelmeli ( a <= veya a>= gibi)

        //FAKTORİYEL
        System.out.println("Lütfen faktoriyelini hesaplayacağınız sayıyı giriniz...");
        int b = sc.nextInt();
        int e = 1;
        while(b>=1){
            //Eğer e değişkeni dışarıda değil içeride tanımlanmış olsaydı while döngüsü dışarısında bastıramazdık
            e = e*b;
            b--;
        }
        System.out.println(e);

    }
}