package strings;

import java.util.*;


public class lec1 {
    void main() {
        // String ch1 = "sexy";

        // String ch = new String("hotty");

        // System.out.println(ch);

        // String Pool:
        // The String Pool is a special area inside the Heap memory that stores String literals.
        //
        // Working:
        // 1. When a String literal is created (e.g., "Hello"), Java first checks
        //    whether that value already exists in the String Pool.
        // 2. If it does not exist, Java creates the String object and stores it in the pool.
        // 3. If the same String literal is used again, Java does NOT create a new object.
        //    Instead, it returns a reference to the existing object in the pool.
        // 4. This saves memory because multiple references can point to the same String object.

        // if new keyword is used then:
        // String s1 = "Hello";
        // String s2 = new String("Hello");

        //"Hello" is still stored in the String Pool.
        // new String("Hello") creates a new object in the Heap, outside the String Pool.
        // So s1 == s2 is false, even though s1.equals(s2) is true.


        // System.out.println(s2.length());
        // System.out.println(s1.charAt(1));

        //string is immutable: once created cannt be changed
        // StringBuilder:
        // StringBuilder is a mutable class in Java used to create and modify strings efficiently.
        //
        // Mutable means its content can be changed without creating a new object.

        //string builder
        // StringBuilder is a mutable class in Java that allows efficient string manipulation by modifying the same object instead of creating new objects. 
        // It is faster than String for repeated modifications but is not thread-safe.
        
        // Why use StringBuilder?
        // - String objects are immutable.
        // - Every time you modify a String (using +, concat(), etc.),
        //   Java creates a new String object.
        // - StringBuilder modifies the existing object instead,
        //   making it faster and more memory-efficient for multiple changes.

        // StringBuilder sb = new StringBuilder("Hello");

        // sb.append(" World");     // Hello World
        // sb.insert(5, ",");       // Hello, World
        // sb.replace(0, 5, "Hi");  // Hi, World
        // sb.delete(2, 3);         // Hi World
        // sb.reverse();            // dlroW iH

        // System.out.println(sb);

        //commonn methods
        // append()      // Adds text to the end
        // insert()      // Inserts text at a specific index
        // replace()     // Replaces characters
        // delete()      // Removes characters
        // deleteCharAt()// Removes a character at an index
        // reverse()     // Reverses the characters
        // length()      // Returns the length
        // capacity()    // Returns the current capacity
        // charAt()      // Gets a character at an index
        // setCharAt()   // Changes a character at an index
        // toString()    // Converts StringBuilder to String


        // == compares and gives true or false as output
        
        // .equals() case sensitive -> it checks wether the strings match uppercae lowercase (compares contents (values))
        
        // .equalsIgnoreCase()
        // Compares the content of two Strings while ignoring
        // differences in uppercase and lowercase letters.

        //String input 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("provide the string content: ");
        // String str = sc.nextLine();
        // System.out.println("value: " + str);
        // System.out.println("provide the string content: ");
        // String s = sc.next(); // skips when a gap is found
        // System.out.println("value of next:" + s);

    }
}
