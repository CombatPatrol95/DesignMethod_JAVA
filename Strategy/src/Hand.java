
public class Hand {

	public static final int HANDVAL_GUU = 0;
	public static final int HANDVAL_CHO = 1;
	public static final int HANDVAL_PAA = 2;
	public static final Hand[] hand = {
			new Hand(HANDVAL_GUU),
			new Hand(HANDVAL_CHO),
			new Hand(HANDVAL_PAA),
	};
	private static final String[] name = {
			"stone", "scissors", "clothes"
	};
	private int handvalue;
	private Hand(int handvalue) { 
		this.handvalue = handvalue;
	}
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	private int fight(Hand h) {
		if(this == h) {
			return 0;
		}else if ((this.handvalue + 1) % 3 == h.handvalue) {
			return 1;
		}else {
			return 0;
		}
	}
	public String toString() {
		return name[handvalue];
	}
	
}
