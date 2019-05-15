/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinanceInterfaces;

import DBConnect.DBconnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class IncomeStatement_UI extends javax.swing.JInternalFrame {

                 Connection cons = null;
                 PreparedStatement ps = null;
                 ResultSet rs = null;
                 
                 PreparedStatement ps1 = null;
                 ResultSet rs1 = null;
                 
                 PreparedStatement ps2 = null;
                 ResultSet rs2 = null;
                 
                 PreparedStatement ps3 = null;
                 ResultSet rs3 = null;
                 
                 PreparedStatement ps4 = null;
                 ResultSet rs4 = null;
                 
                 PreparedStatement ps5 = null;
                 ResultSet rs5 = null;
                 
                 
    public IncomeStatement_UI() {
        initComponents();
        cons = DBconnect.getConnection();
        tableload();
    }

    public void tableload(){
        try{
            String sql ="SELECT isno, year,month,revenue,cost_of_goods, gross_profit,wages,inventory,earnings_from_operations,other_income,taxes,net_earnings FROM income_statement";
            ps = cons.prepareStatement(sql);
            rs = ps.executeQuery();
            
            table1.setModel(DbUtils.resultSetToTableModel(rs));
            
                    }
        catch(Exception e){}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        incomestatement = new javax.swing.JLabel();
        isno = new javax.swing.JLabel();
        years = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isnobox = new javax.swing.JLabel();
        cogbox = new javax.swing.JLabel();
        monthbox = new javax.swing.JComboBox<>();
        yearbox = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        fill = new javax.swing.JButton();
        year_L = new javax.swing.JLabel();
        month_L = new javax.swing.JLabel();
        otherbox = new javax.swing.JLabel();
        earnings = new javax.swing.JButton();
        gross = new javax.swing.JButton();
        net = new javax.swing.JButton();
        revenuebox = new javax.swing.JLabel();
        cog = new javax.swing.JLabel();
        rS = new javax.swing.JLabel();
        earningbox = new javax.swing.JLabel();
        inventorybox = new javax.swing.JLabel();
        netbox = new javax.swing.JLabel();
        wagesbox = new javax.swing.JLabel();
        grossbox = new javax.swing.JLabel();
        otherI = new javax.swing.JLabel();
        invenT = new javax.swing.JLabel();
        taX = new javax.swing.JLabel();
        rS1 = new javax.swing.JLabel();
        rS2 = new javax.swing.JLabel();
        cog_L = new javax.swing.JLabel();
        gross_L = new javax.swing.JLabel();
        wages_L = new javax.swing.JLabel();
        inven_L = new javax.swing.JLabel();
        earnings_L = new javax.swing.JLabel();
        other_L = new javax.swing.JLabel();
        tax_L = new javax.swing.JLabel();
        net_L = new javax.swing.JLabel();
        revenue_L = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        taxbox = new javax.swing.JTextField();
        monthsearch = new javax.swing.JLabel();
        searchbox = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1290, 590));
        setMinimumSize(new java.awt.Dimension(1290, 590));
        setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setBackground(new java.awt.Color(0, 0, 51));
        top.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));

        incomestatement.setBackground(new java.awt.Color(204, 204, 255));
        incomestatement.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        incomestatement.setForeground(new java.awt.Color(255, 255, 255));
        incomestatement.setText("INCOME STATEMENT");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(incomestatement, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addComponent(incomestatement, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        isno.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        isno.setForeground(new java.awt.Color(0, 0, 153));
        isno.setText("IS No :");
        getContentPane().add(isno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        years.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        years.setForeground(new java.awt.Color(0, 0, 153));
        years.setText("Year  :");
        getContentPane().add(years, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Month :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Wages                          Rs :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 240, -1));

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Revenue          Rs :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        isnobox.setBackground(new java.awt.Color(255, 255, 255));
        isnobox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        isnobox.setForeground(new java.awt.Color(0, 0, 51));
        isnobox.setText(" ID");
        isnobox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        getContentPane().add(isnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 40, 30));

        cogbox.setBackground(new java.awt.Color(255, 255, 255));
        cogbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        cogbox.setForeground(new java.awt.Color(0, 0, 51));
        cogbox.setText("  suplier ");
        cogbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        cogbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cogboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cogboxKeyTyped(evt);
            }
        });
        getContentPane().add(cogbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 90, 30));

        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthboxItemStateChanged(evt);
            }
        });
        getContentPane().add(monthbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 90, -1));

        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YEAR", "2018", "2019", "2020", "2021", "2022", "2022", "2023", "20224", "2025" }));
        yearbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearboxItemStateChanged(evt);
            }
        });
        getContentPane().add(yearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 90, -1));

        add.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 51));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 130, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1290, 10));

        delete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 51));
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 90, 30));

        update.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 51));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, 90, 30));

        clear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 51));
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 280, 90, 30));

        fill.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        fill.setForeground(new java.awt.Color(0, 0, 51));
        fill.setText("Demo");
        fill.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });
        getContentPane().add(fill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 80, 90, 30));

        year_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        year_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(year_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 150, 20));

        month_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        month_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(month_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 160, 20));

        otherbox.setBackground(new java.awt.Color(255, 255, 255));
        otherbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        otherbox.setForeground(new java.awt.Color(0, 0, 51));
        otherbox.setText(" Inventory");
        otherbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        otherbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                otherboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otherboxKeyTyped(evt);
            }
        });
        getContentPane().add(otherbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 90, 30));

        earnings.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        earnings.setForeground(new java.awt.Color(0, 0, 51));
        earnings.setText("Earnings From Operations");
        earnings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningsActionPerformed(evt);
            }
        });
        getContentPane().add(earnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        gross.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        gross.setForeground(new java.awt.Color(0, 0, 51));
        gross.setText("Gross Profit");
        gross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grossActionPerformed(evt);
            }
        });
        getContentPane().add(gross, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        net.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        net.setForeground(new java.awt.Color(0, 0, 51));
        net.setText("Net Earnings");
        net.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netActionPerformed(evt);
            }
        });
        getContentPane().add(net, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, -1, -1));

        revenuebox.setBackground(new java.awt.Color(255, 255, 255));
        revenuebox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        revenuebox.setForeground(new java.awt.Color(0, 0, 51));
        revenuebox.setText("   stock");
        revenuebox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        revenuebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                revenueboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                revenueboxKeyTyped(evt);
            }
        });
        getContentPane().add(revenuebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, 30));

        cog.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        cog.setForeground(new java.awt.Color(0, 0, 153));
        cog.setText("Cost Of Goods  Rs : ");
        getContentPane().add(cog, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, -1));

        rS.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        rS.setForeground(new java.awt.Color(0, 0, 153));
        rS.setText("Rs :");
        getContentPane().add(rS, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 40, -1));

        earningbox.setBackground(new java.awt.Color(255, 255, 255));
        earningbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        earningbox.setForeground(new java.awt.Color(0, 0, 51));
        earningbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        earningbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                earningboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                earningboxKeyTyped(evt);
            }
        });
        getContentPane().add(earningbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 130, 30));

        inventorybox.setBackground(new java.awt.Color(255, 255, 255));
        inventorybox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        inventorybox.setForeground(new java.awt.Color(0, 0, 51));
        inventorybox.setText(" inventory");
        inventorybox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        inventorybox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inventoryboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inventoryboxKeyTyped(evt);
            }
        });
        getContentPane().add(inventorybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 90, 30));

        netbox.setBackground(new java.awt.Color(255, 255, 255));
        netbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        netbox.setForeground(new java.awt.Color(0, 0, 51));
        netbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        netbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                netboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                netboxKeyTyped(evt);
            }
        });
        getContentPane().add(netbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 120, 30));

        wagesbox.setBackground(new java.awt.Color(255, 255, 255));
        wagesbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        wagesbox.setForeground(new java.awt.Color(0, 0, 51));
        wagesbox.setText("  HRM");
        wagesbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        wagesbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wagesboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wagesboxKeyTyped(evt);
            }
        });
        getContentPane().add(wagesbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 90, 30));

        grossbox.setBackground(new java.awt.Color(255, 255, 255));
        grossbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        grossbox.setForeground(new java.awt.Color(0, 0, 51));
        grossbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(51, 102, 255)));
        grossbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grossboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grossboxKeyTyped(evt);
            }
        });
        getContentPane().add(grossbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, 30));

        otherI.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        otherI.setForeground(new java.awt.Color(0, 0, 153));
        otherI.setText("Other Income    Rs :");
        getContentPane().add(otherI, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 170, -1));

        invenT.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        invenT.setForeground(new java.awt.Color(0, 0, 153));
        invenT.setText("Inventory                      Rs :");
        getContentPane().add(invenT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 240, -1));

        taX.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        taX.setForeground(new java.awt.Color(0, 0, 153));
        taX.setText("Taxes              Rs :");
        getContentPane().add(taX, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 170, -1));

        rS1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        rS1.setForeground(new java.awt.Color(0, 0, 153));
        rS1.setText("Rs :");
        getContentPane().add(rS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 40, -1));

        rS2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        rS2.setForeground(new java.awt.Color(0, 0, 153));
        rS2.setText("Rs :");
        getContentPane().add(rS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, -1));

        cog_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cog_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cog_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 50, 20));

        gross_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        gross_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(gross_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 50, 20));

        wages_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        wages_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(wages_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 50, 20));

        inven_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        inven_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(inven_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 50, 20));

        earnings_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        earnings_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(earnings_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 50, 20));

        other_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        other_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(other_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, 50, 20));

        tax_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tax_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(tax_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, 50, 20));

        net_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        net_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(net_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 50, 20));

        revenue_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        revenue_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(revenue_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 50, 20));

        table1.setBackground(new java.awt.Color(0, 0, 51));
        table1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        table1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 255, 255));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IsNo", "year", "Month", "Revenue", "COGS", "Gross_Profit", "Wages", "Inventory", "Earning_from_capital", "Other_income", "Taxes", "Net_Earnings"
            }
        ));
        table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.setGridColor(new java.awt.Color(204, 204, 255));
        table1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 51));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 190));

        taxbox.setForeground(new java.awt.Color(0, 0, 51));
        taxbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                taxboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taxboxKeyTyped(evt);
            }
        });
        getContentPane().add(taxbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 90, 30));

        monthsearch.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        monthsearch.setForeground(new java.awt.Color(0, 0, 153));
        monthsearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        monthsearch.setText("Month :");
        getContentPane().add(monthsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 77, 20));

        searchbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        searchbox.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 110, -1));

        search.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 51));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 330, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1290, 590));
        background.setMinimumSize(new java.awt.Dimension(1290, 590));
        background.setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthboxItemStateChanged
        month_L.setText("");
    }//GEN-LAST:event_monthboxItemStateChanged

    private void yearboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearboxItemStateChanged
        year_L.setText("");
    }//GEN-LAST:event_yearboxItemStateChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          
        String month = monthbox.getSelectedItem().toString();
        String year = yearbox.getSelectedItem().toString(); 
        
        String revenue = revenuebox.getText();
         if(revenuebox.getText().trim().isEmpty()){
                revenue_L.setText("Empty");
            }
        String cos = cogbox.getText();
         if(cogbox.getText().trim().isEmpty()){
                cog_L.setText("Empty");
            }
        String gross = grossbox.getText();
         if(grossbox.getText().trim().isEmpty()){
                gross_L.setText("Empty");
            }
        String wages = wagesbox.getText();
         if(wagesbox.getText().trim().isEmpty()){
                wages_L.setText("Empty");
            }
        String inventory = inventorybox.getText();
         if(inventorybox.getText().trim().isEmpty()){
                inven_L.setText("Empty");
            }
        
         String earning = earningbox.getText();
         if(earningbox.getText().trim().isEmpty()){
                earnings_L.setText("Empty");
            }
         String other = otherbox.getText();
         if(otherbox.getText().trim().isEmpty()){
                other_L.setText("Empty");}
        String tax = taxbox.getText();
         if(taxbox.getText().trim().isEmpty()){
                tax_L.setText("Empty");
            }
        String net = netbox.getText();
        if(netbox.getText().trim().isEmpty()){
                net_L.setText("Empty");
            }

        try{
            String q = "INSERT INTO income_statement (year,month,revenue,cost_of_goods,gross_profit,wages,inventory,earnings_from_operations, other_income, taxes, net_earnings) values ('"+ year +"','"+ month +"','"+revenue +"','"+cos +"','"+gross +"','"+wages +"','"+  inventory+"','"+earning +"','"+ other+"','"+tax +"','"+net +"')";
            ps = cons.prepareStatement(q);
            ps.execute();
            tableload();
            
            
        isnobox.setText("");
        yearbox.setSelectedIndex(0);
        monthbox.setSelectedIndex(0);
        revenuebox.setText("");
        cogbox.setText("");
        grossbox.setText("");
        wagesbox.setText("");
        inventorybox.setText("");
        earningbox.setText("");
        otherbox.setText("");
        taxbox.setText("");
        netbox.setText("");
        
        
        year_L.setText("");
        month_L.setText("");
        revenue_L.setText("");
        cog_L.setText("");
        gross_L.setText("");
        wages_L.setText("");
        inven_L.setText("");
        earnings_L.setText("");
        other_L.setText("");
        tax_L.setText("");
        net_L.setText("");
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_addActionPerformed

    private void netActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netActionPerformed
        double earnings;
        double other;
        double tax;
        double net;
        
         if(grossbox.getText().trim().isEmpty()){
                gross_L.setText("Empty");
            }
        if(taxbox.getText().trim().isEmpty()){
                tax_L.setText("Empty");
            }
         if(earningbox.getText().trim().isEmpty()){
                earnings_L.setText("Empty");
            }
        earnings = Double.parseDouble(earningbox.getText());
        other = Double.parseDouble(otherbox.getText());
        tax = Double.parseDouble(taxbox.getText());
        
        net = (earnings + other) - tax;
        
        netbox.setText(Double.toString(net));
        
    }//GEN-LAST:event_netActionPerformed

    private void earningsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningsActionPerformed
                double wages;
                double inventory;
                double gross;
                double earnings;
                
                if(grossbox.getText().trim().isEmpty()){
                gross_L.setText("Empty");
            }
                
                wages = Double.parseDouble(wagesbox.getText());
                inventory = Double.parseDouble(inventorybox.getText());
                gross = Double.parseDouble(grossbox.getText());
                
                earnings = gross - (wages + inventory );
                
                earningbox.setText(Double.toString(earnings));
                
                
                
                
    }//GEN-LAST:event_earningsActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int r = table1.getSelectedRow();

        String isno = table1.getValueAt(r,0).toString();
        String year = table1.getValueAt(r,1).toString();
        String month = table1.getValueAt(r,2).toString();
        String revenue = table1.getValueAt(r,3).toString();
        String cogs = table1.getValueAt(r,4).toString();
        String gross = table1.getValueAt(r,5).toString();
        String wages = table1.getValueAt(r,6).toString();
        String inventory = table1.getValueAt(r,7).toString();
        String earnings = table1.getValueAt(r,8).toString();
        String other = table1.getValueAt(r,9).toString();
        String tax = table1.getValueAt(r,10).toString();
        String net = table1.getValueAt(r,11).toString();
        

        isnobox.setText(isno);
        yearbox.setSelectedItem(year);
        monthbox.setSelectedItem(month);
        revenuebox.setText(revenue);
        cogbox.setText(cogs);
        grossbox.setText(gross);
        wagesbox.setText(wages);
        inventorybox.setText(inventory);
        earningbox.setText(earnings);
        otherbox.setText(other);
        taxbox.setText(tax);
        netbox.setText(net);
        
        add.setEnabled(false);
        
    }//GEN-LAST:event_table1MouseClicked

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed


        taxbox.setText("100.00");
        String year = yearbox.getSelectedItem().toString();
            if(yearbox.getSelectedIndex()== 0)
            year_L.setText("Select a month");
            
        String month = monthbox.getSelectedItem().toString();
            if(monthbox.getSelectedIndex()== 0)
            month_L.setText("Select a month");    
         
        try{

           
            String sql ="SELECT * FROM finance_stock where month=? AND year=?";

            ps = cons.prepareStatement(sql);
            ps.setString(1,(String)monthbox.getSelectedItem());
            ps.setString(2,(String)yearbox.getSelectedItem());
            rs = ps.executeQuery();
            
             while(rs.next()){
                    revenuebox.setText(rs.getString("total"));       
            }

            String sql1 = "SELECT * FROM finance_tealeaf where month=? AND year=?";
            ps1 = cons.prepareStatement(sql);
            ps1.setString(1,(String)monthbox.getSelectedItem());
            ps1.setString(2,(String)yearbox.getSelectedItem());
            rs1 = ps1.executeQuery();

            while(rs1.next()){
                    cogbox.setText(rs1.getString("total"));
            }
        }
        catch(Exception e){}
        
        try{

            String sql ="SELECT * FROM finance_stock where month=? AND year=?";

            ps = cons.prepareStatement(sql);
            ps.setString(1,(String)monthbox.getSelectedItem());
            ps.setString(2,(String)yearbox.getSelectedItem());
            rs = ps.executeQuery();
            
             while(rs.next()){
                    revenuebox.setText(rs.getString("total"));       
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
        
        try{

            String sql1 = "SELECT * FROM finance_tealeaf where month=? AND year=?";
            ps1 = cons.prepareStatement(sql1);
            ps1.setString(1,(String)monthbox.getSelectedItem());
            ps1.setString(2,(String)yearbox.getSelectedItem());
            rs1 = ps1.executeQuery();

            while(rs1.next()){
                    cogbox.setText(rs1.getString("total"));
            }
        }
        catch(Exception e){}
        
        try{

            String sql2 = "SELECT * FROM finance_inventory where month=? AND year=?";
            ps2 = cons.prepareStatement(sql2);
            ps2.setString(1,(String)monthbox.getSelectedItem());
            ps2.setString(2,(String)yearbox.getSelectedItem());
            rs2 = ps2.executeQuery();

            while(rs2.next()){
                    inventorybox.setText(rs2.getString("total"));
            }
        }
        catch(Exception e){}
        
        try{

            String sql3 = "SELECT * FROM finance_vehicle where month=? AND year=?";
            ps3 = cons.prepareStatement(sql3);
            ps3.setString(1,(String)monthbox.getSelectedItem());
            ps3.setString(2,(String)yearbox.getSelectedItem());
            rs3 = ps3.executeQuery();

            while(rs3.next()){
                     otherbox.setText(rs3.getString("total"));
            }
        }
        catch(Exception e){}
        
        try{

            String sql4 = "SELECT * FROM finance_hrm where month=? AND year=?";
            ps4 = cons.prepareStatement(sql4);
            ps4.setString(1,(String)monthbox.getSelectedItem());
            ps4.setString(2,(String)yearbox.getSelectedItem());
            rs4 = ps4.executeQuery();

            while(rs4.next()){
                   wagesbox.setText(rs4.getString("total"));
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_fillActionPerformed

    private void grossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grossActionPerformed
       
        
        double revenue;
        double cog;
        double gross_profit;

        revenue = Double.parseDouble(revenuebox.getText());
        cog = Double.parseDouble(cogbox.getText());
        gross_profit = revenue - cog;

        grossbox.setText(Double.toString(gross_profit));
    }//GEN-LAST:event_grossActionPerformed

    private void revenueboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_revenueboxKeyReleased
       revenue_L.setText("");
    }//GEN-LAST:event_revenueboxKeyReleased

    private void revenueboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_revenueboxKeyTyped
       char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_revenueboxKeyTyped

    private void cogboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cogboxKeyReleased
        cog_L.setText("");
    }//GEN-LAST:event_cogboxKeyReleased

    private void grossboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grossboxKeyReleased
       gross_L.setText("");
    }//GEN-LAST:event_grossboxKeyReleased

    private void wagesboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wagesboxKeyReleased
        wages_L.setText("");
    }//GEN-LAST:event_wagesboxKeyReleased

    private void inventoryboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryboxKeyReleased
       inven_L.setText("");
    }//GEN-LAST:event_inventoryboxKeyReleased

    private void earningboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_earningboxKeyReleased
        earnings_L.setText("");
    }//GEN-LAST:event_earningboxKeyReleased

    private void otherboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otherboxKeyReleased
        other_L.setText("");
    }//GEN-LAST:event_otherboxKeyReleased

    private void taxboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taxboxKeyReleased
      tax_L.setText("");
    }//GEN-LAST:event_taxboxKeyReleased

    private void netboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_netboxKeyReleased
      net_L.setText("");
    }//GEN-LAST:event_netboxKeyReleased

    private void cogboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cogboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_cogboxKeyTyped

    private void grossboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grossboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_grossboxKeyTyped

    private void wagesboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wagesboxKeyTyped
      char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_wagesboxKeyTyped

    private void inventoryboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryboxKeyTyped
       char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_inventoryboxKeyTyped

    private void earningboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_earningboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_earningboxKeyTyped

    private void otherboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otherboxKeyTyped
       char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_otherboxKeyTyped

    private void taxboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taxboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_taxboxKeyTyped

    private void netboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_netboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_netboxKeyTyped

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int delete1 = JOptionPane.showConfirmDialog(null,"Do you want to Delete this record?");

        if(delete1 == 0){

            String isno = isnobox.getText();

            try{
                String sql = "DELETE from income_statement Where isno='"+ isno +"'";
                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
                
                isnobox.setText("");
        yearbox.setSelectedIndex(0);
        monthbox.setSelectedIndex(0);
        revenuebox.setText("");
        cogbox.setText("");
        grossbox.setText("");
        wagesbox.setText("");
        inventorybox.setText("");
        earningbox.setText("");
        otherbox.setText("");
        taxbox.setText("");
        netbox.setText("");
        
        
        year_L.setText("");
        month_L.setText("");
        revenue_L.setText("");
        cog_L.setText("");
        gross_L.setText("");
        wages_L.setText("");
        inven_L.setText("");
        earnings_L.setText("");
        other_L.setText("");
        tax_L.setText("");
        net_L.setText("");
            }
            catch(Exception e){}}
        add.setEnabled(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int update1 = JOptionPane.showConfirmDialog(null,"Do you want to update this record?");

        if(update1 ==0){
           
        String isno = isnobox.getText();
        String year = yearbox.getSelectedItem().toString();
        String month = monthbox.getSelectedItem().toString();
        String revenue =  revenuebox.getText();
        String cogs = cogbox.getText();
        String gross = grossbox.getText();
        String wages = wagesbox.getText();
        String inventory = inventorybox.getText();
        String earnings = earningbox.getText();
        String other = otherbox.getText();
        String tax = taxbox.getText();
        String net = netbox.getText();
        
        
        try {
            String sql=" UPDATE income_statement SET year = '"+ year +"' ,month ='"+ month +"',revenue = '"+ revenue +"',cost_of_goods = '"+ cogs +"',gross_profit ='"+ gross +"',wages = '"+ wages +"',inventory = '"+ inventory +"',earnings_from_operations ='"+ earnings +"', other_income = '"+other+"',taxes = '"+tax+"', net_earnings ='"+net+"' where isno ='"+ isno+"'" ;
                                                                                                            
            
                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
                
                
        isnobox.setText("");
        yearbox.setSelectedIndex(0);
        monthbox.setSelectedIndex(0);
        revenuebox.setText("");
        cogbox.setText("");
        grossbox.setText("");
        wagesbox.setText("");
        inventorybox.setText("");
        earningbox.setText("");
        otherbox.setText("");
        taxbox.setText("");
        netbox.setText("");
        
        
        year_L.setText("");
        month_L.setText("");
        revenue_L.setText("");
        cog_L.setText("");
        gross_L.setText("");
        wages_L.setText("");
        inven_L.setText("");
        earnings_L.setText("");
        other_L.setText("");
        tax_L.setText("");
        net_L.setText("");
            }

            catch(Exception e){}
        }
        add.setEnabled(true);
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        isnobox.setText("");
        yearbox.setSelectedIndex(0);
        monthbox.setSelectedIndex(0);
        revenuebox.setText("");
        cogbox.setText("");
        grossbox.setText("");
        wagesbox.setText("");
        inventorybox.setText("");
        earningbox.setText("");
        otherbox.setText("");
        taxbox.setText("");
        netbox.setText("");
        
        
        year_L.setText("");
        month_L.setText("");
        revenue_L.setText("");
        cog_L.setText("");
        gross_L.setText("");
        wages_L.setText("");
        inven_L.setText("");
        earnings_L.setText("");
        other_L.setText("");
        tax_L.setText("");
        net_L.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String month = searchbox.getText();
        try{
            String sql ="SELECT isno, year,month,revenue,cost_of_goods, gross_profit,wages,inventory,earnings_from_operations,other_income,taxes,net_earnings FROM income_statement where month LIKE '%"+ month +"%'";
            ps = cons.prepareStatement(sql);

            rs = ps.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed
           
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel background;
    private javax.swing.JButton clear;
    private javax.swing.JLabel cog;
    private javax.swing.JLabel cog_L;
    private javax.swing.JLabel cogbox;
    private javax.swing.JButton delete;
    private javax.swing.JLabel earningbox;
    private javax.swing.JButton earnings;
    private javax.swing.JLabel earnings_L;
    private javax.swing.JButton fill;
    private javax.swing.JButton gross;
    private javax.swing.JLabel gross_L;
    private javax.swing.JLabel grossbox;
    private javax.swing.JLabel incomestatement;
    private javax.swing.JLabel invenT;
    private javax.swing.JLabel inven_L;
    private javax.swing.JLabel inventorybox;
    private javax.swing.JLabel isno;
    private javax.swing.JLabel isnobox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel month_L;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JLabel monthsearch;
    private javax.swing.JButton net;
    private javax.swing.JLabel net_L;
    private javax.swing.JLabel netbox;
    private javax.swing.JLabel otherI;
    private javax.swing.JLabel other_L;
    private javax.swing.JLabel otherbox;
    private javax.swing.JLabel rS;
    private javax.swing.JLabel rS1;
    private javax.swing.JLabel rS2;
    private javax.swing.JLabel revenue_L;
    private javax.swing.JLabel revenuebox;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbox;
    private javax.swing.JLabel taX;
    private javax.swing.JTable table1;
    private javax.swing.JLabel tax_L;
    private javax.swing.JTextField taxbox;
    private javax.swing.JPanel top;
    private javax.swing.JButton update;
    private javax.swing.JLabel wages_L;
    private javax.swing.JLabel wagesbox;
    private javax.swing.JLabel year_L;
    private javax.swing.JComboBox<String> yearbox;
    private javax.swing.JLabel years;
    // End of variables declaration//GEN-END:variables
}
