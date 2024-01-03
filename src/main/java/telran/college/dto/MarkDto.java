package telran.college.dto;

import jakarta.validation.constraints.*;

public record MarkDto(@NotNull @Positive long stId,@NotNull @Positive long subject,@NotNull @Min(60) @Max(100) int score) {

}
