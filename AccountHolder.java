package hw4classes;
import java.lang.Math;   

public class AccountHolder {

	private int id;
	private String address;
	
	public AccountHolder(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	public int getNextInt() {
		return (int)Math.random() * 1000;
	}
	
}
