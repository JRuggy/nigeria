package ruggy.students;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.time.*;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
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
}
