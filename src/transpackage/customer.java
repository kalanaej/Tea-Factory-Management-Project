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
public class customer {
     private int ID;
    private String customerName;
    private String telNO;
    private String type;
    private String complaint;
    
     public customer(int ID, String customerName, String telNO, String type, String complaint) {
        this.ID = ID;
        this.customerName = customerName;
        this.telNO = telNO;
        this.type = type;
        this.complaint = complaint;

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

    public String gettype() {
        return type;
    }
    public String getcomplaint() {
        return complaint;
    }
    
}
