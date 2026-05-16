package javacore.exceptioncustom;

public class LoginInvalidException extends Exception {

    public LoginInvalidException() {
        super("login invalido burrao");
    }

    public LoginInvalidException(String message) {
        super(message);
    }

    

     }
