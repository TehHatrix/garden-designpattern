package Garden;

public class GardenMain {
    public static void main(String[] args){
        Animal test = new Cats();
        test = new OrangeStripes(test);
        System.out.println(test);
//        test.setMoveBehaviour();
    }
}
