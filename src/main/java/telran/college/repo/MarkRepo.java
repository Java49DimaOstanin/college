package telran.college.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import telran.college.dto.*;
import telran.college.entities.*;


public interface MarkRepo extends JpaRepository<Mark, Long> {
	List<SubjectNameScore> findByStudentName(String studentName);
	@Query(value="SELECT student.name as name from Mark where subject.type=:type "
			+ "group by student.name order by avg(score) desc limit :nStudents")
List<String> findBestStudentsSubjectType(String type, int nStudents);
}
