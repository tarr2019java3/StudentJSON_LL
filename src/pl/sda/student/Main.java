package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Marek", "Kwiatkowski", 26);
        Student student2 = new Student("Marcin", "Nowak", 42);
        Student student3 = new Student("Dawid", "Rutkowski", 36);
        Student student4 = new Student("Krzysztof", "Szybki", 1);
        Student student5 = new Student("Andrzej", "Parapet", 22);

        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>() ;
        studentList.add(student) ;
        studentList.add(student1) ;
        studentList.add(student2) ;
        studentList.add(student3) ;
        studentList.add(student4) ;
        studentList.add(student5);

        try {
            objectMapper.writeValue(new File("student_lista.json"), studentList);
            objectMapper.writeValue(new File("student.json"), student);
            objectMapper.writeValue(new File("student1.json"), student);
            objectMapper.writeValue(new File("student2.json"), student);
            objectMapper.writeValue(new File("student3.json"), student);
            objectMapper.writeValue(new File("student4.json"), student);
            objectMapper.writeValue(new File("student5.json"), student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
