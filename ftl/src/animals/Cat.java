package animals;

public class Cat extends animal {
    public Cat(String name, Integer weight) {
        super(name, weight);
    }

    public Cat() {

    }

    private Integer heightcoefficient(Integer weight){
        if(weight > 10){
            return 120;

        }
        return 90;

    }

    public Integer jumpHeight(){
        if(this.weight == null) return 300;
        return this.heightcoefficient(this.weight);


    }

}
