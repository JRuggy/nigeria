package ruggy.students;

import java.util.List;
import java.time.*;

public class StudentService {
    public List<Student> hello() {
		return List.of(
			new Student(
				1L,
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}

    public List<Student> getStudents() {
        return null;
    }
}
