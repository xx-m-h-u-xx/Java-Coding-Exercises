/* Method Overriding
If a subclass has the same method as declared in the super class, this is known as method overriding.

Method overriding rules:

- Must have the same parameter list.
- Must have the same return type: although a covariant return allows us to change the return type of the overridden method.
- Must not have a more restrictive access modifier: may have a less restrictive access modifier.
- Must not throw new or broader checked exceptions: may throw narrower checked exceptions and may throw any unchecked exception.
- Only inherited methods may be overridden (must have IS-A relationship) */

/* Superclass */
public class Programmer {
    public void code() {
        System.out.println("Coding in C++");
    }
}

/* Subclass */
public class JavaProgrammer extends Programmer{
    public void code() {
        System.out.println("Coding in Java");
    }
}

public class MethodOverridder {
    public static void main(String[] args) {
        Programmer ben = new JavaProgrammer();
        ben.code();
    }
}

/*
Output:
Coding in Java
 */
