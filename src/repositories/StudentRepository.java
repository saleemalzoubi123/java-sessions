package repositories;

import entities.StudentEntity;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<StudentEntity> studentEntityList = new ArrayList<>();

    public List<StudentEntity> getStudentEntityList() {
        return studentEntityList;
    }

    public void setStudentEntityList(List<StudentEntity> studentEntityList) {
        this.studentEntityList = studentEntityList;
    }
    public int getCurrentSequence(){
        return studentEntityList.size();
    }
    public int getNextSequence(){
        return studentEntityList.size()+1;
    }
}
