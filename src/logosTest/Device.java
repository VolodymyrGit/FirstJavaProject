package logosTest;

public class Device {
    private long serialNumber;
    private String brand;
    private String info;
    private int price;

    public Device() {
    }


}
//  З файлу необхідно отримати дані про об’єкти.
//  Кожна стрічка у файлі = дані про новий об’єкт.
//  Через кому та пробіл передаються властивості об’єкта.
//  Об’єкт Device буде мати наступні поля :
//  long serialNumber,
//  String brand,
//  String info,
//  int price
//
//  Кожна стрічка - новий об’єкт.
//  Тобто якщо ви прочитали стрічку тексту (до символа переводу каретки “Enter”), ви прочитали один об’єкт.
//  Ваше завдання перевести стрічку тексту в об’єкт.
//  А фактично перевести файл у колекцію об’єктів типу Device.
//  Створити консольну програму (користувач вводить цифру) для реалізації наступних методів :
//  Вивести весь список на екран.
//  Шукати Device за серійним номером(Якщо такого Device немає кидати помилку, яку створите самостійно).
//  Вивести посортований список за назвою бренду.
//  Вивести лише ті Device у яких ціна більша ніж 400.
//  Вивести лише ті Device у яких в серійному номері є нуль(0) і ціна менша за 800.
//  Вивести найдорожчий товар.