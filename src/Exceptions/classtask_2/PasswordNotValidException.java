package Exceptions.classtask_2;

public class PasswordNotValidException extends RuntimeException{
    public PasswordNotValidException (String message) {
        super(message);
    }
}
