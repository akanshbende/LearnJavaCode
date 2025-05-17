package Map.ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
        // Java 7 -> segment based locking -> 16 segment-(Divided into 16 hashmaps).
        // Only the segment being written to or read from is locked.
        // read: do not require locking unless there is a write operation happening on the same segment.
        // write: lock

        // Java 8 -> no segmentation
        //        -> instead use compare and swap approach -> no locking except resizing or collision

//        ConcurrentHashMap is ideal for multi-threaded environments like web servers, caches, etc.
//        Avoid using putIfAbsent() and compute() simultaneously from multiple threads unless needed — prefer atomic operations provided.

//        Thread A last saw -> x = 45
//        Thread A work ->  x to 50
//        if x is still 45, then change it to 50 else don't change and retry.
//        put -> index


    }
}
