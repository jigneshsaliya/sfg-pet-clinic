package guru.springframework.sfgpetclinic.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PetType {
    private String name;
}

