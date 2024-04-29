package fileLesson;

import fileLesson.Product;
import org.nocrala.tools.texttablefmt.Table;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class read {
    public static void main(String[] args) {
        try {
            BufferedReader readerbuffer = new BufferedReader(new FileReader("data.csv"));
            String data;
            String [] contents = null;
            List<Product> product = new ArrayList<>();
            while((data=readerbuffer.readLine())!= null){
                contents = data.split(",");
                product.add(new Product(contents[0], contents[1],Integer.valueOf(contents[2]),contents[3]));
            }
            Table table = new Table(4);
            table.addCell("UUID");
            table.addCell("Product Name");
            table.addCell("Qty");
            table.addCell("Created Date");
            for(Product product1 : product){
                table.addCell(product1.getUuid(),0);
                table.addCell(product1.getName(),1);
                table.addCell(String.valueOf(product1.getQty()),1);
                table.addCell(product1.getCreatLocalDate(),3);
            }
            System.out.println(table.render());
//            product.forEach(System.out::println);
            readerbuffer.close();
        }catch (Exception ignore){
            System.out.println(ignore.getMessage());
        }
    }
}
