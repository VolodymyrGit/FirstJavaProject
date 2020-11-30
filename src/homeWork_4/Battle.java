package homeWork_4;

public class Battle {

    public static void main(String[] args) {
//        Warrior warrior = new Warrior();
        RomanLegionary romanLegionary = new RomanLegionary("RomanLegionary",1000,
                "Sword Gladius", 200);
        Samurai samurai = new Samurai("Samurai", 900,
                "Nihonto Katana", 160);
        UkrainianKozak ukrainianKozak = new UkrainianKozak("Ukrainian Kozak", 1100,
                "Saber", 170);
        VikingBerserker vikingBerserker = new VikingBerserker("VikingBerserker", 800,
                "Scandinavian Sword", 150);

        romanLegionary.warriorParameters();
        samurai.warriorParameters();
        ukrainianKozak.warriorParameters();
        vikingBerserker.warriorParameters();

        System.out.println("    Битва !!!\n");

//        while(romanLegionary.getHealth() > 0 && samurai.getHealth() > 0 &&
//        ukrainianKozak.getHealth() > 0 && vikingBerserker.getHealth() > 0) {
            Warrior.whoShouldAttack(romanLegionary, samurai, ukrainianKozak, vikingBerserker);

//        }

//        romanLegionary.attack(samurai);

//        int[] warriorsArray = new int[]{romanLegionary.getHealth(), samurai.getHealth(),
//        ukrainianKozak.getHealth(), vikingBerserker.getHealth()};
//        int index = 0;
//        while (warriorsArray[index] > 0){
//        }
    }
}
//  Зробити міні-гру - битва.  Створити одну сутність - шаблонний варіант воїна.
//  Зробити декілька типів воїнів-наслідників. Кожен з них має свої особливості , наприклад hp, зброя і т.д.
//  Тут потрібно проявити свою фантазію і додавати класи, які хочеться. Потім має бути битва.
//  Воїни можуть атакувати, якщо вони атакують, життя зменшується. На кожному етапі показувати інфу.