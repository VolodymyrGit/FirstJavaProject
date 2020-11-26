package homeWork_4;

public class UkrainianKozak extends Warrior{
    private int pistol;
    private int saber;

    public UkrainianKozak(String name, int health, int attackForce, int attackSpeed) {
        super(name, health, attackForce, attackSpeed);
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.