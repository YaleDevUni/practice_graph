import java.util.ArrayList;
import java.util.List;


public class Edge {
    int u;
    int v;
    public Edge(int u, int v){
        this.u = u;
        this.v = v;
    }
    public int[] getEdge(){
        int[] temp = new int[]{u,v};
        return temp;
    }
    @Override
    public boolean equals(Object object){
        System.out.println(((Edge) object).getEdge()[0]);
        if(object != null && object instanceof Edge){
            if( ((Edge) object).getEdge()[0]==u && ((Edge) object).getEdge()[1]==v){
                System.out.println("sdfsefesf");
                return true;
            }
        }

        return false;
    }
    public static void main() {
        // List<Edge> my = new ArrayList<>();
        // my.add(new Edge(1, 2));
        // boolean a = false;
        // a=my.contains(new Edge(1,2));
        // System.out.println(a);
    }
}
