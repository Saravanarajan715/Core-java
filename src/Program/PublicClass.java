package Program;

class PublicDemo {
    public int b;
}
public class PublicClass {
    public int a = 10;

    public PublicClass() {
        System.out.println("Public constructor");
    }

    public void msg() {
        System.out.println("Msg method");
    }

    public static void main(String[] args) {
        PublicDemo p1 = new PublicDemo();
        p1.b = 20; 
        System.out.println("Value of b : " + p1.b);

        PublicClass p = new PublicClass();
        System.out.println("Value of a : " + p.a);
        p.msg();
    }
}


