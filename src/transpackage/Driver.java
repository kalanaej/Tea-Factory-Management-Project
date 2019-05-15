/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transpackage;

import static javax.lang.model.type.TypeKind.INT;

/**
 *
 * @author user
 */
public class Driver {

    private int ID;
     private String type;
    private String driverName;
    private String password;
    private String register;
    private String service;
    private String address;
    private String telNO;
    private String truckNO;
    private String capasity;
    private String nicNO;
    private String route;

     private byte[] picture;

    public Driver(int ID,String type,String driverName, String password,String register,String service, String address, String telNO, String truckNO, String capasity, String nicNO, String route, byte[] image) {
        this.ID = ID;
        this.type = type;
        this.driverName = driverName;
        this.password = password;
        this.register = register;
        this.service = service;
        this.address = address;
        this.telNO = telNO;
        this.truckNO = truckNO;
        this.capasity = capasity;
        this.nicNO = nicNO;
        this.route = route;
        this.picture = image;
    }

    public int getID(){
        return ID;
    }
     public String gettype() {
        return type;
    }
     public String getdriverName() {
        return driverName;
    }

    public String getpassword() {
        return password;
    }
    public String getregister(){
        return register;
    }
    public String getservice(){
        return service;
    }

    public String getaddress() {
        return address;
    }

    public String gettelNO() {
        return telNO;
    }

    public String gettruckNO() {
        return truckNO;
    }

    public String getcapasity() {
        return capasity;
    }

    public String getnicNO() {
        return nicNO;
    }

    public String getroute() {
        return route;
    }

    public byte[] getImage() {
        return picture;
    }

  

}
