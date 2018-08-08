package guru.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Owner extends Person{
    Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
