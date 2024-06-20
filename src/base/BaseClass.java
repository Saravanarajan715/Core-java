package base;

public class BaseClass {
    protected int a = 10;

    protected BaseClass() {
        System.out.println("Protected constructor");
    }

    protected void msg() {
        System.out.println("Protected msg method");
    }
}

