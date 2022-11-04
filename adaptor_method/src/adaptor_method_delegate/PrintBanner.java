package adaptor_method_delegate;

import adaptor_method.Banner;

public class PrintBanner extends Print{

	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}
	public void printWeak() {
		banner.showWithParen();
	}
	public void printStrong() {
		banner.showWithYjsp();
	}
}
