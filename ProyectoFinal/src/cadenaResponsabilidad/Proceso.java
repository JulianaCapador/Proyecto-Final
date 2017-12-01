package cadenaResponsabilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Proceso {

	int opcion = 0;
	//Gerente gerencia = new Gerente();
	Nomina recursos = new Nomina();
	Compra comercial = new Compra(recursos);
	
	public Proceso(int opcion){
		this.opcion = opcion;
	}
	
	
	public void operacion() throws NumberFormatException, IOException{	
		
			if(opcion != 0){
				comercial.realizarFuncion(opcion);
			}
	}
		
}
