package derived;


import base.BaseClass;

public class DerivedClass extends BaseClass {
    public DerivedClass() {
        super(); // Calls the protected constructor of BaseClass
    }

    public void display() {
        System.out.println("Value of a : " + a); // Accessing protected variable from BaseClass
        msg(); // Calling protected method from BaseClass
    }

    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.display();
    }
}
