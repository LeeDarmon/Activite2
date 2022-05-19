/**
 * Solveur de sudoku.
 */
public class Solveur {
    /**
     *  grille a resoudre.
     */
    private Grille grille;
    /**
     * Constructeur prenant la grille a resoudre en variable
     * @param g nouvelle grille
     */
    public Solveur(final Grille g) {
        Grille gi = g;
        this.grille = gi;
    }

    /**
     * Fonction recursive pour remplir la grille
     * @return true si la grille est remplie correctement
     */
    public boolean resoudreSudoku(){
        char[] possibleChars = this.grille.possible;
        GrilleImplSecond g = (GrilleImplSecond) this.grille;
        g.displayGrille();
        for(int x = 0; x < g.getDimension(); x++){
            for(int y = 0; y < g.getDimension(); y++){
                if(g.getValue(x, y) == Grille.EMPTY){
                    for(int n = 0; n <= g.getDimension(); n++){
                        char currentChar = possibleChars[n];
                        if (g.possible(x, y, currentChar)) {
                            g.setValue(x, y, currentChar);
                            if(resoudreSudoku()){
                                return true;
                            } else {
                                g.setValue(x, y, Grille.EMPTY);
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
