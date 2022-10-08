package racingcar.type;

public enum ErrorMessageType {

    INPUT_NOT_ALLOW_BLANK("공백은 입력할 수 없습니다."),
    NOT_ALLOW_GREATER_THAN_FIVE("자동차 이름은 5자 이하만 가능합니다.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
