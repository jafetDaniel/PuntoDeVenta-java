package Controller;

import Model.Combo;
import Model.Medidas;
import Model.MedidasDao;
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

public class MedidasController implements ActionListener, MouseListener, KeyListener{
    private Medidas med;
    private MedidasDao medDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public MedidasController(Medidas med, MedidasDao medDao, PanelAdmin views) {
        this.med = med;
        this.medDao = medDao;
        this.views = views;
        
        this.views.btnRegistrarMedida.addActionListener(this);
        this.views.btnModificarMedida.addActionListener(this);
        this.views.btnNuevaMedida.addActionListener(this);
        
        this.views.jMenuEliminarMedida.addActionListener(this);
        this.views.jMenuReingresarMedida.addActionListener(this);
        
        this.views.jTableMedidas.addMouseListener(this);
        
        this.views.txtBuscarMedida.addKeyListener(this);
        
        this.views.jLabelMedidas.addMouseListener(this);
        
        llenarMedida();
        AutoCompleteDecorator.decorate(views.jComboMedidaPro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarMedida) { //si se presiono en registrar medida
            if (views.txtNombreMedida.getText().equals("") ||
                views.txtNombreCortoMedida.getText().equals("") ) {
                
                  JOptionPane.showMessageDialog(null, "Campos incompletos");
            }else{
                med.setNombre(views.txtNombreMedida.getText());     
                med.setNombre_corto(views.txtNombreCortoMedida.getText());
                
                if (medDao.registrar(med)) {
                    limpiarTable();
                    listarMedidas();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Medida registrada");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar medida");
                }
                
            }
        }else
   if (e.getSource() == views.btnModificarMedida) { //si se presiono en modificar medida
            if (views.txtIdMedida.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtNombreMedida.getText().equals("") ||
                    views.txtNombreCortoMedida.getText().equals("") ) {

                    JOptionPane.showMessageDialog(null, "Campos incompletos");
                } else {
                    med.setNombre(views.txtNombreMedida.getText()); 
                    med.setNombre_corto(views.txtNombreCortoMedida.getText());
                    med.setId(Integer.parseInt(views.txtIdMedida.getText()));

                    if (medDao.modificar(med)) {
                         limpiarTable();
                         listarMedidas();
                         limpiar();
                        JOptionPane.showMessageDialog(null, "Medida modificada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar medida");
                    }

                }

            }
        }else
       if (e.getSource() == views.jMenuEliminarMedida) { //si se presiono en eliminar medida
            if (views.txtIdMedida.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdMedida.getText());
                if (medDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarMedidas();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Medida eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar medida");
                }
           }
        }else
           if (e.getSource() == views.jMenuReingresarMedida) { //si se presiono en reingresar medida
            if (views.txtIdMedida.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdMedida.getText());
                if (medDao.accion("activo", id)) {
                     limpiarTable();
                     listarMedidas();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Medida reingresada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar medida");
                }
           }
        }else{
               limpiar();
           }
    }
    
    public void listarMedidas(){
        Tables color = new Tables();
        views.jTableMedidas.setDefaultRenderer(views.jTableMedidas.getColumnClass(0), color);
        
        List<Medidas> lista = medDao.listaMedidas(views.txtBuscarMedida.getText());
        modelo = (DefaultTableModel) views.jTableMedidas.getModel();
        Object[] ob = new Object[4];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getNombre();
           ob[2] = lista.get(i).getNombre_corto();
           ob[3] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTableMedidas.setModel(modelo);
        
        JTableHeader header = views.jTableMedidas.getTableHeader();
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
        if (e.getSource() == views.jTableMedidas) { //para mostrar datos en form al seleccionar una medida en la tabla
            int fila = views.jTableMedidas.rowAtPoint(e.getPoint());
            
            views.txtIdMedida.setText(views.jTableMedidas.getValueAt(fila, 0).toString());
            views.txtNombreMedida.setText(views.jTableMedidas.getValueAt(fila, 1).toString());
            views.txtNombreCortoMedida.setText(views.jTableMedidas.getValueAt(fila, 2).toString());
            
             views.txtIdMedida.setEnabled(false); //deshabilitar field id
             views.btnRegistrarMedida.setEnabled(false); //deshabilitar boton registrar
             
        }else if(e.getSource() == views.jLabelMedidas){ //se selecciono la opcion medidas en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(5);
            limpiarTable();
            listarMedidas();
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
        views.txtNombreMedida.setText("");
        views.txtNombreCortoMedida.setText("");
        views.txtIdMedida.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarMedida) {
            limpiarTable();
            listarMedidas();
        } else {
        }
    }
    
    private void llenarMedida(){
        List<Medidas> lista = medDao.listaMedidas(views.txtBuscarMedida.getText());
       
        for (int i = 0; i < lista.size(); i++) {
           int id = lista.get(i).getId();
           String nombre = lista.get(i).getNombre();   
           views.jComboMedidaPro.addItem(new Combo(id, nombre));          
        }  
    }
    
}
