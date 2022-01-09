package Garden.seasonsFactory;

import javafx.scene.image.Image;

public class SummerTree implements Tree {

	@Override
	public Image showTree() {
		return new Image(getClass().getResourceAsStream("/Garden/controllers/seasons/summer/tree.png"));
	}

}
