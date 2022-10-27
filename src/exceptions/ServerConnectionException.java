/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * This exception is to display an error message if the server takes too long 
 * to connect.
 * @author iker
 */
public class ServerConnectionException extends Exception{

    public ServerConnectionException(String msg) {
        super(msg);
    }
    
}
