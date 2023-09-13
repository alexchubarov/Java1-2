package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Competitor [] arrayCompetitor = {new Cat(20,3,"Barsik"),
                new Human(50,2, "Alex"), new Robot(600,20,"Robokop")};
        Obstacle [] arrayObstacle = {new Wall(3), new Road(50)};

        for (Competitor c : arrayCompetitor){
            for (Obstacle o : arrayObstacle){
                o.doIt(c);
                if (!c.IsOnDistance()){
                    break;}
            }
        }
        for(Competitor c : arrayCompetitor){
            c.info();
        }
        }
    }

