package Map;
/*
How HashMap Retrieves Data

When we call get(key), the HashMap follows these steps:

Hashing the Key: Similar to insertion, the key is hashed using the same hash
function to calculate its hash code.

Finding the Index: The hash code is used to find the index of the bucket where
the key-value pair is stored.

Searching in the Bucket: Once the correct bucket is found, it checks for the
key in that bucket. If it finds the key, it returns the associated value.

-------------------------

Handling Collisions

Since different keys can generate the same index (called a collision),
HashMap uses a technique to handle this situation. Java's HashMap
uses Linked Lists (or balanced trees after Java 8) for this.

If multiple key-value pairs map to the same bucket, they are stored in a
linked list inside the bucket.

When a key-value pair is retrieved, the HashMap traverses the linked
list, checking each key until it finds a match.

After Java 8 -
- Linked list is replaced with Balanced Binary Tree - RB Tree. - TC: O(logN)

----------------------------

Handling Collisions
map.put("apple", 50);
map.put("banana", 30);
map.put("orange", 80);

Let's say "apple" and "orange" end up in the same bucket due to a hash
collision. They will be stored in a linked list in that bucket:

Bucket 5: ("apple", 50) -> ("orange", 80)

When we do map.get("orange"), HashMap will go to Bucket 5 and then
traverse the linked list to find the entry with the key "orange".

-----------------------------
HashMap Resizing (Rehashing)

HashMap has an internal array size, which by default is 16.
When the number of elements (key-value pairs) grows and
exceeds a certain load factor (default is 0.75), HashMap
automatically resizes the array to hold more data. This process is
called rehashing.

The default size of the array is 16, so when more than 12
elements (16 * 0.75) are inserted, the HashMap will resize.

------------------------------
During rehashing

The array size is doubled.

1. All existing entries are rehashed (i.e., their positions are recalculated)
and placed into the new array.
2. This ensures the HashMap continues to perform efficiently even as
more data is added.

-----------------------------------
Time Complexity

HashMap provides constant time O(1) performance for basic
operations like put() and get() (assuming no collisions).
However, if there are many collisions, and many entries are
stored in the same bucket, the performance can degrade to O(n),
where n is the number of elements in that bucket.

But after Java 8, if there are too many elements in a bucket,
HashMap switches to a balanced tree instead of a linked list to
ensure better performance O(log n).
*/
public class Hash {
}
