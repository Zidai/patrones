/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bezier;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author feliciano
 */
public class pruebaBezierAndroid {
    public static void main(String args[]){
        ArrayList<Point> puntos;
        puntos = new ArrayList<>();
        bezierAndroid ba=new bezierAndroid();
        /*puntos.add(new Point(42,68));
        puntos.add(new Point(488,147));
        puntos.add(new Point(35,353));
        puntos.add(new Point(479,486));*/


puntos.add(new Point(243,266));
puntos.add(new Point(314,332));
puntos.add(new Point(429,222));
puntos.add(new Point(420,318));

        ba.dibujarBezier(puntos,10);
    }
}
