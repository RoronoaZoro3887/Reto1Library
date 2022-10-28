/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This exception is to show an error if the user or email already exists.
 * @author iker
 */
public class SignUpEmailAndUsernameException extends Exception{

    public SignUpEmailAndUsernameException(String msg) {
        super(msg);
    }
    
}
