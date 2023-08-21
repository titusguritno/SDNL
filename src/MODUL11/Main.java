package MODUL11;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Graph gr = new Graph();
        gr.addVertex('A');
        gr.addVertex('B');
        gr.addVertex('C');
        gr.addVertex('D');
        gr.addVertex('E');
        gr.addVertex('F');
        gr.addVertex('G');
        gr.addVertex('H');
        gr.addVertex('I');
        gr.addVertex('J');

        gr.addEdge(0, 1, 5);
        gr.addEdge(0, 2, 5);

        gr.addEdge(1, 3, 4);
        gr.addEdge(1, 4, 9);
        gr.addEdge(1, 0, 5);

        gr.addEdge(2, 3, 4);
        gr.addEdge(2, 5, 7);
        gr.addEdge(2, 0, 5);

        gr.addEdge(3, 4, 8);
        gr.addEdge(3, 5, 6);
        gr.addEdge(3, 1, 4);
        gr.addEdge(3, 2, 4);

        gr.addEdge(4, 5, 10);
        gr.addEdge(4, 6, 10);
        gr.addEdge(4, 7, 8);
        gr.addEdge(4, 8, 9);
        gr.addEdge(4, 1, 9);
        gr.addEdge(4, 3, 8);

        gr.addEdge(5, 6, 3);
        gr.addEdge(5, 2, 7);
        gr.addEdge(5, 3, 6);
        gr.addEdge(5, 4, 10);

        gr.addEdge(6, 7, 6);
        gr.addEdge(6, 9, 7);
        gr.addEdge(6, 4, 10);
        gr.addEdge(6, 5, 3);

        gr.addEdge(7, 8, 4);
        gr.addEdge(7, 9, 6);
        gr.addEdge(7, 4, 8);
        gr.addEdge(7, 6, 6);

        gr.addEdge(8, 9, 7);
        gr.addEdge(8, 4, 9);
        gr.addEdge(8, 7, 4);

        gr.addEdge(9, 6, 7);
        gr.addEdge(9, 7, 6);
        gr.addEdge(9, 8, 7);

        gr.cetakPrim();

        gr.bfs();

        gr.dfs();

        gr.show();

        gr.toString();
        System.out.println("");
    }
}
