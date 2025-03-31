package Map;

import java.util.*;

public class Person {
    private String id;
    private String name;
    private String description;

    public Person(String id,String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Map<String, Person> deneme = new HashMap<>();
        deneme.put("1", new Person("1","mustafa", "male"));

        System.out.println(deneme);
        System.out.println("************ ******** ******** ******** ******** ********");

        Map<String, Person> dnm = new HashMap<>(); // insertion order not preserved, it's about hashcode
        dnm.put("2", new Person("2", "Bilge", "female"));
        dnm.put("5", new Person("5", "Bal", "cat"));
        dnm.put("3", new Person("3", "Peri", "dog"));
        System.out.println(dnm);


        System.out.println("************ ******** ******** ******** ******** ********");
        Map<String, Person> deneme2 = new LinkedHashMap<>();
        deneme2.put("2", new Person("2", "Bilge", "female"));
        deneme2.put("3", new Person("5", "Bal", "cat"));
        deneme2.put("3", new Person("3", "Peri", "dog"));

        System.out.println(deneme2);
        System.out.println("************ ******** ******** ******** ******** ********");

        Map<String, Person> deneme3 = new LinkedHashMap<>(); // insertion order preserved
        deneme3.put("2", new Person("2", "Bilge", "female"));
        deneme3.put("5", new Person("5", "Bal", "cat"));
        deneme3.put("3", new Person("3", "Peri", "dog"));
        System.out.println(deneme3);

    }
}
