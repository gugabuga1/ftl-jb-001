package animals;

public abstract class animal {
    public static class AnimalWeight{
        public enum WeightType{
            KG, GR
        }
        private Integer value;
        private WeightType weightType;

        public AnimalWeight(Integer value, WeightType weightType) {
            this.value = value;
            this.weightType = weightType;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public WeightType getWeightType() {
            return weightType;
        }

        public void setWeightType(WeightType weightType) {
            this.weightType = weightType;
        }
    }
    protected String name;
    protected AnimalWeight weight;
    protected Integer currentPosition = 0;
    public MoveType moveType;

    public animal(String name, Integer AnimalWeight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public abstract void voice();




    protected void runForward(Integer lenght){

        this.currentPosition += lenght;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public AnimalWeight getWeight() {
         return weight;
     }

     public void setWeight(AnimalWeight weight) {
         this.weight = weight;
     }

     public Integer getCurrentPosition() {
         return currentPosition;
     }

     public void setCurrentPosition(Integer currentPosition) {
         this.currentPosition = currentPosition;
     }

     public MoveType getMoveType() {
         return moveType;
     }

     public void setMoveType(MoveType moveType) {
         this.moveType = moveType;
     }
 }

