package ClassObject;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;
public class CreateArrayObj {
    public static void main(String[] args) {
        Student [] students = new Student[2];
        students[0] = new Student(
                UUID.randomUUID().toString(),
                "pisal",
                "Sek",
                "male",
                19,
                "pisalsek88@gmail.com"
        );
        students[1] = new Student(UUID.randomUUID().toString(),
                "pisal",
                "Sek",
                "male",
                20,
                "ot kvol168@gmail.com");
        System.out.println(Arrays.toString(students));
    }
}
