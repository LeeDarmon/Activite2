import java.util.Arrays;
import java.util.List;

final class Program {
    private Program() {
        throw new UnsupportedOperationException();
    }
    public static void main(final String[] args) {
       // System.out.println("Hello World");


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

        /*
        final char[][] grilleExtended = {
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
        */


        //tests lee
        GrilleImplSecond gi2 = new GrilleImplSecond();
        gi2.setGrille(grille);

        //ligne 1

        gi2.setValue(0,1,'@');
        gi2.setValue(0,2,'1');
        gi2.setValue(0,3,'@');
        gi2.setValue(0,4,'@');
        gi2.setValue(0,5,'3');
        gi2.setValue(0,6,'@');
        gi2.setValue(0,7,'@');
        gi2.setValue(0,8,'6');

        //ligne2
        gi2.setValue(1,0,'@');
        gi2.setValue(1,1,'5');
        gi2.setValue(1,2,'3');
        gi2.setValue(1,3,'@');
        gi2.setValue(1,4,'2');
        gi2.setValue(1,5,'@');
        gi2.setValue(1,6,'@');
        gi2.setValue(1,7,'0');
        gi2.setValue(1,8,'8');




        System.out.println(Arrays.deepToString(gi2.getGrille()));



        List<Character> possibleChar = gi2.createListPossible();

        System.out.println(possibleChar);

        System.out.println(gi2.checkChar('3', possibleChar));

       for (int i = 0; i < gi2.getGrille().length; i++) {

        System.out.println(gi2.getValue(0,i));
       }

        System.out.println(gi2.checkX(1, '4'));
        System.out.println(gi2.checkY(1, '5'));


        System.out.println(gi2.checkBloc(0, 0, '2'));

        System.out.println(gi2.possible(0, 0, '1'));


        GrilleImplSecond gi3 = new GrilleImplSecond();
        gi3.setGrille(grille);
        gi3.displayGrille();
        System.out.println("\nTest resolution :");
        if(resoudreSudoku(gi3, 0, 0)){
            System.out.println("Reussite");
            gi3.displayGrille();
        } else {
            System.out.println("Pas de solution");
            gi3.displayGrille();
        }



    }

    public static boolean resoudreSudoku(GrilleImplSecond g, int li,
                                         int co) {
            System.out.println("Iteration " + "Ligne : " + li + " colonne :" + co);
            int ligne = li;
            int col = co;
            GrilleImplSecond gi = g;
            char[] possibleChars = gi.possible;
            gi.displayGrille();
            for(int x = 0; x < g.getDimension(); x++){
                for(int y = 0; y < g.getDimension(); y++){
                    if(g.getValue(x, y) == Grille.EMPTY){
                        for(int n = 0; n <= g.getDimension(); n++){
                            char currentChar = possibleChars[n];
                            if (gi.possible(x, y, currentChar)) {
                                gi.setValue(x, y, currentChar);
                                if(resoudreSudoku(gi, 0, 0)){
                                    return true;
                                } else {
                                    gi.setValue(ligne, col, Grille.EMPTY);
                                }
                            }
                            }
                        return false;
                    }
                }
            }
            return true;
        }

}
