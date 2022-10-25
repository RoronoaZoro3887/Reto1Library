/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import userPackage.User;

/**
 * Esta es una clase de interfaz
 * @author iker
 */
public interface DaoInteface {
    
    /**
     * Este metodo es para comprobar que un usuario exista en la base de datos y
     * ademas nos devolvera un objeto user para mostrarlo en pantalla.
     * @param usu
     * @return User de la clase usuario
     */
    public User SignIn(User usu);
    /**
     * Este metodo nos introducira un usuario en la base de datos
     * @param usu 
     */
    public void SignUp(User usu);
    /**
     * Este metodo nos saca de la sesion actual del usuario
     */
    public void LogOut();
    
    
}
