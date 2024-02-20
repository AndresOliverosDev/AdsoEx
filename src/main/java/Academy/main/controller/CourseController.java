package Academy.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.main.model.Course;

@RestController
public class CourseController {

    @GetMapping("/course")
    public Course consult(Integer id, String name, String desc) {
        return new Course(id, name, desc);
    }
}
