package Garden.animalStrategy;

import javafx.scene.image.Image;


public abstract class Animal {
    String description = "Unknown Animals";
    MoveBehaviour moveBehaviour;
    String imgPath = "/Garden/controllers/animals/";
    String pattern = "";

    public String getDescription(){
        return description;
    }
    public abstract String color();
    public abstract void setImage();

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgPath() {
        return this.imgPath;
    }

    public void setMoveBehaviour(MoveBehaviour mb) {
        moveBehaviour = mb;
    }

    public MoveBehaviour getMoveBehaviour(){
        return this.moveBehaviour;
    }

    public Image getImage() {
        System.out.println(imgPath);
        return new Image(getClass().getResourceAsStream(imgPath + ".png"));
    }





}
