package homeWork_10;

import java.util.Map;
import java.util.Objects;

public class MyEntry <K, V> {
    private K valueK;
    private V valueV;

    public MyEntry(K key, V value) {
        this.valueK = key;
        this.valueV = value;
    }

    public K getValueK() {
        return valueK;
    }

    public void setValueK(K valueK) {
        this.valueK = valueK;
    }

    public V getValueV() {
        return valueV;
    }

    public void setValueV(V valueV) {
        this.valueV = valueV;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + valueK +
                ", value=" + valueV +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return valueK.equals(myEntry.valueK) &&
                valueV.equals(myEntry.valueV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueK, valueV);
    }

    public void addNewObjectToMap (Map<K, V> m, MyEntry<K, V> me) {
        m.put(me.getValueK(), me.getValueV());
    }

    public void deleteFromMapByKey(Map<K, V> m, K k) {
        m.remove(k);
    }

    public void deleteFromMapByValue(Map<K, V> m, V v) {
        for (Map.Entry<K, V> entry : m.entrySet()) {
            if(entry.getValue().equals(v)) {
                m.remove(entry.getKey());
            }
        }
    }

    public void printSetKeysFromMap(Map<K, V> m) {
        for (Map.Entry<K,V> entry : m.entrySet()) {
            System.out.println(entry.getKey());
        }
    }

    public void printListValuesFromMap(Map<K, V> m) {
        for (Map.Entry<K,V> entry : m.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void printMap(Map<K, V> m) {
        for (Map.Entry<K,V> entry : m.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue() + "\n");
        }
    }
}

//    Створити клас MyEntry<K,V>.
//        Описати в ньому дженеріками –поля, гетери/сетери, toString.
//        Реалізувати в даному класі методи, які б:
//        ● Додавали новий об’єкт в мапу
//        ● Видаляли об’єкт мапи за ключем
//        ● Видаляли об’єкт мапи за значенням
//        ● Виводили на екран Set ключів
//        ● Виводили на екран List значень
//        ● Виводили на екран цілу мапу