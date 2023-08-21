package MODUL9;
/**
 *
 * @author Titus Guritno
 */
public class TestingGraph {
    public static void main(String[] args) {
        Graph gr = new Graph();        
//        variabel vertex
        gr.addVertex('A');
        gr.addVertex('B');
        gr.addVertex('C');
        gr.addVertex('D');
        gr.addVertex('F');
        gr.addVertex('G');
        gr.addVertex('H');
        
//        nilai edge
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
        
//        adjecency Matrix
        System.out.println("Adjecency Matrix : ");
        gr.toString();
        
        System.out.println("");
        gr.show();
        
//        kunjungan dfs
        System.out.println("Hasil DFS");
        gr.dfs();
        System.out.println("");
    }
}
