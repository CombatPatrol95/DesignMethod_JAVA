package idcard;

import Framework.*;

public class IDCard extends Product{

	private String owner;
	IDCard(String owner){
		System.out.println(owner+"'s IDCard");
		this.owner = owner;
	}
	public void use() {
		System.out.println("using THIS CRAP");
	}
	public String getOwner() {
		return owner;
	}
}
