package adaptor_method;

public class Banner {
	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("("+string+")");
	}
	public void showWithYjsp() {
		System.out.println("yaju"+string+"senpai");
	}

}
