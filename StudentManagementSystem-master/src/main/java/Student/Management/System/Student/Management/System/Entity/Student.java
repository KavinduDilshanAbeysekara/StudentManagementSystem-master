package Student.Management.System.Student.Management.System.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long  id;
    @Column(name = "first_name",nullable=false)
    private String firstName;
    @Column(name = "last name",nullable=false)
    private String lastName;
    @Column(name = "email id",nullable=false)
    private String email;
    @Column(name = "department")
    private String Department;
    @Column(name = "year of enrollment")
    private int yearOfEnrollment;
    
}
