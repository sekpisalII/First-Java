package OOP.Inheritance.Encapsulation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
 class Email{
        private Integer id ;
        private String topic;
        private String description;
        private LocalDateTime sentDate;
}
public class email {
    public static void main(String[] args) {
        int [] number = new int[2];
        number[0] = 12;
        number[1] = 10;
        System.out.println(number[0]);
    }
}
