package guru.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
