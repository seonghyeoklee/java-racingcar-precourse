package racingcar.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayGameTest {

    @Test
    @DisplayName("random 값이 4 이상일 경우 전진한다.")
    void test() {
        PlayGame playGame = new PlayGame(4);
        assertTrue(playGame.isMovingForward());
    }

    @Test
    @DisplayName("random 값이 3 이하의 값이면 전진하지 못한다.")
    void test2() {
        PlayGame playGame = new PlayGame(3);
        assertFalse(playGame.isMovingForward());
    }
}