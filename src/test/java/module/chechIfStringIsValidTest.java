package module;

import org.junit.Test;

import static org.junit.Assert.*;

public class chechIfStringIsValidTest {



    @Test
    public void checkIfStringIsValid (){

        chechIfStringIsValid MyCheck = new chechIfStringIsValid();
        Boolean result = MyCheck.isValid("{{((}}()");
        assertTrue(result);
    }
}