package Map.NavigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

/*
* NavigableMap extends SortedMap, providing
more powerful navigation options such as
finding the closest matching key or retrieving
the map in reverse order.
*
* A NavigableMap in Java is an extension of SortedMap that provides extra navigation methods to traverse the map in both directions (ascending and descending order).
*
* What is NavigableMap?
It is an interface in the java.util package.
Extends SortedMap, and adds powerful navigation features.
The most commonly used implementation is TreeMap.
*
*
* */
public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap=new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(3,"Three");

        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.ceilingEntry(4));

    }
}
