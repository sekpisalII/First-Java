package ClassObject;

public class Overloading {
    public void dsip(char c ){
        System.out.println(c);
    }
    public void dsip(char c , int num){
        System.out.println(c + " " + num);
    }
}
class test{
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.dsip('A');
        obj.dsip('A',12);
    }
}