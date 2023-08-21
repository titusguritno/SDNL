package MODUL10;
/**
 *
 * @author LENOVO
 */
public class MainGraph {
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
        
        gr.addEdge('A', 'B', 5);
        gr.addEdge('A', 'D', 7);
        gr.addEdge('A', 'F', 4);
        gr.addEdge('B', 'C', 7);
        gr.addEdge('B', 'D', 6);
        gr.addEdge('C', 'D', 6);
        gr.addEdge('C', 'G', 9);
        gr.addEdge('C', 'H', 15);
        gr.addEdge('D', 'G', 5);
        gr.addEdge('F', 'G', 9);
        gr.addEdge('G', 'H', 8);
          
        System.out.println("BFS : ");
        gr.bfs();
        System.out.println("\n");
        System.out.println("DFS : ");
        gr.dfs();
        System.out.println("\n");
        System.out.println("==================");
        System.out.println("Keterangan Grat : ");
        System.out.println("==================");
        gr.show();
        System.out.println("===================");
        System.out.println("Adjacency Matrix : ");
        System.out.println("===================");
        gr.toString();
        System.out.println();
    }
}
