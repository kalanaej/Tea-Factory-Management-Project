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
public class request {

    private int ID;
    private String customerName;
    private String telNO;
    private String address;
    private String availability;
    private String date;
    private String description;

    public request(int ID, String customerName, String telNO, String address, String availability, String date, String description) {
        this.ID = ID;
        this.customerName = customerName;
        this.telNO = telNO;
        this.address = address;

        this.availability = availability;
        this.date = date;
        this.description = description;

    }

    public int getID() {
        return ID;
    }

    public String getcustomerName() {
        return customerName;

    }

    public String gettelNO() {
        return telNO;
    }

    public String getaddress() {
        return address;
    }

    public String getavailability() {
        return availability;
    }

    public String getdate() {
        return date;
    }

    public String getdescription() {
        return description;
    }

}
