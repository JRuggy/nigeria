package ruggy.students;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> hello() {
		return List.of(
			new Student(
				1L,
				"Mariam",
				"jastonruggy@icloud.com",
				LocalDate.of(2000, Month.JANUARY, 5),
				21
			)
		);
	}

    public List<Student> getStudents() {
        return new ArrayList<>();
    }
}
