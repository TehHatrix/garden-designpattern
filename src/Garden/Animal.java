package Garden;

public abstract class Animal {
    String description = "Unknown Animals";
    public String getDescription(){
        return description;
    }
    public abstract String color();
}
