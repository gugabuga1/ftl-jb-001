package animals;

public class animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;

    public animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public animal() {
    }

    public void voice(){
        System.out.println("voice");

    }

    protected void runForward(Integer lenght){
        this.currentPosition += lenght;
    }

}
