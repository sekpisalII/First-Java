package fileLesson.Practice;

import fileLesson.model.Product;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.csv"));
            String[] contents = null;
            String data;
            Product product = new Product();
            while ((data = bufferedReader.readLine()) != null){
                contents = data.split(",");
                product.setUuid(contents[0]);
                product.setProductName(contents[1]);
                product.setCreatedDate(contents [4]);
                product.setProductQty( Integer.parseInt(contents[2]));
                product.setProductPrice( Integer.parseInt(contents[3]));
            }
            System.out.println(product);
            bufferedReader.close();
        }catch (Exception ignore){
            System.out.println(ignore.getMessage());
        }

    }
}
