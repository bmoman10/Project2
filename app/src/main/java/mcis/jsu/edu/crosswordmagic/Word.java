package mcis.jsu.edu.crosswordmagic;

public class
Word {

    public static final String DOWN = "D";
    public static final String ACROSS = "A";
    public static final int DATA_FIELDS = 6;
    public static final int HEADER_FIELDS = 3;

    private final int row, column, box;
    private final String direction, word, clue;

    public Word(String[] fields) {

        this.row = Integer.parseInt(fields[0]);
        this.column = Integer.parseInt(fields[1]);
        this.box = Integer.parseInt(fields[2]);
        this.direction = fields[3];
        this.word = fields[4];
        this.clue = fields[5];

    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getBox() {
        return box;
    }

    public String getDirection() {
        return direction;
    }

    public String getWord() {
        return word;
    }

    public String getClue() {
        return clue;
    }

    public boolean isAcross() {
        return direction.equals(Word.ACROSS);
    }

    public boolean isDown() {
        return direction.equals(Word.DOWN);
    }

}