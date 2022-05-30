import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Tests pour grille.
 */
public class TestProgram {
    /**
     * Tests methode getDimension().
     */
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
        GrilleImplSecond g = new GrilleImplSecond(grillecomplete);
        assertEquals(limitDim, g.getDimension());
        final char[][] grilleExtend;
        grilleExtend = new char[][]{
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
        GrilleImplSecond objetGrilleext;
        objetGrilleext = new GrilleImplSecond(grilleExtend);
        assertEquals(limitDimExtend, objetGrilleext.getDimension());

    }

    /**
     * Tests methode setValue().
     */
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
        GrilleImplSecond g = new GrilleImplSecond(grillecomplete);
        g.setValue(0, 0, '9');
        assertEquals('9', g.getValue(0, 0));
    }

    /**
     * Tests methode getValue().
     */
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
        GrilleImplSecond g = new GrilleImplSecond(grillecomplete);
        assertEquals('3', g.getValue(x, y));
    }

    /**
     * Tests methode complete.
     */
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
        GrilleImplSecond g = new GrilleImplSecond(grillecomplete);
        assertTrue(g.complete());

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

        GrilleImplSecond objetGrilleddnc = new GrilleImplSecond(grilleEmpty);
        assertFalse(objetGrilleddnc.complete());


    }
    /**
     * Tests methode possible().
     */
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
        GrilleImplSecond objetGrille1 = new GrilleImplSecond(grille);
        char value = '4';
        int x = 0;
        int y = 0;
        int x2 = 2;
        int y2 = 1;
        assertTrue(objetGrille1.possible(x, y, value));
        assertFalse(objetGrille1.possible(x2, y2, value));
    }
    /**
     * Tests methode displayGrille().
     */
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
        GrilleImplSecond objetGrille1 = new GrilleImplSecond(grille);
        objetGrille1.displayGrille();
    }
    /**
     * Tests methode createListPossible().
     */
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond(grille);
        List<Character> c = objetGrilleComplete.createListPossible();
        assertNotNull(c);
    }
    /**
     * Tests methode checkChar().
     */
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond(grille);
        List<Character> c = objetGrilleComplete.createListPossible();
        assertTrue(objetGrilleComplete.checkChar('1', c));
    }
    /**
     * Tests methode checkX().
     */
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond(grille);

        assertTrue(objetGrilleComplete.checkX(0, '3'));

    }
    /**
     * Tests methode checkY().
     */
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
        GrilleImplSecond objetGrilleComplete = new GrilleImplSecond(grille);

        assertFalse(objetGrilleComplete.checkY(0,  '9'));
        assertTrue(objetGrilleComplete.checkY(0,  '3'));
    }
    /**
     * Tests methode checkBlock().
     */
    @Test
    void checkBlock() {
        final int premiereRangee = 0;
        final int secondeRangee = 3;
        final int troisiemeRangee = 6;

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
        GrilleImplSecond grille = new GrilleImplSecond(g);

        assertTrue(grille.checkBloc(premiereRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(troisiemeRangee, premiereRangee, '3'));
        assertTrue(grille.checkBloc(premiereRangee, secondeRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, secondeRangee, '3'));
        assertTrue(grille.checkBloc(troisiemeRangee, secondeRangee, '8'));
        assertTrue(grille.checkBloc(premiereRangee, troisiemeRangee, '3'));
        assertTrue(grille.checkBloc(secondeRangee, troisiemeRangee, '4'));
        assertTrue(grille.checkBloc(troisiemeRangee, troisiemeRangee, '4'));

        final int premierExtend = 0;
        final int secondExtend = 4;
        final int troisiemeExtend = 8;
        final int quatriemeExtend = 12;



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
        GrilleImplSecond grille2 = new GrilleImplSecond(grilleExtend);
        assertTrue(grille2.checkBloc(premierExtend, premierExtend, '3'));
        assertTrue(grille2.checkBloc(secondExtend, premierExtend, '5'));
        assertTrue(grille2.checkBloc(troisiemeExtend, premierExtend, '3'));
        assertFalse(grille2.checkBloc(quatriemeExtend, premierExtend, '3'));
        assertTrue(grille2.checkBloc(quatriemeExtend, premierExtend, '4'));
        assertTrue(grille2.checkBloc(premierExtend, secondExtend, '3'));
        assertTrue(grille2.checkBloc(secondExtend, secondExtend, '3'));
        assertTrue(grille2.checkBloc(troisiemeExtend, secondExtend, '8'));
        assertTrue(grille2.checkBloc(quatriemeExtend, secondExtend, '4'));
        assertTrue(grille2.checkBloc(quatriemeExtend, secondExtend, '4'));
        assertTrue(grille2.checkBloc(premierExtend, troisiemeExtend, '3'));
        assertTrue(grille2.checkBloc(secondExtend, troisiemeExtend, '4'));
        assertTrue(grille2.checkBloc(troisiemeExtend, troisiemeExtend, '4'));
        assertTrue(grille2.checkBloc(quatriemeExtend, troisiemeExtend, '3'));
        assertTrue(grille2.checkBloc(quatriemeExtend, troisiemeExtend, '3'));
        assertTrue(grille2.checkBloc(premierExtend, quatriemeExtend, '3'));
        assertTrue(grille2.checkBloc(secondExtend, quatriemeExtend, '4'));
        assertTrue(grille2.checkBloc(troisiemeExtend, quatriemeExtend, '8'));
        assertTrue(grille2.checkBloc(quatriemeExtend, quatriemeExtend, '9'));
        assertTrue(grille2.checkBloc(premierExtend, quatriemeExtend, '3'));
        assertTrue(grille2.checkBloc(secondExtend, quatriemeExtend, '4'));
        assertTrue(grille2.checkBloc(quatriemeExtend, quatriemeExtend, '4'));
        assertTrue(grille2.checkBloc(quatriemeExtend, quatriemeExtend, '4'));
    }
}
