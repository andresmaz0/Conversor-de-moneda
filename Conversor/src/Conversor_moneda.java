import javax.swing.JOptionPane;


public class Conversor_moneda {
	/* Esta clase se encarga de todo el calculo de las monedas
	la moneda que se utiliza en este codigo son dolares
	
	monedas y su equivalente a dolar
	
	peso_col = 4157.98;
	peso_mex = 17.07;
	Euro = 0.92;
	Libra_ester = 0.79;
	Yen = 144.67;
	Won = 1299.05;
	Yuan = 7.24;
	*/
	static String [] coin = {"Dolares","Pesos Colombianos","Pesos Mexicanos","Euros","Libras esterlinas","Yenes Japoneses","Wones Coreanos","Yuanes Chinos"}; 
	static double [] list_valores = {4157.98,17.07,0.79,0.92,144.67,1299.05,7.24};
	
	//constructor
	public Conversor_moneda() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la cantidad de dinero que se desea convertir:"));
		menu_conversor(valor);
	}
	
	public static void menu_conversor(double valor) {
		String [] menu = {"De Dolares a otras monedas","De otras monedas a Dolares"};
		String mensaje =  (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambios de divisa",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		if (mensaje == menu[0]) {
			dolar_to_other(valor);
		}
		else {
			other_to_dolar(valor);
		}
	}
	
	public static void other_to_dolar(double valor) {
		String opcion = "other_to_dolar";
		String [] menu = menu_monedas(opcion);
		String mensaje = (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambios de divisa",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		calculos(valor,mensaje,opcion);
	}
	
	public static void dolar_to_other(double valor) {
		String opcion = "dolar_to_other";
		String [] menu = menu_monedas(opcion);
		String mensaje = (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambios de divisa",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		calculos(valor,mensaje,opcion);
	}
	
	public static String[] menu_monedas(String opcion) {
		
		if(opcion.equalsIgnoreCase("dolar_to_other")) {
			//inicializando menu
			String [] menu = new String[7];
			
			//llenando mi vector menu
			for (int i = 0 ; i < menu.length; i++) {
				menu[i]=("De "+coin[0]+" a "+coin[i+1]);
			}
			//retorno una cadena de strings
			return menu;
		} else {
			//inicializando menu
			String [] menu = new String[7];
			
			//llenando mi vector menu
			for (int i = 0 ; i < menu.length; i++) {
				menu[i]=("De "+coin[i+1]+" a "+coin[0]);
			}
			//retorno una cadena de strings
			return menu;
		}
	}
	
	public static void calculos(double valor_ingresado,String mensaje,String opcion) {
		if (opcion.equalsIgnoreCase("dolar_to_other")) {
			for (int i = 0; i < list_valores.length; i++) {
				if(mensaje.equalsIgnoreCase("De "+coin[0]+" a "+coin[i+1])) {
					double redondeo = Math.round(valor_ingresado * list_valores[i]*100)/100d;
					JOptionPane.showMessageDialog(null, "El resultado fue " + (redondeo) +" "+ coin[i+1]);
				}
			}
		} else {
			for (int i = 0; i < list_valores.length; i++) {
				if(mensaje.equalsIgnoreCase("De "+coin[i+1]+" a "+coin[0])) {
					double redondeo = Math.round(valor_ingresado * 1/list_valores[i] *100)/100d;
					JOptionPane.showMessageDialog(null, "El resultado fue " + (redondeo) +" "+ coin[0]);
				}
			}
		}
	}
}
