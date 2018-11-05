/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.io.*; 
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author 154003771
 */
public class King extends Piece{
    public int x=Window.getX(0)+Window.getWidth2()/Board.NUM_COLUMNS;
    public int y=Window.getY(0)+Window.getHeight2()/Board.NUM_ROWS;
    private int xdelta=Window.getWidth2()/Board.NUM_COLUMNS;
    private int ydelta=Window.getHeight2()/Board.NUM_ROWS;
        public void draw(Graphics2D g, Color color1, Color color2){
        
        g.fillRect(Window.getX(0)+Window.getWidth2()/Board.NUM_COLUMNS,
                    Window.getY(0)+Window.getHeight2()/Board.NUM_ROWS,
                    Window.getWidth2()/Board.NUM_COLUMNS,
                    Window.getHeight2()/Board.NUM_ROWS);
        g.setColor(color2);
        g.drawString("KING", Window.getX(0)+Window.getWidth2()/Board.NUM_COLUMNS,  
                    Window.getY(0)+Window.getHeight2()/Board.NUM_ROWS+30);
    }
}
