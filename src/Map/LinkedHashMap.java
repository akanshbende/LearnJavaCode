package Map;
/*
* LinkedHashMap is a subclass of HashMap that maintains the insertion order (or optionally access order) of the entries.
*
*You can create a LinkedHashMap that maintains access order instead of insertion order. This is useful for implementing LRU cache behavior.
* LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
* -> Setting the third parameter true enables access order: the most recently accessed (get or put) item goes to the end.
*
*
* 🧠 Use Cases
Maintaining insertion order (e.g. displaying values in the order added)

Creating simple LRU caches

Better iteration performance than HashMap when order matters
* */

public class LinkedHashMap<K, V> {
  //  protected abstract boolean removeEldestEntry(Map.Entry<K, V> eldest);

    public static void main(String[] args) {
//        java.util.LinkedHashMap<String,Integer> linkedhashmap=new LinkedHashMap<>(); // subclass of hashmap; double linked list.

//        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(11,0.3f,false);
//
//        map.put(1, "Apple");
//        map.put(3, "Banana");
//        map.put(2, "Orange");
//        map.put(4, "Mango");
//
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }
    }
}
