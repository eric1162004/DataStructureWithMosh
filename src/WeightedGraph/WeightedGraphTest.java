package WeightedGraph;

public class WeightedGraphTest {

    public static void Test(){
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B", 1);
        graph.addEdge("B", "C", 2);
        graph.addEdge("A", "C", 10);
        var path = graph.getShortestPath("A", "C");
        System.out.println(path);

        // graph.print();
    }
}
