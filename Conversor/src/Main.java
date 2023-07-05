import javax.swing.JOptionPane;

public class Main {
	
	public static void inicio() {
		//Creando menu desplegable
		String [] menu = {"Moneda","Temperatura"};
		String seleccion = (String) JOptionPane.showInputDialog(null,"Selecciona un conversor","Menu de inicio",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		
		if(seleccion.equalsIgnoreCase("Moneda")) {
			Conversor_moneda divisa = new Conversor_moneda();
			regresar_a_inicio();
		}
	}
	
	public static void regresar_a_inicio() {
		String [] menu = {"Si","No"};
		String continuar = (String) JOptionPane.showInputDialog(null,"Desea volver al menu de inicio?","Continuar",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		if (continuar.equalsIgnoreCase("Si")) {
			inicio();
		} else {
			JOptionPane.showMessageDialog(null, "Gracias por usar la app vuelve pronto ;)");
		}
	}
	
	public static void main(String[] args) {
		inicio();
	}
}
