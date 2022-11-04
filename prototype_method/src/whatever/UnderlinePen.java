package whatever;

import framework.*;

public class UnderlinePen implements product {
	private char ulchar;
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\" "+ s);
		for ( int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
	}
	public product createClone() {
		product p = null;
		try {
			p = (product)clone();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
