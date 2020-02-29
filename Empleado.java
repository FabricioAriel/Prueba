import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Empleado {
		private int codEmp;
		private String Nombre;
		private Double salBasico;
		private int ant;
		public Empleado(int codEmp, String nombre, Double salBasico, int ant) {
			super();
			this.codEmp = codEmp;
			Nombre = nombre;
			this.salBasico = salBasico;
			this.ant = ant;
		}
		public int getCodEmp() {
			return codEmp;
		}
		public String getNombre() {
			return Nombre;
		}
		public Double getSalBasico() {
			return salBasico;
		}
		public int getAnt() {
			return ant;
		}
		public void agregar() {
			try {
				String sql="INSERT INTO Salario VALUES("+getCodEmp()+",'"+getNombre()+"',"+getSalBasico()+","+getAnt()+")";
				Conexion con = new Conexion();
				Connection c=(Connection) con.getConexion();
				Statement mst= c.createStatement();
				mst.executeUpdate(sql);
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
