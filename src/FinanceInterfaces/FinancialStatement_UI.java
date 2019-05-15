
package FinanceInterfaces;

import DBConnect.DBconnect;
import com.itextpdf.text.BaseColor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Vihanga
 */
public class FinancialStatement_UI extends javax.swing.JInternalFrame {
                 Connection cons = null;
                 Connection cons1 = null;
                 Connection cons2 = null;
                 PreparedStatement ps = null;
                 PreparedStatement ps1 = null;
                 PreparedStatement ps2 = null;
                 ResultSet rs = null;
                 ResultSet rs1 = null;
                 ResultSet rs2 = null;
    
    public FinancialStatement_UI() {
        initComponents();
        cons = DBconnect.getConnection();
        cons1 = DBconnect.getConnection();
        cons2 = DBconnect.getConnection();
        
    }
 public void tableload(){
    
    try{
            String sql ="SELECT bsno,year,month,cash,account_recivable,inventory,property_equipment,total_assets,account_payable,debt,equity_capital,retained_earnings,total_liabilities_shareholders FROM balance_sheet";
            ps = cons.prepareStatement(sql);
            rs = ps.executeQuery();
            
            String sql1 ="SELECT csno,year,month,net_earnings,depreciation_and_Amortization,changes_in_working_capital,cash_from_Opertations,investment_in_proprty_and_equipment,cash_from_investing,issuance_of_debt,issuance_of_equity,cash_from_financing,net_increasing_in_cash,Opening_cash_balance,Closing_cash_balance FROM cashflow_statement";
            ps1 = cons1.prepareStatement(sql1);
            rs1 = ps1.executeQuery();
            
            String sql2 = "SELECT isno, year,month,revenue,cost_of_goods, gross_profit,wages,inventory,earnings_from_operations,other_income,taxes,net_earnings FROM income_statement";
            ps2 = cons2.prepareStatement(sql2);
            rs2 = ps2.executeQuery();
            
            
            table2.setModel(DbUtils.resultSetToTableModel(rs));
            table3.setModel(DbUtils.resultSetToTableModel(rs1));
            table1.setModel(DbUtils.resultSetToTableModel(rs2));
            
                    }
        catch(Exception e){}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        cashflowStatement1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Report = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1290, 590));
        setMinimumSize(new java.awt.Dimension(1290, 590));
        setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setBackground(new java.awt.Color(0, 0, 51));
        top.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        top.setPreferredSize(new java.awt.Dimension(1290, 46));

        cashflowStatement1.setBackground(new java.awt.Color(204, 204, 255));
        cashflowStatement1.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        cashflowStatement1.setForeground(new java.awt.Color(255, 255, 255));
        cashflowStatement1.setText("FINANCIAL STATEMENT");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(cashflowStatement1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addComponent(cashflowStatement1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

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
        table2.setGridColor(new java.awt.Color(255, 255, 255));
        table2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table2.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(table2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 960, 80));

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("INCOME STATEMENT");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        search.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 51));
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 90, -1));

        searchbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        searchbox.setForeground(new java.awt.Color(0, 0, 51));
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchboxKeyTyped(evt);
            }
        });
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 110, -1));

        table3.setBackground(new java.awt.Color(0, 0, 51));
        table3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        table3.setForeground(new java.awt.Color(255, 255, 255));
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Csno", "Year", "Month", "Net earnings", "depreciation_and_Amortization", "changes_in_working_capital", "cash_from_Opertations", "investment_in_proprty_and_equipment", "cash_from_investing", "issuance_of_debt", "issuance_of_equity ", "cash_from_financing", "net_increasing_in_cash", "Opening_cash_balance", "Closing_cash_balance"
            }
        ));
        table3.setGridColor(new java.awt.Color(255, 255, 255));
        table3.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table3.setSelectionForeground(new java.awt.Color(0, 0, 51));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 960, 80));

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("BALANCE SHEET");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("CASHFLOW STATEMENT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        Report.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Report.setForeground(new java.awt.Color(0, 0, 51));
        Report.setText("Report");
        Report.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });
        getContentPane().add(Report, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 290, 90, -1));

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
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table1.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane4.setViewportView(table1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 960, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 50, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 280, 50, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1290, 590));
        background.setMinimumSize(new java.awt.Dimension(1290, 590));
        background.setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyTyped
       char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_searchboxKeyTyped

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String bsno = searchbox.getText();
        String csno = searchbox.getText();
        String isno = searchbox.getText();

        try{
            String sql ="SELECT bsno,year,month,cash,account_recivable,inventory,property_equipment,total_assets,account_payable,debt,equity_capital,retained_earnings,total_liabilities_shareholders from balance_sheet where bsno LIKE '%"+ bsno +"%'";
            ps = cons.prepareStatement(sql);
            rs = ps.executeQuery();

            String sql1 ="SELECT csno,year,month,net_earnings,depreciation_and_Amortization,changes_in_working_capital,cash_from_Opertations,investment_in_proprty_and_equipment,cash_from_investing,issuance_of_debt,issuance_of_equity,cash_from_financing,net_increasing_in_cash,Opening_cash_balance,Closing_cash_balance FROM cashflow_statement where csno LIKE '%"+ csno +"%'";
            ps1 = cons1.prepareStatement(sql1);
            rs1 = ps1.executeQuery();

            String sql2 = "SELECT isno, year,month,revenue,cost_of_goods, gross_profit,wages,inventory,earnings_from_operations,other_income,taxes,net_earnings FROM income_statement where isno LIKE '%"+ isno +"%'";
            ps2 = cons2.prepareStatement(sql2);
            rs2 = ps2.executeQuery();
            
            table1.setModel(DbUtils.resultSetToTableModel(rs2));
            table3.setModel(DbUtils.resultSetToTableModel(rs1));
            table2.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e){}

    }//GEN-LAST:event_searchActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
            Document document = new Document(PageSize.A4);
                     try { 
                         
                         PdfWriter.getInstance(document,new FileOutputStream("Financial Report.pdf"));
                          document.open();
                          Image image = Image.getInstance("reporthead.png");
                          image.scaleAbsolute(350f, 70f);
                          document.add(image);
                           int r4 = table1.getSelectedRow();

      
                        String year = table1.getValueAt(r4,1).toString();
                        String month = table1.getValueAt(r4,2).toString();
                          
                           document.add(new Paragraph("                                              Financial Statement",FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.BOLD,BaseColor.BLACK)));
                       
                       document.add(new Paragraph("Year  -   "+year+"                                    Month  -   "+month));
                   document.add(new Paragraph("__________________________________________________________________________"));
                        
                         document.add(new Paragraph("   "));
                          
                       
                        int r1 = table1.getSelectedRow();

      
                        String revenue = table1.getValueAt(r1,3).toString();
                        String cogs = table1.getValueAt(r1,4).toString();
                        String gross = table1.getValueAt(r1,5).toString();
                        String wages = table1.getValueAt(r1,6).toString();
                        String inventory = table1.getValueAt(r1,7).toString();
                        String earnings = table1.getValueAt(r1,8).toString();
                        String other = table1.getValueAt(r1,9).toString();
                        String tax = table1.getValueAt(r1,10).toString();
                        String net = table1.getValueAt(r1,11).toString();
                       
                      
                          PdfPTable tab1 = new PdfPTable(2);
                          PdfPCell cell= new PdfPCell(new Paragraph("Income Statement"));
                          cell.setColspan(4);
                          cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                          cell.setBackgroundColor(BaseColor.GREEN);
                          tab1.addCell(cell);
                          
                          tab1.addCell("Revenue");tab1.addCell("Rs:  "+revenue);
                          tab1.addCell("Cost Of Goods ");tab1.addCell("Rs:  "+cogs);
                          tab1.addCell("Gross Profit");tab1.addCell("Rs:  "+gross);
                          tab1.addCell("Wages ");tab1.addCell("Rs:  "+wages);
                          tab1.addCell("Inventory");tab1.addCell("Rs:  "+inventory);
                          tab1.addCell("Earning From Operations ");tab1.addCell("Rs:  "+earnings);;
                          tab1.addCell("Other Income");tab1.addCell("Rs:  "+other);
                          tab1.addCell("Taxes");tab1.addCell("Rs:  "+tax);
                          tab1.addCell("Net Earnings");tab1.addCell("Rs:  "+net);
                          document.add(tab1);
                    
                          
                           int r2 = table2.getSelectedRow();

       
        
        String cash = table2.getValueAt(r2,3).toString();
        String account_recivable = table2.getValueAt(r2,4).toString();
        String inventorys = table2.getValueAt(r2,5).toString();
        String property_equipment = table2.getValueAt(r2,6).toString();
        String total_asset = table2.getValueAt(r2,7).toString();
        String account_payable = table2.getValueAt(r2,8).toString();
        String debt = table2.getValueAt(r2,9).toString();
        String equity_capital = table2.getValueAt(r2,10).toString();
        String retained_earnings = table2.getValueAt(r2,11).toString();
        String total_liability_shareholder = table2.getValueAt(r2,12).toString();
                      
                          PdfPTable tab2 = new PdfPTable(2);
                          PdfPCell cell1 = new PdfPCell(new Paragraph("Balance Sheet"));
                          cell1.setColspan(4);
                          cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                          cell1.setBackgroundColor(BaseColor.GREEN);
                          tab2.addCell(cell1);
                       
                          tab2.addCell("Cash");tab2.addCell("Rs:  "+cash);
                          tab2.addCell("Account Recivable");tab2.addCell("Rs:  "+account_recivable);
                          tab2.addCell("Inventory ");tab2.addCell("Rs:  "+inventorys);
                          tab2.addCell("Property and Equipment ");tab2.addCell("Rs:  "+property_equipment);
                          tab2.addCell("Total Assets ");tab2.addCell("Rs:  "+total_asset);
                          tab2.addCell("Account Payable");tab2.addCell("Rs:  "+account_payable);
                          tab2.addCell("Dept ");tab2.addCell("Rs:  "+ debt );
                          tab2.addCell("Equity Capital ");tab2.addCell("Rs:  "+equity_capital);
                          tab2.addCell("Retained Earnings");tab2.addCell("Rs:  "+retained_earnings);
                          tab2.addCell("Total Liabilities and Shareholders");tab2.addCell("Rs:  "+total_liability_shareholder);
                          document.add(tab2);
             
                      
                         int r = table3.getSelectedRow();
                       
                          String net_earnings = table3.getValueAt(r,3).toString();
                          String depreciation_and_Amortization = table3.getValueAt(r,4).toString();
                          String changes_in_working_capital = table3.getValueAt(r,5).toString();
                          String cash_from_Opertations = table3.getValueAt(r,6).toString();
                          String investment_in_proprty_and_equipment = table3.getValueAt(r,7).toString();
                          String cash_from_investing = table3.getValueAt(r,8).toString();
                          String issuance_of_debt = table3.getValueAt(r,9).toString();
                          String issuance_of_equity = table3.getValueAt(r,10).toString();
                          String cash_from_financing = table3.getValueAt(r,11).toString();
                          String net_increasing_in_cash = table3.getValueAt(r,12).toString();
                          String Opening_cash_balance = table3.getValueAt(r,13).toString();
                          String Closing_cash_balance= table3.getValueAt(r,14).toString();
                       
                     
                        PdfPTable tab3 = new PdfPTable(2);
                        PdfPCell cell2= new PdfPCell(new Paragraph("Cash Flow Statement"));
                          cell2.setColspan(4);
                          cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                          cell2.setBackgroundColor(BaseColor.GREEN);
                          tab3.addCell(cell2);
                        
                        
                          tab3.addCell("Net Earnings ");tab3.addCell("Rs:  "+ net_earnings);
                          tab3.addCell("Depreciation & Amortization");tab3.addCell("Rs:  " +depreciation_and_Amortization);
                          tab3.addCell("Changes In Working Capital");tab3.addCell("Rs:  "+changes_in_working_capital);
                          tab3.addCell("Cash From Operations ");tab3.addCell("Rs:  "+cash_from_Opertations);
                          tab3.addCell("Investment in Prop/Equip  ");tab3.addCell("Rs:  "+investment_in_proprty_and_equipment);
                          tab3.addCell("Cash From Investing");tab3.addCell("Rs:  "+cash_from_investing);
                          tab3.addCell("Issuance Of Debt ");tab3.addCell("Rs:  "+issuance_of_debt);
                          tab3.addCell("Issuance Of Equity ");tab3.addCell("Rs:  "+issuance_of_equity );
                          tab3.addCell("Cash from Financing");tab3.addCell("Rs:  "+cash_from_financing);
                          tab3.addCell("Net Increase/Decrease In Cash");tab3.addCell("Rs:  "+net_increasing_in_cash);
                          tab3.addCell("Openning Cash Balance");tab3.addCell("Rs:  "+Opening_cash_balance);
                          tab3.addCell("Closing Cash Balance ");tab3.addCell("Rs:  "+Closing_cash_balance);
                          document.add(tab3);
             
                       
                        document.add(new Paragraph("                ...................................                                              ...................................",FontFactory.getFont(FontFactory.TIMES_BOLD, 12,java.awt.Font.BOLD, BaseColor.BLACK)));
            
                        document.add(new Paragraph("                       Prepared By                                                            Checked By",FontFactory.getFont(FontFactory.TIMES_BOLD, 12,java.awt.Font.BOLD, BaseColor.BLACK)));
                        document.add(new Paragraph("  "));
                       
                        document.close();
                       JOptionPane.showMessageDialog(null,"Report Saved");
                       Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\DELL\\Documents\\NetBeansProjects\\TeaFactoryFinance\\Report.pdf");
                         
                     } catch (DocumentException ex) {
                         Logger.getLogger(FinancialStatement_UI.class.getName()).log(Level.SEVERE, null, ex);
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(FinancialStatement_UI.class.getName()).log(Level.SEVERE, null, ex);
                     }  catch (IOException ex) {
                         Logger.getLogger(FinancialStatement_UI.class.getName()).log(Level.SEVERE, null, ex);
                     } 
                      
    }//GEN-LAST:event_ReportActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
     
    }//GEN-LAST:event_table3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Report;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cashflowStatement1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
