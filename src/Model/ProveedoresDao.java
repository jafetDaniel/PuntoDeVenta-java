package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedoresDao {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrar(Proveedores prov){
       String sql ="INSERT INTO proveedores (ruc, nombre, telefono, direccion) VALUES(?,?,?,?)";
       
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setString(1, prov.getRuc());
            ps.setString(2, prov.getNombre());
            ps.setString(3, prov.getTelefono());
            ps.setString(4, prov.getDireccion());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    
    public List listaProveedores(String valor){
        List<Proveedores> listaProv = new ArrayList();
        String sql = "SELECT * FROM proveedores ORDER BY estado ASC";
        String buscar = "SELECT * FROM proveedores WHERE nombre LIKE '%"+valor+"%' OR telefono LIKE '%"+valor+"%'";
        
        try {
            con = cn.getConexion();
            
            if (valor.equalsIgnoreCase("")) {
                 ps = con.prepareStatement(sql);
                 rs = ps.executeQuery();
            }else{
                 ps = con.prepareStatement(buscar);
                 rs = ps.executeQuery();
            }
           
            
            while (rs.next()) {
                Proveedores prov = new Proveedores();
                prov.setId(rs.getInt("id"));
                prov.setRuc(rs.getString("ruc"));
                prov.setNombre(rs.getString("nombre"));
                prov.setTelefono(rs.getString("telefono"));
                prov.setDireccion(rs.getString("direccion"));
                prov.setEstado(rs.getString("estado"));             
                listaProv.add(prov);  
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaProv;
    }
    
    public boolean modificar (Proveedores prov){
       String sql ="UPDATE proveedores SET ruc = ?, nombre = ?, telefono = ?, direccion = ? WHERE id = ?";
       
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, prov.getRuc());
            ps.setString(2, prov.getNombre());
            ps.setString(3, prov.getTelefono());
            ps.setString(4, prov.getDireccion());
            ps.setInt(5, prov.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean accion(String estado, int id){
        String sql = "UPDATE proveedores SET estado = ? WHERE id = ?";
        try {
             con = cn.getConexion();
             ps = con.prepareStatement(sql);
             
             ps.setString(1, estado);         
             ps.setInt(2, id);
             
             ps.execute();
             return true;
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
