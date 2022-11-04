package iterator_method;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("114,514!"));
		bookShelf.appendBook(new Book("你是一个一个一个"));
		bookShelf.appendBook(new Book("893"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book) it.next();
			System.out.print(book.getName());
		}
	}

}
