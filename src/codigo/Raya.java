/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author pilar
 */
public class Raya  {
    
int x1, x2, y1, y2;
    Color color = null;
    private Color _color;
    
   
 public Raya(int _x1, int _y1, Color _color){
        this.x1 = _x1;
        this.y1 = _y1;
        this.color = _color;
    }
    

    
  
    
    //El pinta linea coge la ultima coordenada del raton y se la pasamos a 
    //pintaLinea y hay uno las 2 coordenadas con drawLine
   

   public  void pintaRaya(Graphics g, int posX, int posY){
        
        this.x2= posX;
        this.y2 =posY;
        //Cogemos el color
        g.setColor(color);
        
        g.drawLine(x1, y1, x2, y2);
    }
  
    
   
   

   
}
