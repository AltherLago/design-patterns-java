package strategy;

public class BehaviorDefense implements Behavior {

    @Override
    public void toMove(){
        System.out.println("Moving defensively...");
    }
}
