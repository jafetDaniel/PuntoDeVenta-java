package Controller;

import Model.Combo;
import Model.Tables;
import Model.Productos;
import Model.ProductosDao;
import View.PanelAdmin;
import View.Print;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ProductosController implements ActionListener, MouseListener, KeyListener{
    private Productos prod;
    private ProductosDao prodDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp;
    
    public ProductosController(Productos prod, ProductosDao prodDao, PanelAdmin views) {
        this.prod = prod;
        this.prodDao = prodDao;
        this.views = views;
        this.views.btnRegistrarPro.addActionListener(this);
        this.views.btnModificarPro.addActionListener(this);
        this.views.btnNuevoPro.addActionListener(this);
        this.views.btnGenerarNC.addActionListener(this);
        
        this.views.jMenuEliminarPro.addActionListener(this);
        this.views.jMenuReingresarPro.addActionListener(this);
        
        this.views.jTablePro.addMouseListener(this);
        
        this.views.txtBuscarPro.addKeyListener(this);
        
        this.views.jLabelProductos.addMouseListener(this);
        
        this.views.txtCodNC.addKeyListener(this); 
        this.views.txtCantNC.addKeyListener(this);
        this.views.txtPagarConNC.addKeyListener(this);
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
        }else
        if(e.getSource()== views.btnGenerarNC){
            insertarCompra();
        }else{
            
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
        if (e.getSource() == views.txtCodNC) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (views.txtCodNC.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Ingrese el código");
                }else{
                    String cod = views.txtCodNC.getText();
                    prod = prodDao.buscarCodigo(cod);
                    views.txtIdNC.setText(""+prod.getId());
                    views.txtProductoNC.setText(prod.getDescripcion());
                    views.txtPrecioNC.setText(""+prod.getPrecio_compra());
                    views.txtCantNC.requestFocus();
                }
            }
        }else
            if(e.getSource() == views.txtCantNC){
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    int cant = Integer.parseInt(views.txtCantNC.getText());
                    String desc = views.txtProductoNC.getText();
                    double precio = Double.parseDouble(views.txtPrecioNC.getText());
                    int id = Integer.parseInt(views.txtIdNC.getText());
                    
                    if (cant > 0) {
                        tmp = (DefaultTableModel) views.jTableNuevaCompra.getModel();
                        ArrayList lista = new ArrayList();
                        int item = 1;
                        lista.add(item);
                        lista.add(id);
                        lista.add(desc);
                        lista.add(cant);
                        lista.add(precio);
                        lista.add(cant * precio);
                        
                        Object[] obj = new Object[5];
                        obj[0] = lista.get(1);
                        obj[1] = lista.get(2);
                        obj[2] = lista.get(3);
                        obj[3] = lista.get(4);
                        obj[4] = lista.get(5);
                        tmp.addRow(obj);
                        views.jTableNuevaCompra.setModel(tmp);
                        limpiarCamposNC();
                         calcularCompra();
                        views.txtCodNC.requestFocus();
                    }
                
                }
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == views.txtBuscarPro) {
            limpiarTable();
            listarProductos();
        } else 
            if(e.getSource() == views.txtCantNC){
                int cantidad;
                double precio;
                if (views.txtCantNC.getText().equals("")) {
                    cantidad = 1;
                     precio = Double.parseDouble(views.txtPrecioNC.getText());
                     views.txtTotalNC.setText(""+precio);
                }else{
                    cantidad = Integer.parseInt(views.txtCantNC.getText());
                    precio = Double.parseDouble(views.txtPrecioNC.getText());
                    views.txtTotalNC.setText(""+ cantidad * precio);
                }
        }else
            if (e.getSource() == views.txtPagarConNC) {
                int pagar;
                if (views.txtPagarConNC.getText().equals("")) {
                    views.txtCambioNC.setText(""); 
                }else{
                    pagar = Integer.parseInt(views.txtPagarConNC.getText());
                    double total = Double.parseDouble(views.jLabelTotalPagarNC.getText());
                    views.txtCambioNC.setText(""+(pagar - total)); //calculando cambio
                }
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
    
    private void limpiarCamposNC(){
        views.txtCodNC.setText("");
        views.txtIdNC.setText("");
        views.txtProductoNC.setText("");
        views.txtCantNC.setText("");
        views.txtPrecioNC.setText("");
        views.txtTotalNC.setText("");
    }
    
    private void calcularCompra(){//calcular tota a pagar y sumarlo
        double total = 0.00;
        int numFila = views.jTableNuevaCompra.getRowCount();
        
        for (int i = 0; i < numFila; i++) {
            total = total + Double.parseDouble(String.valueOf(views.jTableNuevaCompra.getValueAt(i, 4)));            
        }
        views.jLabelTotalPagarNC.setText(""+total);
    }
    
    private void insertarCompra(){
        Combo id_p = (Combo) views.jComboProveederNC.getSelectedItem();
        int id_proveedor = id_p.getId();
        String total = views.jLabelTotalPagarNC.getText();
        
        if (prodDao.registrarCompra(id_proveedor, total)) {
             int id_compra = prodDao.id_compra();
            for (int i = 0; i < views.jTableNuevaCompra.getRowCount(); i++) {
               
                double precio = Double.parseDouble(views.jTableNuevaCompra.getValueAt(i, 3).toString());
                int cantidad = Integer.parseInt(views.jTableNuevaCompra.getValueAt(i, 2).toString());
                int id = Integer.parseInt(views.jTableNuevaCompra.getValueAt(i, 0).toString());
                 
                double sub_total = precio * cantidad;
                
                prodDao.registrarCompraDetalle(id_compra, id, precio, cantidad, sub_total);
                prod = prodDao.buscarId(id);
                int stockActual = prod.getCantidad() + cantidad;
                prodDao.actualizarStock(stockActual, id);
            }
            limpiarTableDetalle();
            JOptionPane.showMessageDialog(null, "Compra generada");
            Print p = new Print(id_compra);
            p.setVisible(true);
            
        }
        
    }
    
    public void limpiarTableDetalle(){
        for (int i = 0; i < tmp.getRowCount(); i++) {
            tmp.removeRow(i);
            i = i - 1;
        }
    }
    
}