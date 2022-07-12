package animals;

 class animal {
    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    public Boolean canFly = false;

    public animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        this.canFly = false;
    }

    public animal() {
        this.canFly = false;
    }

    public void voice(){
        System.out.println("voice");

    }

    protected void runForward(Integer lenght){

        this.currentPosition += lenght;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getWeight() {
         return weight;
     }

     public void setWeight(Integer weight) {
         this.weight = weight;
     }

     public Integer getCurrentPosition() {
         return currentPosition;
     }

     public void setCurrentPosition(Integer currentPosition) {
         this.currentPosition = currentPosition;
     }

     public Boolean getCanFly() {
         return canFly;
     }

     public void setCanFly(Boolean canFly) {
         this.canFly = canFly;
     }
 }
