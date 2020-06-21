package se.lexicon.school_management_assignment.data.service.converter;

import org.springframework.stereotype.Component;
import se.lexicon.school_management_assignment.dto.views.CourseView;
import se.lexicon.school_management_assignment.dto.views.StudentView;
import se.lexicon.school_management_assignment.model.Course;
import se.lexicon.school_management_assignment.model.Student;

import java.util.Collection;
import java.util.List;

@Component
public class ModelToDto implements Converters {
    @Override
    public StudentView studentToStudentView(Student student) {
        return null;
    }

    @Override
    public CourseView courseToCourseView(Course course) {
        return null;
    }

    @Override
    public List<CourseView> coursesToCourseViews(Collection<Course> courses) {
        return null;
    }

    @Override
    public List<StudentView> studentsToStudentViews(Collection<Student> students) {
        return null;
    }
}
