package com.dimevision.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Dimevision
 * @version 0.1
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotExistsException extends RuntimeException {

    public NotExistsException(String message) {
        super(message);
    }

    public NotExistsException(Throwable cause) {
        super(cause);
    }

    public NotExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
