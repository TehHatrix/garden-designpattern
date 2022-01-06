package Garden.seasonsFactory;

public class AutumnFactory implements SeasonFactory {

	@Override
	public Ground createGround() {
		return new AutumnGround();
	}

	@Override
	public Tree createTree() {
		return new AutumnTree();
	}

}
