package exercise;


// BEGIN
class ReversedSequence implements CharSequence {
    String string;

    public ReversedSequence(String str) {
        this.string = reverseString(str);
    }

    private String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (String s : str.split("")) {
            result.insert(0, s);
        }
        return result.toString();
    }

    @Override
    public int length() {
        return (int) string.chars()
                .count();
    }

    @Override
    public char charAt(int i) {
        if (i < 0 || i > string.length() - 1) {
            throw new IndexOutOfBoundsException(i);
        }
        return (char) string.chars().toArray()[i];

    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        if (i < 0 || i > string.length() - 1) {
            throw new IndexOutOfBoundsException(i);
        }
        if (i1 < 0 || i1 > string.length() - 1) {
            throw new IndexOutOfBoundsException(i1);
        }
        return string.substring(i, i1);
    }


    @Override
    public String toString() {
        return string;
    }
}
// END
