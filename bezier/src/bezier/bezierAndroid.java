/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bezier;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author feliciano
 */
public class bezierAndroid {
    private ArrayList<Integer>px;
    private ArrayList<Integer>py;
    private ArrayList<Integer>pax;
    private ArrayList<Integer>pay;
    private ArrayList<Point> puntos;
    bezierAndroid(){
        px = new ArrayList<>();
        py = new ArrayList<>();  
        pax = new ArrayList<>();
        pay = new ArrayList<>(); 
        puntos = new ArrayList<>();
        //puntos.add(new Point(e.getX(), e.getY()));
    }
    public void dibujarBezier(ArrayList<Point> puntos, int numeroPuntos) {
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
            //panel.getGraphics().fillOval((int) puntoX - 2, (int) puntoY - 2, 4, 4);
            //System.out.println("x= "+(int)puntoX+" y= "+(int)puntoY);
            px.add(map((int)puntoX,0,500,0,100));
            py.add(map((int)puntoY,0,500,0,100));
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
        //System.out.println("\n\n");
        System.out.println("puntos originales");
        System.out.println(px);
        System.out.println(py);
        quitar_iguales();
        ver_pasos();
        System.out.println("imprimiendo pasos que debe de seguir el motor");
        System.out.println(pax);
        System.out.println(pay);
        System.out.println("codigo para arduino");
        for(int i=0;i<pax.size();i++){
            System.out.println("stepper1.step("+pax.get(i)+");");
            System.out.println("stepper2.step("+pay.get(i)+");");
        }
        
        
        /*for(int y=1;y<px.size();y++){
            if(px.get(y)==px.get(y-1) && py.get(y)== py.get(y-1)){
            px.remove(y);
            }
        }*/
//Se dibuja el último trayecto de la curva
        //g.drawLine((int) anteriores.get(anteriores.size() - 1)[0], (int) anteriores.get(anteriores.size() - 1)[1], 
                //(int) puntos.get(tamLista - 1).getX(), (int) puntos.get(tamLista - 1).getY());
        
        
    }
    private double calcularB(double u, int n, int k) {
        
        return (factorial(n) / (factorial(k) * factorial(n - k))) * 
                Math.pow(u, k) * Math.pow(1 - u, n - k);
        
    }
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
    public void quitar_iguales(){
        for(int i=1;i<px.size();i++){
            if(px.get(i)== px.get(i-1)&&py.get(i)== py.get(i-1) ){
                px.remove(i);
                py.remove(i);
                i--;
            }
        }
        System.out.println("aqui va filtrado para que no esten iguales");
        System.out.println(px);
        System.out.println(py);
        System.out.println(px.size());
    }

    private void ver_pasos() {
        pax.add(1);
        pay.add(0);
        for(int i=1;i<px.size();i++){
            pax.add(px.get(i)-px.get(i-1));
            pay.add(py.get(i-1)-py.get(i));
        }
    }
}
