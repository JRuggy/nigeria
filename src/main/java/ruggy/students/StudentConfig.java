package ruggy.students;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jarred = new Student(
                    "Jarred",
                    "jarred@icloud.com",
                    LocalDate.of(2022, Month.MAY, 26));

            Student ruggy = new Student(
                    "Ruggy",
                    "jastonruggy@icloud.com",
                    LocalDate.of(1999, Month.SEPTEMBER, 4));

            Student hope = new Student(
                    "Hope",
                    "hope@icloud.com",
                    LocalDate.of(2003, Month.SEPTEMBER, 15));

            repository.saveAll(
                    List.of(jarred, ruggy, hope));
        };
    }
}
