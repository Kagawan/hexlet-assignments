package exercise.dto;

// BEGIN
import jakarta.validation.constraints.*;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GuestCreateDTO {
    @NotNull
    @NotBlank
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "^\\+\\d{11,13}$")
    private String phoneNumber;
    @Size(min = 4, max = 4)
    private String clubCard;
    @Future
    private LocalDate cardValidUntil;
    private LocalDate createdAt;
}
// END
