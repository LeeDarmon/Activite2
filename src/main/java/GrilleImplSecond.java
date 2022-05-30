import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GrilleImplSecond implements Grille {

    /** Grille implementee.
     * Peut faire 9x9 ou 16x16
     */
    private char[][] grille;

    /** Recupere la grille implementee.
     *
     * @param g La grille à ajouter
     *
     */
    public GrilleImplSecond(final char[][] g) {
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
        final int dimensionMinimum = 9;
        final float diff = 1;
        final int diff1 = 1;
        final int diff2 = 2;
        final int diff3 = 3;
        int borneMaxi = 0;
        int borneMini = 0;
        int o = 0;

        //gestion 9 x 9
        if (dimension == dimensionMinimum) {
            final double aire;
            aire = 3.0;
            if ((x + diff) / aire <= 1) {
                final int x1 = 2;
                final int x2 = 0;
                borneMaxi = x1;
                borneMini = x2;

            } else if  ((x + diff) / aire <= 2) {
                final int x1 = 5;
                final int x2 = 3;
                borneMaxi = x1;
                borneMini = x2;

            } else if ((x + diff) / aire <= (int) aire) {
                final int x1 = 8;
                final int x2 = 6;
                borneMaxi = x1;
                borneMini = x2;
            }

            if ((y + diff) / aire <= 1) {
                o = 0;
            } else if ((y + diff) / aire <= 2) {
                o = (int) aire;
            } else if ((y + diff) / aire <= (int) aire) {
                o = (int) aire * 2;
            }

            for (int j = borneMini; j <= borneMaxi; j++) {
                char v1 = getValue(j, o);
                char v2 = getValue(j, o + diff1);
                char v3 = getValue(j, o + diff2);
                Collections.addAll(impossibleChar, v1, v2, v3);
            }

        } else {
            final double aire;
            aire = 4.0;
            if ((x + diff) / aire <= 1) {
                final int x1 = 3;
                final int x2 = 0;
                borneMaxi = x1;
                borneMini = x2;
            } else if ((x + diff) / aire <= 2) {
                final int x1 = 7;
                final int x2 = 4;
                borneMaxi = x1;
                borneMini = x2;

            } else if ((x + diff) / aire <= (aire - diff1)) {
                final int x1 = 11;
                final int x2 = 8;
                borneMaxi = x1;
                borneMini = x2;
            } else if ((x + diff) / aire <= aire) {
                final int x1 = 15;
                final int x2 = 12;
                borneMaxi = x1;
                borneMini = x2;
            }

            if ((y + diff) / aire <= 1) {
                o = 0;
            } else if ((y + diff) / aire <= 2) {
                o = (int) aire;
            } else if ((y + diff) / aire <= ((int) aire - diff1)) {
                o = (int) aire * 2;
            } else if ((y + diff) / aire <= (int) aire) {
                o = (int) aire * diff3;
            }

            for (int j = borneMini; j <= borneMaxi; j++) {
                char v1 = getValue(j, o);
                char v2 = getValue(j, o + diff1);
                char v3 = getValue(j, o + diff2);
                char v4 = getValue(j, o + diff3);
                Collections.addAll(impossibleChar, v1, v2, v3, v4);
            }
        }

        return !impossibleChar.contains(value);
    }
}
