/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This is the exception class for when the password is not correct.
 * @author iker
 */
public class LoginPasswordException extends Exception{
    
    public LoginPasswordException(String msg){
        super(msg);
    }
}
