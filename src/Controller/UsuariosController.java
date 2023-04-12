package Controller;

import Model.Tables;
import Model.Usuarios;
import Model.UsuariosDao;
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

public class UsuariosController implements ActionListener, MouseListener, KeyListener{
    private Usuarios us;
    private UsuariosDao usDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    

    public UsuariosController(Usuarios us, UsuariosDao usDao, PanelAdmin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnRegistrarUsuario.addActionListener(this);
        this.views.btnModificarUsuario.addActionListener(this);
        this.views.btnNuevoUsuario.addActionListener(this);
        
        this.views.jMenuEliminarUser.addActionListener(this);
        this.views.jMenuReingresarUser.addActionListener(this);
        
        this.views.jTableUsuarios.addMouseListener(this);
        
        this.views.txtBuscarUser.addKeyListener(this);
        
        this.views.jLabelUsuarios.addMouseListener(this);
        
        listarUsuarios();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarUsuario) { //si se presiona el boton registrar
            if (views.txtUsuario.getText().equals("")
                    || views.txtNombreUsuario.getText().equals("")
                    || String.valueOf(views.txtClaveUsuario.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campos incompletos");
            } else {

                us.setUsuario(views.txtUsuario.getText());
                us.setNombre(views.txtNombreUsuario.getText());
                us.setClave(String.valueOf(views.txtClaveUsuario.getPassword()));
                us.setCaja(views.jComboCajaUsuario.getSelectedItem().toString());
                us.setRol(views.jComboRolUsuario.getSelectedItem().toString());

                if (usDao.registrar(us)) { //registrar usuario
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al regitrar usuario");
                }
            }
        } else if (e.getSource() == views.btnModificarUsuario) { //si se presiona el boton modificar
            if (views.txtUsuario.getText().equals("")
                    || views.txtNombreUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos incompletos");
            } else {

                us.setUsuario(views.txtUsuario.getText());
                us.setNombre(views.txtNombreUsuario.getText());
                us.setCaja(views.jComboCajaUsuario.getSelectedItem().toString());
                us.setRol(views.jComboRolUsuario.getSelectedItem().toString());
                us.setId(Integer.parseInt(views.txtIdUser.getText()));

                if (usDao.modificar(us)) { //modificar usuario
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario modificado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifiar usuario");
                }
            }
        } else if (e.getSource() == views.jMenuEliminarUser) {//si se presiona el boton eliminar
            if (views.txtIdUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una Fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdUser.getText());
                if (usDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarUsuarios();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar Usuario");
                }

            }
        }else if (e.getSource() == views.jMenuReingresarUser) {//si se presiono reingresar usuario
            if (views.txtIdUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una Fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdUser.getText());
                
                if (usDao.accion("activo", id)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar");
                }

            }
        }else{
            limpiar();
        }

    }
    
    public void listarUsuarios(){
        Tables color = new Tables();
        views.jTableUsuarios.setDefaultRenderer(views.jTableUsuarios.getColumnClass(0), color);
        
        List<Usuarios> lista = usDao.listaUsuarios(views.txtBuscarUser.getText());
        modelo = (DefaultTableModel) views.jTableUsuarios.getModel();
        Object[] ob = new Object[6];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getUsuario();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getCaja();
           ob[4] = lista.get(i).getRol();
           ob[5] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTableUsuarios.setModel(modelo);
        
        JTableHeader header = views.jTableUsuarios.getTableHeader();
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
        if (e.getSource() == views.jTableUsuarios) { //para mostrar datos en form al seleccioanr un usuario en la tabla
            int fila = views.jTableUsuarios.rowAtPoint(e.getPoint());
            views.txtIdUser.setText(views.jTableUsuarios.getValueAt(fila, 0).toString());
            views.txtUsuario.setText(views.jTableUsuarios.getValueAt(fila, 1).toString());
            views.txtNombreUsuario.setText(views.jTableUsuarios.getValueAt(fila, 2).toString());
            views.jComboCajaUsuario.setSelectedItem(views.jTableUsuarios.getValueAt(fila, 3).toString());
            views.jComboRolUsuario.setSelectedItem(views.jTableUsuarios.getValueAt(fila, 4).toString());
            
            views.txtClaveUsuario.setEnabled(false); //deshabilitar field contraseña
             views.txtIdUser.setEnabled(false); //deshabilitar field id
            views.btnRegistrarUsuario.setEnabled(false); //deshabilitar boton registrar
            
        }else if(e.getSource() == views.jLabelUsuarios){ //se selecciono la opcion usuarios en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(3);
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

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarUser) {
            limpiarTable();
            listarUsuarios();
        } else {
        }
    }
    
    private void limpiar(){
        views.txtUsuario.setText("");
        views.txtNombreUsuario.setText("");
        views.txtClaveUsuario.setText("");
        
        views.txtIdUser.setText("");
        views.txtClaveUsuario.setEnabled(true);
    }
    
    
}
