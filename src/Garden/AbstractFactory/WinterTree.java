package Garden.AbstractFactory;

import javafx.scene.image.Image;

public class WinterTree implements Tree {

	@Override
	public Image showTree() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/winter/tree.png"));
	}

}
