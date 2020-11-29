package homeWork_4;

public class VikingBerserker extends Warrior {
    private int number = 4;
    private String name = "VikingBerserker";
    private int health = 800;
    private String weaponsName = "Scandinavian Sword";
    private int weapon = 150;
    private int scandinavianSword;
    private int axe;

    public VikingBerserker(String name, int health, String weaponsName, int weapon) {
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