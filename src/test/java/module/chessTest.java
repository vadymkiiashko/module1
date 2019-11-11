package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class chessTest {


    @Test
    public void moveOutOfboard(){

        chess MyChess = new chess();

        int[] position1 = {1,1};
        int[] position2 = {0,1};
        boolean result = MyChess.canMove(position1,position2);
        assertFalse(result);
    }

    @Test
    public void moveTooFarX(){

        chess MyChess = new chess();

        int[] position1 = {1,1};
        int[] position2 = {4,2};
        boolean result = MyChess.canMove(position1,position2);
        assertFalse(result);
    }
    @Test
    public void moveTooFary(){

        chess MyChess = new chess();

        int[] position1 = {1,1};
        int[] position2 = {2,6};
        boolean result = MyChess.canMove(position1,position2);
        assertFalse(result);
    }

    @Test
    public void moveValid(){

        chess MyChess = new chess();

        int[] position1 = {1,1};
        int[] position2 = {2,3};
        boolean result = MyChess.canMove(position1,position2);
        assertTrue(result);
    }
}