package Garden.seasonsFactory;

import javafx.scene.image.Image;

public class SummerGround implements Ground {

	@Override
	public Image showGround() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/summer/ground.png"));
	}

}
