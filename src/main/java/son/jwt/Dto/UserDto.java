package son.jwt.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private String email;
    private String password;
    private String name;

    private String role;
}
