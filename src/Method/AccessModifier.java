package Method;

public class AccessModifier {
    //Publice Modifier
    public void publiceMethod(){
        //Block Code
    }
    //Protected Modifier
    protected void ProtectedMethod(){
        //Block Code
    }
    //Default Modifier
     void defaultModifier(){
        //Block Code
    }
    //Private Modifier

    private void privateModifier(){
        //Block Code
    }
    public double rectangleOfArea(double width, double height) {
        double area = width * height;
        return area;
    }   //parameter requires two double values from width and height
    public static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    public static void main (String [] args ){
        AccessModifier obj = new AccessModifier();

        System.out.println(obj.rectangleOfArea(12.0,13.0));
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");


    }
}
