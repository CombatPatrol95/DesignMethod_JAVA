package builder_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		TextBuilder textbuilder = new TextBuilder();
//		Director directorA = new Director(textbuilder);
//		directorA.construct();
//		String result = textbuilder.getResult();
//		System.out.println(result);
		
		HTMLBuilder htmlbuilder = new HTMLBuilder();
		Director directorB = new Director(htmlbuilder);
		directorB.construct();
		String filename = htmlbuilder.getResult();
		System.out.println(filename + "done deal");
	}

}
