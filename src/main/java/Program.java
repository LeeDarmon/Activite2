

final class Program {
    private Program() {
        throw new UnsupportedOperationException();
    }
    public static void main(final String[] args) throws CloneNotSupportedException {

        /* x = ligne / y = colonne */

        final char[][] grille = {
                {'9', '@', '@', '1', '@', '@', '@', '@', '5'},
                {'@', '@', '5', '@', '9', '@', '2', '@', '1'},
                {'8', '@', '1', '@', '4', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '8', '@', '@', '@', '@'},
                {'@', '@', '@', '7', '@', '@', '@', '@', '@'},
                {'@', '@', '@', '@', '2', '6', '@', '@', '9'},
                {'2', '@', '@', '3', '@', '@', '@', '@', '6'},
                {'@', '@', '@', '2', '@', '@', '9', '@', '@'},
                {'@', '@', '1', '9', '@', '4', '5', '7', '@'},
        };
        GrilleImplSecond gi3 = new GrilleImplSecond();
        gi3.setGrille(grille);
        System.out.println(gi3.checkBloc(3,3,'3'));
        /*
        Solveur s = new Solveur(gi3);
        System.out.println("\nTest resolution :");
        if (s.resoudreSudoku()) {
            System.out.println("Reussite");
            gi3.displayGrille();
        } else {
            System.out.println("Pas de solution");
            gi3.displayGrille();
        }

         */




    }
}
