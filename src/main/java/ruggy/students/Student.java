package ruggy.students;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {

    }

    public Student(long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // This is for id
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // This is for name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    // This is for email
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    // This is for dob
    public LocalDate getDob(){
        return dob;
    }

    public void setDob(LocalDate dob){
        this.dob = dob;
    }
    
    // This is for age
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

}
