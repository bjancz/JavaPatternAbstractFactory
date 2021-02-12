package pl.bjsoft.abstractfactory;

import pl.bjsoft.claim.ClaimFactory;
import pl.bjsoft.policy.PolicyFactory;

public class FactoryProvider {

	public static AbstractFactory getFactory(String choice) {

		if ("Policy".equalsIgnoreCase(choice)) {
			return new PolicyFactory();
		} else if ("Claim".equalsIgnoreCase(choice)) {
			return new ClaimFactory();
		}

		return null;
	}

}
