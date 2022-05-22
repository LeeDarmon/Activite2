import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrilleImplSecond implements Grille {

    /** Grille implementee.
     * Peut faire 9x9 ou 16x16
     */
    private char[][] grille;
    /** Grille implementee.
     * @return retourne la grille
     */
    public char[][] getGrille() {
        return grille.clone();
    }

    /** Recupere la grille implementee.
     *
     * @param g La grille à ajouter
     *
     */
    public final void setGrille(final char[][] g) {
        this.grille = g.clone();
    }

    @Override
    public final int getDimension() {
        return grille.length;
    }

    @Override
    public final void setValue(final int x,
                               final int y,
                               final char v)
            throws IllegalArgumentException {
        this.grille[x][y] = v;
    }

    @Override
    public final char getValue(final int x,
                               final int y) throws IllegalArgumentException {
        return this.grille[x][y];
    }


    @Override
    public final boolean complete() {
        boolean r = false;
        for (int i = 0; i < this.grille.length; i++) {
            for (int j = 0; j < this.grille.length; j++) {
                if (this.grille[i][j] == EMPTY) {
                    r = false;
                } else {
                    r = true;
                    break;
                }
            }
        }
        return r;
    }

    /** Montre en console la grille et ses valeurs.
     */
    public void displayGrille() {
        for (int x = 0; x < this.getDimension(); x++) {
            for (int y = 0; y < this.getDimension(); y++) {
                System.out.print(this.getValue(x, y) + " ");
            }
            System.out.println("");
        }
    }
    @Override
    public final boolean possible(final int x,
                                  final int y,
                                  final char v)
            throws IllegalArgumentException {

        List<Character> possibleChar = createListPossible();

        if (checkChar(v, possibleChar)) {
            if (checkX(x, v)) {
                if (checkY(y, v)) {
                    return checkBloc(x, y, v);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    /** Creation de la liste des caracteres possibles.
     * @return la liste de caracteres possibles
     */
    public List<Character> createListPossible() {
        //creation tableau possibilités
        int dimension = getDimension();
        //reduction correspond aux caracteres pour la grille 16x16
        final int limit = 9;
        final int caracSupp = 6;
        List<Character> possibleChar = new ArrayList();

        if (dimension == limit) {
            for (int i = 0; i < possible.length - caracSupp; i++) {
                possibleChar.add(possible[i]);
            }
        } else {
            for (int i = 0; i < possible.length; i++) {
                possibleChar.add(possible[i]);
            }
        }
        return possibleChar;
    }

    /** Verifie la liste des caracteres pour le char passe en parametre.
     *
     * @param value La valeur teste
     * @param possibleChar La liste de tous les caracteres dans la liste
     * @return true si la valeur est dans la liste
     */
    public boolean checkChar(final char value,
                             final List<Character> possibleChar)
            throws IllegalArgumentException {
        return possibleChar.contains(value);
    }

    /** Verifie qu'un caractere value peut etre pose en testant sa ligne x.
     * @param x Valeur x sur la grille
     * @param value Valeur teste pour placement en x dans la grille
     * @return true si la valeur est placable sur la ligne x
     */
    public boolean checkX(final int x,
                          final char value) throws IllegalArgumentException {
        List<Character> impossibleChar = new ArrayList();
       for (int i = 0; i < grille.length; i++) {
           impossibleChar.add(getValue(x, i));
       }
       return !impossibleChar.contains(value);
    }

    /** Verifie qu'un caractere value peut etre pose en testant sa colonne y.
     * @param y Valeur y sur la grille
     * @param value Valeur teste pour placement en y dans la grille
     * @return true si la valeur est placable sur la colonne y
     */
    public boolean checkY(final int y,
                          final char value) throws IllegalArgumentException {
        List<Character> impossibleChar = new ArrayList();
        for (int i = 0; i < grille.length; i++) {
            impossibleChar.add(getValue(i, y));
        }
        return !impossibleChar.contains(value);
    }

    /** Verifie un caractere value en testant son bloc a la position x, y.
     * @param x bloc a la position x dans la grille
     * @param y bloc a la position y dans la grille
     * @param value Valeur teste pour placement x, y dans la grille
     * @return true si la valeur est placable dans le bloc
     */
    public boolean checkBloc(final int x,
                             final int y,
                             final char value) throws IllegalArgumentException {
        final List<Character> impossibleChar = new ArrayList();
        final int dimension = getDimension();
        int dimensionMinimum = 9;
        final float diff = 1;

        int borne_maxi = 0;
        int borne_mini = 0;
        int o = 0;

        //gestion 9 x 9
        if (dimension == dimensionMinimum) {
            double aire = 3.0;

            if((x + diff) / aire <= 1){
                borne_maxi = 2;
                borne_mini = 0;

            }
            else if((x + diff) / aire <= 2){
                borne_maxi = 5;
                borne_mini = 3;

            }
            else if((x + diff) / aire <= 3){
                borne_maxi = 8;
                borne_mini = 6;
            }

            if((y + diff) / aire <= 1 ){ o = 0; }
            else if((y + diff) / aire <= 2 ){ o = 3; }
            else if((y + diff) / aire <= 3 ){ o = 6; }

            for (int j = borne_mini; j <= borne_maxi; j++) {
                char v1 = getValue(j, o);
                char v2 = getValue(j, o+1);
                char v3 = getValue(j, o+2);
                Collections.addAll(impossibleChar, v1, v2, v3);
            }

        }
        else {
            double aire = 4.0;

            if((x + diff) / aire <= 1){
                borne_maxi = 3;
                borne_mini = 0;

            }
            else if((x + diff) / aire <= 2){
                borne_maxi = 7;
                borne_mini = 4;

            }
            else if((x + diff) / aire <= 3){
                borne_maxi = 11;
                borne_mini = 8;
            }

            else if((x + diff) / aire <= 4){
                borne_maxi = 15;
                borne_mini = 12;
            }

            if((y + diff) / aire <= 1 ){ o = 0; }
            else if((y + diff) / aire <= 2 ){ o = 4; }
            else if((y + diff) / aire <= 3 ){ o = 8; }
            else if((y + diff) / aire <= 4 ){ o = 12; }

            for (int j = borne_mini; j <= borne_maxi; j++) {
                char v1 = getValue(j, o);
                char v2 = getValue(j, o+1);
                char v3 = getValue(j, o+2);
                char v4 = getValue(j, o+3);
                Collections.addAll(impossibleChar, v1, v2, v3, v4);
            }
        }

        return !impossibleChar.contains(value);
    }
}
