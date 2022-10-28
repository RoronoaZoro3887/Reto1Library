/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This is the exception class that checks if the user and password are correct.
 * @author iker
 */
public class LoginUsernameAndPasswordException extends Exception {

    public LoginUsernameAndPasswordException(String msg) {
        super(msg);
    }
    
    
}
