public class OffByN implements CharacterComparator {
    int n;

    public OffByN() {
        n = 3;
    }

    public OffByN(int _n) {
        n = _n;
    }

    @Override
    public boolean equalChars(char x, char y) {
        return Math.abs(x - y) == n;
    }
}
