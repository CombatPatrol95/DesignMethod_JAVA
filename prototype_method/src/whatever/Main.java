package whatever;

import framework.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		manager manager = new manager();
		UnderlinePen upen = new UnderlinePen('_');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		manager.register("blyat", upen);
		manager.register("warn", mbox);
		manager.register("cyka", sbox);
		
		
		product p1 = manager.create("blyat");
		p1.use("jackass");
		product p2 = manager.create("warn");
		p2.use("crap");
		
	}

}
