/* Object Type Casting
Java type casting is classified into two types:

Widening casting (implicit): automatic type conversion.
Narrowing casting (explicit): need explicit conversion.
In primitives, long is a larger type than int . Like in objects, the parent class is a larger type than the child class.

The reference variable only refers to an object. Casting a reference variable doesn’t change the object on the heap but it labels the same object in another way by means of instance members accessibility.

I. Widening casting

Superclass superRef = new Subclass();
II. Narrowing casting

Subclass ref = (Subclass) superRef;
We have to be careful when narrowing. When narrowing, we convince the compiler to compile without any error. If we convince it wrongly, we will get a run time error (usually ClassCastException).

In order to perform narrowing correctly, we use the instanceof operator. It checks for an IS-A relationship */

class A {
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("Class B");
    }
}

public class Test {
    public static void main(String[] args) {
        A objA = new B();
        if(objA instanceof B){
            ((B)objA).display();
        }
    }
}
/**
 * Output: Class B
 */
