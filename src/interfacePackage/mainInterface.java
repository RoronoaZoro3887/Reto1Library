/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacePackage;

import exceptions.LoginPasswordException;
import exceptions.LoginUsernameAndPasswordException;
import exceptions.LoginUsernameException;
import exceptions.ServerConnectionException;
import exceptions.SignUpEmailAndUsernameException;
import exceptions.SignUpEmailException;
import exceptions.SignUpUsernameException;
import userPackage.User;

/**
 * This is an interface class
 *
 * @author iker
 */
public interface mainInterface {

    /**
     * This method is to check that a user exists in the database and it will
     * also return a user object to display on the screen.
     *
     * @param user is a user object
     * @return User of the user class
     * @throws exceptions.LoginUsernameException
     * @throws exceptions.LoginPasswordException
     * @throws exceptions.LoginUsernameAndPasswordException
     * @throws exceptions.ServerConnectionException
     */
    public User signIn(User user) throws LoginUsernameException,
            LoginPasswordException, LoginUsernameAndPasswordException,
            ServerConnectionException;

    /**
     * This method will enter a user in the database.
     *
     * @param user
     * @throws exceptions.SignUpUsernameException
     * @throws exceptions.SignUpEmailException
     * @throws exceptions.SignUpEmailAndUsernameException
     * @throws exceptions.ServerConnectionException
     */
    public void signUp(User user) throws SignUpUsernameException,
            SignUpEmailException, SignUpEmailAndUsernameException,
            ServerConnectionException;

    /**
     * This method logs us out of the user's current session.
     */
    public void logOut();


}
