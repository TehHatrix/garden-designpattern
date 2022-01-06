package Garden.AbstractFactory;

import javafx.scene.image.Image;

public class WinterGround implements Ground {

	@Override
	public Image showGround() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/winter/ground.png"));
	}

}
