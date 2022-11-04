package singleton_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Screwed");
		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();
		if(obj.equals(obj1)) System.out.println("Cyka");
	}

}
