package Controller;

import Model.Combo;
import Model.Proveedores;
import Model.ProveedoresDao;
import Model.Tables;
import View.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ProveedoresController implements ActionListener, MouseListener, KeyListener{
    private Proveedores prov;
    private ProveedoresDao provDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ProveedoresController(Proveedores prov, ProveedoresDao provDao, PanelAdmin views) {
        this.prov = prov;
        this.provDao = provDao;
        this.views = views;
        
        this.views.btnRegistrarProveedor.addActionListener(this);
        this.views.btnModificarProveedor.addActionListener(this);
        this.views.btnNuevoProveedor.addActionListener(this);
        
        this.views.jMenuEliminarProveedor.addActionListener(this);
        this.views.jMenuReingresarProveedor.addActionListener(this);
        
        this.views.jTableProveedores.addMouseListener(this);
        
        this.views.txtBuscarProveedor.addKeyListener(this);
        
        this.views.jLabelProveedores.addMouseListener(this);
        
        llenarProveedor();
        llenarProveedorNC();
        AutoCompleteDecorator.decorate(views.jComboProveedorPro);
        AutoCompleteDecorator.decorate(views.jComboProveederNC);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarProveedor) { //si se presiono en registrar Proveedor
            if (views.txtRucProveedor.getText().equals("") ||
                views.txtNombreProveedor.getText().equals("") ||
                views.txtTelefonoProveedor.getText().equals("") ||
                views.txtDireccionProveedor.getText().equals("") ) {
                
                  JOptionPane.showMessageDialog(null, "Campos incompletos");
            }else{
                prov.setRuc(views.txtRucProveedor.getText());
                prov.setNombre(views.txtNombreProveedor.getText());
                prov.setTelefono(views.txtTelefonoProveedor.getText());
                prov.setDireccion(views.txtDireccionProveedor.getText());
                
                if (provDao.registrar(prov)) {
                    limpiarTable();
                    listarProveedores();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor registrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar proveedor");
                }
                
            }
        }else
   if (e.getSource() == views.btnModificarProveedor) { //si se presiono en modificar Proveedor
            if (views.txtIdProveedor.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtRucProveedor.getText().equals("")
                        || views.txtNombreProveedor.getText().equals("")
                        || views.txtTelefonoProveedor.getText().equals("")
                        || views.txtDireccionProveedor.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Campos incompletos");
                } else {
                    prov.setRuc(views.txtRucProveedor.getText());
                    prov.setNombre(views.txtNombreProveedor.getText());
                    prov.setTelefono(views.txtTelefonoProveedor.getText());
                    prov.setDireccion(views.txtDireccionProveedor.getText());
                    
                    prov.setId(Integer.parseInt(views.txtIdProveedor.getText()));

                    if (provDao.modificar(prov)) {
                         limpiarTable();
                         listarProveedores();
                         limpiar();
                        JOptionPane.showMessageDialog(null, "Proveedor modificado");
                    } else {
                        JOptionPane.showMessageDialog(null, "error al modificar proveedor");
                    }

                }

            }
        }else
       if (e.getSource() == views.jMenuEliminarProveedor) { //si se presiono en eliminar Proveedor
            if (views.txtIdProveedor.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdProveedor.getText());
                if (provDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarProveedores();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar proveedor");
                }
           }
        }else
           if (e.getSource() == views.jMenuReingresarProveedor) { //si se presiono en modificar Proveedor
            if (views.txtIdProveedor.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdProveedor.getText());
                if (provDao.accion("activo", id)) {
                     limpiarTable();
                     listarProveedores();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Proveedor reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar proveedor");
                }
           }
        }else{
               limpiar();
           }
    }
    
    public void listarProveedores(){
        Tables color = new Tables();
        views.jTableProveedores.setDefaultRenderer(views.jTableProveedores.getColumnClass(0), color);
        
        List<Proveedores> lista = provDao.listaProveedores(views.txtBuscarProveedor.getText());
        modelo = (DefaultTableModel) views.jTableProveedores.getModel();
        Object[] ob = new Object[6];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getRuc();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getTelefono();
           ob[4] = lista.get(i).getDireccion();
           ob[5] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTableProveedores.setModel(modelo);
        
        JTableHeader header = views.jTableProveedores.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
        
    }
    
    public void limpiarTable(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jTableProveedores) { //para mostrar datos en form al seleccionar un PROVEEDOR en la tabla
            int fila = views.jTableProveedores.rowAtPoint(e.getPoint());
            
            views.txtIdProveedor.setText(views.jTableProveedores.getValueAt(fila, 0).toString());
            views.txtRucProveedor.setText(views.jTableProveedores.getValueAt(fila, 1).toString());
            views.txtNombreProveedor.setText(views.jTableProveedores.getValueAt(fila, 2).toString());
            views.txtTelefonoProveedor.setText(views.jTableProveedores.getValueAt(fila, 3).toString());
            views.txtDireccionProveedor.setText(views.jTableProveedores.getValueAt(fila, 4).toString());
            
             views.txtIdProveedor.setEnabled(false); //deshabilitar field id
             views.btnRegistrarProveedor.setEnabled(false); //deshabilitar boton registrar
             
        }else if(e.getSource() == views.jLabelProveedores){ //se selecciono la opcion Proveedores en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(2);
             limpiarTable();
             listarProveedores();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    private void limpiar(){
        views.txtRucProveedor.setText("");
        views.txtNombreProveedor.setText("");
        views.txtTelefonoProveedor.setText("");
        views.txtDireccionProveedor.setText("");
        views.txtIdProveedor.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarProveedor) {
            limpiarTable();
            listarProveedores();
        } else {
        }
    }
    
    private void llenarProveedor(){
        List<Proveedores> lista = provDao.listaProveedores(views.txtBuscarProveedor.getText());
       
        for (int i = 0; i < lista.size(); i++) {
           int id = lista.get(i).getId();
           String nombre = lista.get(i).getNombre();
           views.jComboProveedorPro.addItem(new Combo(id, nombre));          
        }  
    }
    
    private void llenarProveedorNC(){
        List<Proveedores> lista = provDao.listaProveedores(views.txtBuscarProveedor.getText());
       
        for (int i = 0; i < lista.size(); i++) {
           int id = lista.get(i).getId();
           String nombre = lista.get(i).getNombre();
           views.jComboProveederNC.addItem(new Combo(id, nombre));          
        }  
    }
    
    
}
