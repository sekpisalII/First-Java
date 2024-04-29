package fileLesson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String uuid;
    private String name;
    private int qty;
    private String creatLocalDate;

}
