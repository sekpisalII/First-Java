package StaticClass;

public class Outer {
        static int a;
    static class Nested_Demo {
        public void my_method() {
            System.out.println("This is my nested class");
            System.out.println(a);
        }
    }
    public static void main(String args[]) {
        Outer.Nested_Demo nested = new Outer.Nested_Demo();
        nested.my_method();
    }
}
