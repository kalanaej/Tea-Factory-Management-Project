/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpackage;

/**
 *
 * @author user
 */
public class login {

    private final String userName;
    private final String password;

    public login(String userName, String password) {

        this.userName = userName;
        this.password = password;

    }
      public String userName(){
        return userName;
    }
    public String password(){
        return password;
    }
    
}
