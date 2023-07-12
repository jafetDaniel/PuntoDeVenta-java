package View;

import Model.Productos;
import Model.ProductosDao;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Print extends javax.swing.JFrame {
    Productos pro = new Productos();
    ProductosDao proDao = new ProductosDao();
    DefaultTableModel modelo = new DefaultTableModel();

    public Print(int id) {
        initComponents();
        Folio.setText("" + id);
        listar(id);
        calcularCompra();
    }
    
      public void listar(int id) {
        List<Productos> lista = proDao.listaDetalle(id);
        modelo = (DefaultTableModel) TableDetalle.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getCantidad();
            ob[1] = lista.get(i).getDescripcion();
            ob[2] = lista.get(i).getPrecio_compra();
            ob[3] = lista.get(i).getPrecio_venta();
            modelo.addRow(ob);
        }
        TableDetalle.setModel(modelo);
        JTableHeader header = TableDetalle.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
        header.setForeground(Color.white);
    }
    
    private void calcularCompra(){
        double total = 0.00;
        int numFila = TableDetalle.getRowCount();
        for (int i = 0; i < numFila; i++) {
            total = total + Double.parseDouble(String.valueOf(TableDetalle.getValueAt(i, 3)));
        }
        TotalPagar.setText("Total: "+ total);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrint = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDetalle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TotalPagar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Folio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrint.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrint.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant.", "Descripción", "Precio", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(TableDetalle);

        PanelPrint.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 167, 550, 350));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Datos del Proveedor");
        PanelPrint.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Punto de Venta");
        PanelPrint.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 130, 20));

        TotalPagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalPagar.setText("Total: ------");
        PanelPrint.add(TotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 180, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre: ");
        PanelPrint.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sitio web: https://puntodeventa.com");
        PanelPrint.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 260, 20));

        Folio.setBackground(new java.awt.Color(204, 204, 204));
        Folio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Folio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Folio.setText("1");
        Folio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrint.add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 130, 20));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ruc:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrint.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 130, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Folio");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrint.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 130, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Dirección:");
        PanelPrint.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 180, 20));

        getContentPane().add(PanelPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 570, 560));

        btnImprimir.setBackground(new java.awt.Color(0, 0, 204));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Toolkit tk = PanelPrint.getToolkit();
        PrintJob pj =  tk.getPrintJob(this, null, null);
        Graphics g = pj.getGraphics();
        PanelPrint.print(g);
        g.dispose();
        pj.end();
    }//GEN-LAST:event_btnImprimirActionPerformed
public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Folio;
    private javax.swing.JPanel PanelPrint;
    private javax.swing.JTable TableDetalle;
    private javax.swing.JLabel TotalPagar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
