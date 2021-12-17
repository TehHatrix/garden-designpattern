package Garden;

public class Birds extends Animal{
    public Birds(){
        description = "Birds";
        setMoveBehaviour(new Fly());
    }
    @Override
    public String color() {
        return null;
    }

}
