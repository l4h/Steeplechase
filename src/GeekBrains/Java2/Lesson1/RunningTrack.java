package GeekBrains.Java2.Lesson1;

public class RunningTrack extends AbstractBarrier {
    private int length;

    RunningTrack(int length){
        super("RunningTrack");
        this.length = length;

    }


    @Override
    public boolean overcome(Runner runner) {
        if(runner.getRunDistance()>length){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return getName()+" length:" + length;
    }
}
