package son.jwt.Exception;

import son.jwt.Exception.Handler.ErrorCode;
import son.jwt.Exception.Handler.JwtException;

public class UserEmailAlreadyExistException extends JwtException {
    public UserEmailAlreadyExistException() {
        super(ErrorCode.USER_ALREADY_EXIST);
    }
}