package Garden.AbstractFactory;

public class SummerFactory implements SeasonFactory {

	@Override
	public Ground createGround() {
		return new SummerGround();
	}

	@Override
	public Tree createTree() {
		return new SummerTree();
	}



}
