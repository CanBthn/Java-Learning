public class BreakCont{
    public static void main(String[] args){
        int a = 10;
        while(a<=10 && a>=0){
            a--;
            if(a==7) continue; //Eğer bu satır açık olursa 7'ye geldikten sonra while döngüsünün başına döner ve 7 bastırılmaz !!! Sonsuz döngüye sebep olabilir !!!
            if(a==3) break;
            System.out.println(a);

            // Continue okunduğunda bir sonraki satıra değil döngünün başına gidilmesine sebep olur
            // Break ise okunduğu yerden itibariyle döngüden çıkılmasına sebep olur
        }
        System.out.println("Bitti"); // Break sonrasında döngü bitti ve döngü dışından kod devam etti
    }
}