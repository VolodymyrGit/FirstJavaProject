package homeWork_4;

public class Battle {

    public static void main(String[] args) {

        RomanLegionary romanLegionary = new RomanLegionary("RomanLegionary",1000,
                "Sword Gladius", 200);
        Samurai samurai = new Samurai("Samurai", 900,
                "Nihonto Katana", 250);
        UkrainianKozak ukrainianKozak = new UkrainianKozak("Ukrainian Kozak", 1100,
                "Saber", 200);
        VikingBerserker vikingBerserker = new VikingBerserker("VikingBerserker", 800,
                "Scandinavian Sword", 300);

        romanLegionary.warriorParameters();
        samurai.warriorParameters();
        ukrainianKozak.warriorParameters();
        vikingBerserker.warriorParameters();

        System.out.println("    Битва !!!\n");

            Warrior.whoShouldAttack(romanLegionary, samurai, ukrainianKozak, vikingBerserker);
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.