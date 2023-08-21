package MODUL9;
import java.util.Stack;
/**
 *
 * @author Titus Guritno
 */
public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjecencyMatrix;
    private int countVartex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjecencyMatrix = new int[maxVertex][maxVertex];

        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                adjecencyMatrix[i][j] = 0;

            }
        }
    }

    public void addVertex(char label) {
        vertexList[countVartex++] = new Vertex(label);
    }

    public void addEdge(int start, int objective, int weight) {
        adjecencyMatrix[start][objective] = weight;
        adjecencyMatrix[objective][start] = weight;
    }

    public void addEdge(char start, char objective, int weight) {
        adjecencyMatrix[indexVertex(start)][indexVertex(objective)] = weight;
        adjecencyMatrix[indexVertex(objective)][indexVertex(start)] = weight;
    }

    private int indexVertex(char vertex) {
        for (int i = 0; i < countVartex; i++) {
            if (vertexList[i].label == vertex) {
                return i;
            }

        }
        return -1;
    }

    public void show() {
        for (int i = 0; i < countVartex; i++) {
            for (int j = 0; j < countVartex; j++) {
                if (adjecencyMatrix[i][j] != 0 && adjecencyMatrix[i][j] != -1) {
                    System.out.println(vertexList[i].label + " terhubung ke "
                            + vertexList[j].label + "dengan bobot = "
                            + adjecencyMatrix[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public void dfs() {
        int seed = 0;
        int bantu;
        Stack<Integer> stack = new Stack<>();
        stack.push(seed);
        while (stack.isEmpty() == false) {
            bantu = stack.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.print(vertexList[bantu].label + ",");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countVartex - 1; i > 0; i--) {
                if (adjecencyMatrix[bantu][i] >= 1
                        && vertexList[i].flagVisited == false) {
                    stack.push(i);
                }
            }
        }
    }

    public String toString() {
        String read = "";
        for (int i = 0; i < countVartex; i++) {
            for (int j = 0; j < countVartex; j++) {
                System.out.print(adjecencyMatrix[i][j] + "\t");
            }
            System.out.println("");
        }
        return read;
    }
}
