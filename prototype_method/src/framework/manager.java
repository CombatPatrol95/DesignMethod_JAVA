package framework;
import java.util.*;
import whatever.UnderlinePen;

public class manager {

	private HashMap showcase = new HashMap();
	public void register(String name, product proto)
	{
		showcase.put(name, proto);
	}
	public product create(String protoname) {
		product p = (product)showcase.get(protoname);
		return p.createClone();
	}
}
