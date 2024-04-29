package OOP.Inheritance;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;
class Book{
    private String uuid;
    private String title;
    private String[] authors;
    private LocalDate publishedDate;
    private Integer numberOfPage;
    public Book(){}
    public Book(String uuid, String title, String[] authors, LocalDate publishedDate, Integer numberOfPage) {
        this.uuid = uuid;
        this.title = title;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.numberOfPage = numberOfPage;
    }
    public String getUuid() {
        return uuid;
    }
    public String getTitle() {
        return title;
    }
    public String[] getAuthors() {
        return authors;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }
    public Integer getNumberOfPage() {
        return numberOfPage;
    }

    @Override
    public String toString() {
        return STR."Book{uuid='\{uuid}\{'\''}, title='\{title}\{'\''}, authors=\{
                Arrays.toString(authors)}, publishedDate=\{
                publishedDate}, numberOfPage=\{numberOfPage}\{'}'}";
    }
}
class TextBook extends Book{
    public TextBook(String uuid, String title, String[] authors, LocalDate publishedDate, Integer numberOfPage){
        super(uuid, title, authors, publishedDate, numberOfPage);
    }
    public void getDetail(){
        System.out.println(STR."Book UUID: \{super.getUuid()}");
        System.out.println(STR."Book Title: \{super.getTitle()}");
        System.out.println(STR."Book authors: \{Arrays.toString(super.getAuthors())}");
        System.out.println(STR."Book published date: \{super.getPublishedDate()}");
        System.out.println(STR."Book page: \{super.getNumberOfPage()}");
    }
}
public class Parent {
    public static void main(String[] args) {
        TextBook Srunoun = new TextBook(
                UUID.randomUUID().toString(),
                "KobKob",
                new String[]{"Pisal","Nika"},
                LocalDate.of(2024,2,2),
                300
        );
        System.out.println(Srunoun);
    }
}
