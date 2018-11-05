
package chess;

public class Window
{
    static final int XBORDER = 20;
    static final int YBORDER = 40;
    static final int YTITLE = 30;
    static final int WINDOW_BORDER = 8;
    static final int WINDOW_WIDTH = 2*(WINDOW_BORDER + XBORDER) + Board.NUM_COLUMNS*90;
    static final int WINDOW_HEIGHT = YTITLE + WINDOW_BORDER + 2 * YBORDER + Board.NUM_ROWS*90;
    public static int xsize = -1;
    public static int ysize = -1;
/////////////////////////////////////////////////////////////////////////
    static public int getX(int x) {
        return (x + XBORDER + WINDOW_BORDER);
    }

    static public int getY(int y) {
        return (y + YBORDER + YTITLE );
    }

    static public int getYNormal(int y) {
        return (-y + YBORDER + YTITLE + Window.getHeight2());
    }
    
    static public int getWidth2() {
        return (xsize - 2 * (XBORDER + WINDOW_BORDER));
    }

    static public int getHeight2() {
        return (ysize - 2 * YBORDER - WINDOW_BORDER - YTITLE);
    }    
}

