package Graph;

public class GraphTest {

    public static void Test(){
        var graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addEdge("A", "B");
        graph.addEdge("B", "D");
        graph.addEdge("D", "C");
        graph.addEdge("A", "C");

        // graph.traverseBreadthFirst("C");

        var graph2 = new Graph();
        graph2.addNode("A");
        graph2.addNode("X");
        graph2.addNode("B");
        graph2.addNode("P");
        graph2.addEdge("X","B");
        graph2.addEdge("X","A");
        graph2.addEdge("A","P");
        graph2.addEdge("B","P");

        var list = graph2.topologicalSort();
        System.out.println(list);

        var graph3 = new Graph();
        graph3.addNode("A");
        graph3.addNode("B");
        graph3.addNode("C");
        graph3.addEdge("A","B");
        graph3.addEdge("B","C");
        graph3.addEdge("C","A");
        System.out.println(graph3.hasCycle());


    }
}
