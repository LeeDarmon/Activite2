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

       // gi.grille = grille;


     //   System.out.println(gi.getDimension());
      //  System.out.println("get 1"+gi.getValue(1, 1));
      //  gi.setValue(1, 1, '1');
      //  System.out.println(gi.getValue(1, 1));
     //   System.out.println(gi.possible(1, 1, '9'));

        //tests lee
        GrilleImplSecond gi2 = new GrilleImplSecond();
        gi2.setGrille(grilleEmpty);

        //ligne 1
        gi2.setValue(0,0,'9');
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
        if(ResoudreSudoku(gi2,0, 0)){
            System.out.println("\n");
        } else {
            System.out.println("Pas de solution");
        }



    }

    public static boolean ResoudreSudoku(Grille gi, int ligne,
                                         int col){
            char[] possibleChars = gi.possible;


            if (ligne == gi.getDimension() - 1 && col == gi.getDimension())
            {
                return true;
            }

            //On check la colonne et on change en fonction
            if (col == gi.getDimension()-1) {
                ligne++;
                col = 0;
            }

            //S'il y a deja une valeur, on itere sur la prochaine casse
            if (gi.getValue(ligne, col) != '@')
                return ResoudreSudoku(gi, ligne, col + 1);

            for (int num = 0; num < gi.getDimension() -1 ; num++) {
                char currentChar = possibleChars[num];

                //On regarde si c'est possible à la pos actuelle
                if (gi.possible(ligne, col, currentChar)) {


                    //On pose la valeur souhaite si c'est possible de la poser
                    gi.setValue(ligne, col, currentChar);

                    //On continue à la prochaine case
                    if (ResoudreSudoku(gi, ligne, col + 1))
                        return true;
                }

                gi.setValue(ligne, col, '@');
            }
            return false;
        }
}
