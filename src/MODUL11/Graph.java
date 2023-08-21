package MODUL11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 *
 * @author Titus Guritno
 */
public class Graph {
    private int maxVertex = 100;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        adjacencyMatrix = new int[maxVertex][maxVertex];
        vertexList = new Vertex[maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    adjacencyMatrix[i][j] = 0;
                }
            }
        }
    }

    public void addVertex(char node) {
        if (countVertex < maxVertex) {
            vertexList[countVertex] = new Vertex(node);
            countVertex++;
        }
    }

    public void addEdge(int a, int b, int c) {
        adjacencyMatrix[a][b] = c;
    }

    private int indexVertex(char c) {
        for (int i = 0; i <= countVertex; i++) {
            if (vertexList[i].getLabel() == c) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        for (int i = 0; i < countVertex; i++) {
            System.out.println("");
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + "\t");
            }
        }
        return null;
    }

    public void show() {
        for (int i = 0; i < countVertex; i++) {
            System.out.println("");
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if (adjacencyMatrix[i][j] == 0 || adjacencyMatrix[i][j] == -1) {
                    System.out.print("");
                } else {
                    System.out.println(vertexList[i].getLabel() + " terhubung ke "
                            + vertexList[j].getLabel() + " "
                            + "dengan beban " + adjacencyMatrix[i][j]);
                }
            }
        }
    }

    public void bfs() {
        reset();
        int seed = 0;
        Queue queue = new LinkedList();
        queue.add(seed);
        while (!queue.isEmpty()) {
            int bantu = (int) queue.remove();
            if (!vertexList[bantu].flagVisited == true) {
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].flagVisited = true;
                for (int i = 0; i <= countVertex - 1; i++) {
                    if (adjacencyMatrix[bantu][i] >= 1 && !vertexList[i].flagVisited) {
                        queue.add(i);
                    }
                }
            }
        }
    }

    public void dfs() {
        reset();
        int seed = 0;
        Stack stack = new Stack();
        stack.push(seed);
        while (!stack.isEmpty()) {
            int bantu = (int) stack.pop();
            if (!vertexList[bantu].flagVisited) {
                System.out.print(vertexList[bantu].getLabel() + " ");
                vertexList[bantu].flagVisited = true;
                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjacencyMatrix[bantu][i] >= 1 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public ArrayList<Edge> getPrimEdges() {
        reset();
        ArrayList<Edge> primEdges = new ArrayList<Edge>();
        ArrayList<Integer> primVertexs = new ArrayList<Integer>();

        int seed = indexVertex('G');
        primVertexs.add(seed);
        vertexList[seed].flagVisited = true;
        while (primVertexs.size() < countVertex) {
            int tempMinWeight = Integer.MAX_VALUE;
            int tempMinIndekVertexI = -1;
            int tempMinIndekVertexJ = -1;
            for (int i = 0; i < primVertexs.size(); i++) {
                for (int j = 0; j < countVertex; j++) {
                    if (adjacencyMatrix[primVertexs.get(i)][j] > 0 && !vertexList[j].flagVisited
                            && adjacencyMatrix[primVertexs.get(i)][j] < tempMinWeight) {
                        tempMinWeight = adjacencyMatrix[primVertexs.get(i)][j];
                        tempMinIndekVertexI = primVertexs.get(i);
                        tempMinIndekVertexJ = j;
                    }
                }
            }
            primVertexs.add(tempMinIndekVertexJ);
            vertexList[tempMinIndekVertexJ].flagVisited = true;
            primEdges.add(new Edge(tempMinIndekVertexI, tempMinIndekVertexJ, tempMinWeight));
        }
        return primEdges;
    }

    public void cetakPrim() {
        ArrayList<Edge> edge = getPrimEdges();
        int total = 0;
        for (int i = 0; i < edge.size(); i++) {
            System.out.println("(" + vertexList[edge.get(i).getVertexA()].getLabel()
                    + ", " + vertexList[edge.get(i).getVertexB()].getLabel()
                    + ")\t= " + edge.get(i).getWeight());
            total = total + edge.get(i).getWeight();
        }
        System.out.println("Total\t= " + total);
    }

    public void reset() {
        for (int i = 0; i <= countVertex - 1; i++) {
            vertexList[i].flagVisited = false;
        }
    }
}
