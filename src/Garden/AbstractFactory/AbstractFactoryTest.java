package Garden.AbstractFactory;

import java.util.Scanner;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		SeasonFactory factory = null;
		
		int action;
		
		while(true) {
			System.out.println("Select a season:\n(1) Summer\n(2) Winter\n(3) Spring\n(4) Autumn\n(5) EXIT PROGRAM");
			action = scan.nextInt();
			
			if(action == 1) {
				factory = new SummerFactory();
			}else if(action == 2) {
				factory = new WinterFactory();
			}else if(action == 3) {
				factory = new SpringFactory();
			}else if(action == 4) {
				factory = new AutumnFactory();
			}else if(action == 5) {
				break;
			}else {
				System.out.println("Invalid choice. Try again");
				continue;
			}
			
			System.out.println("\n"+factory.createGround().showGround());
			System.out.println(factory.createTree().showTree()+"\n\n");
			
		}
		scan.close();

	}

}
