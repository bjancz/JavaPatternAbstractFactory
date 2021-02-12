package pl.bjsoft.abstractfactory;

public interface AbstractFactory <K, T>{
	
	T create (K validationRule);

}
