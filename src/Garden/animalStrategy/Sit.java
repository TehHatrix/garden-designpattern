package Garden.animalStrategy;

public class Sit implements MoveBehaviour {
    @Override
    public String move() {
        System.out.println("Sitting");
        return "sit";
    }
    
}
