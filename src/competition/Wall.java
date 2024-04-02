package competition;

 public class Wall implements Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        participant.jump();
        return participant instanceof Human; // Людина може не подолати стіну
    }
}