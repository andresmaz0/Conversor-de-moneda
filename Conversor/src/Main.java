import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		//Creando menu desplegable
		String [] menu = {"Moneda","Temperatura"};
		Object seleccion = JOptionPane.showInputDialog(null,"Selecciona un conversor","Conversores",JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
		JOptionPane.showMessageDialog(null, seleccion);
	}
}
