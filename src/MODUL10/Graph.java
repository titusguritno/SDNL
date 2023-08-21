package MODUL10;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author Titus Guritno
 */
public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];

        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {

                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                } else {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(char v) {
        vertexList[countVertex++] = new Vertex(v);
    }

    public void addEdge(int satu, int dua, int value) {
        adjacencyMatrix[satu][dua] = value;
        adjacencyMatrix[dua][satu] = value;
    }

    public void addEdge(char satu, char dua, int value) {
        adjacencyMatrix[indexVertex(satu)][indexVertex(dua)] = value;
        adjacencyMatrix[indexVertex(dua)][indexVertex(satu)] = value;
    }

    private int indexVertex(char index) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == index) {
                return i;
            }
        }
        return -1;
    }

    public void dfs() {
        int seed = 0;
        int bantu;
        Stack<Integer> stack = new Stack<>();
        stack.push(seed);
        while (stack.isEmpty() == false) {
            bantu = stack.pop();
            if (vertexList[bantu].flagVisited == false) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
            }
            for (int i = countVertex - 1; i > 0; i--) {
                if (adjacencyMatrix[bantu][i] >= 1
                        && vertexList[i].flagVisited == false) {
                    stack.push(i);
                }
            }
        }
    }

    public void bfs() {
        int seed = 0;
        Queue<Integer> queue = new LinkedList();
        queue.add(seed);
        while (!queue.isEmpty()) {
            int bantu = (Integer) queue.remove();
            if (!vertexList[bantu].flagVisited) {
                System.out.print(vertexList[bantu].label + " ");
                vertexList[bantu].flagVisited = true;
                for (int i = 0; i <= countVertex - 1; i++) {
                    if (adjacencyMatrix[bantu][i] >= 1 && 
                            !vertexList[i].flagVisited) {
                        queue.add(i);
                    }
                }
            }
        }
        for (int i = 0; i <= countVertex - 1; i++) {
            vertexList[i].flagVisited = false;
        }
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                if (adjacencyMatrix[i][j] != 0 && adjacencyMatrix[i][j] != -1) {
                    System.out.println(vertexList[i].label
                            + " Terhubung ke " + vertexList[j].label
                            + " Dengan Beban " + adjacencyMatrix[i][j]);
                }
            }
            System.out.println("");
        }
    }

    public String toString() {
        String hasil = " ";
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.printf(adjacencyMatrix[i][j] + "\t");
            }
            System.out.println("");
        }
        return hasil;
    }
}
