package Academy.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import Academy.main.models.Course;

@Service
public interface CourseService {

    List<Course> getAllCourses();

    Course getByIdCourse(Integer id);

    Course addCourse(Course course);

    Course updateCourse(Integer id, Course course);

    void deleteCourse(Integer id);
}
