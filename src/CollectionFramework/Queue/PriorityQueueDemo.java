package CollectionFramework.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
* A Priority Queue is a special type of queue in which each element is associated with a priority,
* and elements are served based on priority, not just the order of insertion.
*
* Key Concept:
Higher priority elements are dequeued before lower priority ones.
If two elements have the same priority, they are served in FIFO order.
*
*  Types of Priority Queues:
Max-Priority Queue – Highest priority (or value) served first.
Min-Priority Queue – Lowest priority (or value) served first.
*
* | Operation  | Time Complexity |
| ---------- | --------------- |
| Insert     | O(log n)        |
| Delete/Pop | O(log n)        |
| Peek       | O(1)            |

*
* | Method               | Description                                                                     |
| -------------------- | ------------------------------------------------------------------------------- |
| `add(E e)`           | Inserts the specified element into the queue. Throws exception if fails.        |
| `offer(E e)`         | Inserts the specified element. Returns `false` if it can't be added.            |
| `peek()`             | Retrieves, but does not remove, the head of the queue. Returns `null` if empty. |
| `poll()`             | Retrieves and removes the head of the queue. Returns `null` if empty.           |
| `remove()`           | Removes the head. Throws exception if queue is empty.                           |
| `remove(Object o)`   | Removes a specific element if it exists.                                        |
| `contains(Object o)` | Returns `true` if the queue contains the specified element.                     |
| `isEmpty()`          | Returns `true` if the queue is empty.                                           |
| `size()`             | Returns the number of elements in the queue.                                    |
| `clear()`            | Removes all elements from the queue.                                            |
| `toArray()`          | Converts the queue to an array.                                                 |
| `iterator()`         | Returns an iterator to traverse the elements (not sorted order).                |

*
* The internal working of PriorityQueue in Java is based on a binary heap, specifically a min-heap by default.
*
* Underlying Data Structure
Java’s PriorityQueue uses a binary heap implemented with a dynamic array (Object[]).
Heap is complete binary tree: all levels are fully filled except possibly the last, which is filled from left to right.
*
* Min-Heap Property
In a min-heap, the smallest element is always at the root (index 0 of the array).
For a max-heap, you must use a custom comparator.
*
*
* | Operation | Time Complexity | Why?                      |
| --------- | --------------- | ------------------------- |
| Insertion | O(log n)        | Due to sift-up            |
| Deletion  | O(log n)        | Due to sift-down          |
| Peek      | O(1)            | Root is always at index 0 |

* */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of queue interface
        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println(pq); // not sorted
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        System.out.println(pq);


//        System.out.println(pq.poll()); // 10 (smallest first)
//        System.out.println(pq.peek()); // 20 (next smallest)



    }
}
