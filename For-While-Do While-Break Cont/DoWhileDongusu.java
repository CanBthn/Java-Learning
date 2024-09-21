import java.util.Scanner;
public class DoWhileDongusu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            a++;
            System.out.println(a);
        }
        while(a>=0 && a<=10); //Burada ; olmasının sebebi while döngüsü içerisinde bir işlem yapılmaz do kısmı işlemin yapıldığı yerdir
        
        //10'a gelince bir kere daha yukarı gideceğinden dolayı son değer 11 olur lakin yer değiştirirsek
        int b=0;
        do {
            System.out.println(b);
            b++; // Değer 11 olur ama biz artık 10 görürüz
        }
        while(b>=0 && b<=10);
        System.out.println(b); //Burada bakarsak değer en sonda 1 arttığından dolayı 11 olarak görünür

        // SAYILARIN TOPLAMINI BULMA
        // 1234 Sayısının rakamlarının toplamı kaçtır ?
        System.out.println("Lütfen rakamlarının toplamını bulmak istediğiniz sayıyı giriniz...");
        int c = sc.nextInt();
        int toplam=0;
        do {
            toplam += (c%10);
            c/=10;
        }
        while(c>0);
        System.out.println(toplam);
    }
}