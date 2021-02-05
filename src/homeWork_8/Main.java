package homeWork_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Commodity> goods = new ArrayList<>();
            goods.add(new Commodity("Audi", 4, 1.5, 1500));
            goods.add(new Commodity("Renault", 4.5, 2, 1800));
            goods.add(new Commodity("Toyota", 5, 2.5, 2000));
            goods.add(new Commodity("Nissan", 5.5, 2.5, 2500));
            goods.add(new Commodity("VolksWagen", 5.5, 2.5, 2500));


//        Iterator<Object> iterator = goods.listIterator();
//
//        Methods.addTheCommodity(goods);
//
//        Methods.displayAllProducts(goods);
//
//        Methods.removeTheCommodity(goods);
//
//        Methods.displayAllProducts(goods);
//
//        Methods.replaceTheCommodity(goods);
//
//        Methods.displayAllProducts(goods);

        Methods.sortByName(goods);

    }
}
