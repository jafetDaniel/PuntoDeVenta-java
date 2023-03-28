package Controller;

import Model.Usuarios;
import Model.UsuariosDao;
import View.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuariosController implements ActionListener, MouseListener{
    private Usuarios us;
    private UsuariosDao usDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    

    public UsuariosController(Usuarios us, UsuariosDao usDao, PanelAdmin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnRegistrarUsuario.addActionListener(this);
        this.views.jTableUsuarios.addMouseListener(this);
        listarUsuarios();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarUsuario) {
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
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al regitrar usuario");
                }
            }
        }
    }
    
    public void listarUsuarios(){
        List<Usuarios> lista = usDao.listausuarios();
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
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == views.jTableUsuarios) { //para mmostrar datos en form al seleccioanr un usuario en la tabla
            int fila = views.jTableUsuarios.rowAtPoint(e.getPoint());
            views.txtIdUser.setText(views.jTableUsuarios.getValueAt(fila, 0).toString());
            views.txtUsuario.setText(views.jTableUsuarios.getValueAt(fila, 1).toString());
            views.txtNombreUsuario.setText(views.jTableUsuarios.getValueAt(fila, 2).toString());
            views.jComboCajaUsuario.setSelectedItem(views.jTableUsuarios.getValueAt(fila, 3).toString());
            views.jComboRolUsuario.setSelectedItem(views.jTableUsuarios.getValueAt(fila, 4).toString());
            
            views.txtClaveUsuario.setEnabled(false); //deshabilitar field contraseña
            views.btnRegistrarUsuario.setEnabled(false); //deshabilitar boton registrar
        } else {
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
    
    
}
