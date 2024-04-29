package ClassObject;

import java.util.UUID;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String gendel;
    private Integer age;
    private String email;

    public Student(String id, String firstName, String lastName, String gendel, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gendel = gendel;
        this.age = age;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGendel() {
        return gendel;
    }

    public void setGendel(String gendel) {
        this.gendel = gendel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return STR."Student{id=\{id}, firstName='\{firstName}\{'\''}, lastName='\{lastName}\{'\''}, gendel='\{gendel}\{'\''}, age=\{age}, email='\{email}\{'\''}\{'}'}";
    }
}
