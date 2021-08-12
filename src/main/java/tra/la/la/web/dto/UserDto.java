package tra.la.la.web.dto;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
public class UserDto {

    private UUID id;
    private String firstName;
    private String secondName;
    private String lastName;
    private String phone;
}
