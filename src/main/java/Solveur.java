public class Solveur {
    private Grille grille;

    public Solveur(Grille g){
        this.grille = g;
    }

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
