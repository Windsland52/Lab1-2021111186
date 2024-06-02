import java.util.LinkedList;
import java.util.List;

public class Vertex {
    private final String name;   // 每个结点的名字
    private final LinkedList<Edge> EdgeList;   // 边表
    private final int index ;    // 结点编号

    public Vertex(String name, int index) {
        this.name = name;
        this.index = index;
        EdgeList = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return index;
    }

    public LinkedList<Edge> getEdgeList() {
        return EdgeList;
    }
}
