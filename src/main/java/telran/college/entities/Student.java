package telran.college.entities;

import jakarta.persistence.Entity;
import telran.college.dto.PersonDto;

@Entity

public class Student extends Person {
public Student(PersonDto personDto) {
	super(personDto);
}
}
