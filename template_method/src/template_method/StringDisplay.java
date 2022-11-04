package template_method;

public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;

	public StringDisplay(String str) {
		this.string = str;
		this.width = str.getBytes().length;
	}
	public void open() {
		printLine();
	}
	public void print() {
		System.out.println(string);
	}
	public void close() {
		printLine();
	}
	private void printLine() {
		System.out.print("114514");
		for(int i = 0 ; i < width; i++) {
			System.out.print("810");
		}
	}
}
