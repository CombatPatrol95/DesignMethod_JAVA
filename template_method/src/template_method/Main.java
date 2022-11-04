package template_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractDisplay D1 = new CharDisplay('H');
		AbstractDisplay D2 = new StringDisplay("yajusenpai");
		AbstractDisplay D3 = new StringDisplay("你是一个一个一个");
		D1.display();
		D2.display();
		D3.display();
	}

}
