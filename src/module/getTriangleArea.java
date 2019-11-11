package module;
import java.util.*;

public class getTriangleArea {

    public double getTriangleArea (int[] pointA,int[] pointB, int[] pointC){


        double abLength = getLength(pointA,pointB);
        double bcLength = getLength(pointB,pointC);
        double acLength = getLength(pointA,pointC);

        if ((abLength + bcLength > acLength )
                || (bcLength+acLength> abLength )
                || (acLength+abLength > bcLength)){

        double area = (abLength +acLength  + bcLength ) /2;

        return area;
    }
        else return -1;
    }

    public double getLength(int[] point1, int [] point2) {
        double xSquared =  ( (point2[0]-point1[0])*(point2[0]-point1[0]));
        double ySquared =  ( (point2[1]-point1[1])*(point2[1]-point1[1]));
        double length= Math.sqrt(Math.abs(xSquared-ySquared));



        return length;
    }

}
