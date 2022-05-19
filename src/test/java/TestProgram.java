import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestProgram {

    final char[][] grille = {
            {'9', '@', '@', '1', '@', '@', '@', '@', '5'},
            {'@', '@', '5', '@', '9', '@', '2', '@', '1'},
            {'8', '@', '@', '@', '4', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '8', '@', '@', '@', '@'},
            {'@', '@', '@', '7', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '2', '6', '@', '@', '9'},
            {'2', '@', '@', '3', '@', '@', '@', '@', '6'},
            {'@', '@', '@', '2', '@', '@', '9', '@', '@'},
            {'@', '@', '1', '9', '@', '4', '5', '7', '@'},
    };
    GrilleImplSecond ObjetGrille1 = new GrilleImplSecond();


    final char[][] grilleEmpty = {
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
            {'@', '@', '@', '@', '@', '@', '@', '@', '@'},
    };

    GrilleImplSecond ObjetGrilleVide = new GrilleImplSecond();

    final char[][] grillecomplete = {
            {'9', '4', '2', '1', '7', '7', '3', '3', '5'},
            {'1', '4', '5', '1', '9', '7', '2', '3', '1'},
            {'8', '3', '3', '1', '4', '6', '3', '4', '3'},
            {'2', '5', '3', '2', '8', '6', '3', '5', '4'},
            {'1', '3', '2', '7', '7', '4', '3', '3', '3'},
            {'1', '3', '3', '3', '2', '3', '3', '2', '9'},
            {'2', '2', '3', '3', '7', '3', '3', '3', '6'},
            {'2', '3', '1', '2', '2', '3', '9', '4', '3'},
            {'2', '1', '1', '9', '3', '4', '5', '7', '3'},
    };

    GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();

    GrilleImplSecond gi2 = new GrilleImplSecond();

    @Test
    void getDimension() {
        assertEquals(9, ObjetGrille1.getDimension());
    }

    @Test
    void setValue() {
        ObjetGrilleVide.setValue(0,0,'9');
        assertEquals('9', ObjetGrilleVide.getValue(0,0));
    }

    @Test
    void getValue() {
        assertEquals('1', ObjetGrille1.getValue(3,0));
    }

    @Test
    void complete() {
        assertFalse(ObjetGrille1.complete());
        assertTrue(ObjetGrilleComplete.complete());
    }

    @Test
    void possible() {
        gi2.setGrille(grille);
        char value = '4';
        int x = 0;
        int y = 0;
        int x2 = 2;
        int y2 = 1;
        gi2.setValue(x, y, value);
        assertTrue(gi2.possible(x2, y2, value));
    }
}
