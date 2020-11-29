package homeWork_4;

public class UkrainianKozak extends Warrior{
    private int number = 3;
    private String name = "Ukrainian Kozak";
    private int health =1100;
    private String weaponsName = "Saber";
    private int weapon = 170;
    private int saber;
    private int pistol;

    public UkrainianKozak(String name, int health, String weaponsName, int weapon) {
        super(name, health,weaponsName, weapon);
    }

    public int getNumber() {
        return number;
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.