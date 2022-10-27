/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import userPackage.User;

/**
 * This is an interface class
 * @author iker
 */
public interface DaoInteface {
    
    /**
     * This method is to check that a user exists in the database and it will 
     * also return a user object to display on the screen.
     * @param usu is a user object
     * @return User of the user class
     */
    public User SignIn(User usu);
    /**
     * This method will enter a user in the database.
     * @param usu 
     */
    public void SignUp(User usu);
    /**
     * This method logs us out of the user's current session.
     */
    public void LogOut();
    
    
}
