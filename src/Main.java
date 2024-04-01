import competition.*;
import competition.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {new Human("John"), new Cat("Tom"), new Robot("R2D2")};
        Obstacle[] obstacles;
        obstacles = new Obstacle[]{new Trakk(100), new Wall(2)};

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean result = obstacle.overcome(participant);
                if (!result) {
                    System.out.println(participant.getClass().getSimpleName() + " couldn't overcome the obstacle.");
                    break;
                }
            }
        }
    }
}
