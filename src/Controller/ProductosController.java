package Controller;

import Model.Combo;
import Model.Tables;
import Model.Productos;
import Model.ProductosDao;
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

public class ProductosController implements ActionListener, MouseListener, KeyListener{
    private Productos prod;
    private ProductosDao prodDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    

    public ProductosController(Productos prod, ProductosDao prodDao, PanelAdmin views) {
        this.prod = prod;
        this.prodDao = prodDao;
        this.views = views;
        this.views.btnRegistrarPro.addActionListener(this);
        this.views.btnModificarPro.addActionListener(this);
        this.views.btnNuevoPro.addActionListener(this);
        
        this.views.jMenuEliminarPro.addActionListener(this);
        this.views.jMenuReingresarPro.addActionListener(this);
        
        this.views.jTablePro.addMouseListener(this);
        
        this.views.txtBuscarPro.addKeyListener(this);
        
        this.views.jLabelProductos.addMouseListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarPro) { //si se presiona el boton registrar
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtCantidadPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")
                    || views.jComboProveedorPro.getSelectedItem().equals("")
                    || views.jComboMedidaPro.getSelectedItem().equals("")
                    || views.jComboCategoriaPro.getSelectedItem().equals("")
                    ) {
                JOptionPane.showMessageDialog(null, "Campos incompletos");
            } else {

                prod.setCodigo(views.txtCodigoPro.getText());
                prod.setDescripcion(views.txtDescripcionPro.getText());
                prod.setCantidad(Integer.parseInt(views.txtCantidadPro.getText()));
                prod.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                prod.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                
                Combo itemP = (Combo) views.jComboProveedorPro.getSelectedItem();
                Combo itemM = (Combo) views.jComboMedidaPro.getSelectedItem();
                Combo itemC = (Combo) views.jComboCategoriaPro.getSelectedItem();
                
                prod.setId_proveedor(itemP.getId());
                prod.setId_medida(itemM.getId());
                prod.setId_categoria(itemC.getId());
        
                if (prodDao.registrar(prod)) { //registrar usuario
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al regitrar producto");
                }
            }
        } else if (e.getSource() == views.btnModificarPro) { //si se presiona el boton modificar
            if (views.txtCodigoPro.getText().equals("")
                    || views.txtDescripcionPro.getText().equals("")
                    || views.txtCantidadPro.getText().equals("")
                    || views.txtPrecioCompraPro.getText().equals("")
                    || views.txtPrecioVentaPro.getText().equals("")
                    || views.jComboProveedorPro.getSelectedItem().equals("")
                    || views.jComboMedidaPro.getSelectedItem().equals("")
                    || views.jComboCategoriaPro.getSelectedItem().equals("")) {
                
                JOptionPane.showMessageDialog(null, "Campos incompletos");
            } else {

                prod.setCodigo(views.txtCodigoPro.getText());
                prod.setDescripcion(views.txtDescripcionPro.getText());
                prod.setCantidad(Integer.parseInt(views.txtCantidadPro.getText()));
                prod.setPrecio_compra(Double.parseDouble(views.txtPrecioCompraPro.getText()));
                prod.setPrecio_venta(Double.parseDouble(views.txtPrecioVentaPro.getText()));
                
                Combo itemP = (Combo) views.jComboProveedorPro.getSelectedItem();
                Combo itemM = (Combo) views.jComboMedidaPro.getSelectedItem();
                Combo itemC = (Combo) views.jComboCategoriaPro.getSelectedItem();
                
                prod.setId_proveedor(itemP.getId());
                prod.setId_medida(itemM.getId());
                prod.setId_categoria(itemC.getId());
                
                prod.setId(Integer.parseInt(views.txtIdPro.getText()));

                if (prodDao.modificar(prod)) { //modificar producto
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifiar producto");
                }
            }
        } else if (e.getSource() == views.jMenuEliminarPro) {//si se presiona el boton eliminar
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una Fila para eliminar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                if (prodDao.accion("inactivo", id)) {
                     limpiarTable();
                     listarProductos();
                     limpiar();
                    JOptionPane.showMessageDialog(null, "Producto Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                }

            }
        }else if (e.getSource() == views.jMenuReingresarPro) {//si se presiono reingresar producto
            if (views.txtIdPro.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Seleccione una Fila para reingresar");
            } else {
                int id = Integer.parseInt(views.txtIdPro.getText());
                
                if (prodDao.accion("activo", id)) {
                    limpiarTable();
                    listarProductos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto reingresado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al reingresar producto");
                }

            }
        }else{
            limpiar();
        }

    }
    
    public void listarProductos(){
        Tables color = new Tables();
        views.jTablePro.setDefaultRenderer(views.jTablePro.getColumnClass(0), color);
        
        List<Productos> lista = prodDao.listaProductos(views.txtBuscarPro.getText());
        modelo = (DefaultTableModel) views.jTablePro.getModel();
        Object[] ob = new Object[7];
        
        for (int i = 0; i < lista.size(); i++) {
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getCodigo();
           ob[2] = lista.get(i).getDescripcion();
           ob[3] = lista.get(i).getCantidad();
           ob[4] = lista.get(i).getPrecio_compra();  
           ob[5] = lista.get(i).getPrecio_venta();  
           ob[6] = lista.get(i).getEstado();
           modelo.addRow(ob);
        }
        views.jTablePro.setModel(modelo);
        
        JTableHeader header = views.jTablePro.getTableHeader();
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
        if (e.getSource() == views.jTablePro) { //para mostrar datos en form al seleccioanr un producto en la tabla
            int fila = views.jTablePro.rowAtPoint(e.getPoint());
                       
            views.txtIdPro.setText(views.jTablePro.getValueAt(fila, 0).toString());
            views.txtCodigoPro.setText(views.jTablePro.getValueAt(fila, 1).toString());
            views.txtDescripcionPro.setText(views.jTablePro.getValueAt(fila, 2).toString());
            views.txtCantidadPro.setText(views.jTablePro.getValueAt(fila, 3).toString());          
            views.txtPrecioCompraPro.setText(views.jTablePro.getValueAt(fila, 4).toString());
            views.txtPrecioVentaPro.setText(views.jTablePro.getValueAt(fila, 5).toString());
            
            prod = prodDao.buscarPro(Integer.parseInt(views.txtIdPro.getText()));  //metodo buscarPro de la clase ProductosDAO(consulta con JOINS)         
            views.jComboProveedorPro.setSelectedItem(new Combo(prod.getId_proveedor(), prod.getProveedor()));
            views.jComboMedidaPro.setSelectedItem(new Combo(prod.getId_medida(), prod.getMedida()));
            views.jComboCategoriaPro.setSelectedItem(new Combo(prod.getId_categoria(), prod.getCategoria()));
            
             
            views.txtIdPro.setEnabled(false); //deshabilitar field id
            views.btnRegistrarPro.setEnabled(false); //deshabilitar boton registrar
            
        }else if(e.getSource() == views.jLabelProductos){ //se selecciono la opcion productos en el menu lateral
            views.tabbedPaneHeader.setSelectedIndex(0);
            limpiarTable();
            listarProductos();
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
        if (e.getSource() == views.txtBuscarPro) {
            limpiarTable();
            listarProductos();
        } else {
        }
    }
    
    private void limpiar(){
        views.txtCodigoPro.setText("");
        views.txtDescripcionPro.setText("");
        views.txtCantidadPro.setText("");
        views.txtPrecioCompraPro.setText("");
        views.txtPrecioVentaPro.setText("");
        views.txtIdPro.setText("");
    }
    
}
