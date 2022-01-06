package Garden.seasonsFactory;

import javafx.scene.image.Image;

public class SpringTree implements Tree {

	@Override
	public Image showTree() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/spring/tree.png"));
	}

}
