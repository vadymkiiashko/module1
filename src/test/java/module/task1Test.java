package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class task1Test {


    @Test
    public void task1sortTest(){


        task1 MyTest = new task1();
        int[] nums = {1,2,3,4,5,5,5,9};
        int  expected = 6;
        int result = MyTest.howManyUniques(nums);

        assertEquals("",expected,result);


    }

    @Test
    public void task1EmptyArrayTest(){

        task1 MyTest = new task1();
        int[] nums = {};
        int  expected = 0;
        int result = MyTest.howManyUniques(nums);

        assertEquals("",expected,result);

    }


    @Test
    public void task1AllSameTest() {


        task1 MyTest = new task1();
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 1;
        int result = MyTest.howManyUniques(nums);

        assertEquals("", expected, result);

    }}
