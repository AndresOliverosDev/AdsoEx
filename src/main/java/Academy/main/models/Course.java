package Academy.main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Courses")
public class Course {

    @Getter
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCourse;

    @Getter
    @Setter
    @Column
    private String name;

    @Getter
    @Setter
    @Column
    private String description;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Course() {
        
    }
}
