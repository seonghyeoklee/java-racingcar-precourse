package racingcar.domain.input;

import racingcar.domain.Car;

public class InputCarName implements Input<Car> {

    private final String input;

    public InputCarName(String input) {
        this.validateBlank(input);
        this.input = input;
    }

    @Override
    public Car create() {
        return new Car(this.input);
    }

}
