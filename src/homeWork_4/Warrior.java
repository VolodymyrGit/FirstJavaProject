package homeWork_4;

public class Warrior {
    private String name;
    private int health;
    private int attackForce;
    private int attackSpeed;

    public Warrior(String name, int health, int attackForce, int attackSpeed) {
        this.name = name;
        this.health = health;
        this.attackForce = attackForce;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(int attackForce) {
        this.attackForce = attackForce;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.