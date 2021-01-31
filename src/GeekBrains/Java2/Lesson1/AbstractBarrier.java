package GeekBrains.Java2.Lesson1;

public abstract class AbstractBarrier implements Barrier {
    String name;

    public AbstractBarrier(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

}
