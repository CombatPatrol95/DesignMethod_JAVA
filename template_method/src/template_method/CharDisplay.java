package template_method;

public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	public void print() {
		System.out.print(ch);
	}


	public void open() {
		System.out.print("<<");
	}
	
	public void close() {
		System.out.print(">>");
	}
}
