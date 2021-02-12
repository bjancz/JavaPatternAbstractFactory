package pl.bjsoft.claim;

import java.util.Date;

public class ClaimMotor extends Claim{

	
	String make;
	String model;
	Date production;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Date getProduction() {
		return production;
	}

	public void setProduction(Date production) {
		this.production = production;
	}

}
