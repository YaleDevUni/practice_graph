import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DFS {
    // dfs for the directed graph
    private Graph g;
    private List<Edge> discoveryE = new ArrayList<>();
    private List<Edge> backE = new ArrayList<>();
    private List<Edge> forwardE = new ArrayList<>();
    DFS(Graph g) {
        this.g = g;
    }

    public void directedDFS(int v,boolean[] activedV, boolean exploredV, HashMap<Integer,Integer> exploredE) {
        activedV[v] = true;
        for (int outgoing : g.neighbours(v)) {
            Edge curEdge = new Edge(v, outgoing);
            
        }
    }
    public static void main() throws Exception{
        
    }
}

// public static void main(){

// }
