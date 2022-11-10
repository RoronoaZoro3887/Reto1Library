/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userPackage;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * This is the user class 
 * @author iker
 */
public class User implements Serializable{
    
    private Integer id;
    private String username;
    private String email;
    private String fullname;
    private UserStatus status;
    private UserPrivilege privileges;
    private String password;
    private Timestamp lastPasswordChange;
    
    
    public User(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public UserPrivilege getPrivileges() {
        return privileges;
    }

    public void setPrivileges(UserPrivilege privileges) {
        this.privileges = privileges;
    }

  
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
    
    
}
