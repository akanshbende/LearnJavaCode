package HashTable;

import java.util.Hashtable;
import java.util.Map;

/*
* A Hash Table is a data structure that stores key-value pairs and provides fast lookup, insertion, and deletion using a hashing technique.
In Java, the most common implementations are:
✅ HashMap (non-synchronized, modern)
✅ Hashtable (legacy, synchronized)
*
*  How Does a Hash Table Work?
- Hash Function converts a key into an integer (called the hash code).
- That integer is mapped to an index in an internal array (called buckets).
- The value is stored at that index.
- If two keys map to the same index (collision), values are stored in a linked list or tree.
*
* | Feature            | `HashMap`                  | `Hashtable`             |
| ------------------ | -------------------------- | ----------------------- |
| Thread-safe        | ❌ No                       | ✅ Yes                   |
| Allows `null` keys | ✅ One `null` key           | ❌ No                    |
| Performance        | Faster (not synchronized)  | Slower (synchronized)   |
| Usage              | Recommended in modern code | Legacy, rarely used now |

*
* | Operation | Average Time | Worst Case |
| --------- | ------------ | ---------- |
| get()     | O(1)         | O(n)       |
| put()     | O(1)         | O(n)       |
| remove()  | O(1)         | O(n)       |

*
* Hashtable is syncronized
* no null key or value
* Legacy class , replaced now with ConcurrentHashMap
* slower than hashmap
* */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();

        map.put(90,"Alice");
        map.put(85,"Bob");
        map.put(70,"Charlie");
        System.out.println(map);

        System.out.println(map.get(90));;
        System.out.println(map.containsKey(90));

//        map.put(null,"value"); // Throws exception
//        map.put(4,null);        // Throws exception


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Alice")) {

                System.out.println(entry.getValue() + "'s marks: " + entry.getKey());
            }
        }
    }
}
