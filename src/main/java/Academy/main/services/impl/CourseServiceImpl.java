package Academy.main.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Academy.main.models.Course;
import Academy.main.repositories.CourseRepository;
import Academy.main.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

    // Annotation of Injection Dependency of Repository
    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public Course getById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @SuppressWarnings("null")
    @Override
    public Course updateCourse(Long id, Course course) {
        Course courseBBDD = courseRepository.findById(id).orElse(null);

        if (courseBBDD != null) {
            courseBBDD.setName(course.getName());
            courseBBDD.setDescription(course.getDescription());
            return courseRepository.save(courseBBDD);
        }
        return null;
    }

    @SuppressWarnings("null")
    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

}
