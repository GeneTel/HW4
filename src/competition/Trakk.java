package competition;

 public class Trakk implements Obstacle {
    private double length;

     public Trakk(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.run();
        return true; // Учасник завжди подолає бігову доріжку
    }
}