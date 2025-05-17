package Map;

/*
* LRU (Least Recently Used) cache is a data structure that:
Stores a fixed number of items.
Removes the least recently used item when the cache is full and a new item needs to be added.

put(1, "A")  → Cache: {1:A}
put(2, "B")  → Cache: {1:A, 2:B}
put(3, "C")  → Cache: {1:A, 2:B, 3:C}
get(1)       → Cache: {2:B, 3:C, 1:A}   // 1 becomes most recently used
put(4, "D")  → Cache: {3:C, 1:A, 4:D}   // 2 is removed (least recently used)


* */

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }


    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()> capacity;
    }


    public static void main(String[] args) {
        LRUCache<String,Integer> studentMap = new LRUCache<>(3);

        studentMap.put("Bob",99);
        studentMap.put("Alice",89);
        studentMap.put("Ram",91);
        studentMap.get("Bob"); // <2>
        studentMap.put("Vipul",89);

//        studentMap.get("Bob"); <1>

//        System.out.println(studentMap); //{Alice=89, Ram=91, Vipul=89} <1>
        System.out.println(studentMap); //              <2>

    }
}
