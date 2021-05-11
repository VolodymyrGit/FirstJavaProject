package homeWork_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZooClubMethods {
    private static Scanner scan = new Scanner(System.in);


    public static void displayAllPersonsAndTheirAnimals(Map<Person, List<Animal>> zooClub) {
        for (Map.Entry<Person, List<Animal>> entry : zooClub.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue() + "\n");
        }
    }


    private static boolean asksIfYouWantToAddAnotherAnimal() {
        System.out.println("Бажаєте додати ще одну тварину (1 - так/ 0 - ні) :");
        int zeroOrOne = scan.nextInt();
        return zeroOrOne != 0;
    }


    public static void addAPersonToTheClub(Map<Person, List<Animal>> zooClub) {
        System.out.println("\nДодаємо нову людину до зооклубу :\n" +
                "Вкажіть ім'я людини :");
        String personName = scan.nextLine();
        System.out.println("Вкажіть вік людини :");
        int age = scan.nextInt();

        Person person = new Person(personName, age);

        List<Animal> animals = new ArrayList<>();
        addAPetToAPerson(animals, personName);

        zooClub.put(person, animals);
        displayAllPersonsAndTheirAnimals(zooClub);
    }


    public static List<Animal> addAPetToAPerson(List<Animal> animals, String name) {
        do {
            System.out.println("Додаємо тварину до списку тварин, яких має " + name + " :\n" +
                    "Вкажіть тип тварини :");
            scan = new Scanner(System.in);
            String animalType = scan.nextLine();
            System.out.println("Вкажіть ім'я тварини :");
            String animalName = scan.nextLine();
            Animal animal = new Animal(animalType, animalName);
            animals.add(animal);
        } while (asksIfYouWantToAddAnotherAnimal());

        return animals;
    }


    public static void removeTheAnimalFromThePerson(Map<Person, List<Animal>> zooClub) {
        System.out.println("Видаляємо тварину зі списку тварин члена клубу :\n" +
                "Вкажіть ім'я цієї людини :");
        scan = new Scanner(System.in);
        String personName = scan.nextLine();
        System.out.println("Вкажіть вік людини :");
        int age = scan.nextInt();
        Person person = new Person(personName, age);

        System.out.println("Вкажіть тип тварини :");
        scan = new Scanner(System.in);
        String animalType = scan.nextLine();
        System.out.println("Вкажіть ім'я тварини :");
        String animalName = scan.nextLine();
        Animal animal = new Animal(animalType, animalName);

        zooClub.get(person).remove(animal);

        displayAllPersonsAndTheirAnimals(zooClub);
    }


    public static void removeThePersonFromTheClub(Map<Person, List<Animal>> zooClub) {
        System.out.println("Видаляємо людину з клубу :\n" +
                "Вкажіть ім'я цієї людини :");
        String personName = scan.nextLine();
        System.out.println("Вкажіть вік людини :");
        int age = scan.nextInt();
        Person person = new Person(personName, age);

        zooClub.remove(person);

        displayAllPersonsAndTheirAnimals(zooClub);
    }
}