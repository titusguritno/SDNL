package MODUL11;
/**
 *
 * @author Titus Guritno
 */
public class Vertex {
    private char label;
    boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        flagVisited = false;
    }

    public char getLabel() {
        return label;
    }
}
