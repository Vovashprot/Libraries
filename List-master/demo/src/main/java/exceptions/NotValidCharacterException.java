package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotValidCharacterException extends RuntimeException{
    public NotValidCharacterException() {
    }

    public NotValidCharacterException(String message) {
        super(message);
    }

    public NotValidCharacterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidCharacterException(Throwable cause) {
        super(cause);
    }

    public NotValidCharacterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}