package se.lexicon.school_management_assignment.data.dao;
import se.lexicon.school_management_assignment.model.Student;
import java.util.Collection;

public interface StudentDao {

    Student createStudent(String name, String email, String address);
    Student findByEmailIgnoreCase(String email);
    Collection<Student> findByNameContains(String name);
    Student findById(int id);
    Collection<Student> findAll();
    boolean removeStudent(Student student);
    void clear();

}
