import junit.framework.TestCase;

public abstract class ZooAnimals {
    protected String name;
    protected int weight;

    protected ZooAnimals(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}
