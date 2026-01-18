package pl.wsb.fitnesstracker.exception.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Generic business exception indicating that some resource could not be found.
 * Will resolve to the {@link HttpStatus#NOT_FOUND} if handled by the Spring's exception handler.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BusinessException {

    /**
     * Instantiates a new Not found exception.
     *
     * @param message the message
     */
    public NotFoundException(String message) {
        super(message);
    }

}
