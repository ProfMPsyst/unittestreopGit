/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittest.FirstTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Megha Patel, 2026
 */
public class PasswordValidatorTest {
    
    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    //less than 8 character
    public void testCheckLengthbad() {
        String password = "mypass";
        boolean expResult = false;
       assertEquals(expResult, PasswordValidator.checkLength(password));
      //  assertEquals(false, PasswordValidator.checkLength(password));
   
    }
    
  @Test
    //more than 8 character
    public void testCheckLengthgood() {
        String password = "mypassword";
        boolean expResult = true;
       assertEquals(expResult, PasswordValidator.checkLength(password));
      //  assertEquals(false, PasswordValidator.checkLength(password));
 
      
    }
    @Test
  public void testCheckLengthboundry() {
        String password = "password";
        boolean expResult = true;
       assertEquals(expResult, PasswordValidator.checkLength(password));
      //  assertEquals(false, PasswordValidator.checkLength(password));
 
      
    }
}