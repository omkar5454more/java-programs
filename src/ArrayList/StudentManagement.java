package ArrayList;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> studentList = new ArrayList<>();
    public void addStudent(Student s){
        studentList.add(s);

    }
    public void removeStudent(int id){
        for(Student s : studentList)
            if(s.getStudentId()==id){
                studentList.remove(s);
            }
    }
    public void displayStudent(){

        for(Student s: studentList){
            System.out.println(s.toString());
        }

    }
    public void searchStudent(String name ){
        for(Student s : studentList)
            if(s.getStudentName()== name)
                System.out.println(s.toString());
    }
    public void failedStudent(){
        for (Student s : studentList)
            if(s.getStudentMarks()<35.0)
                System.out.println(s.toString());

    }
    public void topperStudent(){
        for (Student s : studentList)
            if(s.getStudentMarks()>90)
                System.out.println(s.toString());
    }



}