import javax.swing.JOptionPane;

/**
 *  Autor: Andres Mazo
 */

public class Main {
	
	public static void inicio() {
		//Creando menu desplegable
		String [] menu = {"Moneda","Temperatura"};
		try {
			String seleccion = (String) JOptionPane.showInputDialog(null,"Selecciona un conversor","Menu de inicio",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
			if(seleccion.equalsIgnoreCase("Moneda")) {
				Conversor_moneda divisa = new Conversor_moneda("Moneda");
			}
			if(seleccion.equalsIgnoreCase("Temperatura")){
				Conversor_moneda divisa = new Conversor_moneda("Temperatura");
			}
			regresar_a_inicio();
		} catch(Exception NullPointerException){
			mensaje_despedida();
		}
	}
	
	public static void regresar_a_inicio() {
		int continuar = JOptionPane.showConfirmDialog(null,"Desea volver al menu de inicio?","Continuar",JOptionPane.YES_NO_OPTION);
		// 0--yes  1---No
		if (continuar==0) {
			inicio();
		} else {
			mensaje_despedida();
		}
	}
	
	public static void mensaje_despedida() {
		JOptionPane.showMessageDialog(null, "Gracias por usar la app vuelve pronto ;)");
	}
	
	public static void main(String[] args) {
		inicio();
	}
}
