package Garden.animalStrategy;

public class Fly implements MoveBehaviour {

    @Override
    public String move() {
        System.out.println("Flying");
        return "fly";
    }
    
}
