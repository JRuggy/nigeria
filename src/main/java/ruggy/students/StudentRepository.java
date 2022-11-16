package ruggy.students;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    // And this is just another way of querying the query
    @Query("select s from student s where s.email = ?1") //This is jp query and not a straight query
    
    // select * from student where email = ?
    Optional<Student> findStudentByEmail(String email);
}
