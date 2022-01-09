package Garden.animalStrategy;

public class Walk implements MoveBehaviour {
    
    @Override
    public String move() {
        //System.out.println("Walking");
        return "Walk";
    }
}
