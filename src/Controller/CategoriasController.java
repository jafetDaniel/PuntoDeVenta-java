package Controller;

import Model.Categorias;
import Model.CategoriasDao;
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


public class CategoriasController implements ActionListener, MouseListener, KeyListener{
    private Categorias cat;
    private CategoriasDao catDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

    public CategoriasController(Categorias cat, CategoriasDao catDao, PanelAdmin views) {
        this.cat = cat;
        this.catDao = catDao;
        this.views = views;
        
        this.views.btnRegistrarCategoria.addActionListener(this);
        this.views.btnModificarCategoria.addActionListener(this);
        this.views.btnNuevaCategoria.addActionListener(this);
        
        this.views.jMenuEliminarCategoria.addActionListener(this);
        this.views.jMenuReingresarCategoria.addActionListener(this);
        
        this.views.jTableCategorias.addMouseListener(this);
        
        this.views.txtBuscarCategoria.addKeyListener(this);
        
        this.views.jlabelCategorias.addMouseListener(this);
        
        listarCategorias();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarCategoria) { //si se presiono en registrar categoria
            if (views.txtNombreCategoria.getText().equals("") ) {
                
                  JOptionPane.showMessageDialog(null, "Campos incompletos");
            }else{
                cat.setNombre(views.txtNombreCategoria.getText());              
                
                if (catDao.registrar(cat)) {
                    limpiarTable();
                    listarCategorias();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Categorìa registrada");
                }else{
                    JOptionPane.showMessageDialog(null, "error al registrar categorìa");
                }
                
            }
        }else
   if (e.getSource() == views.btnModificarCategoria) { //si se presiono en modificar categoria
            if (views.txtIdCategoria.getText().equals("")) {
                 JOptionPane.showMessageDialog(null, "Seleccione una fila");
            } else {
                if (views.txtNombreCategoria.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Campos incompletos");
                } else {
                    cat.setNombre(views.txtNombreCategoria.getText());                   
                    cat.setId(Integer.parseInt(views.txtIdCategoria.getText()));

                    if (catDao.modificar(cat)) {
                         limpiarTable();
                         listarCategorias();
                         limpiar();
                        JOptionPane.showMessageDialog(null, "Categorìa modificada");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al modificar categorìa");
                    }

                }

            }
        }else
       if (e.getSource() == views.jMenuEliminarCategoria) { //si se presiono en eliminar categoria
            if (views.txtIdCategoria.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdCategoria.getText());
                if (catDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarCategorias();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Categorìa eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar categorìa");
                }
           }
        }else
           if (e.getSource() == views.jMenuReingresarCategoria) { //si se presiono reingresar categoria
            if (views.txtIdCategoria.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "Selecciona una fila");
           } else {
                int id = Integer.parseInt(views.txtIdCategoria.getText());
                if (catDao.accion("activo", id)) {
                     limpiarTable();
                     listarCategorias();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Categorìa reingresada");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar categorìa");
                }
           }
        }else{
               limpiar();
           }
    }
    
    public void listarCategorias(){
        Tables color = new Tables();
        views.jTableCategorias.setDefaultRenderer(views.jTableCategorias.getColumnClass(0), color);
        
        List<Categorias> lista = catDao.listaCategorias(views.txtBuscarCategoria.getText());
        modelo = (DefaultTableModel) views.jTableCategorias.getModel();
        Object[] ob = new Object[3];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getNombre();
           ob[2] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTableCategorias.setModel(modelo);
        
        JTableHeader header = views.jTableCategorias.getTableHeader();
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
        if (e.getSource() == views.jTableCategorias) { //para mostrar datos en form al seleccionar una categoria en la tabla
            int fila = views.jTableCategorias.rowAtPoint(e.getPoint());
            
            views.txtIdCategoria.setText(views.jTableCategorias.getValueAt(fila, 0).toString());
            views.txtNombreCategoria.setText(views.jTableCategorias.getValueAt(fila, 1).toString());
            
             views.txtIdCategoria.setEnabled(false); //deshabilitar field id
             views.btnRegistrarCategoria.setEnabled(false); //deshabilitar boton registrar
             
        }else if(e.getSource() == views.jlabelCategorias){ //se selecciono la opcion categorias en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(4);
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
        views.txtNombreCategoria.setText("");
        views.txtIdCategoria.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarCategoria) {
            limpiarTable();
            listarCategorias();
        } else {
        }
    }
    
    
}
