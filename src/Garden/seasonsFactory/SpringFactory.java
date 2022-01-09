package Garden.seasonsFactory;

public class SpringFactory implements SeasonFactory {

	@Override
	public Ground createGround() {
		return new SpringGround();
	}

	@Override
	public Tree createTree() {
		return new SpringTree();
	}

}
