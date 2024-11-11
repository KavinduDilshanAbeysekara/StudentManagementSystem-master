package Student.Management.System.Student.Management.System.service;

import java.util.List;

import Student.Management.System.Student.Management.System.Entity.Student;

public interface StudentService {
     Student saveStudent(Student student);
     List<Student> getAllStudents();
     Student getStudentbyid(long id);
     Student updateStudent(Student student, long id);
     void deleteStudent(long id);
}