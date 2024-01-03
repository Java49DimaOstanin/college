package telran.college.dto;

import java.time.LocalDate;

public record PersonDto(long id,String name ,LocalDate birthDate,String city,String phone) {
	

}
