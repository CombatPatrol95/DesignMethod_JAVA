import java.util.Random;

public class ProbStrategy {


	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;
	private int[][] history = {
			{1,1,1},
			{1,1,1},
			{1,1,1},
	};
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}
	public Hand nextHand() {
		
	}
	private int getSum(int hv) {
		
	}
	public void study(boolean win) {
		
	}
}
