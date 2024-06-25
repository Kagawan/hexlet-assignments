package exercise;

// BEGIN
public class ReversedSequence  implements CharSequence {
    private String str;

    public ReversedSequence(String str) {
        this.str = str;
    }

    public void setStr() {
        this.str = str;
    }

    public String getStr() {
        return str;
    }


    public  String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(getStr()).reverse().toString();
    }


    public int length() {
        return getStr().length();
    }


    public char charAt(int index) {
        return getStr().charAt(getStr().length() - index - 1);
    }


    public CharSequence subSequence(int start, int end) {
        return new ReversedSequence(getStr().substring(start + 1, end + 1));
    }
}
// END
