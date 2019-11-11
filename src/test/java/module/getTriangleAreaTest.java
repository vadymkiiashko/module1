package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class getTriangleAreaTest {


    @Test
    public void getLengthTest (){

        getTriangleArea MyArea = new getTriangleArea();

        int[] pointA = {4,6};
        int[] pointB = {4,8};
        double result = MyArea.getLength(pointA,pointB) ;

        assertEquals(2,result,01);
    }

    @Test

    public void getAreaTest(){
        getTriangleArea MyArea = new getTriangleArea();

        int[] pointA = {4,6};
        int[] pointB = {4,10};

        int[] pointC = {5,7};

        double result =  MyArea.getTriangleArea(pointA,pointB,pointC);

        assertEquals(1,result,01);


    }


    @Test

    public void doesntexistTest(){
        getTriangleArea MyArea = new getTriangleArea();

        int[] pointA = {4,1};
        int[] pointB = {4,5};

        int[] pointC = {4,4};

        double result =  MyArea.getTriangleArea(pointA,pointB,pointC);

        assertEquals(-1,result,01);


    }

}