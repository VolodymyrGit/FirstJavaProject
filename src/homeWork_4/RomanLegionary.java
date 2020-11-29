package homeWork_4;

public class RomanLegionary extends Warrior {
    private int number = 1;
    private int swordGladius;
    private int shield;

    public RomanLegionary(String name, int health, String weaponsName, int weapon) {
        super(name, health, weaponsName, weapon);
    }

//        public RomanLegionary() {
//        }

//    RomanLegionary() {
//        this.name = "RomanLegionary";
//        this.health = 1000;
//        this.weaponsName = "Sword Gladius";
//        this.weapon = 200;
//    }

    public int getNumber() {
        return number;
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.