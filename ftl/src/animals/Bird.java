package animals;

public class Bird extends animal{
    protected Boolean FlyModeActive = false;

    public Bird() {
        canFly = true;
    }

    public void takeOff(){
        FlyModeActive = true;
    }
    public void landing(){
        FlyModeActive = false;
    }
    public void isTheBridFlying(){
        System.out.println(
                this.FlyModeActive == true ? "Duck: flying mode - yes" : "Duck: flying mode - no"
        );

    }
}
