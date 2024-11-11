package Student.Management.System.Student.Management.System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.Management.System.Student.Management.System.Entity.Student;
import Student.Management.System.Student.Management.System.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    //sava students
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    //get all student from database
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //get all studets by id
    @Override
    public Student getStudentbyid(long id){
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }else{
            throw new RuntimeException();
        }
    }

    //update student
    @Override
    public Student updateStudent(Student student, long id){
        Student existingStudent = 
        studentRepository.findById(id).orElseThrow(
            ()-> new RuntimeException()
            );
           
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        //save
        studentRepository.save(existingStudent);
        return existingStudent;
    }

    //delete student
    @Override
    public void deleteStudent(long id){
        //check
        studentRepository.findById(id).orElseThrow(() -> new RuntimeException());
        //delete
        studentRepository.deleteById(id);
    }

}
