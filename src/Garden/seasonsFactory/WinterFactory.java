package Garden.seasonsFactory;

public class WinterFactory implements SeasonFactory {

	@Override
	public Ground createGround() {
		return new WinterGround();
	}

	@Override
	public Tree createTree() {
		return new WinterTree();
	}

}
