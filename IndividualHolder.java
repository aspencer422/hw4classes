package hw4classes;

public class IndividualHolder extends AccountHolder {
	private String name;
	private String ssn;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public IndividualHolder(int id, String address, String name, String ssn) {
		super(id, address);
		this.name = name;
		this.ssn = ssn;
	}
}
