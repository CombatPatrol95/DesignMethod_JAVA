package adaptor_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		adaptor_method_delegate.Print p = new adaptor_method_delegate.PrintBanner("810");
		p.printWeak();
		p.printStrong();
	}

}
