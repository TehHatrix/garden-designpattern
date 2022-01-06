package Garden.AbstractFactory;

import javafx.scene.image.Image;
public class AutumnTree implements Tree {

	@Override
	public Image showTree() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/autumn/tree.png"));
	}

}
