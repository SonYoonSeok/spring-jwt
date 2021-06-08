package son.jwt.Exception.Handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public class ErrorResponse {

    private int errorCode;
    private String errorMessage;

    @Builder
    public ErrorResponse(HttpStatus status, int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
