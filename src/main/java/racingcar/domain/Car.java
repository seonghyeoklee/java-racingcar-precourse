package racingcar.domain;

import static racingcar.type.ErrorMessageType.NOT_ALLOW_GREATER_THAN_FIVE;

public class Car {
    private static final int MAX_LENGTH = 5;

    private final String name;

    public Car(String name) {
        this.name = name;
        validateCarNameLength();
    }

    public void validateCarNameLength() {
        if (this.name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(NOT_ALLOW_GREATER_THAN_FIVE.getMessage());
        }
    }

    public String getName() {
        return name;
    }
}
