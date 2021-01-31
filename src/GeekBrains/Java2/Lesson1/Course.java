package GeekBrains.Java2.Lesson1;

public class Course {
    private AbstractBarrier[] barriers;
    
    public Course(AbstractBarrier[] barriers){
        this.barriers=barriers;
    }
    
    public void testBarriers(Team team){
        Runner[] runners= team.getRunners();
        for (int i = 0; i < runners.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if(barriers[j].overcome(runners[i])){
                    System.out.println(runners[i].getName() +" преодолел препятствие "+barriers[j]);
                    if(j== barriers.length-1){
                        runners[i].setBarriersPass(true);
                    }
                } else {
                    System.out.println(runners[i].getName() +" не преодолел препятствие "+barriers[j]+" и выбывает из игры");
                    break;
                }
            }
        }
    }
}
