public class Graphs {

    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph<>();

        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");


        graph.connectDirected("J", "I");
        graph.connectUnDirected("A", "B");
        graph.connectUnDirected("B", "E");
        graph.connectUnDirected("C", "E");
        graph.connectUnDirected("C", "D");
        graph.connectUnDirected("F", "D");
        graph.connectUnDirected("F", "G");
        graph.connectUnDirected("K", "J");
        graph.connectUnDirected("I", "K");


        graph.connectDirected("A", "C");
        graph.connectDirected("C", "H");
        graph.connectDirected("D", "B");
        graph.connectDirected("E", "F");







        return graph;
    }
    
}
