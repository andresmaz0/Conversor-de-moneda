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
	static double [] valores_monedas = {4157.98,17.07,0.79,0.92,144.67,1299.05,7.24};
	static String [] temperatura = {"Celsius(C)","Fahrenheit(F)","Kelvin(K)","Reaumur(R)","Rankine"};
	static double [] valores_temp = {33.8,274.15,0.8,493.47};
	static Object [] text_conversores = {coin,temperatura};
	static Object [] valores_conversores = {valores_monedas,valores_temp};
	
	//constructor
	public Conversor_moneda(String tipo_conversor) {
		entrada_datos(tipo_conversor);
	}
	
	public static void entrada_datos(String tipo_conversor) {
		try{
			if(tipo_conversor.equalsIgnoreCase("Moneda")){
				double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que desea convertir:"));
				verificacion_valor(valor,tipo_conversor);
			}
			if(tipo_conversor.equalsIgnoreCase("Temperatura")) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el valor en grados que desea convertir:"));
				verificacion_valor(valor,tipo_conversor);
			}
		}catch(Exception exception) {
			JOptionPane.showMessageDialog(null, "Error Ingresa por favor solo numeros");
			entrada_datos(tipo_conversor);
		}
	}
	
	//Verificacion de entrada de valores positivos
	public static void verificacion_valor(double valor_a_verificar,String tipo_conversor) {
		if(valor_a_verificar>0) {
			menu_conversor(valor_a_verificar,tipo_conversor);
		}else {
			JOptionPane.showMessageDialog(null, "Error Ingresa por favor numeros mayores a 0");
			entrada_datos(tipo_conversor);
	}
	}
	
	public static void menu_conversor(double valor,String tipo_conversor) {
		if(tipo_conversor.equalsIgnoreCase("Moneda")) {
			String [] menu = {"De Dolares a otras monedas","De otras monedas a Dolares"};
			String mensaje =  (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambios de divisa",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
			if (mensaje == menu[0]) {
				menu_de_cambio(valor,"dolar_to_other",tipo_conversor);
			}
			else {
				menu_de_cambio(valor,"other_to_dolar",tipo_conversor);
			}
		}
		if(tipo_conversor.equalsIgnoreCase("Temperatura")) {
			String [] menu = {"De Celsius a otras unidades de medida","De otras unidades de medida a Celsius"};
			String mensaje =  (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Cambio de unidad de medida",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
			if (mensaje == menu[0]) {
				menu_de_cambio(valor,"celsius_to_other",tipo_conversor);
			}
			else {
				menu_de_cambio(valor,"other_to_celsius",tipo_conversor);
			}
		}
	}
	
	public static void menu_de_cambio(double valor,String opcion,String tipo_conversor) {
		String [] menu = menu_de_calculos(opcion,tipo_conversor);
		String mensaje = (String) JOptionPane.showInputDialog(null,"Selecciona la operación que deseas realizar","Seleccion de calculo a realizar",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		calculos(valor,mensaje,opcion);
	}
	
	public static String[] menu_de_calculos(String opcion,String tipo_conversor) {
		//inicializando menu
		if(tipo_conversor.equalsIgnoreCase("Moneda")) {
			String [] menu = new String[7];
			
			return menu = creador_menu(opcion,tipo_conversor,menu);
		}
		else{
			String [] menu = new String[4];
			
			return menu = creador_menu(opcion,tipo_conversor,menu);
		}
	}
	
	public static String[] creador_menu(String opcion,String tipo_conversor,String[] menu) {
		String [] vector_texto;
		String verificar;
		if(tipo_conversor.equalsIgnoreCase("Moneda")) {
			vector_texto = coin;
			verificar = "dolar_to_other";
		}
		else {
			vector_texto = temperatura;
			verificar = "celsius_to_other";
		}
		if(opcion.equalsIgnoreCase(verificar)) {
			//llenando mi vector menu
			for (int i = 0 ; i < menu.length; i++) {
				menu[i]=("De "+vector_texto[0]+" a "+vector_texto[i+1]);
			}
		} else {
			//llenando mi vector menu
			for (int i = 0 ; i < menu.length; i++) {
				menu[i]=("De "+vector_texto[i+1]+" a "+vector_texto[0]);
			}
		}
		//retorno una cadena de strings
		return menu;
	}
	
	public static void calculos(double valor_ingresado,String mensaje,String opcion) {
		if (opcion.equalsIgnoreCase("dolar_to_other")) {
			for (int i = 0; i < valores_monedas.length; i++) {
				if(mensaje.equalsIgnoreCase("De "+coin[0]+" a "+coin[i+1])) {
					double redondeo = Math.round(valor_ingresado * valores_monedas[i]*100)/100d;
					JOptionPane.showMessageDialog(null, "El resultado fue " + (redondeo) +"$ "+ coin[i+1]);
				}
			}
		} else {
			for (int i = 0; i < valores_monedas.length; i++) {
				if(mensaje.equalsIgnoreCase("De "+coin[i+1]+" a "+coin[0])) {
					double redondeo = Math.round(valor_ingresado * 1/valores_monedas[i] *100)/100d;
					JOptionPane.showMessageDialog(null, "El resultado fue " + (redondeo) +"$ "+ coin[0]);
				}
			}
		}
	}
}
