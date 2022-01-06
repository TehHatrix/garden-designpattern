package Garden.AbstractFactory;

import javafx.scene.image.Image;

public class AutumnGround implements Ground {

	@Override
	public Image showGround() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/autumn/ground.png"));
	}

}
