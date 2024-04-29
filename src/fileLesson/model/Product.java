package fileLesson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String uuid;
    private String ProductName;
    private Integer ProductPrice;
    private Integer ProductQty;
    private String createdDate;
}
