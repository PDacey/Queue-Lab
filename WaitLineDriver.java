/**
 * Driver to be able to utilize WaitLine
 * @author Paul Dacey
 *
 */


public class WaitLineDriver {

	public static void main(String[] args) {
		
		WaitLine test = new WaitLine();
		test.reset();
		test.simulate(12, 50, 5);
		test.displayResults();
		

	}

}
