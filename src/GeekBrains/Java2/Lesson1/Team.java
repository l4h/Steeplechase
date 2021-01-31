package GeekBrains.Java2.Lesson1;

public class Team {
    String name;
    Runner[] runners;

    public Team(Runner[] runners,String name){
        this.name = name;
        this.runners=runners;
    }


    public void printTeamInfo(){
        System.out.println("Team "+name);
        for (int i = 0; i < runners.length; i++) {
            System.out.println(runners[i]);
        }
    }

    public Runner[] getRunners() {
        return runners;
    }


    public void printWinnersInfo(){
        System.out.println("Winners:");
        for (int i = 0; i < runners.length; i++) {
            if(runners[i].isBarriersPass()){
                System.out.println(runners[i]);
            }
        }
    }
}
