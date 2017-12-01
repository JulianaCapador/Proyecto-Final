package FabricaAbstracta;

public class FabricaElectrolux implements Productos{

	@Override
	public Lavadora crearLavadora() {
		return new LavadoraElectrolux();
	}

	@Override
	public Microondas crearMicroondas() {	
		return new MicroondasElectrolux();
	}

	@Override
	public Nevera crearNevera() {
		return new NeveraElectrolux();
	}

}
