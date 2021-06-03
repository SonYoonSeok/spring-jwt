package son.jwt.DTO;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserRequest {

    private String email;
    private String password;
    private String name;
}
