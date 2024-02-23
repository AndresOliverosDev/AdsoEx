package Academy.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Academy.main.models.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
