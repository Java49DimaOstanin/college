package telran.college.dto;

import jakarta.validation.constraints.*;

public record SubjectDto(@NotNull @Positive Long id, String name, 
		@NotNull @Min(50) @Max(300)int hours,
		@Positive Long lecturerId,SubjectType type) {

}
