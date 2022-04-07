import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GrilleImplSecond implements Grille {

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
        boolean r = false;
        for(int i = 0; i < this.grille.length; i++){
            for(int j = 0; j < this.grille.length; j++){
                if(this.grille[i][j] == EMPTY) {
                    r = false;
                }
                else {
                    r = true;
                    break;
                }
            }
        }
        return r;
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {

        List<Character> possibleChar = createListPossible();

        if (checkChar(value, possibleChar)) {
            if(checkX(x, value)){
                if(checkY(y, value)){
                    if(checkBloc(x, y, value)){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }

    }

    // etape 1 : création liste des caractères possibles
    public List<Character> createListPossible() {
        //creation tableau possibilités
        int dimension = getDimension();
        List<Character> possibleChar = new ArrayList();

        if (dimension == 9) {
            for (int i = 0; i<possible.length - 6; i++) {
                possibleChar.add(possible[i]);
            }
        }
        else {
            for (int i = 0; i<possible.length; i++) {
                possibleChar.add(possible[i]);
            }
        }
        return possibleChar;
    }

    // etape 2 : vérification que le caractère est possible
    public boolean checkChar(char value, List<Character> possibleChar)throws IllegalArgumentException {
        if (possibleChar.contains(value)) {
            return true;
        }
        else {
            return false;
        }
    }

    //vérification en x que le caractère est possible
    public boolean checkX(int x, char value) throws IllegalArgumentException {
        List<Character> impossibleChar = new ArrayList();
       for (int i=0; i< grille.length; i++) {
           impossibleChar.add(getValue(x,i));
       }
       if (impossibleChar.contains(value)) {
           return false;
       }
       else {
           return true;
       }
    }

    // vérification en y que le caractère est possible
    public boolean checkY(int y, char value) throws IllegalArgumentException {
        List<Character> impossibleChar = new ArrayList();
        for (int i=0; i< grille.length; i++) {
            impossibleChar.add(getValue(i,y));
        }
        if (impossibleChar.contains(value)) {
            return false;
        }
        else{
            return true;
        }
    }

    // vérification du bloc que le caractère est possible
    public boolean checkBloc(int x, int y, char value) throws IllegalArgumentException {
        List<Character> impossibleChar = new ArrayList();
        int dimension = getDimension();
        int c = 0;
        if (dimension == 9) {
            if (x+1 <= 3) {
                c = 3;
                if (y+1 <=3) {
                    for (int i=0; i<= c ; i++) {
                        char v1 = getValue(i,0);
                        char v2 = getValue(i,1);
                        char v3 = getValue(i,2);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 6) {
                    for (int i=0; i<= c  ; i++) {
                        char v1 = getValue(i,3);
                        char v2 = getValue(i,4);
                        char v3 = getValue(i,5);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 9){
                    for (int i=0; i<=c  ; i++) {
                        char v1 = getValue(i,6);
                        char v2 = getValue(i,7);
                        char v3 = getValue(i,8);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
            }
            else if (x+1 <= 6) {
                c = 6;
                if (y+1 <=3) {
                    for (int i=3; i<= c ; i++) {
                        char v1 = getValue(i,0);
                        char v2 = getValue(i,1);
                        char v3 = getValue(i,2);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 6) {
                    for (int i=3; i<= c  ; i++) {
                        char v1 = getValue(i,3);
                        char v2 = getValue(i,4);
                        char v3 = getValue(i,5);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 9) {
                    for (int i=3; i<=c  ; i++) {
                        char v1 = getValue(i,6);
                        char v2 = getValue(i,7);
                        char v3 = getValue(i,8);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
            }
            else if (x+1 <= 9) {
                c = 9;
                if (y+1 <=3) {
                    for(int i=6; i<= c ; i++) {
                        char v1 = getValue(i,0);
                        char v2 = getValue(i,1);
                        char v3 = getValue(i,2);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 6) {
                    for(int i=6; i<= c  ; i++) {
                        char v1 = getValue(i,3);
                        char v2 = getValue(i,4);
                        char v3 = getValue(i,5);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
                else if (y+1 <= 9) {
                    for (int i=6; i<=c  ; i++) {
                        char v1 = getValue(i,6);
                        char v2 = getValue(i,7);
                        char v3 = getValue(i,8);
                        Collections.addAll(impossibleChar, v1, v2, v3);
                    }
                }
            }
        }
        System.out.println(impossibleChar);
        if (impossibleChar.contains(value)) {
            return false;
        }
        else {
            return true;
        }
    }
}
