public class GrilleImpl implements Grille{
    @Override
    public int getDimension() {
        return 0;
    }

    @Override
    public void setValue(int x, int y, char value) throws IllegalArgumentException {

    }

    @Override
    public char getValue(int x, int y) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public boolean complete() {
        return false;
    }

    @Override
    public boolean possible(int x, int y, char value) throws IllegalArgumentException {
        return false;
    }
}
