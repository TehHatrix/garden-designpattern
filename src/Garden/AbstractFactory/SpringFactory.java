package Garden.AbstractFactory;

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
