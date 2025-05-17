package CollectionFramework.Queue;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
* Enqueue: Adding an element to the rear (end) of the queue.
Dequeue: Removing an element from the front (start) of the queue.
Front: The first element in the queue.
Rear: The last element in the queue.
*
* | Operation | Description                          | Time Complexity |
| --------- | ------------------------------------ | --------------- |
| Enqueue   | Add item to the rear                 | O(1)            |
| Dequeue   | Remove item from the front           | O(1)            |
| Peek      | View the front item without removing | O(1)            |
| isEmpty   | Check if the queue is empty          | O(1)            |

*
*  Types of Queues:
Simple Queue – Basic FIFO structure.
Circular Queue – The last position is connected back to the first to make use of space.
Priority Queue – Elements are served based on priority, not just order.
Deque (Double-Ended Queue) – Insertion and deletion can occur from both ends.
*
*
* Queue<Integer> list = new LinkedList<>() ;
list.add(1);
System.out.println(list.size());

System.out.println(list.remove()); // throws exception if empty
System. out.println(list.poll());

System.out.println(list.element()); // throws exception if empty
System.out.println(list.peek());
* */
public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1); // enqueue
        list.addLast(2);
        list.addLast(3);

        System.out.println(list);

        list.removeFirst();// dequeue
        System.out.println(list);

        list.peek();
        list.getFirst();

        // Instead introdeuce Queue

        Queue<Integer> que=new LinkedList<>();

        que.add(24);
        que.add(39);
        que.add(18);
        que.add(6);
        System.out.println(que);
        System.out.println(que.peek());
        que.remove();
        System.out.println(que);


        Queue<Integer> list2 = new LinkedList<>() ;
        list2.add(1);
        System.out.println(list2.size());

        System.out.println(list2.remove()); // throws exception if empty
        System. out.println(list2.poll());

        System.out.println(list2.element()); // throws exception if empty
        System.out.println(list2.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

// System.out.println(queue2.offer(3)); // throws exception
        System.out.println(queue2.offer(3)); // false
    }
}
