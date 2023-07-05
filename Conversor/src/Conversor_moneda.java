import javax.swing.JOptionPane;

public class Conversor_moneda {
	//Esta clase se encarga de todo el calculo de las monedas
	//la moneda que se utiliza en este codigo son dolares
	
	//monedas y su equivalente a dolar
	static double peso_col = 4157.98;
	static double peso_mex = 17.07;
	static double euro = 0.92;
	static double libra_ester = 0.79;
	static double yen = 144.67;
	static double won = 1299.05;
	static double yuan = 7.24;
	static String [] monedas = {"Dolar","Peso Colombiano","Peso Mexicano","Euro","Libra esterlina","Yen Japones","Won Coreano","Yuan Chino"}; 
	
	//constructor
	public Conversor_moneda() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero que se desea convertir:"));
		menu_conversor();
	}
	
	public static Object menu_conversor() {
		String [] menu = {"De Dolares a otras monedas","De otras monedas a Dolares"};
		Object mensaje =  JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambios de divisa",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		return mensaje;
	}
}
