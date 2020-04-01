package edu.nf.movie.cinema.service.exception;

/**
 * @author Alone
 * @date 2019/11/26
 */
public class DataAccessException extends RuntimeException{

    public DataAccessException(String message) {
        super(message);
    }

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(Throwable cause) {
        super(cause);
    }
}
