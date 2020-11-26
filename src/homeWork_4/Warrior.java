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

    public void warriorAndParameters() {
        System.out.println("Warrior - " + name);
        System.out.println("Health - " + health + " hp");
        System.out.println("Attack force - " + attackForce);
    }

    public void attack() {

    }

    public void defend() {

    }

    public void slipping() {

    }

    public int random() {
        return random();
    }
}

//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.