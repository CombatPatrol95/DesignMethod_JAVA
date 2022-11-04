package singleton_method;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("Generated an INSTANCE");
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
