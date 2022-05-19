import org.junit.jupiter.api.Assertions;
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
        ObjetGrilleComplete.setGrille(grillecomplete);
        Assertions.assertTrue(ObjetGrilleComplete.complete());

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
        ObjetGrilleComplete.setGrille(grilleEmpty);
        Assertions.assertFalse(ObjetGrilleComplete.complete());


    }

    @Test
    void possible() {
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
        ObjetGrille1.setGrille(grille);
        char value = '4';
        int x = 0;
        int y = 0;
        int x2 = 2;
        int y2 = 1;
        assertTrue(ObjetGrille1.possible(x, y, value));
        assertFalse(ObjetGrille1.possible(x2, y2, value));
    }

    @Test
    void displayGrille() {
        ObjetGrille1.setGrille(grille);
        ObjetGrille1.displayGrille();
    }
    @Test
    void createListPossible(){
        GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();
        ObjetGrilleComplete.setGrille(grille);
        List<Character> c = ObjetGrilleComplete.createListPossible();
        Assertions.assertNotNull(c);
    }

    @Test
    void checkChar(){
        GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();
        ObjetGrilleComplete.setGrille(grille);
        List<Character> c = ObjetGrilleComplete.createListPossible();
        Assertions.assertTrue(ObjetGrilleComplete.checkChar('1', c));
    }

    @Test
    void checkX(){
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
        GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();
        ObjetGrilleComplete.setGrille(grille);

        Assertions.assertTrue(ObjetGrilleComplete.checkX(0, '3'));

    }

    @Test
    void checkY(){
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
        GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();
        ObjetGrilleComplete.setGrille(grille);

        Assertions.assertFalse(ObjetGrilleComplete.checkY(0,  '9'));
        Assertions.assertTrue(ObjetGrilleComplete.checkY(0,  '3'));
    }

    @Test
    void checkBlock(){
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
        GrilleImplSecond ObjetGrilleComplete = new GrilleImplSecond();
        ObjetGrilleComplete.setGrille(grille);

        Assertions.assertTrue(ObjetGrilleComplete.checkBloc(0, 0, '3'));


        final char[][] grilleExtend = {
                {'9', '@', '@', '1', '@', '@', '@', '@', '5', '9', '@', '@', '1', '@', '@', '@', '@', '5'},
                {'@', '@', '5', '@', '9', '@', '2', '@', '1', '@', '@', '5', '@', '9', '@', '2', '@', '1'},
                {'8', '@', '@', '@', '4', '@', '@', '@', '@', '8', '@', '@', '@', '4', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@', '@', '@', '@', '@', '@', '8', '@', '@', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@', '@', '@', '@', '@', '7', '@', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@', '9', '@', '@', '@', '@', '2', '6', '@', '@', '9'},
                {'2', '@', '@', '3', '@', '@', '@', '@', '6', '2', '@', '@', '3', '@', '@', '@', '@', '6'},
                {'@', '@', '@', '2', '@', '@', '9', '@', '@', '@', '@', '@', '2', '@', '@', '9', '@', '@'},
                {'@', '@', '1', '9', '@', '4', '5', '7', '@', '@', '@', '1', '9', '@', '4', '5', '7', '@'},
                {'9', '@', '@', '1', '@', '@', '@', '@', '5', '9', '@', '@', '1', '@', '@', '@', '@', '5'},
                {'@', '@', '5', '@', '9', '@', '2', '@', '1', '@', '@', '5', '@', '9', '@', '2', '@', '1'},
                {'8', '@', '@', '@', '4', '@', '@', '@', '@', '8', '@', '@', '@', '4', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@', '@', '@', '@', '@', '@', '8', '@', '@', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@', '@', '@', '@', '@', '7', '@', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@', '9', '@', '@', '@', '@', '2', '6', '@', '@', '9'},
                {'2', '@', '@', '3', '@', '@', '@', '@', '6', '2', '@', '@', '3', '@', '@', '@', '@', '6'},
                {'@', '@', '@', '2', '@', '@', '9', '@', '@', '@', '@', '@', '2', '@', '@', '9', '@', '@'},
                {'@', '@', '1', '9', '@', '4', '5', '7', '@', '@', '@', '1', '9', '@', '4', '5', '7', '@'},
        };
        GrilleImplSecond ObjetGrilleExtendComplete = new GrilleImplSecond();
        ObjetGrilleExtendComplete.setGrille(grilleExtend);
        Assertions.assertTrue(ObjetGrilleExtendComplete.checkBloc(0, 0, '3'));

    }
}
