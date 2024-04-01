package competition;

 public class Cat implements Participant {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " runs");
    }

    @Override
    public void jump() {
        System.out.println(name + " jumps");
    }
}