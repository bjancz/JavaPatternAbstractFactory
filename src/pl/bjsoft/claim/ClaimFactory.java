package pl.bjsoft.claim;

import pl.bjsoft.abstractfactory.AbstractFactory;

public class ClaimFactory implements AbstractFactory<Double, Claim> {

	@Override
	public Claim create(Double validator) {
		if (validator > 10)
			return new ClaimMotor();
		return new ClaimHouseHold();
	}

}
