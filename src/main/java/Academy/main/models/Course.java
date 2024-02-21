package Academy.main.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Courses")
public class Course {

    @Id
    public Integer idCourse;
    public String name;
    public String description;

    public Course(Integer idCourse, String name, String description) {
        this.idCourse = idCourse;
        this.name = name;
        this.description = description;
    };

}
