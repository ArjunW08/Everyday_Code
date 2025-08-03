package Introduction;

/*
 * Java Collection Framework :
 * Provides a set of interfaces and classes to implement various data strutures and algorithms.
 * These interfaces include several methods to perform different operations on collections.
 * 
 * Collection -> List, Set, Queue
 * Map -> SorterdMap
 * Iterator -> ListIterator
 * 
 * List
 * Set -> SortedSet
 * Queue -> Deque
 * 
 * All above mentioned are interfaces. This whole set is called as collection framework.
 * 
 * Java Collection Interface :
 * It contains various ethods that can be used to perform different operations on objects.
 * 1. size()
 * 2. isEmpty()
 * 3. contains(Object O)
 * 4. add(E e)
 * 5. remove(Object O)
 * 6. containsAll(Collection<> C)
 * 7. addAll(Coellection<> C)
 * 8. removeAll(Collection<> C)
 * 9. retainALL(Collection<> C)
 * 10. clear()
 * 11. Object[] toArray()
 * 
 * Java List Interface : 
 * The List interface extends the collection interface and adds methods that are specific
 * to lists, which are ordered collections that allow duplicate elements.
 * Here are some methods that are present in the list interface but not in the 
 * Collection inerface :
 * get(int index)
 * set(int index, E element)
 * add(int index, E element) : Inserts an element and shift others on right side.
 * remove(int index) : removes element 
 * indexOf(Object o)
 * lastIndexOf(Object o)
 * listIterator()
 * listIterator(int index) : Return the list iterator from the specified index.
 * subList(int fromIndex, int toIndex) : Return a view of the portion of the list.
 * 
 * Classes Implementing List Interface : 
 * 1. ArrayList
 * 2. LinkedList
 * 3. Stack
 * 4. Vector
 * 
 * Java ArrayList :
 * In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, 
 * it's hard to change it.
 * To handle this issue, we can use the ArrayList class. It allows us to create resizable arrays.
 * Unlike arrays, arraylists can automatically adjust their capacity when we add or remove elements from them. 
 * Hence, arraylists are also known as dynamic arrays.
 * 
 * Initially the arraylist has a certain capacity, and as elements are added, it fills up.
 * When the capacity is reached, the ArrayList creates a new larger array and copies the elemets from the old array to the new one.
 * This process of resizing and copyting is transparent to the user.
 * 
 * However, frequent resizing operations can lead to the performance overhaed, so the ArrayList increases
 * it's capacity by a certain factor to minimize the frequency of resizing.
 * 
 * Java LinkedList :
 * The LinkedList class of the java collections framework provides the functionality of the linkedlist data 
 * structure(double linkedlist).
 * Elements in linked lists are not stored in sequence. Instead they are scattered and connected through links(Prev and Next).
 * 
 * Java Vector : 
 * The Vector class synchronizes each indivisual operations. Ths means whenever we want to perform operations on vectors, 
 * the vector class automatically applies a lock to that operation. 
 * It is because when one therad is accessing a vector, and at the same time another thread tries to access it, an exception
 * called. ConcurrentModificationException is generated. Hence, this continous use of lock for each operation makes vector less efficient.
 * However, in array lists, method are not synchronized.
 * 
 * Java Stack :
 * In stack, elements are stored and accessed in Last In First Out manner. That is elements are added to the top of the stack and removed
 * from the top of the stack.
 * 
 * 1. void push(E item): Pushes an element on to the top of stack.
 * 2. E pop() : Removes and returns the element at the top of the stack. Throws an 
 * EmtpyStackException if the stack is empty.
 * 3. E peek() : Returns the element at the top of the stack without removing it. Throws EmptyStackException if the stack is empty.
 * 4. boolean empty() : Returns true if the stack is empty.
 * 
 * Java Queue Interface : 
 * Provides the functionality of Queue data structure. It extends collection interface.
 * 
 * Methods in Queue Interface : 
 * 1. boolean add(E e): Inserts specified element into the queue.
 * 2. boolean offer(E e): Inserts specified element into the queue. Returns true
 * if the element was added successfully, or false if the queue is full.
 * 3. E remove(): Removes and returns the element at the front of the queue.
 * Throws an exception id the queue is empty. It can throw exception.
 * 4. E poll(): Removes and returns the element at the front of the queue. 
 * Returns null if the queue is empty.
 * 5. E element(): Retrieves but does not remove the element at the front of the queue.
 * Throws an exception if the queue is empty.
 * 6. E peek(): Retrieves but does not remove the element at the front of the queue. Returns null
 * if the queue is empty.
 * 
 * Classes Implementing Queue interface : 
 * 1. ArrayDeque(Queue -> Deque -> ArrayDeque)
 * 2. LinkedList
 * 3. PriorityQueue
 * 
 * Java ArrayDeque Class : 
 * Adding Elements:
 * addFirst(E e) or offerFirst(E e): Adds an element to the front of the deque.
 * addLast(E e) or offerLast(E e): Adds an element to the end of the deque.
 * 
 * Removing ElementsL
 * removeFirst() or pollFirst(): Removes and returns the element at the front of deque.
 * removeLast() or pollLast(): Removes and returns the element at the end of deque.
 * 
 * Accessing Elements:
 * getFirst() or peekFirst(): Returns the element at the front of the deque without removing it.
 * getLast() or peekLast(): Returns the element at the end of the deque without removing it.
 * 
 * Stack and Queue Operations Using ArrayDeque(standard way to use)
 * You Can make stack, queue, and doubly ended queue using ArrayDeque.
 * 1. Stack Operations:
 * push(E e): Pushes an element onto the stack represented by the deque.
 * pop(): Pops an element from the stack represented by the deque.
 * 
 * 2. Queue Operations:
 * add(E e) or offer(E e): Adds an element to the end of the deque, effectively making it a queue.
 * remove() or poll(): Removes and returns the element at the front of the deque making it a queue.
 * 
 * 
 * Java Set Intreface:
 * The set interface of the Java Collections framework provides the features of the mathematical set in 
 * Java. It extends the Collection interface. Unlike the List interface, sets cannot duplicate elements.
 * 
 * Classes Implementing Set Interface : 
 * 1. EnumSet 
 * 2. HashSet // Creates a unique hash of each element.
 * 3. LinkedHashSet
 * 4. TreeSet
 * 
 * Methods of Set Interface : 
 * 1. add() : Add specified elements into the set.
 * 2. allAll() : Add all the elements of the specified collections to the set.
 * 3. remove() : removes the specified elements from the set.
 * 4. removeAll() : removes all the elements from the set that are present in another specified set.
 * 5. retainAll() : retains all the elements in the set that are also present in another specified set.
 * 6. clear() : removes all the elements from the set.
 * 7. size() : returns the length of the set.
 * 8. contains() : returns true if the set contains the specified element.
 * 
 * 
 * Java Hashset :
 * In Java, HashSet is commonly used if we have to access elements randomly.
 * It is because elements in a hash table are accessed using hash codes.
 * The hashcode of an element is a unique identity that helps to identify the 
 * elements in a hash table.
 * HashSet cannot contain duplicate elemets. Hence each hash set element has a unique hashcode.
 * 
 * Java HashSet of Custom Objects :
 * When using Set and HashSet in Java, for the primitive types we can just use it
 * without worry about how to implement the hashcode and the comparison logic.
 * But when you want to use the Set with a custom class by putting custom objects
 * into the set, that custom class has to implement the hashCode() and equals() methods in order 
 * for the HashSet to work.
 * 
 * Java Map Interface : 
 * In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with 
 * indivisual values. A map cannot contain duplicate keys. Ans, each key is associated with a single
 * value.
 * 
 * Classes Implementing Map Interface : 
 * 1. HashMap
 * 2. TreeMap
 * 3. EnumMap
 * 4. LinkedHashMap
 * 5. WeakHashMap
 * 
 * Methods of Map
 * 1. put(K,V) : Inserting key/value pair
 * 2. putAll() : Insert all entried from from a specified map to this map
 * 3. putIfAbsent(K,V) : If key not associated with the value V
 * 4. get(K) : Returns the value associated with the specified key K. 
 * If the key is not found it retuens null.
 * 5. getOrDefault(K, defaultValue) : Returns the value associated with specified key.
 * If the key is not found, it returns the defaultValue.
 * 6. containsKey(K) : Checks if the specified key K is present in the map or not.
 * 7. conatinsValue(V) : Checks if the specified value V is present in the map or not.
 * 8. replace(K,V) : Replace the value of the key K with the new specified value V.
 * 9. replace(K, oldValue, newValue) : replaces the value of the key K with the new value
 * only if the key K is associated with the value oldValue.
 * 10. remove(K) : Removes the entry from the map represented by the key K.
 * 11. remove(K,V) : Removes the entry from the map that has key K associated with the value V.
 * 12. keySet() : Returns a set of all keys present in a map.
 * 13. values() : Returns a set of all the values present in a map.
 * 14. entrySet() : Returns a set of all the key/value mapping present in a map.
 * 
 * Key Value pair actually stored as an entry.
 */

public class Intro {

}
