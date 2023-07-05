import javax.swing.JOptionPane;

public class Main {
	
	public static String inicio() {
		//Creando menu desplegable
		String [] menu = {"Moneda","Temperatura"};
		String seleccion = (String) JOptionPane.showInputDialog(null,"Selecciona un conversor","Conversores",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		return seleccion;
	}
	
	public static void main(String[] args) {
		String seleccion = inicio();
		//Entrada de variables
		if(seleccion.equalsIgnoreCase("Moneda")) {
			Conversor_moneda divisa = new Conversor_moneda();
			
		}
	}
}
