import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	protected Connection con=null;

	public Connection getConexion() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empleado","root","");
		}
		catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos "+ex);
		}
		return con;
	}
}
