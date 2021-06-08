package son.jwt.Exception.Handler;

import lombok.Getter;

@Getter
public class JwtException extends RuntimeException {

    private ErrorCode errorCode;

    public JwtException(ErrorCode errorCode) {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }
}
