package Controller;

import Model.Clientes;
import Model.ClientesDao;
import Model.Tables;
import Model.Clientes;
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

public class ClientesController implements ActionListener, MouseListener, KeyListener{
    private Clientes cl;
    private ClientesDao clDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public ClientesController(Clientes cl, ClientesDao clDao, PanelAdmin views) {
        this.cl = cl;
        this.clDao = clDao;
        this.views = views;
        
        this.views.btnRegistrarCliente.addActionListener(this);
        this.views.btnModificarCliente.addActionListener(this);
        this.views.btnNuevoCliente.addActionListener(this);
        
        this.views.jMenuEliminarCliente.addActionListener(this);
        this.views.jMenuReingresarCliente.addActionListener(this);
        
        this.views.jTableClientes.addMouseListener(this);
        
        this.views.txtBuscarCliente.addKeyListener(this);
        
        this.views.jLabelClientes.addMouseListener(this);
        
        listarClientes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCliente) { //si se presiono en registrar cliente
            if (views.txtNombreCliente.getText().equals("") ||
                views.txtTelefonoCliente.getText().equals("") ||
                views.txtDireccionCliente.getText().equals("") ) {
                
                  JOptionPane.showMessageDialog(null, "Campos incompletos");
            }else{
                cl.setNombre(views.txtNombreCliente.getText());
                cl.setTelefono(views.txtTelefonoCliente.getText());
                cl.setDireccion(views.txtDireccionCliente.getText());
                
                if (clDao.registrar(cl)) {
                    limpiarTable();
                    listarClientes();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente registrado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al registrar cliente");
                }
                
            }
        }else
   if (e.getSource() == views.btnModificarCliente) { //si se presiono en modificar cliente
            if (views.txtIdCliente.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtNombreCliente.getText().equals("")
                        || views.txtTelefonoCliente.getText().equals("")
                        || views.txtDireccionCliente.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Campos incompletos");
                } else {
                    cl.setNombre(views.txtNombreCliente.getText());
                    cl.setTelefono(views.txtTelefonoCliente.getText());
                    cl.setDireccion(views.txtDireccionCliente.getText());
                    
                    cl.setId(Integer.parseInt(views.txtIdCliente.getText()));

                    if (clDao.modificar(cl)) {
                         limpiarTable();
                         listarClientes();
                         limpiar();
                        JOptionPane.showMessageDialog(null, "Cliente modificado");
                    } else {
                        JOptionPane.showMessageDialog(null, "error al modificar cliente");
                    }

                }

            }
        }else
       if (e.getSource() == views.jMenuEliminarCliente) { //si se presiono en eliminar cliente
            if (views.txtIdCliente.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdCliente.getText());
                if (clDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarClientes();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar Cliente");
                }
           }
        }else
           if (e.getSource() == views.jMenuReingresarCliente) { //si se presiono en modificar cliente
            if (views.txtIdCliente.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdCliente.getText());
                if (clDao.accion("activo", id)) {
                     limpiarTable();
                     listarClientes();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente Reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar Cliente");
                }
           }
        }else{
               limpiar();
           }
    }
    
    public void listarClientes(){
        Tables color = new Tables();
        views.jTableClientes.setDefaultRenderer(views.jTableClientes.getColumnClass(0), color);
        
        List<Clientes> lista = clDao.listaClientes(views.txtBuscarCliente.getText());
        modelo = (DefaultTableModel) views.jTableClientes.getModel();
        Object[] ob = new Object[5];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getNombre();
           ob[2] = lista.get(i).getTelefono();
           ob[3] = lista.get(i).getDireccion();
           ob[4] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTableClientes.setModel(modelo);
        
        JTableHeader header = views.jTableClientes.getTableHeader();
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
        if (e.getSource() == views.jTableClientes) { //para mostrar datos en form al seleccionar un cliente en la tabla
            int fila = views.jTableClientes.rowAtPoint(e.getPoint());
            
            views.txtIdCliente.setText(views.jTableClientes.getValueAt(fila, 0).toString());
            views.txtNombreCliente.setText(views.jTableClientes.getValueAt(fila, 1).toString());
            views.txtTelefonoCliente.setText(views.jTableClientes.getValueAt(fila, 2).toString());
            views.txtDireccionCliente.setText(views.jTableClientes.getValueAt(fila, 3).toString());
            
             views.txtIdCliente.setEnabled(false); //deshabilitar field id
             views.btnRegistrarCliente.setEnabled(false); //deshabilitar boton registrar
             
        }else if(e.getSource() == views.jLabelClientes){ //se selecciono la opcion clientes en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(1);
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
        views.txtNombreCliente.setText("");
        views.txtTelefonoCliente.setText("");
        views.txtDireccionCliente.setText("");
        views.txtIdCliente.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarCliente) {
            limpiarTable();
            listarClientes();
        } else {
        }
    }
    
    
}
