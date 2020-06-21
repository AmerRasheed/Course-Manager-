package se.lexicon.school_management_assignment.data.service.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.lexicon.school_management_assignment.data.dao.CourseCollectionRepository;
import se.lexicon.school_management_assignment.data.dao.StudentCollectionRepository;
import se.lexicon.school_management_assignment.data.dao.StudentDao;
import se.lexicon.school_management_assignment.data.sequencers.StudentSequencer;
import se.lexicon.school_management_assignment.data.service.converter.ModelToDto;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {StudentManager.class, CourseCollectionRepository.class, StudentCollectionRepository.class, ModelToDto.class})
public class StudentManagerTest {

    @Autowired
    private StudentService testObject;
    @Autowired
    private StudentDao studentDao;

    @Test
    @DisplayName("Test context successfully setup")
    void context_loads() {
        assertNotNull(testObject);
        assertNotNull(studentDao);
    }

    //Write your tests here

    @AfterEach
    void tearDown() {
        StudentSequencer.setStudentSequencer(0);
        studentDao.clear();
    }
}