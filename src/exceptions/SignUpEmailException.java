/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This exception shows an error if the email exists.
 * @author iker
 */
public class SignUpEmailException extends Exception{

    public SignUpEmailException(String msg) {
        super(msg);
    }
    
    
}
