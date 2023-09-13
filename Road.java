package HomeWork1;

public class Road extends Obstacle {
    int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.Run(lenght);
    }
}
