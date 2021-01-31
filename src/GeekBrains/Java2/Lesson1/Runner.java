package GeekBrains.Java2.Lesson1;

public class Runner {
    private String name;
    private int jumpHeight;
    private int runDistance;
    private boolean barriersPass;

    public Runner(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public String toString(){
        return "{"+name+ ",  \tmax jump height:" + jumpHeight+",  \tmax run distance:"+runDistance+"}";
    }
    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public int getRunDistance() {
        return runDistance;
    }

    public boolean isBarriersPass() {
        return barriersPass;
    }
    public void setBarriersPass(boolean barriersPass) {
        this.barriersPass = barriersPass;
    }


}
