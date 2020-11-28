package homeWork_4;

public class VikingBerserker extends Warrior{
    private int scandinavianSword;
    private int axe;

    public VikingBerserker(String name, int health, int attackForce, int attackSpeed) {
        super(name, health, attackForce, attackSpeed);
    }

    public void scandinavianSword(){
        System.out.println("Вікінг берсеркер наносить удар мечем");

    }

    public void axe(){
        System.out.println("Вікінг берсеркер наносить удар сокирою");
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.