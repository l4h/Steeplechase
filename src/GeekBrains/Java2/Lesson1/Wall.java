package GeekBrains.Java2.Lesson1;

public class Wall extends AbstractBarrier{
    private int height;

    Wall(int height){
        super("Wall");
        this.height=height;
    }

    @Override
    public boolean overcome(Runner runner) {
       if(runner.getJumpHeight()>height){
           return true;
       }
       return false;
    }

    @Override
    public String toString(){
        return getName()+" height:"+height;
    }
    
    public int getHeight() {
        return height;
    }
}
