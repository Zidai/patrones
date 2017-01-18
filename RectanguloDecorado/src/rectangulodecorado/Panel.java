/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulodecorado;

import javax.swing.JPanel;
import java.awt.*;
/**
 *
 * @author subzero
 */
public abstract class Panel extends JPanel{
    public abstract void pintar(int x,int y,int ancho,int alto);
    
}
