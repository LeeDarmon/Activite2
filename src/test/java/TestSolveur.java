import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSolveur {

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



    @Test
    void TestSolveurSolvable() {
        char[][] grilleSolvable = {
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
        ObjetGrille1.setGrille(grilleSolvable);
        Solveur s = new Solveur(ObjetGrille1);
        Assertions.assertTrue(s.resoudreSudoku());
    }

}
