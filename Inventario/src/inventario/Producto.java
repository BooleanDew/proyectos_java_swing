package inventario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class Producto {

    private String nombreProducto;
    private double precio;
    private String unidad;
    private String descripcion;
    private Conexion c = new Conexion();

    public Producto() {

    }

    public Producto(String nombreProducto, double precio, String unidad, String descripcion) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.unidad = unidad;
        this.descripcion = descripcion;
    }

    public int setCrear() {
        Connection con = c.getConexion();
        try {

            String sql = "INSERT INTO productos(nombre_producto,precio,unidad,descripcion) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, this.nombreProducto);
            ps.setDouble(2, this.precio);
            ps.setString(3, this.unidad);
            ps.setString(4, this.descripcion);
            int ok = ps.executeUpdate();
            return ok;

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            con = null;
        }
        return 0;
    }

    public Object[][] getProductos() {
        List<Object[]> productos = new ArrayList<>();
        try {
            Connection con = c.getConexion();
            String sql = "SELECT * FROM productos";
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getDouble(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                productos.add(fila);
            }
            return productos.toArray(new Object[productos.size()][5]);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new Object[0][0];
    }

    public Object[][] getBuscar(int id) {
        List<Object[]> productos = new ArrayList<>();
        try {
            Connection con = c.getConexion();
            String sql = "SELECT * FROM productos WHERE id=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getDouble(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);

                productos.add(fila);
            }
            return productos.toArray(new Object[productos.size()][5]);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return new Object[0][0];
    }
    
     public int getEliminar(int id) {
        List<Object[]> productos = new ArrayList<>();
        try {
            Connection con = c.getConexion();
            String sql = "DELETE FROM productos WHERE id=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            int ok = ps.executeUpdate();
            System.out.println("eliminado con exito");
           return ok;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }
     
       public String[] getEditar(int id) {
        String[] productos =new String[5];
        try {
            Connection con = c.getConexion();
            String sql = "SELECT * FROM productos WHERE id=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                productos[0] = String.valueOf(rs.getInt(1));
                productos[1] = rs.getString(2);
                productos[2] = String.valueOf(rs.getDouble(3));
                productos[3] = rs.getString(4);
                productos[4] = rs.getString(5);

            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return productos;
    }
       
       public int setEditar(int id,double precio, String descripcion){
           
              List<Object[]> productos = new ArrayList<>();
        try {
            Connection con = c.getConexion();
            String sql = "UPDATE productos SET precio=?,descripcion=? WHERE id=?";
            PreparedStatement ps = con.prepareCall(sql);
            ps.setDouble(1, precio);
            ps.setString(2, descripcion);
            ps.setInt(3, id);
            int ok = ps.executeUpdate();
           return ok;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
       }
}
