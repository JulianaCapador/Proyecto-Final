package Strategy;

import javax.swing.JOptionPane;

public class Prestacion implements strategyNomina{

	double salario=0; 
	double comisiones=0;
	double total=0;
	
	public Prestacion(){
		
	}
	
	
	public double getComisiones() {
		return comisiones;
	}


	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}


	@Override
	public double calcular() {
		
		total=salario+comisiones;
		
		
		return total;
	}

	@Override
	public double pedir() {
		salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
		comisiones = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las comisiones"));
		return salario;
		
	}
	

}
