package abstractFactory_method;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = Factory.getFactory(args[0]);
		Link blyat = factory.createLink("blyat", "https://www.baidu.com");
		Tray traynews = factory.createTray("News");
		traynews.add(blyat);
		Page page = factory.createPage("Page","cyka");
		page.add(traynews);
		page.output();
	}

}
