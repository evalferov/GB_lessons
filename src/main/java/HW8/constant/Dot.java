package constant;

public enum Dot {
    EMPTY(""),
    X("X"),
    O("O");

    private String dot;

    Dot(String dot) {
        this.dot = dot;
    }

    public String getDot() {
        return dot;
    }
}
