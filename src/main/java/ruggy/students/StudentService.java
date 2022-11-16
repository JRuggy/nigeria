package ruggy.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository){
		this.studentRepository = studentRepository;
	}

    public List<Student> hello() {
		return studentRepository.findAll();
	}

    public List<Student> getStudents() {
        return new ArrayList<>();
    }

	public void addNewStudent(Student student) {
		// studentRepository.findStudentByEmail(student.getEmail());
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

		// Condition To Check
		if(studentOptional.isPresent()){
			throw new IllegalStateException("Email Taken");
		}

		studentRepository.save(student);


		// System.out.println(student);
	}
}
