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
public class reply {

    private int ID;
    private String customerName;
    private String telNO;
    private String availability;
    private String message;

    public reply(int ID, String customerName, String telNO, String availability, String message) {
        this.ID = ID;
        this.customerName = customerName;
        this.telNO = telNO;
        this.availability = availability;
        this.message = message;

    }

    public int getID() {
        return ID;
    }

    public String getcutomerName() {
        return customerName;
    }

    public String gettelNO() {
        return telNO;
    }

    public String getavailability() {
        return availability;
    }

    public String getmessage() {
        return message;
    }

}
