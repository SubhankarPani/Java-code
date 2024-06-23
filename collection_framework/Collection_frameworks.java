package collection_framework;

//import java.util.*;
//
//public class Collection_frameworks {
//    public static void main(String[] args) {
//        Collection_frameworks collectionTester = new Collection_frameworks();
//        collectionTester.testArrayList();
//        System.out.println("---");
//        collectionTester.testLinkedList();
//    }
//
//    // Method to test ArrayList
//    public void testArrayList() {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Ravi");
//        list.add("Vijay");
//        list.add("Ravi");
//        list.add("Ajay");
//
//        System.out.println("Printing ArrayList:");
//        printCollection(list);
//    }
//
//    // Method to test LinkedList
//    public void testLinkedList() {
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("Ravi");
//        list.add("Vijay");
//        list.add("Ravi");
//        list.add("Ajay");
//
//
//        ]System.out.println("Printing LinkedList:");
//        printCollection(list);
//    }
//
//    // Method to print elements of a collection using Iterator
//    private void printCollection(Collection<String> collection) {
//        Iterator<String> itr = collection.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }
//}

import java.util.*;
public class Collection_frameworks{
    public static void main(String[] args) {
        ArrayList();
        LinkedList();
        Vector();
        Stack();
        PriortyQueue();
        ArrayDeque();
        HashSet();
        LinkedHashSet();
    }

    public static void ArrayList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("Printing ArrayList:");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void LinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        System.out.println("Printing LinkedList:");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void Vector(){
        Vector <String> vector=new Vector<String>();
        vector.add("Ayush");
        vector.add("Amit");
        vector.add("Subhankar");
        System.out.println("Printing Vector");
        Iterator<String> itr= vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
public static void Stack(){
        Stack<String> stack=new Stack<String>();
        stack.push("Ayush");
        stack.push("Subhankar");
        stack.push("Ashish");
        stack.push("Akriti");
        stack.pop();
        Iterator<String> itr= stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
}

//Priorty Queue
    public static void PriortyQueue(){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");

        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 =queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
    //Arraydeque
    public static void ArrayDeque(){
        Deque<String> deque=new ArrayDeque<String>() ;
            deque.add("Gautam");
            deque.add("Karan");
            deque.add("Ajay");
//            for(String str:deque){
//                System.out.println(str);
//            }
        Iterator itr= deque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
//HashSet
    public static void HashSet(){
        HashSet<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Vikay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    //LinkedHashSet
    public static void LinkedHashSet(){
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Subhankar");
        set.add("Ajay");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}

//1. ArrayList
//Characteristics:
//
//Resizable array implementation of the List interface.
//Allows duplicate elements.
//Maintains the insertion order.
//Provides fast random access (index-based access) because it is backed by an array.
//Slow for insertions and deletions, especially in the middle of the list, because elements need to be shifted.
//Use Cases:

//When frequent access to elements using indexes is required.
//When the number of reads far exceeds the number of writes.
//2. LinkedList
//Characteristics:

//Doubly-linked list implementation of the List and Deque interfaces.
//Allows duplicate elements.
//Maintains the insertion order.
//Provides better performance than ArrayList for insertions and deletions at any position, as it involves only pointer changes.
//        Slower for random access because it requires traversal from the beginning or end of the list.
//Use Cases:
//
//When frequent insertions and deletions are required.
//When the number of writes far exceeds the number of reads.
//3. Vector
//Characteristics:
//
//Synchronized (thread-safe) resizable array implementation of the List interface.
//Allows duplicate elements.
//Maintains the insertion order.
//Provides fast random access.
//Slower than ArrayList due to synchronization overhead.
//Use Cases:
//
//When a thread-safe list implementation is required.
//In legacy code where Vector is already in use (since Vector is considered obsolete in favor of ArrayList and other concurrent collections).
//        4. Stack
//Characteristics:
//
//Subclass of Vector that implements a last-in-first-out (LIFO) stack.
//        Provides push, pop, peek, empty, and search methods.
//Synchronized (thread-safe) due to Vector inheritance.
//Use Cases:
//
//When a thread-safe LIFO stack is needed.
//For legacy code where Stack is already in use (since Stack is considered obsolete in favor of Deque implementations).
//        5. PriorityQueue
//Characteristics:
//
//Unbounded priority queue based on a priority heap.
//Does not allow null elements.
//Elements are ordered based on their natural ordering or by a Comparator provided at queue construction time.
//        Provides O(log n) time for insertion and deletion.
//Use Cases:
//
//When elements need to be processed in priority order rather than in the order of insertion.
//Suitable for scheduling and simulation systems.
//        6. ArrayDeque
//Characteristics:
//
//Resizable array implementation of the Deque interface.
//Does not allow null elements.
//Provides constant-time performance for insertions and deletions at both ends.
//More efficient than LinkedList for implementing stacks and queues.
//Use Cases:
//
//When a double-ended queue or stack is needed with better performance than LinkedList.
//        Suitable for implementing stacks, queues, and double-ended queues.
//        7. HashSet
//Characteristics:
//
//Implementation of the Set interface based on a hash table.
//Does not allow duplicate elements.
//        Allows null elements.
//Provides constant-time performance for basic operations (add, remove, contains, and size).
//Does not maintain any order of elements.
//Use Cases:
//
//When a collection of unique elements is needed.
//Suitable for fast lookups and efficient use of a hash table.
//8. LinkedHashSet
//Characteristics:
//
//Ordered version of HashSet that maintains a doubly-linked list across all elements.
//Preserves the insertion order.
//Does not allow duplicate elements.
//        Allows null elements.
//Slightly slower than HashSet due to the overhead of maintaining the linked list.
//Use Cases:
//
//When a collection of unique elements is needed, and the order of insertion must be preserved.
//        Suitable for use cases where the iteration order is important.
//These characteristics and use cases should help you choose the appropriate collection for your specific needs.