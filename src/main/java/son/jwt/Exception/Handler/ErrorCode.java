package son.jwt.Exception.Handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_ALREADY_EXIST(HttpStatus.CONFLICT,409, "Email is Already Exist");

    private final HttpStatus errorStatus;
    private final int errorCode;
    private final String errorMessage;
}
