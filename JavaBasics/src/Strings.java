public class Strings {
    /*
     * Java String : Non Primitive data type
     * Basically a object that represents a sequence of char values.
     * An array of characters works same as Java String.
     * 
     * Creation :
     * 1. By String literal
     * 2. By new keyword
     * 
     * String objects are immutable(unchangeable). Once object is create it's
     * data or state can't be changed.
     * 
     * Comparing Two Strings in Java
     * 
     * The String class equals() method compares the original
     * content of the string. It compares values of string for
     * equality. String class provides the following two
     * methods.
     * 
     * 1. public boolean equals(Object another) compares the string
     * to the specified object.
     * 2. public boolean equalsIgnoreCase(String another) compares this
     * string to another string, ignoring case.
     * 
     * Heap : Stores value
     * Stack : Stores references
     * 
     * Scanner metods for string :
     * 1. nextLine() : It consider complete line as string.
     * 2. next : It consider only one word before the space as input.
     * 
     * String methods : since strings are immutable each functions returns new string by keeping original string as it is.
     * 1. toUpperCase()
     * 2. toLowerCase()
     * 3. trim()
     * 4. startsWith() => Eg: Carpet.startsWith("Car");
     * 5. endsWith() => Eg: Carpet.endsWith("pet");
     * 6. equals()
     * 7. equalsIgnoreCase()
     * 8. charAt()
     * 9. valueOf()
     * 10. replace()
     * 11. contains()
     * 12. substring() beginindex and endindex
     * 13. split() can apply regex
     * 14. toCharArray()
     * 15. isEmpty()
     * 16. isBlank() => check for string is empty or contains whitespaces only.
     */

     public static void main(String[] args) {
        String name = "Arjun"; // Inside Heap memory(String constant pool area)
        System.out.println("First Name : " + name);
        String YourName = new String("Arjun"); // Inside Heap Memory Area
        name = "NewName"; // Arjun is still in memory until garbage collector do not clean.
        System.out.println("Second Name : " + name);


      //   String comparison :
      String name1 = "Virat";
      String name2 = "Virat";
      String name3 = new String("Virat");
      String name4 = "  ";

      System.out.println(name1==name2); // checks if references pointed are same or not.
      System.out.println(name1==name3);
      System.out.println(name1.equals(name3)); // checks values of objects. By default case sensitive.
      System.out.println(name2.contains("ra"));
      System.out.println(name4.isBlank());
     }
}
