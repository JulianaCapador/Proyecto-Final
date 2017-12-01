package Strategy;

import javax.swing.JOptionPane;

public class Termino implements strategyNomina {
	
	double salario=0; 
	double auxiliotrans=180000;
	double total=0;
	
	
	
	public double getAuxiliotrans() {
		return auxiliotrans;
	}

	public void setAuxiliotrans(double auxiliotrans) {
		this.auxiliotrans = auxiliotrans;
	}

	public Termino(){
		this.salario = salario;
	}
	
	public double pedir(){
		salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de Salario"));
		return salario;		
	}
	
	@Override
	public double calcular() {
		JOptionPane.showMessageDialog(null, "EL SALARIO ES DE: $ "+salario+" MCTE");
		total=(salario+auxiliotrans);
		return total;
		
	}

}
