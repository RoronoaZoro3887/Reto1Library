/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This exception shows an error when the user already exists.
 * @author iker
 */
public class SignUpUsernameException extends Exception{

    public SignUpUsernameException(String msg) {
        super(msg);
    }
    
    
}
