package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuariosDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuarios login(String usuario, String clave){
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND clave = ?"; //consulta
        Usuarios us = new Usuarios();
        
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql); //guardar consulta en variable
            
            ps.setString(1, usuario); //pasando el usuario a consulta
            ps.setString(2, clave); //pasando contrasenmia a consulta
            rs = ps.executeQuery(); //ejecutar consulta
            
            if (rs.next()) { //obteenr registro de consulta
                us.setId(rs.getInt("id"));
                us.setUsuario(rs.getString("usuario"));
                us.setNombre(rs.getString("nombre"));
                us.setCaja(rs.getString("caja"));
                us.setRol(rs.getString("rol"));
                us.setEstado(rs.getString("estado"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
    
    
}
