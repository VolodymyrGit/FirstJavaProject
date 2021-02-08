package homeWork_8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Commodity> goods = new ArrayList<>();
        goods.add(new Commodity("Audi", 4, 4, 3500));
        goods.add(new Commodity("Renault", 3, 7, 1800));
        goods.add(new Commodity("Toyota", 5, 1, 2000));
        goods.add(new Commodity("Nissan", 1, 3, 2500));
        goods.add(new Commodity("VolksWagen", 9, 2, 1500));

        Methods.consoleMenu(goods);
    }
}