package son.jwt.Dto.Response;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final Long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;


    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}