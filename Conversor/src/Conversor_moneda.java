import javax.swing.JOptionPane;

public class Conversor_moneda {
	//Esta clase se encarga de todo el calculo de las monedas
	//la moneda que se utiliza en este codigo son dolares
	
	//monedas y su equivalente a dolar
	double peso_col = 4157.98;
	double peso_mex = 17.07;
	double euro = 0.92;
	double libra_ester = 0.79;
	double yen = 144.67;
	double won = 1299.05;
	double yuan = 7.24;
	
	//constructor
	public Conversor_moneda() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero que se desea convertir:"));
		System.out.println(valor+22);
	}
}
