package CollectionFramework.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

/*
* Set is a data structure that stores a collection of unique elements—that is, no duplicate values are allowed.
*
* Key Features of a Set:
No duplicates:      Each element can appear only once.
Unordered:          Sets do not maintain the order of elements (some types may offer ordering, see below).
Efficient lookup:   Checking whether an element exists in a set is typically faster than in a list.
*
* | Operation       | HashSet | LinkedHashSet | TreeSet    |
| --------------- | ------- | ------------- | ---------- |
| `add()`         | O(1)    | O(1)          | O(log n)   |
| `remove()`      | O(1)    | O(1)          | O(log n)   |
| `contains()`    | O(1)    | O(1)          | O(log n)   |
| Maintains Order | ❌       | ✅ (insertion) | ✅ (sorted) |

*
* A synchronized set in Java is a thread-safe version of a set — meaning it can be safely accessed by multiple threads without data corruption or race conditions.
By default, HashSet, LinkedHashSet, and TreeSet are not thread-safe. So if you're working in a multi-threaded environment, you need to manually synchronize them.
* */
public class SetOverview {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(1);
        set.add(67);
        set.add(12);
        set.add(19);

        System.out.println(set);// unorder as entered

        Set<Integer> lset= new LinkedHashSet<>();

        lset.add(1);
        lset.add(67);
        lset.add(12);
        lset.add(19);

        System.out.println(lset);// ordered as entered

        Set<Integer> tset= new TreeSet<>();

        tset.add(1);
        tset.add(67);
        tset.add(12);
        tset.add(19);

        System.out.println(tset); // sorted

        // Navigable set
        // instead put we use add


        // for thread saftey

        Set<Integer> integers= Collections.synchronizedSet(tset); // syncronized set

        Set<String> normalSet = new HashSet<>();
        Set<String> syncSet = Collections.synchronizedSet(normalSet);

        syncSet.add("apple");
        syncSet.add("banana");

        System.out.println(syncSet);

        // for thread saftey

        Set<Integer> set5 = new ConcurrentSkipListSet<>(); // built in thread saftey




    }
}
