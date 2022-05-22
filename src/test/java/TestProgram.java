import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestProgram {
    @Test
    void getDimension() {
        final int limitDim = 9;
        final int limitDimExtend = 16;
        final char[][] grillecomplete = {
                {'3', '9', '1', '2', '8', '6', '5', '7', '4'},
                {'4', '8', '7', '3', '5', '9', '1', '2', '6'},
                {'6', '5', '2', '7', '1', '4', '8', '3', '9'},
                {'8', '7', '5', '4', '3', '1', '6', '9', '2'},
                {'2', '1', '3', '9', '6', '7', '4', '8', '5'},
                {'9', '6', '4', '5', '2', '8', '7', '1', '3'},
                {'1', '4', '9', '6', '7', '3', '2', '5', '8'},
                {'5', '3', '8', '1', '4', '2', '9', '6', '7'},
                {'7', '2', '6', '8', '9', '5', '3', '4', '1'},
        };
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grillecomplete);
        assertEquals(limitDim, objetGrilleComplete.getDimension());
        final char[][] grilleExtend = {
                {'9', '@', '@', '1', '@', '@', '@', '@',
                        '5', '9', '@', '@', '1', '@', '@', '@'},
                {'@', '@', '5', '@', '9', '@', '2', '@',
                        '1', '@', '@', '5', '@', '9', '@', '2'},
                {'8', '@', '@', '@', '4', '@', '@', '@',
                        '@', '8', '@', '@', '@', '4', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@',
                        '@', '@', '@', '@', '@', '8', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@',
                        '@', '@', '@', '@', '7', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@',
                        '9', '@', '@', '@', '@', '2', '6', '@'},
                {'2', '@', '@', '3', '@', '@', '@', '@',
                        '6', '2', '@', '@', '3', '@', '@', '@'},
                {'@', '@', '@', '2', '@', '@', '9', '@',
                        '@', '@', '@', '@', '2', '@', '@', '9'},
                {'@', '@', '1', '9', '@', '4', '5', '7',
                        '@', '@', '@', '1', '9', '@', '4', '5'},
                {'9', '@', '@', '1', '@', '@', '@', '@',
                        '5', '9', '@', '@', '1', '@', '@', '5'},
                {'@', '@', '5', '@', '9', '@', '2', '@',
                        '1', '@', '@', '5', '@', '9', '@', '2'},
                {'8', '@', '@', '@', '4', '@', '@', '@',
                        '@', '8', '@', '@', '@', '4', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@',
                        '@', '@', '@', '@', '@', '8', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@',
                        '@', '@', '@', '@', '7', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@',
                        '9', '@', '@', '@', '@', '2', '6', '@'},
                {'2', '@', '@', '3', '@', '@', '@', '@',
                        '6', '2', '@', '@', '3', '@', '@', '@'},
        };
        objetGrilleComplete.setGrille(grilleExtend);
        assertEquals(limitDimExtend, objetGrilleComplete.getDimension());

    }

    @Test
    void setValue() {
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grillecomplete);
        objetGrilleComplete.setValue(0, 0, '9');
        assertEquals('9', objetGrilleComplete.getValue(0, 0));
    }

    @Test
    void getValue() {
        final int x = 8;
        final int y =  8;
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grillecomplete);
        assertEquals('3', objetGrilleComplete.getValue(x, y));
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grillecomplete);
        assertTrue(objetGrilleComplete.complete());

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
        objetGrilleComplete.setGrille(grilleEmpty);
        assertFalse(objetGrilleComplete.complete());


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
        GrilleImplSecond objetGrille1 = new GrilleImplSecond();
        objetGrille1.setGrille(grille);
        char value = '4';
        int x = 0;
        int y = 0;
        int x2 = 2;
        int y2 = 1;
        assertTrue(objetGrille1.possible(x, y, value));
        assertFalse(objetGrille1.possible(x2, y2, value));
    }

    @Test
    void displayGrille() {
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
        GrilleImplSecond objetGrille1 = new GrilleImplSecond();
        objetGrille1.setGrille(grille);
        objetGrille1.displayGrille();
    }
    @Test
    void createListPossible() {
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grille);
        List<Character> c = objetGrilleComplete.createListPossible();
        assertNotNull(c);
    }

    @Test
    void checkChar() {
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grille);
        List<Character> c = objetGrilleComplete.createListPossible();
        assertTrue(objetGrilleComplete.checkChar('1', c));
    }

    @Test
    void checkX() {
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grille);

        assertTrue(objetGrilleComplete.checkX(0, '3'));

    }

    @Test
    void checkY() {
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond();
        objetGrilleComplete.setGrille(grille);

        assertFalse(objetGrilleComplete.checkY(0,  '9'));
        assertTrue(objetGrilleComplete.checkY(0,  '3'));
    }

    @Test
    void checkBlock() {
        final int premiereRangee = 0;
        final int secondeRangee = 3;
        final int troisiemeRangee = 6;
        final int quatriemeRangee = 9;
        final int cinquiemeRangee = 12;

        final char[][] g = {
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
        GrilleImplSecond grille = new GrilleImplSecond();
        grille.setGrille(g);

        assertTrue(grille.checkBloc(premiereRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(troisiemeRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(premiereRangee, secondeRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, secondeRangee, '3'));
        assertTrue(grille.checkBloc(troisiemeRangee, secondeRangee, '3'));
        assertTrue(grille.checkBloc(premiereRangee, troisiemeRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, troisiemeRangee, '4'));
        assertTrue(grille.checkBloc(troisiemeRangee, troisiemeRangee, '4'));

        final int premiereRangee2 = 0;
        final int secondeRangee2 = 4;
        final int troisiemeRangee2 = 8;
        final int quatriemeRangee2 = 12;


        final char[][] grilleExtend = {
                {'9', '@', '@', '1', '@', '@', '@', '@', '5', '9', '@', '@', '1', '@', '@', '@'},
                {'@', '@', '5', '@', '9', '@', '2', '@', '1', '@', '@', '5', '@', '9', '@', '2'},
                {'8', '@', '@', '@', '4', '@', '@', '@', '@', '8', '@', '@', '@', '4', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@', '@', '@', '@', '@', '@', '8', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@', '@', '@', '@', '@', '7', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@', '9', '@', '@', '@', '@', '2', '6', '@'},
                {'2', '@', '@', '3', '@', '@', '@', '@', '6', '2', '@', '@', '3', '@', '@', '@'},
                {'@', '@', '@', '2', '@', '@', '9', '@', '@', '@', '@', '@', '2', '@', '@', '9'},
                {'@', '@', '1', '9', '@', '4', '5', '7', '@', '@', '@', '1', '9', '@', '4', '5'},
                {'9', '@', '@', '1', '@', '@', '@', '@', '5', '9', '@', '@', '1', '@', '@', '5'},
                {'@', '@', '5', '@', '9', '@', '2', '@', '1', '@', '@', '5', '@', '9', '@', '2'},
                {'8', '@', '@', '@', '4', '@', '@', '@', '@', '8', '@', '@', '@', '4', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@', '@', '@', '@', '@', '@', '8', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@', '@', '@', '@', '@', '7', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@', '9', '@', '@', '@', '@', '2', '6', '@'},
                {'2', '@', '@', '3', '@', '@', '@', '@', '6', '2', '@', '@', '3', '@', '@', '@'},
        };
        GrilleImplSecond grille2 = new GrilleImplSecond();
        grille2.setGrille(grilleExtend);
        assertTrue(grille2.checkBloc(premiereRangee, premiereRangee, '3'));
        assertTrue(grille2.checkBloc(secondeRangee, premiereRangee, '3'));
        assertTrue(grille2.checkBloc(troisiemeRangee, premiereRangee, '3'));
        assertTrue(grille2.checkBloc(quatriemeRangee, premiereRangee, '3'));
        assertTrue(grille2.checkBloc(cinquiemeRangee, premiereRangee, '4'));
        assertTrue(grille2.checkBloc(premiereRangee, secondeRangee, '3'));
        assertTrue(grille2.checkBloc(secondeRangee, secondeRangee, '3'));
        assertTrue(grille2.checkBloc(troisiemeRangee, secondeRangee, '4'));
        assertTrue(grille2.checkBloc(quatriemeRangee, secondeRangee, '4'));
        assertTrue(grille2.checkBloc(cinquiemeRangee, secondeRangee, '4'));
        assertTrue(grille2.checkBloc(premiereRangee, troisiemeRangee, '3'));
        assertTrue(grille2.checkBloc(secondeRangee, troisiemeRangee, '4'));
        assertTrue(grille2.checkBloc(troisiemeRangee, troisiemeRangee, '4'));
        assertTrue(grille2.checkBloc(quatriemeRangee, troisiemeRangee, '3'));
        assertTrue(grille2.checkBloc(cinquiemeRangee, troisiemeRangee, '3'));
        assertTrue(grille2.checkBloc(premiereRangee, quatriemeRangee, '3'));
        assertTrue(grille2.checkBloc(secondeRangee, quatriemeRangee, '4'));
        assertTrue(grille2.checkBloc(troisiemeRangee, quatriemeRangee, '4'));
        assertTrue(grille2.checkBloc(quatriemeRangee, quatriemeRangee, '3'));
        assertTrue(grille2.checkBloc(cinquiemeRangee, quatriemeRangee, '3'));
        assertTrue(grille2.checkBloc(premiereRangee, cinquiemeRangee, '3'));
        assertTrue(grille2.checkBloc(secondeRangee, cinquiemeRangee, '4'));
        assertTrue(grille2.checkBloc(troisiemeRangee, cinquiemeRangee, '4'));
        assertTrue(grille2.checkBloc(quatriemeRangee, cinquiemeRangee, '4'));
        assertTrue(grille2.checkBloc(cinquiemeRangee, cinquiemeRangee, '4'));

    }
}
