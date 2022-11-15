package ruggy.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService();
    }

    private StudentService studentService() {
        return null;
    }

    @GetMapping
	public List<Student> getStudents() {
		return studentService.hello();
	}
}
