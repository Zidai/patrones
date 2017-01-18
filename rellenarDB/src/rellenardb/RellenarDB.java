/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rellenardb;

import java.sql.*;
import java.io.*;
import java.io.IOException;
import java.util.List;
import org.jdom.Document;         // |
import org.jdom.Element;          // |\ Librerías
import org.jdom.JDOMException;    // |/ JDOM
import org.jdom.input.SAXBuilder; // |
/**
 *
 * @author subzero
 */
public class RellenarDB {

  public static void main(String[]args){
      RellenarDB n=new RellenarDB();
      n.cargarXml();
  }
  

public void cargarXml()
{
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File( "noticias.xml" );
    try
    {
        //Se crea el documento a traves del archivo
        Document document = (Document) builder.build( xmlFile );
 
        //Se obtiene la raiz 'tables'
        Element rootNode = document.getRootElement();
        
        Element canal=rootNode.getChild("channel");
        //Se obtiene la lista de hijos de la raiz 'tables'
        List list = (canal.getChildren("item"));
 
        //Se recorre la lista de hijos de 'tables'
        for ( int i = 0;i< list.size(); i++ )
        {
            //Se obtiene el elemento 'tabla'
            Element item = (Element) list.get(i);
 
            //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
            String guid = item.getChildText("guid");
            System.out.println( "guid: " + guid);
            String titulo = item.getChildText("title");
            System.out.println( "title: " + titulo);
            String des = item.getChildText("description");
            System.out.println( "des: " + des);
            String link = item.getChildText("link");
            System.out.println( "link: " + link);
            String pubDate = item.getChildText("pubDate");
            System.out.println( "puDate: " + pubDate);
            
            
            
            Connection connection = getConnection.getConnection();

          Statement stmt = connection.createStatement();
          String s="INSERT INTO noticias(guid,titulo,descripcion,link,pubdate) VALUES(\'"+guid+"\',\'"+titulo+"\',\'"+des+"\',\'"+link+"\',\'"+pubDate+"\')";
          System.out.println(s);
          stmt.executeUpdate(s);
            
 
            
        }
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    }
    catch(Exception e){
          e.printStackTrace();
        }
}
    
}
