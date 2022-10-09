package racingcar.exception;

public class InputWrongValueException extends IllegalArgumentException {

    public InputWrongValueException(String message) {
        super(message);
        printMessage(message);
    }

    private void printMessage(String message) {
        System.out.println("[ERROR] " + message);
    }
}
