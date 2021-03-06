package homeWork_10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyEntry <K, V> {
    private K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public void addNewObjectToMap (Map<K, V> m, MyEntry<K, V> entry) {
        m.put(entry.getKey(), entry.getValue());
    }

    public void deleteFromMapByKey(Map<K, V> m, K k) {
        m.remove(k);
    }

    public void deleteFromMapByValue(Map<K, V> m, V v) {
        Set<Map.Entry<K, V>> entries = new HashSet<>();
        entries = m.entrySet();
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