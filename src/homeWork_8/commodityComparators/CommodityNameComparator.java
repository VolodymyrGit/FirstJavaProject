package homeWork_8.commodityComparators;

import homeWork_8.Commodity;
import java.util.Comparator;

public class CommodityNameComparator implements Comparator<Commodity>{
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

