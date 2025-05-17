package Map.SortedMap;

import java.util.*;

/*
* SortedMap is an interface that extends Map and
guarantees that the entries are sorted based on
the keys, either in their natural ordering or by a
specified Comparator.

* A SortedMap in Java is a special type of Map that maintains its keys in a sorted order.
 It's an interface in Java under the java.util package.
 Keys are automatically sorted in ascending order (according to their natural ordering or a custom Comparator).
 Values are not sorted, only keys are.

* The most common concrete class for SortedMap is TreeMap.
 It sorts keys:
- Naturally (e.g., alphabetically for strings, numerically for numbers)
- Or using a custom Comparator
* */
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap=new TreeMap<>(); // ascending order // Tree Map - Red Black Tree -> Self balancing binary search tree
//        SortedMap<Integer,String> sortedMap=new TreeMap<>((a,b) -> b-a); // descending order - comparator
        sortedMap.put(91,"Vivek");
        sortedMap.put(99,"Shubham");
        sortedMap.put(78,"Mohit");
        sortedMap.put(68,"Vikul");

        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());

        System.out.println(sortedMap.firstEntry());
        System.out.println(sortedMap.lastEntry());

        System.out.println(sortedMap.headMap(91));// to from beginning 91 - exclude 91
        System.out.println(sortedMap.tailMap(91));// upto 91 from last - include 91

    }
}
