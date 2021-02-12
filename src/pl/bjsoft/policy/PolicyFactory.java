package pl.bjsoft.policy;

import pl.bjsoft.abstractfactory.AbstractFactory;

public class PolicyFactory implements AbstractFactory<Double, Policy> {

	@Override
	public Policy create(Double validator) {
		if (validator != null)
			return new PolicyMotor();
		return new PolicyHouseHold();
	}

}
