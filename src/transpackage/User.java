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
public class User {

    private int ID;
    private String userName;
    private String password;
    private String address;
    private String tel_NO;

    public User(int ID, String userName, String password, String address, String tel_NO) {
        this.ID = ID;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.tel_NO = tel_NO;

    }

    public int getID() {
        return ID;
    }

    public String getuserName() {
        return userName;
    }

    public String getpassword() {
        return password;
    }

    public String getaddress() {
        return address;
    }

    public String gettel_NO() {
        return tel_NO;
    }

}
