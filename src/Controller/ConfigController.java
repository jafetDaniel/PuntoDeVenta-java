
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
        //cambiar de color (rojo) al pasar mouse sobre alguna opicion del menu
        if (e.getSource() == views.jlabelCategorias) {
            views.jPanelCatego.setBackground(new Color(255,51,51));
        }else
            if(e.getSource() == views.jLabelClientes){
                views.jPanelClientes.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelConfig){
                views.jPanelConfig.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelMedidas){
                views.jPanelMedidas.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelNuevaCompra){
                views.jPanelNuevaCompra.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelNuevaVenta){
                views.jPanelNuevaVenta.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelProveedores){
                views.jPanelProveedores.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelUsuarios){
                views.jPanelUsuarios.setBackground(new Color(255,51,51));
            }else
            if(e.getSource() == views.jLabelProductos){
                views.jPanelProductos.setBackground(new Color(255,51,51));
            }
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
         //quitar color al quitar mouse de alguna opcion del menu
         if (e.getSource() == views.jlabelCategorias) {
            views.jPanelCatego.setBackground(new Color(51,51,51));
        }else
            if(e.getSource() == views.jLabelClientes){
                views.jPanelClientes.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelConfig){
                views.jPanelConfig.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelMedidas){
                views.jPanelMedidas.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelNuevaCompra){
                views.jPanelNuevaCompra.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelNuevaVenta){
                views.jPanelNuevaVenta.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelProveedores){
                views.jPanelProveedores.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelUsuarios){
                views.jPanelUsuarios.setBackground(new Color(51,51,51));
            }else
            if(e.getSource() == views.jLabelProductos){
                views.jPanelProductos.setBackground(new Color(51,51,51));
            }
    }
    
}
