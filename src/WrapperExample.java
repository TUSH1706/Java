public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

       final A Tushar = new A("Tushar singh");
        Tushar.name = "other name";

        // when a non-primitive is final uh can not re-assign it
       // Tushar = new A("new object");

        A obj;

        for (int i = 0; i < 100000000; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;

    }
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
