package builder_method;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {

	private String filename;
	private PrintWriter writer;
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub

		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		}catch(IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>"+title+"</h1>");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub

		writer.println("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub

		writer.println("<u1>");
		for(int i = 0; i < items.length; i++) {
			writer.println("<li>" + items + "</li>");
		}
		writer.println("</u1>");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

		writer.println("</body></html>");
		writer.close();
	}

	public String getResult() {
		return filename;
	}
}
