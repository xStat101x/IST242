public class Pair {

    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Pair() {
        this.x = -1;
        this.y = -1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {

        return "(" + x + "," + y + ")";
    }
}
