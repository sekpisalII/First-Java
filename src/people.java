import java.util.Scanner;

public class people{
    private int id ;
    private int age ;
    private String firstName;
    private String lastName;
    private double salary;
    public people(int id, int age , String firstName, String lastName,double salary){
        this.id = id ;
        this.age = age;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }
    public void display () {
        System.out.println(id);
        System.out.println(age);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(salary);
    }
    public  int a(int a,int b){
        return a+b;
    }
    public  double a(double a ,double b ){
        return a+b;
    }
}
