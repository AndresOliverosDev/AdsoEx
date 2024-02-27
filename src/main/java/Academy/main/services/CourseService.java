package Academy.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import Academy.main.models.Course;

@Service
public interface CourseService {

    List<Course> getAllCourses();

    Course getByIdCourse(Long id);

    Course addCourse(Course course);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);
}
