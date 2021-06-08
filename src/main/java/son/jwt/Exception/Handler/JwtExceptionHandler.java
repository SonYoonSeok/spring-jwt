package son.jwt.Exception.Handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class JwtExceptionHandler {

    @ExceptionHandler(JwtException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(HttpServletRequest request, final JwtException e) {
        e.printStackTrace();
        return ResponseEntity
                .status(e.getErrorCode().getErrorStatus())
                .body(ErrorResponse.builder()
                        .errorCode(ErrorCode.USER_ALREADY_EXIST.getErrorCode())
                        .errorMessage(ErrorCode.USER_ALREADY_EXIST.getErrorMessage())
                        .build());
    }
}
