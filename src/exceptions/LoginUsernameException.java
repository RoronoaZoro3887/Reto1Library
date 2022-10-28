/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This class is an exception to show an error if the user does not exist.
 * @author iker
 */
public class LoginUsernameException extends Exception{
    
    public LoginUsernameException(String msg){
        super(msg);
        
    }
}
