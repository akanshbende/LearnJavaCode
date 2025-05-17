package CollectionFramework.Queue;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
* A Deque (short for Double-Ended Queue) is a linear data structure that allows insertion and deletion from both ends — front and rear.
*
* Unlike a regular queue (FIFO) or stack (LIFO), Deque supports both:
Queue behavior: enqueue/dequeue
Stack behavior: push/pop
*
* | Operation                       | Description                          |
| ------------------------------- | ------------------------------------ |
| `addFirst(e)` / `offerFirst(e)` | Insert element at the front          |
| `addLast(e)` / `offerLast(e)`   | Insert element at the rear           |
| `removeFirst()` / `pollFirst()` | Remove and return element from front |
| `removeLast()` / `pollLast()`   | Remove and return element from rear  |
| `peekFirst()`                   | View the front element               |
| `peekLast()`                    | View the last element                |
| `isEmpty()`                     | Check if deque is empty              |
| `size()`                        | Return number of elements            |

*
* Use Cases:
Palindrome checking

Sliding window problems

Undo/redo systems

Task scheduling

Deque as stack or queue (more flexible)

⚡ Performance:
ArrayDeque is faster than LinkedList for deque operations.

All main operations are O(1) (amortized).


* */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);  // front: 10
        dq.addLast(20);   // rear: 20 → [10, 20]
        dq.addFirst(5);   // front: 5 → [5, 10, 20]

        System.out.println(dq.removeLast());  // 20
        System.out.println(dq.peekFirst());   // 5


        // offer ex
        dq.offerFirst(10); // Inserts 10 at front
        dq.offerLast(20);  // Inserts 20 at rear
        dq.offerFirst(5);  // Inserts 5 at front

        System.out.println(dq); // Output: [5, 10, 20]'


        Deque<String> deque = new ArrayDeque<>(); // faster iteration // low memory // no null allowed // circular array // no need to shift index // only shift head and tail.

        deque.offerFirst("A");  // front ← A
        deque.offerLast("B");   // A ←→ B
        deque.offerFirst("C");  // C ←→ A ←→ B

        System.out.println("Deque (ArrayDeque): " + deque); // [C, A, B]

        System.out.println("Removed first: " + deque.pollFirst()); // C
        System.out.println("Removed last: " + deque.pollLast());   // B

        Deque<String> deque1 = new LinkedList<>(); //

        deque1.offerFirst("A");  // front ← A
        deque1.offerLast("B");   // A ←→ B
        deque1.offerFirst("C");  // C ←→ A ←→ B

        System.out.println("Deque (LinkedList): " + deque1); // [C, A, B]

        System.out.println("Removed first: " + deque1.pollFirst()); // C
        System.out.println("Removed last: " + deque1.pollLast());   // B
    }
}
