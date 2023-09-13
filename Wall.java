package HomeWork1;

public class Wall extends Obstacle {
    public int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.Jump(hight);
    }
}
