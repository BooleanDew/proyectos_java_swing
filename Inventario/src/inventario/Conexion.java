
package inventario;
import java.sql.*;

public class Conexion {
    public Connection getConexion(){
       Connection con = null;
        try {
            String usuario = "root";
            String clave = "";
            String url = "jdbc:mysql://localhost:3306/inventario";
            con = DriverManager.getConnection(url, usuario,clave);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return con;
    }
}
