package cadenaResponsabilidad;

import gui.AreaComercial;

public class Compra implements Funciones{

	private final int tipoFuncion = 2;
	private Funciones sucesor;
	
	AreaComercial comercial = new AreaComercial();
	public Compra(Funciones s){
		this.sucesor = s;	
	}


	@Override
	public void realizarFuncion(int funcion) {
		if(funcion == tipoFuncion){
			comercial.setVisible(true);
		}else{
			sucesor.realizarFuncion(funcion);
		}
		
	}
}
