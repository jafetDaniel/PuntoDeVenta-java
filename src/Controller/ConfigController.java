
package Controller;

import View.PanelAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigController implements MouseListener{
    private PanelAdmin views;

    public ConfigController(PanelAdmin views) {
        this.views = views;
        this.views.jlabelCategorias.addMouseListener(this);
        this.views.jLabelClientes.addMouseListener(this);
        this.views.jLabelConfig.addMouseListener(this);
        this.views.jLabelMedidas.addMouseListener(this);
        this.views.jLabelNuevaCompra.addMouseListener(this);
        this.views.jLabelNuevaVenta.addMouseListener(this);
        this.views.jLabelProveedores.addMouseListener(this);
        this.views.jLabelUsuarios.addMouseListener(this);
        this.views.jLabelProductos.addMouseListener(this);
       
    }
    
    

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == views.jlabelCategorias) {
            views.jPanelCatego.setBackground(new Color(255,51,51));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
