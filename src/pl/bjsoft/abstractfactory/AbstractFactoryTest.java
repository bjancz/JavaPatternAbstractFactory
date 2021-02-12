package pl.bjsoft.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory("Claim");

		Object object = factory.create(Double.valueOf("200"));

		Object object2 = factory.create(Double.valueOf("2"));
		
		System.out.println(object.getClass().getName());
		System.out.println(object2.getClass().getName());
	}
}
