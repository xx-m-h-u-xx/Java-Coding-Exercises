/* Interface
An interface is a blueprint of a class.
An interface is 100% abstract. No constructors are allowed here. It represents an IS-A relationship.

NOTE: Interfaces only define required methods. We can not retain common code.

An interface can have only abstract methods, not concrete methods. By default, interface methods are public and abstract. So inside the interface, we don’t need to specify public and abstract.
So when a class implements an interface’s method without specifying the access level of that method, the compiler will throw an error stating “Cannot reduce the visibility of the inherited method from interface”. So that implemented method’s access level must be set to public.

By default, interface variables are public, static and final */

interface Drawable {
    void draw();
}
class Circle implements Drawable{
    public void draw() {
        System.out.println("Circle!");
    }
}
public class InterfaceChecker {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }
}
