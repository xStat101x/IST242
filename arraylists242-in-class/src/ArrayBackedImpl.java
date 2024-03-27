public class ArrayBackedImpl implements IST242List{

    private final int INITIAL_CAPACITY = 5;
    private String[] contents;
    private int curSize;

    public ArrayBackedImpl() {
        this.contents = new String[INITIAL_CAPACITY];
        this.curSize = 0;
    }
    @Override
    public void append(String e) {
        if (curSize == contents.length) {
            resize();
        }
        contents[curSize] = e;
        curSize++;
    }

    private void resize() {
        String[] resized = new String[2 * contents.length];

        for (int i = 0; i < curSize; i++) {
            resized[i] = contents[i];
        }

        this.contents = resized;
    }

    @Override
    public int size() {
        return curSize;
    }

    @Override
    public boolean isEmpty() {
        if (curSize == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "[";
        boolean first = true;
        for (int i = 0; i < curSize; i++) {
            if (first) {
                result += contents[i];
                first = false;
            } else {
                result += ", " + contents[i];
            }
        }
        return result + "]";
    }
}
