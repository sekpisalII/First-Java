package fileLesson.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String uuid;
    private String ProductName;
    private Integer ProductPrice;
    private Integer ProductQty;
    private String createdDate;
}
