package Introduction;

/*
 * Comparable and Comparator : 
 * To sort custom objects like Student or Employee, we need to provide explicit
 * sorting logic.
 * To achieve this, Java provides the Comparable and Comparator interfaces. 
 * Comparable and Comparator in Java allows us to define custom sorting behavior
 * for objects, including sorting based on multiple data members.
 * 
 * The interface is found in java.lang package and contains only one method named
 * compareTo(Object). It provides a single sorting sequence only, i.e, you can sort the
 * elements on the basis of single data member only. For example, it may be rollno, name
 * age or anything else.
 * 
 * public int compareTo(Object obj) : It is object is greater than the specified object.
 * It returns :
 * positive integer, if the current object is greater than the specified object.
 * negative integer, if the current object is less than the specified object.
 * zero, if the current object is equal 
 * 
 * Comparator interface defines a compare(arg1, arg2) methods with two arguments that
 * represent compared objects, and works similarly to the Comparabke.compareTo() method.
 * 
 * we can use lambda expression also.
 */

public class intro {

}
