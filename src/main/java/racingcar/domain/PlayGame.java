package racingcar.domain;

public class PlayGame {
    private static final int MOVING_FORWARD = 4;

    private boolean movingForward;

    public PlayGame(int random) {
        if (random >= MOVING_FORWARD) {
            this.movingForward = true;
        }
    }
    
    public boolean isMovingForward() {
        return this.movingForward;
    }
}
