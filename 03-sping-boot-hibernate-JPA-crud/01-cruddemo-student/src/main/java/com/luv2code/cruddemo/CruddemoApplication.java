package com.luv2code.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

// inject StudentDAO bean
    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            // deleteAllStudents(studentDAO);
            // deleteStudent(studentDAO);
            // createStudent(studentDAO);
            createMultipleStudents(studentDAO);
            // readStudent(studentDAO);
            // queryStudent(studentDAO);
            // queryForStudentsByLastName(studentDAO);

        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        // delete all students
        System.out.println("Deleting all students");
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted rows: " + numRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        // delete student with id 1
        int studentId = 1;
        System.out.println("Deleting student with id: " + studentId);
        studentDAO.deleteById(studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {

        // retrieve student based on the id: primary key
        int studentId = 1;
        System.out.println("Updating student with id: " + studentId);
        Student myStudent = studentDAO.findById(studentId);

        //change first name to "Scooby"
        System.out.println("Updating student: ");
        myStudent.setFirstName("John");
        //update the student
        studentDAO.update(myStudent);
        //display the updated student
        System.out.println("Updated student: " + myStudent);
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        // get a list of students
        List<Student> students = studentDAO.findByLastName("Ali");

        // display list of students
        for (Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }

    private void queryStudent(StudentDAO studentDAO) {
        // get a list of students
        List<Student> students = studentDAO.findAll();

        // display list of students
        for (Student tempStudent : students) {
            System.out.println(tempStudent);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        // create a student object
        System.out.println("Creating new student: ....");
        Student student = new Student("Saif", "Ali", "saif.ali@example.com");

        // save the student object
        System.out.println("Creating new student: ....");
        studentDAO.saveStudent(student);

        // display the student id
        int studentId = student.getId();
        System.out.println("Saved student. Generated id: " + studentId);

        // retrieve the student based on the id: primary key
        System.out.println("Retrieving student with id: " + studentId);
        Student retrievedStudent = studentDAO.findById(studentId);
        // display the student
        System.out.println("Found student: " + retrievedStudent);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating 3 students: ....");
        Student student1 = new Student("John", "Doe", "john.doe@example.com");
        Student student2 = new Student("Jane", "Doe", "jane.doe@example.com");
        Student student3 = new Student("Jim", "Beam", "jim.beam@example.com");

        studentDAO.saveStudent(student1);
        studentDAO.saveStudent(student2);
        studentDAO.saveStudent(student3);
        System.out.println("Saved students. Generated ids: "
                + student1.getId() + ", " + student2.getId() + ", " + student3.getId());
        System.out.println("All students created successfully.");
    }

    private void createStudent(StudentDAO studentDAO) {
        // create Student object
        System.out.println("Creating new student: ....");
        Student student = new Student("John", "Doe", "john.doe@example.com");

        // save the student object
        studentDAO.saveStudent(student);

        // display the student id
        System.out.println("Saved student. Generated id: " + student.getId());

    }

}
