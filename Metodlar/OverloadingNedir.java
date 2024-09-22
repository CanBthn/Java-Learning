public class OverloadingNedir{
    
    //Return sonrası yazılan satırlar okunmayacaktır bundan doayı bu satır boştur

    public static int toplama(int a, int b, int c){
        return a+b+c;
    }

    //Satır 10 ile 12 dahil olmak üzere yorum satırı alır veya silerseniz hatayı görebilirsiniz
    public static int toplama(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(toplama(2,3,4));
        //Eğer 2'li olan 2.fonskiyonu yazmazsam hata alırım
        System.out.println(toplama(1, 2)); // 3 Değer olmadığından dolayı hata verir
        
        //Değişken kullanımı püf nokta

        int sayi3 = 0;
        if(sayi3==0){
            int sayi4 = 4;
        }
        //System.out.println(sayi4); If içerisindeki sayi4 if içerisinde kullanılabilir satır 25'te olan sout(sayi4) çalışmayacak hata verecektir

    }
}