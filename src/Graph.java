import java.util.*;
class Graph {
    private int vertices;
    private int[][] g;
    Graph(int vertices){
        this.vertices = vertices;
        g = new int[vertices][vertices];
        for(int i = 0; i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                g[i][j] = 0;
            }
        }
    }
    public void randGen(){
        Random rand = new Random();
        for(int i = 0; i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                int n = rand.nextInt(2);
                if(n==1){
                    g[i][j] = 1;
                }
            }
        }
    }
    public void addEdges(int a, int b){
        g[a][b] = 1;
    }
    public int deg(int vertex){
        int count = 0;
        for(int i=0;i<vertices;i++){
            if(g[vertex][i]==1){
                count = count +1;
            }
        }
        return count;
    }
    public int[] neighbours(int vertex){
        int deg = this.deg(vertex);
        int[] neighbours = new int[deg];
        int cur = 0;
        for (int i = 0; i < vertices; i++) {
            if(g[vertex][i] == 1){
                neighbours[cur] = i;
                cur = cur +1;
            }
        }
        return neighbours;
    }
    public void print(){
        for(int i = 0; i<vertices;i++){
            for(int j = 0;j<vertices;j++){
                System.out.print(g[i][j]);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) throws Exception {
        Graph myG = new Graph(10);
        myG.randGen();
        myG.print();
    }
}
