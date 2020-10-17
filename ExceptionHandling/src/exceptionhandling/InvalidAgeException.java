/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author pc
 */
public class InvalidAgeException extends ArithmeticException{

    public InvalidAgeException(String message) {
        super(message);
    }
    
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir Invalid Age Hatasıdır");; //To change body of generated methods, choose Tools | Templates.
    }
    
}
