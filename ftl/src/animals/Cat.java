package animals;

public class Cat extends animal {
    public Cat(String name, AnimalWeight weight) {
        super(name, weight.getValue(), MoveType.WALK);
    }

    public Cat() {
        super(MoveType.WALK);



    }




    private Integer heightcoefficient(AnimalWeight weight){
        if(weight.getValue() > 10){
            return 120;

        }
        return 90;

    }

    public Integer jumpHeight(){
        if(this.weight == null) return 300;
        return this.heightcoefficient(this.weight);


    }
    @Override
    public void voice(){
        System.out.println("mey");

    }


}
