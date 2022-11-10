/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagePackage;

import enumPackcage.ActionType;
import enumPackcage.ExceptionType;
import java.io.Serializable;
import userPackage.User;

/**
 * This is the message class that is in charge of storing the objects that 
 * we are going to pass from the client to the server.
 * @author iker
 */
public class Message implements Serializable{
    
    private User user;
    private ActionType acType;
    private ExceptionType exType;
    
    
    public Message(User usuario,ActionType aType, ExceptionType eType){
        this.user = usuario;
        this.acType = aType;
        this.exType = eType;
    }

    public Message() {
       
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ActionType getAcType() {
        return acType;
    }

    public void setAcType(ActionType acType) {
        this.acType = acType;
    }

    public ExceptionType getExType() {
        return exType;
    }

    public void setExType(ExceptionType exType) {
        this.exType = exType;
    }
    
    
    
}
