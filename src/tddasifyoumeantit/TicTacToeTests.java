package tddasifyoumeantit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("WeakerAccess")
public class TicTacToeTests {
    @Test public void
    emptyGameIsUnfinished() {
        assertEquals("Unfinished", new int[0].length == 0 ? "Unfinished" : "Undefined");
    }

    @Test public void
    singleMoveIsUnfinished() {
        assertEquals("Unfinished", new int[]{1}.length == 1 ? "Unfinished" : "Undefined");
    }

    @Test public void
    twoMovesIsUnfinished() {
        assertEquals("Unfinished", ticTacToeScoreOf());
    }

    private String ticTacToeScoreOf() {
        return new int[]{1,2}.length == 2 ? "Unfinished" : "Undefined";
    }

}
