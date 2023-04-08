
package View;

import Controller.ClientesController;
import Controller.ConfigController;
import Controller.UsuariosController;
import Model.Clientes;
import Model.ClientesDao;
import Model.Usuarios;
import Model.UsuariosDao;

public class PanelAdmin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuariosDao usDao = new UsuariosDao();
    
    Clientes cl = new Clientes();
    ClientesDao clDao = new ClientesDao();
    
    public PanelAdmin() {
        initComponents();
        ConfigController config  = new ConfigController(this);
        UsuariosController users  = new UsuariosController(us, usDao, this);
        
        ClientesController cliente  = new ClientesController(cl, clDao, this);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopuUsuarios = new javax.swing.JPopupMenu();
        jMenuEliminarUser = new javax.swing.JMenuItem();
        jMenuReingresarUser = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanelCatego = new javax.swing.JPanel();
        jlabelCategorias = new javax.swing.JLabel();
        jPanelNuevaVenta = new javax.swing.JPanel();
        jLabelNuevaVenta = new javax.swing.JLabel();
        jPanelNuevaCompra = new javax.swing.JPanel();
        jLabelNuevaCompra = new javax.swing.JLabel();
        jPanelProductos = new javax.swing.JPanel();
        jLabelProductos = new javax.swing.JLabel();
        jPanelClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        jPanelProveedores = new javax.swing.JPanel();
        jLabelProveedores = new javax.swing.JLabel();
        jPanelMedidas = new javax.swing.JPanel();
        jLabelMedidas = new javax.swing.JLabel();
        jPanelConfig = new javax.swing.JPanel();
        jLabelConfig = new javax.swing.JLabel();
        jPanelUsuarios = new javax.swing.JPanel();
        jLabelUsuarios = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        tabbedPaneHeader = new org.edisoncor.gui.tabbedPane.TabbedPaneHeader();
        jPanel4 = new javax.swing.JPanel();
        jPanelNuevoProducto = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        txtDescripcionPro = new javax.swing.JTextField();
        jLabelCategoria = new javax.swing.JLabel();
        txtPrecioCompraPro = new javax.swing.JTextField();
        jLabelPrecioVenta = new javax.swing.JLabel();
        jLabelPrecioCompra = new javax.swing.JLabel();
        jLabelMedida = new javax.swing.JLabel();
        jLabelProveedor = new javax.swing.JLabel();
        txtPrecioVentaPro = new javax.swing.JTextField();
        jComboMedidaPro = new javax.swing.JComboBox<>();
        jComboCategoriaPro = new javax.swing.JComboBox<>();
        jComboProveedorPro = new javax.swing.JComboBox<>();
        btnNuevoPro = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarPro = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarPro = new org.edisoncor.gui.button.ButtonTextDown();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePro = new javax.swing.JTable();
        PaginadorPro = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanelNuevoCliente = new javax.swing.JPanel();
        jLabelNombreCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabelTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabelDireccionCliente = new javax.swing.JLabel();
        btnNuevoCliente = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarCliente = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarCliente = new org.edisoncor.gui.button.ButtonTextDown();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDireccionCliente = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        PaginadorCliente = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        jPanelNuevoProveedor = new javax.swing.JPanel();
        jLabelRucProveedor = new javax.swing.JLabel();
        txtRucProveedor = new javax.swing.JTextField();
        jLabelTelefonoProveedor = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabelDireccionProveedor = new javax.swing.JLabel();
        btnNuevoProveedor = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarProveedor = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarProveedor = new org.edisoncor.gui.button.ButtonTextDown();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtDireccionProveedor = new javax.swing.JTextPane();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabelNombreProveedor = new javax.swing.JLabel();
        PaginadorProveedor = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jPanelNuevoUsuario = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabelContraseñaUsuario = new javax.swing.JLabel();
        jLabelRolUsuario = new javax.swing.JLabel();
        btnNuevoUsuario = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarUsuario = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarUsuario = new org.edisoncor.gui.button.ButtonTextDown();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelCajaUsuario1 = new javax.swing.JLabel();
        jComboRolUsuario = new javax.swing.JComboBox<>();
        jComboCajaUsuario = new javax.swing.JComboBox<>();
        txtClaveUsuario = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        txtBuscarUser = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        PaginadorUsuarios = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanelNuevaCategoria = new javax.swing.JPanel();
        btnNuevaCategoria = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarCategoria = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarCategoria = new org.edisoncor.gui.button.ButtonTextDown();
        txtNombreCategoria = new javax.swing.JTextField();
        jLabelNombreCategoria = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCategorias = new javax.swing.JTable();
        PaginadorCategorias = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanelNuevaMedida = new javax.swing.JPanel();
        btnNuevaMedida = new org.edisoncor.gui.button.ButtonTextDown();
        btnModificarMedida = new org.edisoncor.gui.button.ButtonTextDown();
        btnRegistrarMedida = new org.edisoncor.gui.button.ButtonTextDown();
        txtNombreCortoMedida = new javax.swing.JTextField();
        txtNombreMedida = new javax.swing.JTextField();
        jLabelNombreCortoMedida = new javax.swing.JLabel();
        jLabelNombreMedida = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableMedidas = new javax.swing.JTable();
        PaginadorMedidas = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableNuevaVenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStockNV = new javax.swing.JTextField();
        btnGenerarNV = new org.edisoncor.gui.button.ButtonTextDown();
        jLabel7 = new javax.swing.JLabel();
        txtTotalNV = new javax.swing.JTextField();
        txtCantNV = new javax.swing.JTextField();
        txtProductoNV = new javax.swing.JTextField();
        txtCodNV = new javax.swing.JTextField();
        txtPrecioNV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboClienteNV = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPagarNV = new javax.swing.JTextField();
        txtCambioNV = new javax.swing.JTextField();
        jLabelTotalPagarNV = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();
        PaginadoVentas = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTableCompras = new javax.swing.JTable();
        PaginadoCompras = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanelNuevosDatosEmpresa = new javax.swing.JPanel();
        jLabelRucEmpresa = new javax.swing.JLabel();
        txtRucEmpresa = new javax.swing.JTextField();
        jLabelTelefonoEmpresa = new javax.swing.JLabel();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        jLabelMensajeEmpresa = new javax.swing.JLabel();
        btnModificarEmpresa = new org.edisoncor.gui.button.ButtonTextDown();
        txtNombreEmpresa = new javax.swing.JTextField();
        jLabelNombreEmpresa = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtDireccionEmpresa = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtMensajeEmpresa = new javax.swing.JTextPane();
        jLabelDireccionEmpresa1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableNuevaCompra = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnGenerarNC = new org.edisoncor.gui.button.ButtonTextDown();
        txtTotalNC = new javax.swing.JTextField();
        txtCantNC = new javax.swing.JTextField();
        txtProductoNC = new javax.swing.JTextField();
        txtCodNC = new javax.swing.JTextField();
        txtPrecioNC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboProveederNC = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtPagarNC = new javax.swing.JTextField();
        txtCambioNC = new javax.swing.JTextField();
        jLabelTotalPagarNC = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnUsers2 = new org.edisoncor.gui.button.ButtonTextDown();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jMenuEliminarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jMenuEliminarUser.setText("Eliminar");
        jPopuUsuarios.add(jMenuEliminarUser);

        jMenuReingresarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exchange.png"))); // NOI18N
        jMenuReingresarUser.setText("Reingresar");
        jPopuUsuarios.add(jMenuReingresarUser);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCatego.setBackground(new java.awt.Color(51, 51, 51));

        jlabelCategorias.setBackground(new java.awt.Color(255, 255, 255));
        jlabelCategorias.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlabelCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jlabelCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/box.png"))); // NOI18N
        jlabelCategorias.setText("Categorías");

        javax.swing.GroupLayout jPanelCategoLayout = new javax.swing.GroupLayout(jPanelCatego);
        jPanelCatego.setLayout(jPanelCategoLayout);
        jPanelCategoLayout.setHorizontalGroup(
            jPanelCategoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabelCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelCategoLayout.setVerticalGroup(
            jPanelCategoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabelCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelCatego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 40));

        jPanelNuevaVenta.setBackground(new java.awt.Color(51, 51, 51));

        jLabelNuevaVenta.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevaVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nventa.png"))); // NOI18N
        jLabelNuevaVenta.setText("Nueva Venta");

        javax.swing.GroupLayout jPanelNuevaVentaLayout = new javax.swing.GroupLayout(jPanelNuevaVenta);
        jPanelNuevaVenta.setLayout(jPanelNuevaVentaLayout);
        jPanelNuevaVentaLayout.setHorizontalGroup(
            jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelNuevaVentaLayout.setVerticalGroup(
            jPanelNuevaVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, 40));

        jPanelNuevaCompra.setBackground(new java.awt.Color(51, 51, 51));

        jLabelNuevaCompra.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevaCompra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Carrito-de-compras.png"))); // NOI18N
        jLabelNuevaCompra.setText("Nueva Compra");

        javax.swing.GroupLayout jPanelNuevaCompraLayout = new javax.swing.GroupLayout(jPanelNuevaCompra);
        jPanelNuevaCompra.setLayout(jPanelNuevaCompraLayout);
        jPanelNuevaCompraLayout.setHorizontalGroup(
            jPanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelNuevaCompraLayout.setVerticalGroup(
            jPanelNuevaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelNuevaCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelNuevaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 40));

        jPanelProductos.setBackground(new java.awt.Color(51, 51, 51));

        jLabelProductos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jLabelProductos.setText("Productos");

        javax.swing.GroupLayout jPanelProductosLayout = new javax.swing.GroupLayout(jPanelProductos);
        jPanelProductos.setLayout(jPanelProductosLayout);
        jPanelProductosLayout.setHorizontalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelProductosLayout.setVerticalGroup(
            jPanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        jPanelClientes.setBackground(new java.awt.Color(51, 51, 51));

        jLabelClientes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Clientes.png"))); // NOI18N
        jLabelClientes.setText("Clientes");

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        jPanelProveedores.setBackground(new java.awt.Color(51, 51, 51));

        jLabelProveedores.setBackground(new java.awt.Color(255, 255, 255));
        jLabelProveedores.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelProveedores.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        jLabelProveedores.setText("Proveedores");

        javax.swing.GroupLayout jPanelProveedoresLayout = new javax.swing.GroupLayout(jPanelProveedores);
        jPanelProveedores.setLayout(jPanelProveedoresLayout);
        jPanelProveedoresLayout.setHorizontalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelProveedoresLayout.setVerticalGroup(
            jPanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        jPanelMedidas.setBackground(new java.awt.Color(51, 51, 51));

        jLabelMedidas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMedidas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelMedidas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMedidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/detallista.png"))); // NOI18N
        jLabelMedidas.setText("Medidas");

        javax.swing.GroupLayout jPanelMedidasLayout = new javax.swing.GroupLayout(jPanelMedidas);
        jPanelMedidas.setLayout(jPanelMedidasLayout);
        jPanelMedidasLayout.setHorizontalGroup(
            jPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelMedidasLayout.setVerticalGroup(
            jPanelMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMedidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        jPanelConfig.setBackground(new java.awt.Color(51, 51, 51));

        jLabelConfig.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfig.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelConfig.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/config.png"))); // NOI18N
        jLabelConfig.setText("Configuración");

        javax.swing.GroupLayout jPanelConfigLayout = new javax.swing.GroupLayout(jPanelConfig);
        jPanelConfig.setLayout(jPanelConfigLayout);
        jPanelConfigLayout.setHorizontalGroup(
            jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanelConfigLayout.setVerticalGroup(
            jPanelConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 200, 40));

        jPanelUsuarios.setBackground(new java.awt.Color(51, 51, 51));

        jLabelUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users.png"))); // NOI18N
        jLabelUsuarios.setText("Usuarios");

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 640));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Punto De Venta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, 180, 40));

        tabbedPaneHeader.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelNuevoProducto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevoProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevoProducto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCodigo.setText("Código");
        jPanelNuevoProducto.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        txtCodigoPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProducto.add(txtCodigoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 180, 30));

        jLabelDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDescripcion.setText("Descripción");
        jPanelNuevoProducto.add(jLabelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        txtDescripcionPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcionPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProActionPerformed(evt);
            }
        });
        jPanelNuevoProducto.add(txtDescripcionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 30));

        jLabelCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCategoria.setText("Categoría");
        jPanelNuevoProducto.add(jLabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 30));

        txtPrecioCompraPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPrecioCompraPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraProActionPerformed(evt);
            }
        });
        jPanelNuevoProducto.add(txtPrecioCompraPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 30));

        jLabelPrecioVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPrecioVenta.setText("Precio Venta");
        jPanelNuevoProducto.add(jLabelPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 30));

        jLabelPrecioCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPrecioCompra.setText("Precio Compra");
        jPanelNuevoProducto.add(jLabelPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 30));

        jLabelMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelMedida.setText("Medida");
        jPanelNuevoProducto.add(jLabelMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 30));

        jLabelProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelProveedor.setText("Proveedor");
        jPanelNuevoProducto.add(jLabelProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        txtPrecioVentaPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProducto.add(txtPrecioVentaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 30));

        jComboMedidaPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProducto.add(jComboMedidaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, 30));

        jComboCategoriaPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProducto.add(jComboCategoriaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 180, 30));

        jComboProveedorPro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboProveedorPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProveedorProActionPerformed(evt);
            }
        });
        jPanelNuevoProducto.add(jComboProveedorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, 30));

        btnNuevoPro.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoPro.setText("Nuevo");
        btnNuevoPro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProducto.add(btnNuevoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 30));

        btnModificarPro.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarPro.setText("Modificar");
        btnModificarPro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProducto.add(btnModificarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, 30));

        btnRegistrarPro.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarPro.setText("Registrar");
        btnRegistrarPro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProducto.add(btnRegistrarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 90, 30));

        jPanel4.add(jPanelNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 610));

        jTablePro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Producto", "Precio", "Cantidad", "Medida", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTablePro);
        if (jTablePro.getColumnModel().getColumnCount() > 0) {
            jTablePro.getColumnModel().getColumn(4).setHeaderValue("Medida");
            jTablePro.getColumnModel().getColumn(5).setHeaderValue("Estado");
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 960, 540));

        PaginadorPro.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorProLayout = new javax.swing.GroupLayout(PaginadorPro);
        PaginadorPro.setLayout(PaginadorProLayout);
        PaginadorProLayout.setHorizontalGroup(
            PaginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorProLayout.setVerticalGroup(
            PaginadorProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel4.add(PaginadorPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 960, 60));

        tabbedPaneHeader.addTab("tab1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanelNuevoCliente.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevoCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreCliente.setText("Nombre");
        jPanelNuevoCliente.add(jLabelNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 30));

        txtNombreCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoCliente.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 220, 30));

        jLabelTelefonoCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTelefonoCliente.setText("Teléfono");
        jPanelNuevoCliente.add(jLabelTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 90, 30));

        txtTelefonoCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });
        jPanelNuevoCliente.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 220, 30));

        jLabelDireccionCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDireccionCliente.setText("Dirección:");
        jPanelNuevoCliente.add(jLabelDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 30));

        btnNuevoCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoCliente.setText("Nuevo");
        btnNuevoCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoCliente.add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 90, 30));

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarCliente.setText("Modificar");
        btnModificarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoCliente.add(btnModificarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 90, 30));

        btnRegistrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoCliente.add(btnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 90, 30));

        jScrollPane3.setViewportView(txtDireccionCliente);

        jPanelNuevoCliente.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, 210));

        jTableClientes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Teléfono", "Dirección", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        PaginadorCliente.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorClienteLayout = new javax.swing.GroupLayout(PaginadorCliente);
        PaginadorCliente.setLayout(PaginadorClienteLayout);
        PaginadorClienteLayout.setHorizontalGroup(
            PaginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorClienteLayout.setVerticalGroup(
            PaginadorClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaginadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PaginadorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneHeader.addTab("tab2", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTableProveedores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ruc", "Nombre", "Teléfono", "Dirección"
            }
        ));
        jScrollPane4.setViewportView(jTableProveedores);
        if (jTableProveedores.getColumnModel().getColumnCount() > 0) {
            jTableProveedores.getColumnModel().getColumn(1).setHeaderValue("Usuario");
            jTableProveedores.getColumnModel().getColumn(4).setHeaderValue("Caja");
        }

        jPanelNuevoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevoProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevoProveedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRucProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelRucProveedor.setText("Ruc");
        jPanelNuevoProveedor.add(jLabelRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));

        txtRucProveedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProveedor.add(txtRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 210, 30));

        jLabelTelefonoProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTelefonoProveedor.setText("Teléfono");
        jPanelNuevoProveedor.add(jLabelTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        txtTelefonoProveedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTelefonoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoProveedorActionPerformed(evt);
            }
        });
        jPanelNuevoProveedor.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 210, 30));

        jLabelDireccionProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDireccionProveedor.setText("Dirección:");
        jPanelNuevoProveedor.add(jLabelDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 30));

        btnNuevoProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoProveedor.setText("Nuevo");
        btnNuevoProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProveedor.add(btnNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 30));

        btnModificarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarProveedor.setText("Modificar");
        btnModificarProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProveedor.add(btnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 90, 30));

        btnRegistrarProveedor.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarProveedor.setText("Registrar");
        btnRegistrarProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoProveedor.add(btnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 90, 30));

        jScrollPane5.setViewportView(txtDireccionProveedor);

        jPanelNuevoProveedor.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 210, 230));

        txtNombreProveedor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoProveedor.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 210, 30));

        jLabelNombreProveedor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreProveedor.setText("Nombre");
        jPanelNuevoProveedor.add(jLabelNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        PaginadorProveedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorProveedorLayout = new javax.swing.GroupLayout(PaginadorProveedor);
        PaginadorProveedor.setLayout(PaginadorProveedorLayout);
        PaginadorProveedorLayout.setHorizontalGroup(
            PaginadorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorProveedorLayout.setVerticalGroup(
            PaginadorProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaginadorProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PaginadorProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneHeader.addTab("tab3", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTableUsuarios.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Caja", "Rol", "Estado"
            }
        ));
        jTableUsuarios.setComponentPopupMenu(jPopuUsuarios);
        jTableUsuarios.setRowHeight(20);
        jScrollPane6.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(1).setHeaderValue("Usuario");
            jTableUsuarios.getColumnModel().getColumn(3).setHeaderValue("Caja");
            jTableUsuarios.getColumnModel().getColumn(4).setHeaderValue("Rol");
        }

        jPanelNuevoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuario");
        jPanelNuevoUsuario.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 30));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoUsuario.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 210, 30));

        jLabelContraseñaUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelContraseñaUsuario.setText("Contraseña");
        jPanelNuevoUsuario.add(jLabelContraseñaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 30));

        jLabelRolUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelRolUsuario.setText("Rol");
        jPanelNuevoUsuario.add(jLabelRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, 30));

        btnNuevoUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoUsuario.setText("Nuevo");
        btnNuevoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoUsuario.add(btnNuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 90, 30));

        btnModificarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoUsuario.add(btnModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 90, 30));

        btnRegistrarUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarUsuario.setText("Registrar");
        btnRegistrarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevoUsuario.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, 30));

        txtNombreUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoUsuario.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 30));

        jLabelNombreUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreUsuario.setText("Nombre");
        jPanelNuevoUsuario.add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jLabelCajaUsuario1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCajaUsuario1.setText("Caja");
        jPanelNuevoUsuario.add(jLabelCajaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 30));

        jComboRolUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador" }));
        jPanelNuevoUsuario.add(jComboRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 180, 30));

        jComboCajaUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General" }));
        jPanelNuevoUsuario.add(jComboCajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, 30));

        txtClaveUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveUsuarioActionPerformed(evt);
            }
        });
        jPanelNuevoUsuario.add(txtClaveUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, 30));
        jPanelNuevoUsuario.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 70, -1));

        txtBuscarUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevoUsuario.add(txtBuscarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 250, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        jPanelNuevoUsuario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 30));

        PaginadorUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorUsuariosLayout = new javax.swing.GroupLayout(PaginadorUsuarios);
        PaginadorUsuarios.setLayout(PaginadorUsuariosLayout);
        PaginadorUsuariosLayout.setHorizontalGroup(
            PaginadorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorUsuariosLayout.setVerticalGroup(
            PaginadorUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaginadorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PaginadorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneHeader.addTab("tab4", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanelNuevaCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevaCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Categoría", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevaCategoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevaCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevaCategoria.setText("Nuevo");
        btnNuevaCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaCategoria.add(btnNuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 30));

        btnModificarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarCategoria.setText("Modificar");
        btnModificarCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaCategoria.add(btnModificarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, 30));

        btnRegistrarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarCategoria.setText("Registrar");
        btnRegistrarCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaCategoria.add(btnRegistrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 90, 30));

        txtNombreCategoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevaCategoria.add(txtNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 220, 30));

        jLabelNombreCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreCategoria.setText("Nombre");
        jPanelNuevaCategoria.add(jLabelNombreCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jTableCategorias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Estado"
            }
        ));
        jScrollPane7.setViewportView(jTableCategorias);

        PaginadorCategorias.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorCategoriasLayout = new javax.swing.GroupLayout(PaginadorCategorias);
        PaginadorCategorias.setLayout(PaginadorCategoriasLayout);
        PaginadorCategoriasLayout.setHorizontalGroup(
            PaginadorCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorCategoriasLayout.setVerticalGroup(
            PaginadorCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaginadorCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PaginadorCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneHeader.addTab("tab5", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanelNuevaMedida.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevaMedida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevaMedida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevaMedida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevaMedida.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevaMedida.setText("Nuevo");
        btnNuevaMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaMedida.add(btnNuevaMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, 30));

        btnModificarMedida.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarMedida.setText("Modificar");
        btnModificarMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaMedida.add(btnModificarMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 30));

        btnRegistrarMedida.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarMedida.setText("Registrar");
        btnRegistrarMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevaMedida.add(btnRegistrarMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, 30));

        txtNombreCortoMedida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevaMedida.add(txtNombreCortoMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, 30));

        txtNombreMedida.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevaMedida.add(txtNombreMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 30));

        jLabelNombreCortoMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreCortoMedida.setText("Nombre corto");
        jPanelNuevaMedida.add(jLabelNombreCortoMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 30));

        jLabelNombreMedida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreMedida.setText("Nombre");
        jPanelNuevaMedida.add(jLabelNombreMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jTableMedidas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableMedidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Corto", "Estado"
            }
        ));
        jScrollPane8.setViewportView(jTableMedidas);

        PaginadorMedidas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadorMedidasLayout = new javax.swing.GroupLayout(PaginadorMedidas);
        PaginadorMedidas.setLayout(PaginadorMedidasLayout);
        PaginadorMedidasLayout.setHorizontalGroup(
            PaginadorMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        PaginadorMedidasLayout.setVerticalGroup(
            PaginadorMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelNuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaginadorMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNuevaMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(PaginadorMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabbedPaneHeader.addTab("tab6", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNuevaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane9.setViewportView(jTableNuevaVenta);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1250, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Producto");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Cant");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Precio");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Total");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        txtStockNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtStockNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 60, -1));

        btnGenerarNV.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerarNV.setText("Generar");
        btnGenerarNV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGenerarNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNVActionPerformed(evt);
            }
        });
        jPanel10.add(btnGenerarNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 90, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Stock");
        jPanel10.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        txtTotalNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtTotalNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 50, -1));

        txtCantNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCantNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantNVActionPerformed(evt);
            }
        });
        jPanel10.add(txtCantNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 50, -1));

        txtProductoNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtProductoNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 260, -1));

        txtCodNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtCodNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        txtPrecioNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtPrecioNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 120, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Código");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboClienteNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(jComboClienteNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 190, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Cambio");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, -1, -1));

        txtPagarNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtPagarNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 150, -1));

        txtCambioNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel10.add(txtCambioNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 150, -1));

        jLabelTotalPagarNV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotalPagarNV.setText("-----------------");
        jPanel10.add(jLabelTotalPagarNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 540, 220, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Total Pagar");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Pagar con");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        tabbedPaneHeader.addTab("tab7", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Total", "Fecha"
            }
        ));
        jScrollPane11.setViewportView(jTableVentas);

        jPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 1270, 450));

        PaginadoVentas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadoVentasLayout = new javax.swing.GroupLayout(PaginadoVentas);
        PaginadoVentas.setLayout(PaginadoVentasLayout);
        PaginadoVentasLayout.setHorizontalGroup(
            PaginadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        PaginadoVentasLayout.setVerticalGroup(
            PaginadoVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel11.add(PaginadoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1270, 80));

        tabbedPaneHeader.addTab("tab8", jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Proveedor", "Total", "Fecha"
            }
        ));
        jScrollPane12.setViewportView(jTableCompras);

        jPanel12.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 69, 1270, 450));

        PaginadoCompras.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PaginadoComprasLayout = new javax.swing.GroupLayout(PaginadoCompras);
        PaginadoCompras.setLayout(PaginadoComprasLayout);
        PaginadoComprasLayout.setHorizontalGroup(
            PaginadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );
        PaginadoComprasLayout.setVerticalGroup(
            PaginadoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel12.add(PaginadoCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1270, 80));

        tabbedPaneHeader.addTab("tab9", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelNuevosDatosEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNuevosDatosEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelNuevosDatosEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevosDatosEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRucEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelRucEmpresa.setText("Ruc");
        jPanelNuevosDatosEmpresa.add(jLabelRucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        txtRucEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevosDatosEmpresa.add(txtRucEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, 30));

        jLabelTelefonoEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTelefonoEmpresa.setText("Teléfono");
        jPanelNuevosDatosEmpresa.add(jLabelTelefonoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, 30));

        txtTelefonoEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTelefonoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmpresaActionPerformed(evt);
            }
        });
        jPanelNuevosDatosEmpresa.add(txtTelefonoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, 30));

        jLabelMensajeEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelMensajeEmpresa.setText("Mensaje:");
        jPanelNuevosDatosEmpresa.add(jLabelMensajeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, 30));

        btnModificarEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarEmpresa.setText("Modificar");
        btnModificarEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanelNuevosDatosEmpresa.add(btnModificarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 90, 30));

        txtNombreEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanelNuevosDatosEmpresa.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 30));

        jLabelNombreEmpresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNombreEmpresa.setText("Nombre");
        jPanelNuevosDatosEmpresa.add(jLabelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 30));

        jScrollPane14.setViewportView(txtDireccionEmpresa);

        jPanelNuevosDatosEmpresa.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, 160));

        jScrollPane13.setViewportView(txtMensajeEmpresa);

        jPanelNuevosDatosEmpresa.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 220, 130));

        jLabelDireccionEmpresa1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDireccionEmpresa1.setText("Dirección:");
        jPanelNuevosDatosEmpresa.add(jLabelDireccionEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 30));

        jPanel13.add(jPanelNuevosDatosEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 610));

        tabbedPaneHeader.addTab("tab10", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1290, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        tabbedPaneHeader.addTab("tab11", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableNuevaCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Cantidad", "Precio", "Total"
            }
        ));
        jScrollPane10.setViewportView(jTableNuevaCompra);

        jPanel15.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1250, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Proveedor");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 537, -1, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Producto");
        jPanel15.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Cant");
        jPanel15.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Precio");
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Total");
        jPanel15.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        btnGenerarNC.setBackground(new java.awt.Color(0, 0, 0));
        btnGenerarNC.setText("Generar");
        btnGenerarNC.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGenerarNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNCActionPerformed(evt);
            }
        });
        jPanel15.add(btnGenerarNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 90, 30));

        txtTotalNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalNCActionPerformed(evt);
            }
        });
        jPanel15.add(txtTotalNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 50, -1));

        txtCantNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCantNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantNCActionPerformed(evt);
            }
        });
        jPanel15.add(txtCantNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 50, -1));

        txtProductoNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel15.add(txtProductoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 260, -1));

        txtCodNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel15.add(txtCodNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        txtPrecioNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel15.add(txtPrecioNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 120, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Código");
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboProveederNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel15.add(jComboProveederNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 190, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Cambio");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        txtPagarNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel15.add(txtPagarNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 150, -1));

        txtCambioNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCambioNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCambioNCActionPerformed(evt);
            }
        });
        jPanel15.add(txtCambioNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 150, -1));

        jLabelTotalPagarNC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTotalPagarNC.setText("-----------------");
        jPanel15.add(jLabelTotalPagarNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, 220, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Total Pagar");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Pagar con");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        tabbedPaneHeader.addTab("tab12", jPanel15);

        jPanel3.add(tabbedPaneHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1290, 640));

        btnUsers2.setBackground(new java.awt.Color(0, 0, 0));
        btnUsers2.setText("Users");
        btnUsers2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel3.add(btnUsers2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 100, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consultas.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 50, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Punto de Venta Java");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 330, 40));
        jLabel22.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1290, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionProActionPerformed

    private void jComboProveedorProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProveedorProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboProveedorProActionPerformed

    private void txtPrecioCompraProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraProActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtTelefonoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoProveedorActionPerformed

    private void txtCantNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantNVActionPerformed

    private void btnGenerarNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarNVActionPerformed

    private void btnGenerarNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarNCActionPerformed

    private void txtCantNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantNCActionPerformed

    private void txtTotalNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalNCActionPerformed

    private void txtTelefonoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmpresaActionPerformed

    private void txtCambioNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCambioNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCambioNCActionPerformed

    private void txtClaveUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PaginadoCompras;
    private javax.swing.JPanel PaginadoVentas;
    private javax.swing.JPanel PaginadorCategorias;
    public javax.swing.JPanel PaginadorCliente;
    private javax.swing.JPanel PaginadorMedidas;
    private javax.swing.JPanel PaginadorPro;
    private javax.swing.JPanel PaginadorProveedor;
    private javax.swing.JPanel PaginadorUsuarios;
    private org.edisoncor.gui.button.ButtonTextDown btnGenerarNC;
    private org.edisoncor.gui.button.ButtonTextDown btnGenerarNV;
    private org.edisoncor.gui.button.ButtonTextDown btnModificarCategoria;
    public org.edisoncor.gui.button.ButtonTextDown btnModificarCliente;
    private org.edisoncor.gui.button.ButtonTextDown btnModificarEmpresa;
    private org.edisoncor.gui.button.ButtonTextDown btnModificarMedida;
    private org.edisoncor.gui.button.ButtonTextDown btnModificarPro;
    private org.edisoncor.gui.button.ButtonTextDown btnModificarProveedor;
    public org.edisoncor.gui.button.ButtonTextDown btnModificarUsuario;
    private org.edisoncor.gui.button.ButtonTextDown btnNuevaCategoria;
    private org.edisoncor.gui.button.ButtonTextDown btnNuevaMedida;
    public org.edisoncor.gui.button.ButtonTextDown btnNuevoCliente;
    private org.edisoncor.gui.button.ButtonTextDown btnNuevoPro;
    private org.edisoncor.gui.button.ButtonTextDown btnNuevoProveedor;
    public org.edisoncor.gui.button.ButtonTextDown btnNuevoUsuario;
    private org.edisoncor.gui.button.ButtonTextDown btnRegistrarCategoria;
    public org.edisoncor.gui.button.ButtonTextDown btnRegistrarCliente;
    private org.edisoncor.gui.button.ButtonTextDown btnRegistrarMedida;
    private org.edisoncor.gui.button.ButtonTextDown btnRegistrarPro;
    private org.edisoncor.gui.button.ButtonTextDown btnRegistrarProveedor;
    public org.edisoncor.gui.button.ButtonTextDown btnRegistrarUsuario;
    private org.edisoncor.gui.button.ButtonTextDown btnUsers2;
    public javax.swing.JComboBox<String> jComboCajaUsuario;
    private javax.swing.JComboBox<String> jComboCategoriaPro;
    private javax.swing.JComboBox<String> jComboClienteNV;
    private javax.swing.JComboBox<String> jComboMedidaPro;
    private javax.swing.JComboBox<String> jComboProveederNC;
    private javax.swing.JComboBox<String> jComboProveedorPro;
    public javax.swing.JComboBox<String> jComboRolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCajaUsuario1;
    private javax.swing.JLabel jLabelCategoria;
    public javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelCodigo;
    public javax.swing.JLabel jLabelConfig;
    private javax.swing.JLabel jLabelContraseñaUsuario;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelDireccionCliente;
    private javax.swing.JLabel jLabelDireccionEmpresa1;
    private javax.swing.JLabel jLabelDireccionProveedor;
    private javax.swing.JLabel jLabelMedida;
    public javax.swing.JLabel jLabelMedidas;
    private javax.swing.JLabel jLabelMensajeEmpresa;
    private javax.swing.JLabel jLabelNombreCategoria;
    private javax.swing.JLabel jLabelNombreCliente;
    private javax.swing.JLabel jLabelNombreCortoMedida;
    private javax.swing.JLabel jLabelNombreEmpresa;
    private javax.swing.JLabel jLabelNombreMedida;
    private javax.swing.JLabel jLabelNombreProveedor;
    private javax.swing.JLabel jLabelNombreUsuario;
    public javax.swing.JLabel jLabelNuevaCompra;
    public javax.swing.JLabel jLabelNuevaVenta;
    private javax.swing.JLabel jLabelPrecioCompra;
    private javax.swing.JLabel jLabelPrecioVenta;
    public javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelProveedor;
    public javax.swing.JLabel jLabelProveedores;
    private javax.swing.JLabel jLabelRolUsuario;
    private javax.swing.JLabel jLabelRucEmpresa;
    private javax.swing.JLabel jLabelRucProveedor;
    private javax.swing.JLabel jLabelTelefonoCliente;
    private javax.swing.JLabel jLabelTelefonoEmpresa;
    private javax.swing.JLabel jLabelTelefonoProveedor;
    private javax.swing.JLabel jLabelTotalPagarNC;
    private javax.swing.JLabel jLabelTotalPagarNV;
    private javax.swing.JLabel jLabelUsuario;
    public javax.swing.JLabel jLabelUsuarios;
    public javax.swing.JMenuItem jMenuEliminarUser;
    public javax.swing.JMenuItem jMenuReingresarUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelCatego;
    public javax.swing.JPanel jPanelClientes;
    public javax.swing.JPanel jPanelConfig;
    public javax.swing.JPanel jPanelMedidas;
    private javax.swing.JPanel jPanelNuevaCategoria;
    public javax.swing.JPanel jPanelNuevaCompra;
    private javax.swing.JPanel jPanelNuevaMedida;
    public javax.swing.JPanel jPanelNuevaVenta;
    private javax.swing.JPanel jPanelNuevoCliente;
    private javax.swing.JPanel jPanelNuevoProducto;
    private javax.swing.JPanel jPanelNuevoProveedor;
    private javax.swing.JPanel jPanelNuevoUsuario;
    private javax.swing.JPanel jPanelNuevosDatosEmpresa;
    public javax.swing.JPanel jPanelProductos;
    public javax.swing.JPanel jPanelProveedores;
    public javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JPopupMenu jPopuUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableCategorias;
    public javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableCompras;
    private javax.swing.JTable jTableMedidas;
    private javax.swing.JTable jTableNuevaCompra;
    private javax.swing.JTable jTableNuevaVenta;
    private javax.swing.JTable jTablePro;
    private javax.swing.JTable jTableProveedores;
    public javax.swing.JTable jTableUsuarios;
    private javax.swing.JTable jTableVentas;
    public javax.swing.JLabel jlabelCategorias;
    private org.edisoncor.gui.tabbedPane.TabbedPaneHeader tabbedPaneHeader;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtBuscar;
    public javax.swing.JTextField txtBuscarUser;
    private javax.swing.JTextField txtCambioNC;
    private javax.swing.JTextField txtCambioNV;
    private javax.swing.JTextField txtCantNC;
    private javax.swing.JTextField txtCantNV;
    public javax.swing.JPasswordField txtClaveUsuario;
    private javax.swing.JTextField txtCodNC;
    private javax.swing.JTextField txtCodNV;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtDescripcionPro;
    public javax.swing.JTextPane txtDireccionCliente;
    private javax.swing.JTextPane txtDireccionEmpresa;
    private javax.swing.JTextPane txtDireccionProveedor;
    public javax.swing.JTextField txtIdUser;
    private javax.swing.JTextPane txtMensajeEmpresa;
    private javax.swing.JTextField txtNombreCategoria;
    public javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreCortoMedida;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtNombreMedida;
    private javax.swing.JTextField txtNombreProveedor;
    public javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtPagarNC;
    private javax.swing.JTextField txtPagarNV;
    private javax.swing.JTextField txtPrecioCompraPro;
    private javax.swing.JTextField txtPrecioNC;
    private javax.swing.JTextField txtPrecioNV;
    private javax.swing.JTextField txtPrecioVentaPro;
    private javax.swing.JTextField txtProductoNC;
    private javax.swing.JTextField txtProductoNV;
    private javax.swing.JTextField txtRucEmpresa;
    private javax.swing.JTextField txtRucProveedor;
    private javax.swing.JTextField txtStockNV;
    public javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTelefonoProveedor;
    private javax.swing.JTextField txtTotalNC;
    private javax.swing.JTextField txtTotalNV;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
