import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GrilleImpl implements Grille{
    public char[][] grille;

    @Override
    public int getDimension() {
        return grille.length;
    }

    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {
        this.grille[x][y] = value;
    }

    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
        return this.grille[x][y];
    }

    @Override
    public boolean complete() {
        return false;
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        //On recupere la liste des caracteres possibles pour trouver la combinaison possible
        char[] possibleChar = this.possible;
        int commonDiv=0;
        List<char[]> charsX = new ArrayList(Arrays.asList(possibleChar));
        List<char[]> charsY = new ArrayList(Arrays.asList(possibleChar));
        List<char[]> charsBloc = new ArrayList(Arrays.asList(possibleChar));

        //Calcul du bloc approprié, 1 à 4
        if(this.getDimension() == 9){
            commonDiv = 3;
        } else {
            commonDiv = 4;
        }

        int blocX = Math.round(((x / getDimension()) * commonDiv)+1);
        int blocY = Math.round(((y / getDimension()) * commonDiv)+1);
        int counterBlocX = blocX * commonDiv;
        int counterBlocY = blocY * commonDiv;
        int counterX = 0;
        int counterY = 0;

        for(int rang = 0; rang < this.getDimension(); rang ++){
            if(counterX != 0 && counterX % commonDiv == 0){
                counterX = 0;
                counterY++;
            }
            char currentCharacterX = this.getValue(x, rang);
            char currentCharacterY = this.getValue(rang, y);
            System.out.println("Counters : " +counterBlocX + " "  +  counterX);
            System.out.println(counterBlocY + " " + counterY);
            char currentCharacterBloc = this.getValue(counterBlocX + counterX, counterBlocY + counterY);
            System.out.println("Caracteres : " + currentCharacterX);
            System.out.println(currentCharacterY);
            System.out.println(currentCharacterBloc);
            if(charsX.contains(currentCharacterX)){

                charsX.remove(currentCharacterX);
            }
            if(charsY.contains(currentCharacterY)){

                charsY.remove(currentCharacterY);
            }
            if(charsBloc.contains(currentCharacterBloc)){

                charsBloc.remove(currentCharacterBloc);
            }

            counterX++;
        }
        for(int c = 0; c < charsX.size(); c++){
            System.out.println(charsX.get(c));
            System.out.println(charsY.get(c));
            System.out.println(charsBloc.get(c));
        }

        char empty = this.EMPTY;
        charsX.removeIf(a-> (a.equals(empty)));
        charsX.retainAll(charsY);
        charsX.retainAll(charsBloc);

        if(charsX.isEmpty()){
            return false;
        } else {
            return true;
        }

    }
}
