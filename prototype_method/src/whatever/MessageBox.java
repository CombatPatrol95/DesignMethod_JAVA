package whatever;
import framework.manager;
import framework.product;

public class MessageBox implements product{
	private char decochar;
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}
	public void use(String s) {
		int length = s.getBytes().length;
		for(int i = 0; i < length; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + "" + s);
		for(int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
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
