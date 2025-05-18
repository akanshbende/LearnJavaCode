package CollectionFramework.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
* A BlockingQueue in Java is a type of queue that supports thread-safe operations and blocking behavior.
* It is especially useful in multi-threaded programs, like producer-consumer scenarios.
*
* | Feature                 | Description                                                                                                                                               |
| ----------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Thread-safe**         | All operations are synchronized internally.                                                                                                               |
| **Blocking operations** | If the queue is **empty**, `take()` will block until an element is available. <br> If the queue is **full**, `put()` will block until space is available. |
| **No null elements**    | Inserting `null` will throw `NullPointerException`.                                                                                                       |
| **Used in concurrency** | Common in producer-consumer problems, task queues, thread pools, etc.                                                                                     |

* | Implementation          | Characteristics                                         |
| ----------------------- | ------------------------------------------------------- |
| `ArrayBlockingQueue`    | Bounded queue using a fixed-size array                  |
| `LinkedBlockingQueue`   | Optionally bounded, uses linked nodes                   |
| `PriorityBlockingQueue` | Elements ordered by priority (non-blocking on `put`)    |
| `DelayQueue`            | Elements are only taken after a delay                   |
| `SynchronousQueue`      | No internal storage; each insert must wait for a remove |

* | Method                          | Behavior if full/empty     | Blocks? |
| ------------------------------- | -------------------------- | ------- |
| `put(E e)`                      | Waits if queue is full     | ✅ Yes   |
| `take()`                        | Waits if queue is empty    | ✅ Yes   |
| `offer(E e)`                    | Returns `false` if full    | ❌ No    |
| `poll()`                        | Returns `null` if empty    | ❌ No    |
| `offer(E e, timeout, TimeUnit)` | Waits for space if full    | ✅ Yes   |
| `poll(timeout, TimeUnit)`       | Waits for element if empty | ✅ Yes   |


* */
public class BlockingDequeDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
        //A bounded, blocking queue backed by circular array
        // low memory overhead
        //single lock, producer and consumer block each other.
        // more thread problem

        // Producer
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Produced: " + i);
                    queue.put(i); // blocks if queue is full
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    Thread.sleep(1000); // simulate processing
                    int item = queue.take(); // blocks if queue is empty
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        /*
        * Output:
        *   Produced: 1
            Produced: 2
            Produced: 3
            Produced: 4
            Produced: 5
            Consumed: 1
            Consumed: 2
            Consumed: 3
            Consumed: 4
            Consumed: 5
        * */


        BlockingQueue<Integer> lbqueue = new ArrayBlockingQueue<>(3);
        //Optionally bounded backed by Linkedlist
        // Use two seperate locks for enqueue and dequeue operations
        // Higher Concurrency between producers and consumers

        BlockingQueue<Integer> pbqueue = new PriorityBlockingQueue<>(3);
        // Binary heap as array and can grow dynamically
    }
}
