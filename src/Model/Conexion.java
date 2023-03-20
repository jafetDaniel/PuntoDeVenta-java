package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Conexion {
    Connection con;
    
    public Connection getConexion(){
        try {
            String db = "jdbc:mysql://localhost:3306/puntodeventa";
            con = DriverManager.getConnection(db, "root", "");
            return con;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return null;
    }
}
