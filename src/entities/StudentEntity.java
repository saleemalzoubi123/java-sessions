package entities;

import java.time.LocalDate;
import java.util.Objects;


public class StudentEntity extends Object {

    public StudentEntity(){

    }

    public StudentEntity(Integer id, String name, String username, String password, String email, LocalDate birthDate, Integer grade) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.birthDate = birthDate;
        this.grade = grade;
    }

    private Integer id;
    private String name;
    private String username;
    private String password;
    private String email;

    private LocalDate birthDate;
    private Integer grade;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentEntity student)) return false;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(username, student.username) && Objects.equals(password, student.password) && Objects.equals(email, student.email) && Objects.equals(birthDate, student.birthDate) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, email, birthDate, grade);
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", grade=" + grade +
                '}';
    }

    public void print() {
        System.out.println("StudentEntitySSSSSS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", grade=" + grade +
                '}');
    }
}
