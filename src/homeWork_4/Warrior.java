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
        System.out.println("Warrior - " + this.name);
        System.out.println("Health - " + this.health + " hp");
        System.out.println("Attack force - " + this.attackForce);
        System.out.println("Attack speed" + this.attackSpeed);
    }

    public void whoShouldBeAttacked() {
        while (health > 0) {
            if (random() == 1) {
                attack(this.health);
            }
        }
    }

    public void attack(int health) {
        while (health > 0) {
            health - int
        }
    }

    public void defend() {

    }

    public void slipping() {

    }

    public static int random() {
        return ((int) (Math.random() * 4) + 1);
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.