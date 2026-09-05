package gouri.JL.JLException;

import gouri.JL.utility.JLStatusCode;

public class JLGenericException extends JLException{

    JLStatusCode statusCode;

    public JLGenericException(String message, JLStatusCode statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

}
