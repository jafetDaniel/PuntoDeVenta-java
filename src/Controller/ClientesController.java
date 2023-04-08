package Controller;

import Model.Clientes;
import Model.ClientesDao;
import View.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClientesController implements ActionListener{
    private Clientes cl;
    private ClientesDao clDao;
    private PanelAdmin views;

    public ClientesController(Clientes cl, ClientesDao clDao, PanelAdmin views) {
        this.cl = cl;
        this.clDao = clDao;
        this.views = views;
        
        this.views.btnRegistrarCliente.addActionListener(this);
        this.views.btnModificarCliente.addActionListener(this);
        this.views.btnNuevoCliente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCliente) {
            if (views.txtNombreCliente.getText().equals("") ||
                views.txtTelefonoCliente.getText().equals("") ||
                views.txtDireccionCliente.getText().equals("") ) {
                
                  JOptionPane.showMessageDialog(null, "Campos incompletos");
            }else{
                cl.setNombre(views.txtNombreCliente.getText());
                cl.setTelefono(views.txtTelefonoCliente.getText());
                cl.setDireccion(views.txtDireccionCliente.getText());
                
                if (clDao.registrar(cl)) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado");
                }else{
                    JOptionPane.showMessageDialog(null, "error al registrar cliente");
                }
                
            }
        }
    }
    
    
}
