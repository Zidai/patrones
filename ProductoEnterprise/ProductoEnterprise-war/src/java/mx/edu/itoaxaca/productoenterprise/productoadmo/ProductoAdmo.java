/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.productoenterprise.productoadmo;


import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.productoenterprise.modelo.Product;

/**
 *
 * @author subzero
 */
@Named(value = "productoAdmo")
@SessionScoped
public class ProductoAdmo implements Serializable {
    private Product producto;
    /**
     * Creates a new instance of ProductoAdmo
     */
    public ProductoAdmo() {
    }

    public Product getProducto() {
        return producto;
    }

    public void setProducto(Product producto) {
        this.producto = producto;
    }
    
    public void crearProducto(ActionEvent e){
        producto=new Product();
    
    }

    
    
}
