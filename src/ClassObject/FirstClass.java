package ClassObject;

import java.util.Random;
import java.util.UUID;

public class FirstClass {

    public static void main(String[] args) {
        Student obj1 = new Student(
                UUID.randomUUID().toString()
                , "psial"
                , "Sek"
                , "male"
                , 19
                , "pisalsek88@gmail.com");
        System.out.println(obj1);
    }
}


