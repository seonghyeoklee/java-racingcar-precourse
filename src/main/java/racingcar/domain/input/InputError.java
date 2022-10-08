package racingcar.domain.input;

public class InputError {

    private final String message;

    public InputError(String message) {
        this.message = message;
    }

    public void print() {
        System.out.println("[ERROR] " + message);
    }
}
