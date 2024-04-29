package file;
import java.io.*;
public class Main {
    public static void writeObjectToFile(Student student){
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Student.dat"));
            outputStream.writeObject(student);
            outputStream.flush();
            outputStream.close();
            System.out.println("Complete Write to file !!!!!");
        }catch(Exception ignore){}
    }
    public static void readObjectFromFile(){
        try{
            ObjectInputStream read = new ObjectInputStream( new FileInputStream("Student.dat"));
            Student student =  (Student) read.readObject();
            System.out.println(student);
            read.close();
            System.out.println("Read data from file complete !!!!!");
        }catch(IOException ignore){} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
Student student = new Student(3,"Koko",new String[]{"papa"},new String[]{"Khmer"});
       readObjectFromFile();
       //writeObjectToFile(student);
    }
}
