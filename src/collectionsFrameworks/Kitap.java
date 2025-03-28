package collectionsFrameworks;
import java.util.*;
//📝 Görev:
//Bir kitap yönetim sistemi oluştur. Kitapları bir ArrayList içinde saklayacağız, ve her kitap için okuduğunuzu belirten bir HashSet kullanacağız. Bu sayede, aynı kitabı birden fazla kez "okundu" olarak işaretleyemeyeceğiz.
//
//🛠 Yapılacaklar Listesi:
//Kitap sınıfı oluştur:
//
//Kitap adı (String)
//
//Yazar adı (String)
//
//Okunma durumu (HashSet kullanarak "okundu" durumunu saklayacağız, okundu bir kitap birden fazla kez eklenmeyecek).
//
//Ana programı oluştur:
//
//ArrayList kullanarak bir kitap listesi oluştur.
//
//Kitapları listeye ekle.
//
//Kullanıcıdan kitap adı ve yazar adı alarak yeni kitap ekle.
//
//Okundu olarak işaretle:
//
//Kullanıcıya bir kitap adı verildiğinde, bu kitabı "okundu" olarak işaretle.
//
//Kitapları listele:
//
//Tüm kitapları ve okundu mu olmadığını ekrana yazdır.

public class Kitap {
    private String kitap;
    private String yazar;
    private Set<String> okunmaDurumu ;

    public Kitap(String kitap, String yazar) {
        this.kitap = kitap;
        this.yazar = yazar;
        this.okunmaDurumu = new HashSet<>();
    }

    public String getKitap() {
        return kitap;
    }

    public String getYazar() {
        return yazar;
    }

    public Set<String> getOkunmaDurumu() {
        return okunmaDurumu;
    }

    public void kitapOkundu (){
        okunmaDurumu.add("Okundu");
    }
    public boolean isOkundu(){
        return okunmaDurumu.contains("Okundu");
    }
    public static void main(String[] args) {
        List<Kitap> kitapList = new ArrayList<>();

        Kitap kitap1 = new Kitap("sefiller", "dostoyevski");
        Kitap kitap2 = new Kitap("tutunamayanlar", "oguz atay");

        kitapList.add(kitap1);
        kitapList.add(kitap2);

        System.out.println("Kitaplar:");
        for (Kitap klist : kitapList){
            System.out.println("Kitap ismi: " + klist.getKitap() + " - Yazar: " + klist.getYazar() +"- Okundu " + (klist.isOkundu() ? "Evet" : "Hayir") );
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nBir kitap adı girin (Okundu olarak işaretlenecek): ");
        String kitapAdi = sc.nextLine();
        for (Kitap kl : kitapList){
            if (kl.getKitap().equalsIgnoreCase(kitapAdi)){
                kl.kitapOkundu();
                break;
            }
        }
        System.out.println("\nGüncel Kitaplar:");
        for (Kitap kitap : kitapList) {
            System.out.println(kitap.getKitap() + " - Yazar: " + kitap.getYazar() + " - Okundu: " + (kitap.isOkundu() ? "Evet" : "Hayır"));
        }

        sc.close();

    }
}
