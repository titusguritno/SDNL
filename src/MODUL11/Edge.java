package MODUL11;
/**
 *
 * @author Titus Guritno
 */
public class Edge {
    private int vertexA, vertexB, weight;

    public Edge(int verA, int verB, int weight) {
        this.vertexA = verA;
        this.vertexB = verB;
        this.weight = weight;
    }

    public int getVertexA() {
        return vertexA;
    }

    public int getVertexB() {
        return vertexB;
    }

    public int getWeight() {
        return weight;
    }

    public void setVertexA(int vertexA) {
        this.vertexA = vertexA;
    }

    public void setVertexB(int vertexB) {
        this.vertexB = vertexB;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
