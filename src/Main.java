import entities.StudentEntity;
import services.StudentService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main2(String[] args) {
        String space = " ";
        String value1 = "test1";
        String value2 = "test1";

        char c = value1.charAt(4);
        boolean blank = value2.isBlank();
        String substring = value1.substring(2, 4);
        boolean s = value1.contains("s");

        System.out.println(value1.equalsIgnoreCase(value2));
        System.out.println(value1.equals(value2));
        System.out.println(value1 == value2);
    }

    public static void main3(String[] args) {
        int x = 45; //0
        double x2 = 4.05; //0
        float v3 = 33.3F;
        long x4 = 8L;
        short x5 = 123;
        boolean isValid = false; //false
        char x6 = 's';

        Integer z1 = 5;
        Integer z2 = 5;
        Character z10;
        System.out.println(z1.compareTo(z2));

    }

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
       studentService.addStudent("Saleem", "sa123", "ss123", "sal.alzoubi@gmail.com", LocalDate.now().minusYears(30), 8);
       studentService.addStudent("Seraj", "sa123", "ss123", "seraj.alzoubi@gmail.com", LocalDate.now().minusYears(5), 2);
       studentService.addStudent("Abdullah", "sa123", "ss123", "abdullah.alzoubi@gmail.com", LocalDate.now().minusYears(4), 1);

        List<StudentEntity> studentEntityList = studentService.findAll();
        //studentEntityList.forEach(s-> System.out.println(s));

        StudentEntity studentEntity = studentService.findByIdFirstApproach(2);
        System.out.println(studentEntity);
    }
}