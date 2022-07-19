package L028;

public class House {
    private boolean HasGarage;
    private boolean HasSwimmingPool;
    private boolean HasFancyStatues;
    private boolean HasGarden;

    public static class Builder{
        private boolean HasGarage= false;
        private boolean HasSwimmingPool= false;
        private boolean HasFancyStatues= false;
        private boolean HasGarden= false;

        public Builder() {

        }
        public Builder optHasGarage(boolean val) {
            this.HasGarage = val;
            return this;
        }
        public Builder optHasSwimmingPool(boolean val){
            this.HasSwimmingPool = val;
            return this;
        }
        public Builder optHasFancyStatues(boolean val){
            this.HasFancyStatues = val;
            return this;
        }
        public Builder optHasGarden(boolean val){
            this.HasGarden = val;
            return this;
        }
        public House build(){
            return new House(this);
        }
    }

    public House(Builder builder){
        this.HasFancyStatues = builder.HasFancyStatues;
        this.HasGarage = builder.HasGarage;
        this.HasGarden = builder.HasGarden;
        this.HasSwimmingPool = builder.HasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "HasGarage=" + HasGarage +
                ", HasSwimmingPool=" + HasSwimmingPool +
                ", HasFancyStatues=" + HasFancyStatues +
                ", HasGarden=" + HasGarden +
                '}';
    }
}
