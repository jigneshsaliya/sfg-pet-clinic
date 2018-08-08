package guru.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vet extends Person{
    Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
