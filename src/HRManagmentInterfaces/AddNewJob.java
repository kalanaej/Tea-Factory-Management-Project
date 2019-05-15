/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRManagmentInterfaces;

import DBConnect.DBconnect;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class AddNewJob extends javax.swing.JFrame {

    Connection c = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    
    public AddNewJob() {

        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int xsize = (int)tk.getScreenSize().getWidth();
        int ysize = (int)tk.getScreenSize().getHeight();
        
        this.setSize(xsize, ysize);
        
        
        
        
        
        
        initComponents();
        jobtable();
        clear();
    }

    public void clear(){
        txtjid.setText("");
        txtjtitle.setText("");
        txtjsalary.setText("");
        txtjot.setText("");
    
    
    
    }
    
    
    public void demo(){
    txtjid.setText("15");
    txtjtitle.setText("manager");
    txtjsalary.setText("55000");
    txtjot.setText("33000");
    
    }
    
    
    public void jobtable(){
    
        try {
            Connection c = DBconnect.getConnection();
            Statement s = c.createStatement();
            
         
        String sql = "SELECT id,title,salary,otrate from job";
        pst = c.prepareStatement(sql);
        rs= pst.executeQuery();
        jjob.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
            
        }
    
    
    
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtjid = new javax.swing.JTextField();
        txtjtitle = new javax.swing.JTextField();
        txtjsalary = new javax.swing.JTextField();
        txtjot = new javax.swing.JTextField();
        button_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jjob = new javax.swing.JTable();
        btn_demo = new javax.swing.JButton();
        button_cansel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DILUSHA ADD NEW JOBS.jpg"))); // NOI18N
        jLabel1.setText("        ADD NEW JOBS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 110));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("JOB TITLE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("SALARY");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("OT RATE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("JOB ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, 20));
        jPanel2.add(txtjid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, -1));
        jPanel2.add(txtjtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, -1));
        jPanel2.add(txtjsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, -1));
        jPanel2.add(txtjot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, -1));

        button_add.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        button_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/k.png"))); // NOI18N
        button_add.setText("ADD");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });
        jPanel2.add(button_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 140, -1));

        jjob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "JOB ID", "JOB TITLE", "SALARY", "OTRATE"
            }
        ));
        jjob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jjobMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jjob);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 420, 200));

        btn_demo.setText("demo");
        btn_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_demoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_demo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        button_cansel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        button_cansel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/g.png"))); // NOI18N
        button_cansel.setText("CLEAR");
        button_cansel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_canselActionPerformed(evt);
            }
        });
        jPanel2.add(button_cansel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 160, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER FOLLWING DETAILS FOR ADD NEW JOBS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 350, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back2.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 140, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Y8ZfHy.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 879, -1));

        setSize(new java.awt.Dimension(895, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        
        //THIS IS ADD BUTTON CODE.....
        
        try {
            
            int x = JOptionPane.showConfirmDialog(rootPane, "DO YOU WANT TO SAVE THIS ????");
            
            if(x == 0){
               
                 String jobTitle = txtjtitle.getText();
                String bsalary = txtjsalary.getText();
                String ot = txtjot.getText();
                
                
                Pattern alphabet = Pattern.compile("^[a-zA-Z]+$");
                Pattern numbers = Pattern.compile("^[0-9]+$");
                
                Matcher jobTitle1 = alphabet.matcher(jobTitle);
                
                
                if(!jobTitle1.find()){
                
                JOptionPane.showMessageDialog(rootPane, "pls enter correct job title");
                return;
                
                }
                
                
                
                
                double bsalary2=0;
                try {
                    bsalary2 = Double.parseDouble(txtjsalary.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane, "pls enter valid bsalary");
                    return;
                }
                
                double ot2=0;
                try {
                    ot2 = Double.parseDouble(txtjot.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "pls enter valide ot rate");
                    return;
                }
                
                
                
                
                
                Connection c = DBconnect.getConnection();
                Statement s = c.createStatement();
                
                System.out.println("connecteddd!!!!");
                
                s.executeUpdate("INSERT INTO job VALUES('"+txtjid.getText()+"','"+jobTitle+"','"+bsalary+"','"+ot+"')");
                jobtable();
                clear();
                
           
            
           
            }
            else if(x == 1){
                clear();
            }
            
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_button_addActionPerformed

    private void button_canselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_canselActionPerformed
        txtjid.setText("");
        txtjot.setText("");
        txtjsalary.setText("");
        txtjtitle.setText("");
        
        
        
        
         txtjid.setEnabled(true);
        txtjtitle.setEnabled(true);
        txtjsalary.setEnabled(true);
        txtjot.setEnabled(true);
        
        
        
        
    }//GEN-LAST:event_button_canselActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Home h3 = new Home();
        h3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jjobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jjobMouseClicked
        // TODO add your handling code here:
        
        int row = jjob.getSelectedRow();
        
        String id = jjob.getValueAt(row, 0).toString();
        String title = jjob.getValueAt(row, 1).toString();
        String sal= jjob.getValueAt(row, 2).toString();
        String ot = jjob.getValueAt(row, 3).toString();
       
        
        
        txtjid.setText(id);
        
        txtjid.setText(id);
        txtjtitle.setText(title);
        txtjsalary.setText(sal);
        txtjot.setText(ot);
     
        
        txtjid.setEnabled(false);
        txtjtitle.setEnabled(false);
        txtjsalary.setEnabled(false);
        txtjot.setEnabled(false);
        
        
        
        
    }//GEN-LAST:event_jjobMouseClicked

    private void btn_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_demoActionPerformed
        // TODO add your handling code here:
        demo();
        
    }//GEN-LAST:event_btn_demoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewJob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_demo;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_cansel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jjob;
    private javax.swing.JTextField txtjid;
    private javax.swing.JTextField txtjot;
    private javax.swing.JTextField txtjsalary;
    private javax.swing.JTextField txtjtitle;
    // End of variables declaration//GEN-END:variables
}
