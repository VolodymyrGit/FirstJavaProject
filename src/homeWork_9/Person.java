package homeWork_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static Map<Person, List<Animal>> makeAMapFromPersonsAndAnimals() {

        Map<Person, List<Animal>> zooClub = new HashMap<>();

        Person andrii = new Person("Andrii", 25);

        List<Animal> andriiAnimals = new ArrayList<>();
        andriiAnimals.add(new Animal("Dog", "Rex"));
        andriiAnimals.add(new Animal("Cat", "Murchyk"));


        Person bohdan = new Person("Bohdan", 30);

        List<Animal> bohdanAnimals = new ArrayList<>();
        bohdanAnimals.add(new Animal("Dog", "Brovko"));
        bohdanAnimals.add(new Animal("Dog", "Dora"));
        bohdanAnimals.add(new Animal("Cat", "Barry"));


        Person petro = new Person("Petro", 18);

        List<Animal> petroAnimals = new ArrayList<>();
        petroAnimals.add(new Animal("Cat", "Cat"));
        petroAnimals.add(new Animal("Rat", "Skebers"));


        Person olena = new Person("Olena", 27);

        List<Animal> olenaoAnimals = new ArrayList<>();
        olenaoAnimals.add(new Animal("Rabbit", "Rocky"));
        olenaoAnimals.add(new Animal("Cat", "Hercules"));


        zooClub.put(andrii, andriiAnimals);
        zooClub.put(bohdan, bohdanAnimals);
        zooClub.put(petro, petroAnimals);
        zooClub.put(olena, olenaoAnimals);

        return zooClub;
    }
}
