/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bezier;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Simple aplicación para el dibujado de una curva de Bezier.
 * 
 * @author Jesús Serrato
 */
public class bezierTutorial {

    private JFrame frame;
    private JPanel panel;
    private JButton botonDibujar;
    private JButton botonBorrar;
    private JToolBar barra;
    private JSpinner spinner;
    private SpinnerModel model;
    private ArrayList<Point> puntos;
    private ArrayList<Integer>px;
    private ArrayList<Integer>py;

    /**
     * Constructor de la clase sin argumentos
     */
    public bezierTutorial() {
        
        puntos = new ArrayList<>();
        px = new ArrayList<>();
        py = new ArrayList<>();
        inicializarComponentes();
        
    }
    
    /**
     * Método para el inicializado de la GUI.
     */
    public void inicializarComponentes() {
    
        this.frame = new JFrame("Curvas de Bezier");
        frame.getContentPane().setLayout(new BorderLayout());    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.addMouseListener(
                new MouseAdapter() {

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                        panel.getGraphics().fillOval(e.getX() - 5, e.getY() - 5, 10, 10);
                        puntos.add(new Point(e.getX(), e.getY()));
                        //System.out.println("x: "+e.getX()+" y:"+e.getY());
                        System.out.println("puntos.add(new Point("+e.getX()+","+e.getY()+"));");
                    }
        
                }
                
        );
        
        model = new SpinnerNumberModel(100, 1, 1000, 10);
        
        spinner = new JSpinner(model);
                       
        botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.repaint();
                        puntos.clear();
                        panel.getGraphics().drawLine(0, 300, 500, 300);
                        
                    }
        
                }
        );
        
        this.botonDibujar = new JButton("Dibujar");
        this.botonDibujar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.getGraphics().drawLine(0, 180, 500, 180);
                        panel.getGraphics().drawLine(0, 320, 500, 320);
                        
                        panel.getGraphics().drawLine(180, 0, 180, 500);
                        panel.getGraphics().drawLine(320, 0, 320, 500);
                        panel.getGraphics().fillOval(150,315, 10, 10);
                        panel.getGraphics().fillOval(340,315, 10, 10);
                        dibujarBezier(panel.getGraphics(), puntos, (int) model.getValue());
                        puntos.clear();
                       /* int xx[]={21, 22, 23, 24, 24, 25, 25, 26, 26, 27, 27, 28, 28, 29, 29, 30, 30, 30, 31, 31, 32, 32, 33, 34, 34, 35, 35, 36, 37, 37, 38, 38, 39, 40, 41, 42, 42, 43, 43, 44, 45, 46, 47, 48, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 46, 45, 44, 43, 42, 41, 41, 40, 39, 39, 38, 38, 37, 37, 36, 36, 35, 35, 35, 35, 35, 35, 35, 36, 36, 37, 37, 38, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 49, 50, 51, 51, 52, 53, 53, 54, 55, 55, 56, 56, 57, 57, 58, 58, 59, 59, 60, 60, 60, 61, 61, 61, 61, 61, 62, 61, 61, 61, 61, 60, 60, 60, 60, 59, 59, 59, 59, 59, 59, 58, 58, 58, 58, 58, 58, 57, 57, 57, 57, 57, 57, 57, 57, 58, 58, 58, 59, 60, 61};
                        int yy[]={64, 64, 64, 64, 63, 63, 62, 62, 61, 61, 60, 59, 58, 58, 57, 57, 56, 55, 55, 54, 54, 53, 52, 51, 50, 50, 49, 48, 48, 47, 47, 46, 45, 44, 43, 43, 42, 42, 41, 41, 40, 40, 39, 39, 38, 38, 38, 37, 37, 37, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 37, 37, 37, 37, 37, 38, 38, 39, 39, 39, 40, 40, 41, 41, 42, 43, 44, 44, 45, 46, 46, 47, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 61, 62, 62, 63, 63, 63, 63, 63, 63, 63, 63, 63, 62, 62, 62, 61, 61, 61, 60, 59, 59, 58, 58, 57, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 44, 43, 42, 40, 39, 37, 36, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 62, 63, 64, 64, 64, 64};
                        for(int v=0;v<xx.length;v++){
                            try {
                                panel.getGraphics().fillOval(xx[v] - 2, (int) yy[v] - 2, 4, 4);
                                Thread.sleep(20);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(bezierTutorial.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }*/

                    }
        
                }
        );
        
        this.barra = new JToolBar();
        
        barra.add(botonBorrar);
        barra.add(botonDibujar);
        barra.add(spinner);
        
        frame.add(barra, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);        
        frame.setSize(500, 530);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new bezierTutorial();
        
    }
    
    /**
     * Método para el dibujado de una curva de Bezier.
     * 
     * @param g - objeto graphics para el dibujado en pantalla
     * @param puntos - los puntos de control capturados para el dibujado de la curva
     * @param numeroPuntos - El número de puntos que componen a la curva (a mayor número la curva tiene mayor calidad pero requiere mayor procesamiento)
     */
    public void dibujarBezier(Graphics g, ArrayList<Point> puntos, int numeroPuntos) {
        //Variables para almacenar el punto calculado
        double puntoX = 0, puntoY = 0; 
        px.clear();
        py.clear();
        //En esta lista se guardan los puntos anteriores que nos sirven para poder 
        //dibujar las líneas que van de punto a punto
        ArrayList<int[]> anteriores = new ArrayList<>();
        double avance = 1 / ((double) numeroPuntos);
        int tamLista = puntos.size();
        
        //Este ciclo realiza el número de iteraciones que el usuario desee en base 
        //al número de puntos que se desean
        for (double u = 0; u <= 1; u += avance) {   
            //Este ciclo itera sobre los puntos a dibujar y realiza el cálculo del siguiente punto de la curva
            for (int k = 0; k < tamLista; k++) {
                double b = calcularB(u, tamLista - 1, k);
                puntoX += puntos.get(k).getX() * b;
                puntoY += puntos.get(k).getY() * b;
                
            }

            //Se almacenan y se dibuja el punto calculado anteriormente
            anteriores.add(new int[] {(int)puntoX, (int) puntoY});           
            //g.drawLine((int) puntoX, (int) puntoY, (int) puntoX, (int) puntoY);
            panel.getGraphics().fillOval((int) puntoX - 2, (int) puntoY - 2, 4, 4);
            //System.out.println("x= "+(int)puntoX+" y= "+(int)puntoY);
            px.add(map((int)puntoX,0,500,0,100));
            py.add(map((int)puntoY,0,500,0,100));
            //System.out.println("______________");
            //Se dibuja la línea que va del punto anterior al recien calculado
            //de esa manera no tenemos que calcular punto por punto de toda la curva
            if (anteriores.size() > 1) {
                //g.drawLine(anteriores.get(anteriores.size() - 2)[0], anteriores.get(anteriores.size() - 2)[1], (int) puntoX, (int) puntoY);
                //Removemos el primer elemento que ya no se utiliza
                anteriores.remove(0);
            }
            
            //Borramos los valores anteriores para la siguiente iteración
            puntoX = puntoY = 0;
        }
        System.out.println("\n\n");
        //System.out.println(px);
        //System.out.println(py);
        /*for(int y=1;y<px.size();y++){
            if(px.get(y)==px.get(y-1) && py.get(y)== py.get(y-1)){
            px.remove(y);
            }
        }*/
        System.out.println("------------------");
//Se dibuja el último trayecto de la curva
        //g.drawLine((int) anteriores.get(anteriores.size() - 1)[0], (int) anteriores.get(anteriores.size() - 1)[1], 
                //(int) puntos.get(tamLista - 1).getX(), (int) puntos.get(tamLista - 1).getY());
        
        
    }
    
    /**
     * Método para el calculo de B que es la k-ésima función de combinación para 
     * n + 1 puntos de control.
     * 
     * @param u - número de la iteración actual
     * @param n - número de puntos de control
     * @param k - número del punto actual
     * 
     * @return b
     */
    private double calcularB(double u, int n, int k) {
        
        return (factorial(n) / (factorial(k) * factorial(n - k))) * 
                Math.pow(u, k) * Math.pow(1 - u, n - k);
        
    }
    
    /**
     * Método para el cálculo del factorial de un número.
     * 
     * @param n - número del cual se desa conocer el factorial
     * 
     * @return factorial de n
     */
    private double factorial(int n) {
    
        double factorial = 1;
        
        if (n == 0 || n == 1) 
            return factorial;
        else {
            for (int i = 2; i <= n; i++) {
                factorial *= i; 
            }

            return factorial;        
        }
                
    }
public int map(int x, int in_min, int in_max, int out_min, int out_max)
{
  return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
}
    
}