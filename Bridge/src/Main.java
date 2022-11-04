
public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("idi nahuy"));
		Display d2 = new CountDisplay(new StringDisplayImpl("blyat"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("cyka"));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(3);
	}
}
