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
			System.out.println(seleccion);
			if(seleccion.equalsIgnoreCase("Moneda")) {
				Conversor_moneda divisa = new Conversor_moneda();
				regresar_a_inicio();
			}
		} catch(Exception NullPointerException){
			regresar_a_inicio();
		}
	}
	
	public static void regresar_a_inicio() {
		int continuar = JOptionPane.showConfirmDialog(null,"Desea volver al menu de inicio?","Continuar",JOptionPane.YES_NO_OPTION);
		// 0--yes  1---No
		if (continuar==0) {
			inicio();
		} else {
			JOptionPane.showMessageDialog(null, "Gracias por usar la app vuelve pronto ;)");
		}
	}
	
	public static void main(String[] args) {
		inicio();
	}
}
