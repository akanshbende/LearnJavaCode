package Map.ConcurrentMap;

/*
* MAP--->SORTED--->THREAD SAFE--->ConcurrentSkipListMap
* ConcurrentSkipListMap is a thread-safe, sorted, and concurrent implementation of the NavigableMap interface.
* It’s part of Java’s concurrent collection framework (from Java 6+) and is based on a Skip List data structure.
*
*  Core Features:
Feature	Description
Thread-safe	                ✅ Yes — safe for concurrent access
Sorted	                    ✅ Maintains keys in natural or comparator-defined order
Non-blocking reads	        ✅ Most reads don’t require locking
Based on Skip List	        ✅ Efficient search, insert, and delete operations (O(log n))
Implements	                NavigableMap, SortedMap, Map
Null keys/values        	❌ Does not allow null keys (allows null values)
*
*
* A Skip List is a probabilistic data structure that allows fast search, insertion, and deletion, just like a balanced binary search tree (e.g., AVL or Red-Black Tree), but it’s simpler and faster in practice, especially in concurrent environments.
It’s the underlying structure used in ConcurrentSkipListMap.
*
*
Level 3:      A ------------> G
Level 2:      A ----> C ----> G
Level 1:      A -> B -> C -> D -> E -> F -> G
*
* The bottom level is a full sorted list.
Higher levels contain random subsets of elements from the level below.
Searching starts from the top-left, moving right and down until the target is found.
*
* How Operations Work:
Operation	Time Complexity	How it works
Search	O(log n)	Move right until greater, then down
Insert	O(log n)	Insert at bottom, maybe "promote" to higher levels
Delete	O(log n)	Remove from all levels where the node appears

Promotion to higher levels is random (like flipping a coin). This keeps the structure balanced probabilistically.
*
* Works in multithreaded environment.
*
*
 */
public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
    }
}
