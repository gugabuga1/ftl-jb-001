package animals;

public class Bird extends animal{
    protected Boolean FlyModeActive = false;

    public Bird() {
        super(MoveType.FLY);

    }

    public  final void takeOff(){
        FlyModeActive = true;
    }
    public final void landing(){
        FlyModeActive = false;
    }
    public void isTheBridFlying(){
        System.out.println(
                this.FlyModeActive == true ? "Duck: flying mode - yes" : "Duck: flying mode - no"
        );

    }

    public Boolean getFlyModeActive() {
        return FlyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        FlyModeActive = flyModeActive;
    }
}
