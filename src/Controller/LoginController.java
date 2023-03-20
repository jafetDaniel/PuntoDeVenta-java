package Controller;

import Model.Usuarios;
import Model.UsuariosDao;
import View.FrmLogin;
import View.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener{
    private Usuarios us;
    private UsuariosDao usDao;
    private FrmLogin views;

    public LoginController(Usuarios us, UsuariosDao usDao, FrmLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        
        this.views.btnLogin.addActionListener(this);
        this.views.btnCancelar.addActionListener(this);
        
        this.views.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == views.btnLogin){ //si se presiono el boton login
            
            if (views.txtUsuario.getText().equals("") || 
                String.valueOf(views.txtClave.getPassword()).equals("") ){  //si los campos estan vacios
                 JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }else{
            String usuario = views.txtUsuario.getText();
            String clave =  String.valueOf(views.txtClave.getPassword());
            
            us = usDao.login(usuario,clave);
            
            if (us.getUsuario() != null) {
                PanelAdmin admin = new PanelAdmin();
                FrmLogin frm = new FrmLogin();
                
                admin.setVisible(true);
                this.views.dispose();
            }else{
                 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            }
        }//si los campos NO estan vacios
            
        }else{ //si se presiono el boton login
           int pregunta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "pregunta", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
           if(pregunta == 0){
               System.exit(0);
           }
        }
    }
    
}
