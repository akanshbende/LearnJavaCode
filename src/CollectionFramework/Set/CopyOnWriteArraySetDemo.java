package CollectionFramework.Set;
/*
* CopyOnWriteArraySet is a thread-safe Set implementation from the java.util.concurrent package.
* It is part of the CopyOnWrite family (like CopyOnWriteArrayList), which is optimized for concurrent read-heavy scenarios.
*
* Thread-safe: Safe for concurrent use without needing external synchronization.
No duplicates: Like all Sets, it stores only unique elements.
Maintains insertion order.
Best for many reads and few writes:
Every time you modify (add/remove), it creates a new copy of the underlying array.
This makes read operations very fast, but write operations relatively expensive.
*
*  Internally uses a CopyOnWriteArrayList.
On any modification (add, remove, etc.):
The whole array is copied, modified, and the new copy replaces the old one.
This is costly if writes are frequent, but very efficient for reads, as there's no locking or blocking during reads.


*
 * */
public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {

    }
}
