package GeekBrains.Java2.Lesson1;

public class Main {

    public static void main(String[] args) {
        AbstractBarrier [] barriers = {new RunningTrack(15), new Wall(125),
                                new RunningTrack(50), new Wall(75),
                                new RunningTrack(150),new Wall(50)};
        Runner [] runners = {new Runner("Sergey",70,58), new Runner("Dmitry", 69,125),
                            new Runner("Bolt",150,200), new Runner("Alexey",126,100 )};

        Team team = new Team(runners,"RedAlert");
        Course course = new Course(barriers);
        course.testBarriers(team);
        team.printTeamInfo();
        team.printWinnersInfo();

    }

}

