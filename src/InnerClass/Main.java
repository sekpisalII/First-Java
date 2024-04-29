package InnerClass;
class outerclass {
    private String outerField = "Hello CSTAD" ;
    public class InnerClass {
        public void accessOuterField() {
            System.out.println(outerField);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        outerclass outer = new outerclass();
        outerclass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterField();
    }
}