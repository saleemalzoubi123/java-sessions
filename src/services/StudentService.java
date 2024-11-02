package services;

import entities.StudentEntity;
import repositories.StudentRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public class StudentService {
    private final static String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    StudentRepository studentRepository = new StudentRepository();
    List<StudentEntity> studentEntityList = studentRepository.getStudentEntityList();
    public void addStudent(String name,
                           String username,
                           String password,
                           String email,
                           LocalDate birthDate,
                           Integer grade) {

        if (name.isBlank()) {
            System.out.println("Invalid name");
            return;
        }
        if (username.isBlank()) {
            System.out.println("Invalid name");
            return;
        }
        if (password.isBlank()) {
            System.out.println("Invalid name");
            return;
        }
        if (email == null || !email.matches(emailRegex)) {
            System.out.println("Invalid email");
            return;
        }
        int id = studentRepository.getNextSequence();
        StudentEntity student = new StudentEntity(id, name, username, password, email, birthDate, grade);
        studentEntityList.add(student);
    }

    public StudentEntity findByIdSecondApproach(int id) {
        for (int i = 0; i < studentEntityList.size(); i++) {
            StudentEntity student = studentEntityList.get(i);
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public StudentEntity findByIdFirstApproach(int id) {
        Optional<StudentEntity> optionalStudentEntity = studentEntityList.stream().filter(s -> s.getId().equals(id)).findFirst();
        if (optionalStudentEntity.isPresent()) {
            return optionalStudentEntity.get();
        }
        return null;
    }

    public StudentEntity findByIdThirdApproach(int id) {
       for (StudentEntity s: studentEntityList){
           if(s.getId().equals(id)){
               return s;
           }
       }
       return null;
    }

    public StudentEntity findByEmail(String email) {
        Optional<StudentEntity> optionalStudentEntity = studentEntityList.stream().filter(s -> s.getEmail().equalsIgnoreCase(email)).findFirst();
        return optionalStudentEntity.orElse(null);
    }

    public List<StudentEntity> findAll(){
        return studentEntityList;
    }

    //TODO implement update method
    //TODO implement delete method
    //TODO implement Grade entity (name, code)
    //TODO implement Grade repository
    //TODO implement Grade service (add, delete, update, findAll, findById)
}
