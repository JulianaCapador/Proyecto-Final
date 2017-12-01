package cadenaResponsabilidad;

import gui.RecursosHumanos;

public class Nomina implements Funciones {
	
	private final int tipoFuncion = 1;
	private Funciones sucesor;
	
	//Objeto de la ventana
	RecursosHumanos RH = new RecursosHumanos();
	
	
	public Nomina(){
		
	}


	@Override
	public void realizarFuncion(int funcion) {
		if(funcion == tipoFuncion){
			RH.setVisible(true);
		}else{
			sucesor.realizarFuncion(funcion);
		}
		
	}
}
