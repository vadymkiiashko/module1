package module;

public class chess {

    public boolean canMove(int [] position,int [] moveTo) {

        if ( (position[0]>8 && position[0] < 1)
            &&( position[1]<1  && position[1] >8) ) return false;

            if( (moveTo[0]>8 && moveTo[0] < 1)
                    &&( moveTo[1]<1  && moveTo[1] >8) ) return false;



                if ((( Math.abs( position[0] - moveTo[0]) ==1)&& (Math.abs(position[1] - moveTo[1])==2))

        || ( Math.abs( position[0] - moveTo[0]) ==2)&& (Math.abs(position[1] - moveTo[1])==1))
             return true;


     else return false;
}
}
