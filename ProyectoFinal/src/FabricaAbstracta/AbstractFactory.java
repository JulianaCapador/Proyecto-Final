package FabricaAbstracta;

import javax.swing.JOptionPane;

public class AbstractFactory {

	//Creacion de Objetos
	Productos productos;
	Lavadora lavadora;
	Microondas micro;
	Nevera nevera;
	int opcion2= 0;
		
	public AbstractFactory(int opcion2){
		this.opcion2 = opcion2;
	}
	 
	public void operacion(){
		
		switch(opcion2){
			
			case 1:
			     productos = new FabricaWhirpool();
				
				break;
			
			case 2:
				
				productos = new FabricaElectrolux();
				break;
			}
			
		lavadora = productos.crearLavadora();
		micro = productos.crearMicroondas();
		nevera = productos.crearNevera();
		
		JOptionPane.showMessageDialog(null, lavadora.operacion());
		JOptionPane.showMessageDialog(null, micro.operacion());
		JOptionPane.showMessageDialog(null, nevera.operacion());
	}	
	
}
