/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author 373001349
 */
public class Board {
    
    
    public final static int NUM_ROWS = 8;
    public final static int NUM_COLUMNS = 8;
    
    
    public static void Draw(Graphics2D g){
         
//Calculate the width and height of each board square.
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
        
 //Draw the grid.
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<Board.NUM_ROWS;zrow++)
        {
            for (int zcolumn=0;zcolumn<Board.NUM_COLUMNS;zcolumn++)
            {
                    if (zrow % 2 == zcolumn % 2)
                        g.setColor(new Color(187,172,153));
                    else
                        g.setColor(new Color(112,91,73));
                    g.fillRect(Window.getX(0)+zcolumn*Window.getWidth2()/Board.NUM_COLUMNS,
                    Window.getY(0)+zrow*Window.getHeight2()/Board.NUM_ROWS,
                    Window.getWidth2()/Board.NUM_COLUMNS,
                    Window.getHeight2()/Board.NUM_ROWS);
            }
        }
    }
    
    
    public static void Reset() {
 
        
        for (int zi = 0;zi<NUM_ROWS;zi++)
        {
            for (int zx = 0;zx<NUM_COLUMNS;zx++)
            {
                
            }
        }
    }
}

