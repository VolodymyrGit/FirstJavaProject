package homeWork_4;

public class Samurai extends Warrior {
    private int number = 2;
    private String name = "Samurai";
    private int health = 900;
    private String weaponsName = "Nihonto Katana";
    private int weapon = 160;
    private int nihontoKatana;
    private int bow;

    public Samurai(String name, int health, String weaponsName, int weapon) {
        super(name, health, weaponsName, weapon);
    }

    public int getNumber() {
        return number;
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.