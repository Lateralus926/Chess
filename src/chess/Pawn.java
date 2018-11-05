
package chess;

public class Pawn extends Piece{
    private boolean firstMove;
    Pawn() {
        firstMove = true;
    }
    public boolean getFirstMove() {
        return(firstMove);
    }
}
