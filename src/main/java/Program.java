/**
 * Programme principale.
 */
final class Program {
    /**
     * Constructeur de programme principale.
     */
    private Program() {
    }
    /**
     * Programme principale main().
     */
    public static void main(final String[] args) {

        /* x = ligne / y = colonne */

        char[][] grille = {
                {'3', '9', '1', '2', '8', '6', '5', '7', '4'},
                {'4', '8', '7', '3', '5', '9', '1', '2', '6'},
                {'6', '5', '2', '7', '1', '4', '8', '3', '9'},
                {'@', '7', '5', '4', '3', '1', '6', '9', '2'},
                {'2', '1', '3', '9', '6', '@', '4', '8', '5'},
                {'9', '6', '4', '5', '2', '8', '7', '1', '3'},
                {'1', '4', '@', '6', '7', '3', '@', '5', '8'},
                {'5', '3', '8', '1', '4', '2', '9', '6', '7'},
                {'@', '2', '6', '8', '9', '5', '3', '@', '1'},
        };
        GrilleImplSecond gi3 = new GrilleImplSecond(grille);
        //gi3.setGrille(grille);
        Solveur s = new Solveur(gi3);
        System.out.println("\nTest resolution :");
        if (s.resoudreSudoku()) {
            System.out.println("Reussite");
            gi3.displayGrille();
        } else {
            System.out.println("Pas de solution");
            gi3.displayGrille();
        }
    }
}
