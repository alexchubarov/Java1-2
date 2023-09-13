package HomeWork1;

public class Competitor implements RunJump {
    int maxDistance;
    int maxJump;
    String name;
    protected boolean OnDistance;

    public Competitor(int maxDistance, int maxJump, String name) {
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
        this.name = name;
        this.OnDistance = true;
    }

    @Override
    public void Run(int dist) {
        if (dist <= maxDistance) {
            System.out.println(name + " хорошо справился с бегом");
        } else {
            System.out.println(name + " не добежал((");
            OnDistance = false;
            
        }
    }

    @Override
    public void Jump(int hight) {
        if (hight <= maxJump) {
            System.out.println(name + " перепрыгнул");
        } else {
            System.out.println(name + " не его высота(");
            OnDistance = false;
        }
    }

    @Override
    public boolean IsOnDistance() {
        return OnDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " + OnDistance);
    }
}
