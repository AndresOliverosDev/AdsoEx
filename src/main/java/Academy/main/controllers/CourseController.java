package Academy.main.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.main.models.Course;

@RestController
public class CourseController {

    @PostMapping("/course")
    public Course consult(Integer id, String name, String desc) {
        return new Course(id, name, desc);
    }
}
