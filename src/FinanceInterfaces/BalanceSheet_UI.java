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
 * @author Vihanga
 */
public class BalanceSheet_UI extends javax.swing.JInternalFrame {
                 Connection cons = null;
                 PreparedStatement ps = null;
                 ResultSet rs = null;
 
    public BalanceSheet_UI() {
    
        initComponents();
        cons = DBconnect.getConnection();
        tableload();
    }
   
    
    
    
    
    
    public void tableload(){
    
    try{
             String sql ="SELECT bsno,year,month,cash,account_recivable,inventory,property_equipment,total_assets,account_payable,debt,equity_capital,retained_earnings,total_liabilities_shareholders FROM balance_sheet";
            ps = cons.prepareStatement(sql);
            rs = ps.executeQuery();
            
            table2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
                    }
        catch(Exception e){}
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bsno = new javax.swing.JLabel();
        cash = new javax.swing.JLabel();
        top = new javax.swing.JPanel();
        balanceSheet = new javax.swing.JLabel();
        accountRecivable = new javax.swing.JLabel();
        inventory = new javax.swing.JLabel();
        propertyEquipment = new javax.swing.JLabel();
        accountPayable = new javax.swing.JLabel();
        debt = new javax.swing.JLabel();
        equityCapital = new javax.swing.JLabel();
        retainedEarnings = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        bsnobox = new javax.swing.JLabel();
        yearbox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        retainedbox = new javax.swing.JTextField();
        equitybox = new javax.swing.JTextField();
        debtbox = new javax.swing.JTextField();
        accountPbox = new javax.swing.JTextField();
        propertybox = new javax.swing.JTextField();
        inventorybox = new javax.swing.JTextField();
        accountRbox = new javax.swing.JTextField();
        searchbox = new javax.swing.JTextField();
        cashbox = new javax.swing.JTextField();
        property_L = new javax.swing.JLabel();
        inventory_L = new javax.swing.JLabel();
        accountr_L = new javax.swing.JLabel();
        retained_L = new javax.swing.JLabel();
        equity_L = new javax.swing.JLabel();
        debt_L = new javax.swing.JLabel();
        accountp_L = new javax.swing.JLabel();
        cash_L = new javax.swing.JLabel();
        year_L = new javax.swing.JLabel();
        month_L = new javax.swing.JLabel();
        monthsearch = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        total_assets = new javax.swing.JButton();
        total_liability_shares = new javax.swing.JButton();
        totalAbox = new javax.swing.JLabel();
        totalLbox = new javax.swing.JLabel();
        totalA_L = new javax.swing.JLabel();
        totalL_L = new javax.swing.JLabel();
        rs1 = new javax.swing.JLabel();
        rs3 = new javax.swing.JLabel();
        fill = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1290, 590));
        setMinimumSize(new java.awt.Dimension(1290, 590));
        setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bsno.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        bsno.setForeground(new java.awt.Color(0, 0, 153));
        bsno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bsno.setText("BS No :");
        getContentPane().add(bsno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 77, -1));

        cash.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        cash.setForeground(new java.awt.Color(0, 0, 153));
        cash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cash.setText("Cash                                  Rs:");
        getContentPane().add(cash, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, -1));

        top.setBackground(new java.awt.Color(0, 0, 51));
        top.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        top.setForeground(new java.awt.Color(255, 255, 255));

        balanceSheet.setBackground(new java.awt.Color(204, 204, 255));
        balanceSheet.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        balanceSheet.setForeground(new java.awt.Color(255, 255, 255));
        balanceSheet.setText("BALANCE SHEET");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(balanceSheet)
                .addContainerGap(474, Short.MAX_VALUE))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addComponent(balanceSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 50));

        accountRecivable.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        accountRecivable.setForeground(new java.awt.Color(0, 0, 153));
        accountRecivable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountRecivable.setText("Account Recivable             Rs:");
        getContentPane().add(accountRecivable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        inventory.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        inventory.setForeground(new java.awt.Color(0, 0, 153));
        inventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inventory.setText("Inventory                           Rs:");
        getContentPane().add(inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, -1));

        propertyEquipment.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        propertyEquipment.setForeground(new java.awt.Color(0, 0, 153));
        propertyEquipment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        propertyEquipment.setText("Property & Equipment        Rs:");
        getContentPane().add(propertyEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 280, -1));

        accountPayable.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        accountPayable.setForeground(new java.awt.Color(0, 0, 153));
        accountPayable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountPayable.setText("Account Payable                    Rs:");
        getContentPane().add(accountPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 300, -1));

        debt.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        debt.setForeground(new java.awt.Color(0, 0, 153));
        debt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        debt.setText("Debt                                      Rs:");
        getContentPane().add(debt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 300, -1));

        equityCapital.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        equityCapital.setForeground(new java.awt.Color(0, 0, 153));
        equityCapital.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        equityCapital.setText("Equity Capital                        Rs:");
        getContentPane().add(equityCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 300, -1));

        retainedEarnings.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        retainedEarnings.setForeground(new java.awt.Color(0, 0, 153));
        retainedEarnings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        retainedEarnings.setText("Retained Earnings                 Rs:");
        getContentPane().add(retainedEarnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 300, -1));

        year.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        year.setForeground(new java.awt.Color(0, 0, 153));
        year.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        year.setText("Year :");
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 77, -1));

        month.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        month.setForeground(new java.awt.Color(0, 0, 153));
        month.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        month.setText("Month :");
        getContentPane().add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 77, 20));

        bsnobox.setBackground(new java.awt.Color(255, 255, 255));
        bsnobox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        bsnobox.setForeground(new java.awt.Color(0, 0, 51));
        bsnobox.setText("  ID");
        bsnobox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 153)));
        getContentPane().add(bsnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 50, 30));

        yearbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YEAR", "2018", "2019", "2020", "2021", "2022", "2022", "2023", "20224", "2025" }));
        yearbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearboxItemStateChanged(evt);
            }
        });
        getContentPane().add(yearbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 90, -1));

        monthbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MONTH", "January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December" }));
        monthbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthboxItemStateChanged(evt);
            }
        });
        getContentPane().add(monthbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 90, -1));

        retainedbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        retainedbox.setForeground(new java.awt.Color(0, 0, 51));
        retainedbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                retainedboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                retainedboxKeyTyped(evt);
            }
        });
        getContentPane().add(retainedbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 110, -1));

        equitybox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        equitybox.setForeground(new java.awt.Color(0, 0, 51));
        equitybox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                equityboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equityboxKeyTyped(evt);
            }
        });
        getContentPane().add(equitybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 110, -1));

        debtbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        debtbox.setForeground(new java.awt.Color(0, 0, 51));
        debtbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                debtboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                debtboxKeyTyped(evt);
            }
        });
        getContentPane().add(debtbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 110, -1));

        accountPbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        accountPbox.setForeground(new java.awt.Color(0, 0, 51));
        accountPbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountPboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountPboxKeyTyped(evt);
            }
        });
        getContentPane().add(accountPbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 110, -1));

        propertybox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        propertybox.setForeground(new java.awt.Color(0, 0, 51));
        propertybox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                propertyboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                propertyboxKeyTyped(evt);
            }
        });
        getContentPane().add(propertybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, -1));

        inventorybox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        inventorybox.setForeground(new java.awt.Color(0, 0, 51));
        inventorybox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inventoryboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inventoryboxKeyTyped(evt);
            }
        });
        getContentPane().add(inventorybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 110, -1));

        accountRbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        accountRbox.setForeground(new java.awt.Color(0, 0, 51));
        accountRbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountRboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountRboxKeyTyped(evt);
            }
        });
        getContentPane().add(accountRbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, -1));

        searchbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        searchbox.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 110, -1));

        cashbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        cashbox.setForeground(new java.awt.Color(0, 0, 51));
        cashbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cashboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashboxKeyTyped(evt);
            }
        });
        getContentPane().add(cashbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 110, -1));

        property_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        property_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(property_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 50, 20));

        inventory_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        inventory_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(inventory_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 50, 20));

        accountr_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        accountr_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(accountr_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 50, 20));

        retained_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        retained_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(retained_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 50, 20));

        equity_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        equity_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(equity_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 180, 50, 20));

        debt_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        debt_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(debt_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 150, 50, 20));

        accountp_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        accountp_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(accountp_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 50, 20));

        cash_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cash_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cash_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 50, 20));

        year_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        year_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(year_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, 20));

        month_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        month_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(month_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 170, 20));

        monthsearch.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        monthsearch.setForeground(new java.awt.Color(0, 0, 153));
        monthsearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        monthsearch.setText("Month :");
        getContentPane().add(monthsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 77, 20));

        delete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 51));
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 90, -1));

        update.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 51));
        update.setText("Update");
        update.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 140, 90, -1));

        add.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 51));
        add.setText("Add");
        add.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, 90, -1));

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1290, 10));

        table2.setBackground(new java.awt.Color(0, 0, 51));
        table2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        table2.setForeground(new java.awt.Color(255, 255, 255));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Bsno", "Year", "Month", "Cash", "Account Res", "Inventory", "Prop & equ", "total assest", "Account payble", "Debt", "Equity capital", "Retained Earnings", "Total liab & shares "
            }
        ));
        table2.setGridColor(new java.awt.Color(204, 204, 255));
        table2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table2.setSelectionForeground(new java.awt.Color(0, 0, 51));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 1270, 190));

        total_assets.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        total_assets.setForeground(new java.awt.Color(0, 0, 51));
        total_assets.setText("Total Assets");
        total_assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_assetsMouseClicked(evt);
            }
        });
        getContentPane().add(total_assets, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, -1));

        total_liability_shares.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        total_liability_shares.setForeground(new java.awt.Color(0, 0, 51));
        total_liability_shares.setText("Total liabilities & shareholder");
        total_liability_shares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                total_liability_sharesMouseClicked(evt);
            }
        });
        getContentPane().add(total_liability_shares, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        totalAbox.setBackground(new java.awt.Color(255, 255, 255));
        totalAbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        totalAbox.setForeground(new java.awt.Color(0, 0, 51));
        totalAbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 153)));
        totalAbox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                totalAboxPropertyChange(evt);
            }
        });
        getContentPane().add(totalAbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 110, 30));

        totalLbox.setBackground(new java.awt.Color(255, 255, 255));
        totalLbox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        totalLbox.setForeground(new java.awt.Color(0, 0, 51));
        totalLbox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 153)));
        totalLbox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                totalLboxPropertyChange(evt);
            }
        });
        getContentPane().add(totalLbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 110, 30));

        totalA_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        totalA_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(totalA_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 50, 20));

        totalL_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        totalL_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(totalL_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 50, 20));

        rs1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        rs1.setForeground(new java.awt.Color(0, 0, 153));
        rs1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rs1.setText("Rs:");
        getContentPane().add(rs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 30, -1));

        rs3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        rs3.setForeground(new java.awt.Color(0, 0, 153));
        rs3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rs3.setText("Rs:");
        getContentPane().add(rs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 30, -1));

        fill.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        fill.setForeground(new java.awt.Color(0, 0, 51));
        fill.setText("Demo");
        fill.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        fill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillActionPerformed(evt);
            }
        });
        getContentPane().add(fill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 90, 30));

        clear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 51));
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 240, 90, -1));

        background.setBackground(new java.awt.Color(174, 197, 240));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1290, 590));
        background.setMinimumSize(new java.awt.Dimension(1290, 590));
        background.setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        int r1 = table2.getSelectedRow();

        String bsno = table2.getValueAt(r1,0).toString();
        String year = table2.getValueAt(r1,1).toString();
        String month = table2.getValueAt(r1,2).toString();
        String cash = table2.getValueAt(r1,3).toString();
        String account_recivable = table2.getValueAt(r1,4).toString();
        String inventory = table2.getValueAt(r1,5).toString();
        String property_equipment = table2.getValueAt(r1,6).toString();
        String total_asset = table2.getValueAt(r1,7).toString();
        String account_payable = table2.getValueAt(r1,8).toString();
        String debt = table2.getValueAt(r1,9).toString();
        String equity_capital = table2.getValueAt(r1,10).toString();
        String retained_earnings = table2.getValueAt(r1,11).toString();
        String total_liability_shareholder = table2.getValueAt(r1,12).toString();

        bsnobox.setText(bsno);
        yearbox.setSelectedItem(year);
        monthbox.setSelectedItem(month);
        cashbox.setText(cash);
        accountRbox.setText(account_recivable);
        inventorybox.setText(inventory);
        propertybox.setText(property_equipment);
        totalAbox.setText(total_asset);
        accountPbox.setText(account_payable);
        debtbox.setText(debt);
        equitybox.setText(equity_capital);
        retainedbox.setText(retained_earnings);
        totalLbox.setText(total_liability_shareholder);
        
        add.setEnabled(false);
    }//GEN-LAST:event_table2MouseClicked
    
    
    private void total_assetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_assetsMouseClicked
        double cash;
        double account_recivable;
        double inventory;
        double property_equipment;
        double total_assets;

        cash = Double.parseDouble(cashbox.getText());
        account_recivable = Double.parseDouble(accountRbox.getText());
        inventory = Double.parseDouble(inventorybox.getText());
        property_equipment =Double.parseDouble(propertybox.getText());

        total_assets = cash + account_recivable + inventory + property_equipment;

        totalAbox.setText(Double.toString(total_assets));
    }//GEN-LAST:event_total_assetsMouseClicked
 
    
    private void total_liability_sharesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_liability_sharesMouseClicked
        double total_assets;

        total_assets = Double.parseDouble(totalAbox.getText());
        totalLbox.setText(Double.toString(total_assets));
    }//GEN-LAST:event_total_liability_sharesMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
         int update1 = JOptionPane.showConfirmDialog(null,"Do you want to update this record?");

        if(update1 ==0){
            String bsno = bsnobox.getText();
            String year = yearbox.getSelectedItem().toString();
            String month = monthbox.getSelectedItem().toString();
            String cash = cashbox.getText();
            String account_recivable = accountRbox.getText();
            String inventory = inventorybox.getText();
            String property_equipment = propertybox.getText();
            String total_asset = accountPbox.getText();
            String account_payable = totalAbox.getText();
            String debt = debtbox.getText();
            String equity_capital = equitybox.getText();
            String retained_earnings = retainedbox.getText();
            String total_liability_shareholder = totalLbox.getText();

            
            
        if(yearbox.getSelectedIndex()== 0){
            year_L.setText("Select a month");
            }
        if(monthbox.getSelectedIndex()== 0){
            month_L.setText("Select a month");
            }
        if(cashbox.getText().trim().isEmpty()){
                cash_L.setText("Empty");
            }
        if(accountRbox.getText().trim().isEmpty()){
                accountr_L.setText("Empty");
            }
        if(inventorybox.getText().trim().isEmpty()){
                inventory_L.setText("Empty");
            }
        if(propertybox.getText().trim().isEmpty()){
                property_L.setText("Empty");
            }
        if(totalAbox.getText().trim().isEmpty()){
                totalA_L.setText("Empty");
            }
        if(accountPbox.getText().trim().isEmpty()){
               accountp_L.setText("Empty");
            }
        if(debtbox.getText().trim().isEmpty()){
                debt_L.setText("Empty");
            }
        if(equitybox.getText().trim().isEmpty()){
                equity_L.setText("Empty");
            }
        if(retainedbox.getText().trim().isEmpty()){
                retained_L.setText("Empty");
            }
        if(totalLbox.getText().trim().isEmpty()){
                totalL_L.setText("Empty");
            }
        
        
            try{

                String sql=" UPDATE balance_sheet SET year='"+year+"',month='"+month+"',cash='"+cash+"',account_recivable='"+account_recivable+"',inventory='"+inventory+"',property_equipment='"+property_equipment+"',total_assets='"+total_asset+"',account_payable='"+account_payable+"',debt='"+debt+"',equity_capital='"+equity_capital+"',retained_earnings='"+retained_earnings+"',total_liabilities_shareholders='"+total_liability_shareholder+"' where bsno ='"+ bsno+"'" ;

                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
            }

            catch(Exception e){}}
        bsnobox.setText("");
       yearbox.setSelectedIndex(0);
       monthbox.setSelectedIndex(0);
       cashbox.setText("");
       accountRbox.setText("");
       inventorybox.setText("");
       propertybox.setText("");
       totalAbox.setText("");
       accountPbox.setText("");
       debtbox.setText("");
       equitybox.setText("");
       retainedbox.setText("");
       totalLbox.setText("");
    
       add.setEnabled(true);
    }//GEN-LAST:event_updateActionPerformed

    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    
        String year = yearbox.getSelectedItem().toString();
        if(yearbox.getSelectedIndex()== 0){
            year_L.setText("Select a month");
            }
        String month = monthbox.getSelectedItem().toString();
        if(monthbox.getSelectedIndex()== 0){
            month_L.setText("Select a month");
            }
        String cash = cashbox.getText();
        if(cashbox.getText().trim().isEmpty()){
                cash_L.setText("Empty");
            }
        String account_recivable = accountRbox.getText();
        if(accountRbox.getText().trim().isEmpty()){
                accountr_L.setText("Empty");
            }
        String inventory = inventorybox.getText();
        if(inventorybox.getText().trim().isEmpty()){
                inventory_L.setText("Empty");
            }
        String property_equipment = propertybox.getText();
        if(propertybox.getText().trim().isEmpty()){
                property_L.setText("Empty");
            }
        String total_asset = totalAbox.getText();
        if(totalAbox.getText().trim().isEmpty()){
                totalA_L.setText("Empty");
            }
        
        String account_payable = accountPbox.getText();
        if(accountPbox.getText().trim().isEmpty()){
               accountp_L.setText("Empty");
            }
        String debt = debtbox.getText();
        if(debtbox.getText().trim().isEmpty()){
                debt_L.setText("Empty");
            }
        String equity_capital = equitybox.getText();
        if(equitybox.getText().trim().isEmpty()){
                equity_L.setText("Empty");
            }
        String retained_earnings = retainedbox.getText();
        if(retainedbox.getText().trim().isEmpty()){
                retained_L.setText("Empty");
            }
        String total_liability_shareholder = totalLbox.getText();
        if(totalLbox.getText().trim().isEmpty()){
                totalL_L.setText("Empty");
            }
        try{

            String sql = "INSERT INTO balance_sheet (year,month,cash,account_recivable,inventory,property_equipment,total_assets,account_payable,debt,equity_capital,retained_earnings,total_liabilities_shareholders) VALUES('"+year+"','"+month+"','"+cash+"','"+account_recivable+"','"+inventory+"','"+property_equipment+"','"+total_asset+"','"+account_payable+"','"+debt+"','"+equity_capital+"','"+retained_earnings+"','"+total_liability_shareholder+"')";
            ps = cons.prepareStatement(sql);
            ps.execute();
            tableload();
        bsnobox.setText("");
       yearbox.setSelectedIndex(0);
       monthbox.setSelectedIndex(0);
       cashbox.setText("");
       accountRbox.setText("");
       inventorybox.setText("");
       propertybox.setText("");
       totalAbox.setText("");
       accountPbox.setText("");
       debtbox.setText("");
       equitybox.setText("");
       retainedbox.setText("");
       totalLbox.setText("");
        }
        catch(Exception e){}
                                      
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         bsnobox.setText("");
       yearbox.setSelectedIndex(0);
       monthbox.setSelectedIndex(0);
       cashbox.setText("");
       accountRbox.setText("");
       inventorybox.setText("");
       propertybox.setText("");
       totalAbox.setText("");
       accountPbox.setText("");
       debtbox.setText("");
       equitybox.setText("");
       retainedbox.setText("");
       totalLbox.setText("");
       
        
        year_L.setText("");
        month_L.setText("");
        cash_L.setText("");
        accountr_L.setText("");
        inventory_L.setText("");
        property_L.setText("");
        totalA_L.setText("");
        accountp_L.setText("");
        debt_L.setText("");
        equity_L.setText("");
        retained_L.setText("");
        totalL_L.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int delete1 = JOptionPane.showConfirmDialog(null,"Do you want to Delete this record?");

        if(delete1 == 0){

            String bsno = bsnobox.getText();

            try{
                String sql = "DELETE from balance_sheet Where bsno='"+ bsno +"'";
                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
            }
            catch(Exception e){}}
        bsnobox.setText("");
       yearbox.setSelectedIndex(0);
       monthbox.setSelectedIndex(0);
       cashbox.setText("");
       accountRbox.setText("");
       inventorybox.setText("");
       propertybox.setText("");
       totalAbox.setText("");
       accountPbox.setText("");
       debtbox.setText("");
       equitybox.setText("");
       retainedbox.setText("");
       totalLbox.setText("");

    add.setEnabled(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String month = searchbox.getText();
        try{
            String sql ="SELECT bsno,year,month,cash,account_recivable,inventory,property_equipment,total_assets,account_payable,debt,equity_capital,retained_earnings,total_liabilities_shareholders from balance_sheet where month LIKE '%"+ month +"%'";
            ps = cons.prepareStatement(sql);

            rs = ps.executeQuery();
            table2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

    private void cashboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashboxKeyTyped
             char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_cashboxKeyTyped

    private void accountRboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRboxKeyTyped
             char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_accountRboxKeyTyped

    private void inventoryboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryboxKeyTyped
             char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_inventoryboxKeyTyped

    private void propertyboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_propertyboxKeyTyped
           char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_propertyboxKeyTyped

    private void accountPboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPboxKeyTyped
            char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_accountPboxKeyTyped

    private void debtboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debtboxKeyTyped
             char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_debtboxKeyTyped

    private void equityboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equityboxKeyTyped
             char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_equityboxKeyTyped

    private void retainedboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retainedboxKeyTyped
            char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_retainedboxKeyTyped

    private void cashboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashboxKeyReleased
        cash_L.setText("");
    }//GEN-LAST:event_cashboxKeyReleased

    private void accountRboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRboxKeyReleased
        accountr_L.setText("");
    }//GEN-LAST:event_accountRboxKeyReleased

    private void inventoryboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inventoryboxKeyReleased
        inventory_L.setText("");
    }//GEN-LAST:event_inventoryboxKeyReleased

    private void propertyboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_propertyboxKeyReleased
        property_L.setText("");
    }//GEN-LAST:event_propertyboxKeyReleased

    private void accountPboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPboxKeyReleased
       accountp_L.setText("");
    }//GEN-LAST:event_accountPboxKeyReleased

    private void debtboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_debtboxKeyReleased
        debt_L.setText("");
    }//GEN-LAST:event_debtboxKeyReleased

    private void equityboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equityboxKeyReleased
        equity_L.setText("");
    }//GEN-LAST:event_equityboxKeyReleased

    private void retainedboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retainedboxKeyReleased
        retained_L.setText("");
    }//GEN-LAST:event_retainedboxKeyReleased

    private void yearboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearboxItemStateChanged
       year_L.setText("");
    }//GEN-LAST:event_yearboxItemStateChanged

    private void monthboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthboxItemStateChanged
      month_L.setText("");
    }//GEN-LAST:event_monthboxItemStateChanged

    private void totalAboxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalAboxPropertyChange
        totalA_L.setText("");
    }//GEN-LAST:event_totalAboxPropertyChange

    private void totalLboxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_totalLboxPropertyChange
        totalL_L.setText("");
    }//GEN-LAST:event_totalLboxPropertyChange

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
       cashbox.setText("1000.00");
       accountRbox.setText("2000.00");
       inventorybox.setText("130400.00");
       propertybox.setText("145839.00");
      
       accountPbox.setText("25600.00");
       debtbox.setText("12436000.00");
       equitybox.setText("32423.00");
       retainedbox.setText("233464.00");
     
    }//GEN-LAST:event_fillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountPayable;
    private javax.swing.JTextField accountPbox;
    private javax.swing.JTextField accountRbox;
    private javax.swing.JLabel accountRecivable;
    private javax.swing.JLabel accountp_L;
    private javax.swing.JLabel accountr_L;
    private javax.swing.JButton add;
    private javax.swing.JLabel background;
    private javax.swing.JLabel balanceSheet;
    private javax.swing.JLabel bsno;
    private javax.swing.JLabel bsnobox;
    private javax.swing.JLabel cash;
    private javax.swing.JLabel cash_L;
    private javax.swing.JTextField cashbox;
    private javax.swing.JButton clear;
    private javax.swing.JLabel debt;
    private javax.swing.JLabel debt_L;
    private javax.swing.JTextField debtbox;
    private javax.swing.JButton delete;
    private javax.swing.JLabel equityCapital;
    private javax.swing.JLabel equity_L;
    private javax.swing.JTextField equitybox;
    private javax.swing.JButton fill;
    private javax.swing.JLabel inventory;
    private javax.swing.JLabel inventory_L;
    private javax.swing.JTextField inventorybox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel month;
    private javax.swing.JLabel month_L;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JLabel monthsearch;
    private javax.swing.JLabel propertyEquipment;
    private javax.swing.JLabel property_L;
    private javax.swing.JTextField propertybox;
    private javax.swing.JLabel retainedEarnings;
    private javax.swing.JLabel retained_L;
    private javax.swing.JTextField retainedbox;
    private javax.swing.JLabel rs1;
    private javax.swing.JLabel rs3;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable table2;
    private javax.swing.JPanel top;
    private javax.swing.JLabel totalA_L;
    private javax.swing.JLabel totalAbox;
    private javax.swing.JLabel totalL_L;
    private javax.swing.JLabel totalLbox;
    private javax.swing.JButton total_assets;
    private javax.swing.JButton total_liability_shares;
    private javax.swing.JButton update;
    private javax.swing.JLabel year;
    private javax.swing.JLabel year_L;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables
}
