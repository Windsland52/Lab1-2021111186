
public class Edge {
    private int weight;  // 边的权重
    private Vertex tail;  // 尾部结点标识

    public Edge(Vertex tail) {
        this.tail = tail;
        this.weight = 1;
    }

    public Vertex getTail() {
        return tail;
    }

    public void setTail(Vertex tail) {
        this.tail = tail;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void weightAdd1() {
        weight++;
    }
}
