package homeWork_9;

import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Map<Person, List<Animal>> zooClub = Person.makeAMapFromPersonsAndAnimals();

        ZooClubMethods.displayAllPersonsAndTheirAnimals(zooClub);
        ZooClubMethods.addAPersonToTheClub(zooClub);
        ZooClubMethods.removeTheAnimalFromThePerson(zooClub);
        ZooClubMethods.removeThePersonFromTheClub(zooClub);
    }
}
//        1Переробити попереднє завдання, там де компаратори використовуються лише один раз, використати аононімні класи
//
//
//        завдання 2
//        Створити структуру Зооклуб.
//        Створити клас Person , який описати двома полями : ім’я , вік.
//        Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), ім’я тваринки.
//        Кожна людина може мати багато тваринок. Але одна тваринка належить лише одній людині.
//
//        Map<Person, List<Animal>> map;
//
//        Реалізувати консольне меню(НЕ обов’язково), таким чином щоб можна було:
//
//        Додати людину до клубу
//        Додати тваринку до людини
//        Видалити(забрати) тваринку від людини
//        Видалити людину з клубу
//        Вивести на екран зооклуб
//        Вийти з програми
//
//        Використати для побудови меню Switch.