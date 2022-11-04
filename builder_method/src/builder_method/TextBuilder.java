package builder_method;

public class TextBuilder extends Builder {

	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		
		buffer.append("dddd");
		buffer.append("Das ist title");
		buffer.append("\n");

	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub

		buffer.append(" "+str+" ");
		buffer.append("\n");
		
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < items.length; i++) {
			buffer.append("cc"+items[i]);
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

		buffer.append("this is EOF");
	}
	
	public String getResult() {
		return buffer.toString();
	}

}
