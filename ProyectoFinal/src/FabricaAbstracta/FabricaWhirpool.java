package FabricaAbstracta;

public class FabricaWhirpool implements Productos {

	@Override
	public Lavadora crearLavadora() {
		return new LavadoraWhirlpool();
	}

	@Override
	public Microondas crearMicroondas() {
		return new MicroondasWhirlpool();
	}

	@Override
	public Nevera crearNevera() {
		return new NeveraWhirlpool();
	}

}
