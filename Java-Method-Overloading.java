/* Method overloading
If a class has multiple methods that have same name but different parameters, this is known as method overloading.

Method overloading rules:

Must have a different parameter list
May have different return types
May have different access modifiers
May throw different exceptions */

class JavaProgrammer{
    public void code() {
        System.out.println("Coding in C++");
    }
    public void code(String language) {
        System.out.println("Coding in "+language);
    }
}
public class MethodOverloader {
    public static void main(String[] args) {
        JavaProgrammer gosling = new JavaProgrammer();
        gosling.code();
        gosling.code("Java");
    }
}
/*
Output:
Coding in C++
Coding in Java
 */
