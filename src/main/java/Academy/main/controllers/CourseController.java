package Academy.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import Academy.main.models.Course;
import Academy.main.services.CourseService;

@RestController
public class CourseController {

    //Injection Dependency CourseService
    @Autowired
    CourseService courseService;

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    };

    @GetMapping("/getByIdCourse")
    public Course getByIdCourse(Integer id) {
        return courseService.getByIdCourse(id);
    };

    @PostMapping("/addCourse")
    public Course addCourse(String name, String desc) {
        return courseService.addCourse(new Course(name , desc));
    };

    @PutMapping("/updateCourse")
    public Course updateCourse(Integer id, String name, String desc) {
        return courseService.updateCourse(id, new Course(name, desc));
    };

    @DeleteMapping("/deleteCourse")
    public ResponseEntity<String> deleteCourse(Integer id) {
        try{
            courseService.deleteCourse(id);
            return ResponseEntity.ok("El Curso " + id + "Ha sido eliminado satisfactoriamente");
        }
        catch(Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo encontrar el cliente con ID " + id);
        }

        };
}
