package gouri.JL.JLException;

import java.net.http.HttpClient;

public class JLException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public JLException(String message) {
        super(message);
    }
}
