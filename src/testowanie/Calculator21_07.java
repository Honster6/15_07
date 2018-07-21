package testowanie;

public class Calculator21_07 {
    public float sinus(int i, int i1) throws Exception {
        if (i1 < 0 || i < 0) {
            throw new IllegalAccessException("Wrong argument");
        }
        if (i1 < i) {
            throw new IllegalArgumentException("Wrong argument");
        }
        return (float) i / i1;
    }
}
