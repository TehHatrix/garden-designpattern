package Garden;

public class SettingsSingleton {

    private static SettingsSingleton instance;

    public String[] seasons = {"Spring","Summer","Winter","Autumn"};
    public String[] animals = {"Cat","Bird"};
    public String[] animalStripe = {"None","Black","White"};
    public String[] animalBehavior = {"Sit","Walk","Fly"};

    private String defaultSeason = "Spring";
    private String defaultAnimal = "Cat";
    private String defaultAnimalStripe = "None";
    private boolean defaultDisplayTree = false;
    private boolean defaultDisplayAnimal = false;
    private String defaultAnimalBehavior = "Sit";

    private static String chosenSeason = "Spring";
    private static String chosenAnimal = "Cat";
    private static String chosenAnimalStripe = "None";
    private static boolean displayTree = false;
    private static boolean displayAnimal = false;
    private static String chosenAnimalBehavior = "Sit";

    private SettingsSingleton() {

    }

    public static SettingsSingleton getInstance() {
        if(instance == null){
            return new SettingsSingleton();
        }
        return instance;
    }

    public String getChosenSeason() {
        return chosenSeason;
    }

    public void setChosenSeason(String chosenSeason) {
        this.chosenSeason = chosenSeason;
    }

    public String getChosenAnimal() {
        return chosenAnimal;
    }

    public void setChosenAnimal(String chosenAnimal) {
        this.chosenAnimal = chosenAnimal;
    }

    public String getChosenAnimalStripe() {
        return chosenAnimalStripe;
    }

    public void setChosenAnimalStripe(String chosenAnimalStripe) {
        this.chosenAnimalStripe = chosenAnimalStripe;
    }

    public String getDefaultSeason() {
        return defaultSeason;
    }

    public String getDefaultAnimal() {
        return defaultAnimal;
    }

    public String getDefaultAnimalStripe() {
        return defaultAnimalStripe;
    }

    public boolean isDisplayTree() {
        return displayTree;
    }

    public void setDisplayTree(boolean displayTree) {
        this.displayTree = displayTree;
    }

    public boolean isDisplayAnimal() {
        return displayAnimal;
    }

    public void setDisplayAnimal(boolean displayAnimal) {
        this.displayAnimal = displayAnimal;
    }

    public boolean isDefaultDisplayTree() {
        return defaultDisplayTree;
    }

    public boolean isDefaultDisplayAnimal() {
        return defaultDisplayAnimal;
    }

    public String getDefaultAnimalBehavior() {
        return defaultAnimalBehavior;
    }

    public String getChosenAnimalBehavior() {
        return chosenAnimalBehavior;
    }

    public void setChosenAnimalBehavior(String chosenAnimalBehavior) {
        this.chosenAnimalBehavior = chosenAnimalBehavior;
    }
}
