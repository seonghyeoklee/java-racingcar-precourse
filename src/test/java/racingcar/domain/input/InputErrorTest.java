package racingcar.domain.input;

import static org.assertj.core.api.Assertions.assertThat;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Application;

class InputErrorTest extends NsTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    @DisplayName("공백을 입력하면 [ERROR] 로 시작하는 에러 메세지를 출력한다.")
    void printErrorMessage_blank() {
        try {
            new InputCarName("");
        } catch (IllegalArgumentException e) {
            InputError inputError = new InputError(e.getMessage());
            inputError.print();
        }
        assertThat(output()).contains(ERROR_MESSAGE);
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}