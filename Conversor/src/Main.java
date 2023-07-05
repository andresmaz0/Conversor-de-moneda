import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String mensaje;
		mensaje = JOptionPane.showInputDialog("Digite un mensaje");
		JOptionPane.showMessageDialog(null,"mensaje ingresado fue: " + mensaje);
	}
}
