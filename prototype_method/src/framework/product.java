package framework;

public interface product extends Cloneable{
	public abstract void use(String s);
	public abstract product createClone();

}
