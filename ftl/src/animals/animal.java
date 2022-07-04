package animals;

public class animal {
    protected String name;
    protected Integer weight;

    public animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public animal() {
    }

    public void voice(){
        System.out.println("voice");

    }

}
