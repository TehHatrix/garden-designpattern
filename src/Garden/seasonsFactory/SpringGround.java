package Garden.seasonsFactory;

import javafx.scene.image.Image;

public class SpringGround implements Ground {

	@Override
	public Image showGround() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/spring/ground.png"));
	}

}
