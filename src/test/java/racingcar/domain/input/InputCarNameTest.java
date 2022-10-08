package racingcar.domain.input;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static racingcar.type.ErrorMessageType.INPUT_NOT_ALLOW_BLANK;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputCarNameTest {

    @ParameterizedTest
    @ValueSource(strings = {"woo dy", " pobi", "jun "})
    @DisplayName("사용자가 입력한 값에 공백이 존재한다면 IllegalArgumentException 예외가 발생한다.")
    void input_notAllowNullOrBlankStrings(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    new InputCarName(input);
                })
                .withMessageContaining(INPUT_NOT_ALLOW_BLANK.getMessage());
    }

}