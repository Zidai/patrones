/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oribe
 */
 import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
public class Prueba {
   

    
    static public void main(String[] args)
    {
        Document document = new Document(); 
        
        try{
            PdfWriter.getInstance(document, new FileOutputStream("tablas.pdf"));
            document.open();
            
            // Este codigo genera una tabla de 3 columnas
                           
            
            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
           PdfPTable table = new PdfPTable(8);                
            
            // addCell() agrega una celda a la tabla, el cambio de fila
            // ocurre automaticamente al llenar la fila
            PdfPCell celdaIni = new PdfPCell(new Paragraph("HOJA DE ASISTENCIA"));
            
            // Indicamos cuantas columnas ocupa la celda
            celdaIni.setColspan(8);
            table.addCell(celdaIni);
            int i=0;
          
                table.addCell("sdfsdf");
                table.addCell("sdfsdf");
                table.addCell("asdasds");
                table.addCell("asda");
                table.addCell("ssdf");
                table.addCell("sdsdfdg");
                table.addCell("ssdf");
                table.addCell("sdsdfdg");
            
            // Indicamos cuantas columnas ocupa la celda
           
            
            // Agregamos la tabla al documento            
            document.add(table);
            
            document.close();
            
        }catch(Exception e)
        {
            System.err.println("Ocurrio un error al crear el archivo");
            System.exit(-1);
        }
    }
}
    
