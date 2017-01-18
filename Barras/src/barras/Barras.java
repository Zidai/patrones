package barras;


import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author subzero
 */
public class Barras extends JFrame{
    private ArrayList<Double> nvalores;
    private JPanel contentPane;
    
    public Barras(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setBounds(100, 100, 450, 300);
          contentPane = new JPanel();
          contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
          setContentPane(contentPane);
          contentPane.setLayout(null);
          setBounds(0,0,800,600);
          nvalores=new ArrayList<Double>();
    }

    public ArrayList getNvalores() {
        return nvalores;
    }

    public void setNvalores(ArrayList nvalores) {
        this.nvalores = nvalores;
    }
    

    public void paint(Graphics g){
        int xs=0; 
        int width=10;
        for (Double nvalore : nvalores) {
            xs+=40;
            g.drawString(nvalore.toString(),xs,38);
            g.draw3DRect(xs,40,width,nvalore.intValue(), rootPaneCheckingEnabled);
            xs+=10;
        }
    }
    
    public static void main(String[] args) {
        Barras frame = new Barras();
        ArrayList<Double> n=new ArrayList();
        n.add(200.3);
        n.add(132.2);
        n.add(123.4);
        n.add(500.0);
        n.add(200.2);
        n.add(450.4);
        frame.setNvalores(n);
        frame.setVisible(true);
    }
}
