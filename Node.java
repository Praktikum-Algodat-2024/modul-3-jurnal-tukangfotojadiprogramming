package tambahan;

public class Node {
    String earth;
    String name;
    String alterEgo;
    String status;
    int powerLevel;
    Node next, prev;

    public Node(String earth, String name, String alterEgo, String status, int powerLevel) {
        this.earth = earth;
        this.name = name;
        this.alterEgo = alterEgo;
        this.status = status;
        this.powerLevel = powerLevel;
    }
}