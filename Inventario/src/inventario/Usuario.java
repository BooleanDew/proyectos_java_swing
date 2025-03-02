package inventario;

import java.sql.*;

public class Usuario {

    private String nombre;
    private String apellido;
    private String clave;
    private int estado;
    private Conexion c = new Conexion();

    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String clave, int estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        this.estado = estado;
    }

    public int setCrear() {
        Connection con = c.getConexion();
        try {

            String sql = "INSERT INTO usuarios(nombre,apellido,clave,estado) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, this.nombre);
            ps.setString(2, this.apellido);
            ps.setString(3, this.clave);
            ps.setInt(4, this.estado);
            int ok = ps.executeUpdate();
            return ok;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            con = null;
        }
        return 0;
    }

    public String setLogin(String nombre, String clave) {
        try {
            Connection con = c.getConexion();
            String sql = "SELECT * FROM usuarios WHERE nombre = ? AND clave = ?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, nombre);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString("nombre");

            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return "";
    }

    public String getLogin() {
        return this.nombre;
    }

}
