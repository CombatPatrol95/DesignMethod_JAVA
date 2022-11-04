import Framework.*;
import idcard.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Yjsp");
		Product card2 = factory.create("810");
		Product card3 = factory.create("Dingzhen");
		card1.use();
		card2.use();
		card3.use();
	}

}
