package animals;

public class Bird extends animal implements Flight{
    protected Boolean FlyModeActive = false;

    public Bird() {
        super(MoveType.FLY);

    }

    @Override
    public void takeoff() {
        this.FlyModeActive = true;


    }

    @Override
    public void landing() {
        this.FlyModeActive = false;

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
