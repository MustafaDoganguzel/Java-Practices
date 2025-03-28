package collectionsFrameworks;
import java.util.*;

//📌 Yapılacaklar Listesi
//Bir "Ogrenci" sınıfı oluştur.
//Öğrencinin adı olacak (String).
//Öğrencinin dersleri olacak (HashSet kullan).
//Ders eklemek için bir metot yaz.
//Öğrencinin adını ve derslerini almak için getter metotları yaz.

//Ana programı yaz.
//ArrayList kullanarak bir ogrenciListesi oluştur.
//İçine 2-3 tane öğrenci ekle (isimlerini sen belirleyebilirsin).
//Her öğrencinin derslerini ekle (örneğin: "Matematik", "Fizik", "Kimya").
//Tüm öğrencileri ve derslerini ekrana yazdır.

//Kullanıcıdan giriş alarak bir öğrencinin derslerini göster.
//Kullanıcı öğrenci ismini yazınca, o öğrencinin aldığı dersleri ekrana yazdır.
public class Student {
    private String isim;
    private Set<String> dersler = new HashSet<>();

    public Student(String isim) {
        this.isim = isim;
        this.dersler = new HashSet<>();
    }

    public String getIsim() {
        return isim;
    }

    public Set<String> getDersler() {
        return dersler;
    }

    public void dersEkle(String ders) {
        dersler.add(ders);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(isim, student.isim) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isim);
    }

    public static void main(String[] args) {

            List<Student> ogrenciListesi = new ArrayList<>();

            Student st1 = new Student("Mustafa");
            st1.dersEkle("Matematik");
            st1.dersEkle("Fizik");
            st1.dersEkle("Ceng101");

            Student st2 = new Student("ali");

            st2.dersEkle("Kimya");
            st2.dersEkle("Matematik");

            ogrenciListesi.add(st1);
            ogrenciListesi.add(st2);

            for (Student st : ogrenciListesi) {
                System.out.println(st.getIsim() + " Dersleri ->" + st.getDersler());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nDerslerini görmek istediğiniz öğrencinin adını girin: ");
            String isim = scanner.nextLine();

            for (Student ogr : ogrenciListesi) {
                if (ogr.getIsim().equalsIgnoreCase(isim)) {
                    System.out.println(isim + " dersleri: " + ogr.getDersler());
                    break;
                }
            }

            scanner.close();

        }
    }


