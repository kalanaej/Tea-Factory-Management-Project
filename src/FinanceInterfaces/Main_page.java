
package FinanceInterfaces;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Toolkit;
import mainInterface.MainPage;

/**
 *
 * @author Vihanga
 */
public class Main_page extends javax.swing.JFrame {
            
    public Main_page() {
        this.setVisible(true);
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JButton();
        income_statement = new javax.swing.JButton();
        cashflow_statement = new javax.swing.JButton();
        finance_statement = new javax.swing.JButton();
        balance_sheet = new javax.swing.JButton();
        mainframe = new javax.swing.JDesktopPane();
        miniBackground = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 770));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(153, 153, 255));
        home.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(0, 0, 51));
        home.setText("Home");
        home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home.setMultiClickThreshhold(1L);
        home.setSelected(true);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 96, 40));

        income_statement.setBackground(new java.awt.Color(153, 153, 255));
        income_statement.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        income_statement.setForeground(new java.awt.Color(0, 0, 51));
        income_statement.setText("Income Statement");
        income_statement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        income_statement.setMultiClickThreshhold(1L);
        income_statement.setSelected(true);
        income_statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                income_statementActionPerformed(evt);
            }
        });
        getContentPane().add(income_statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 170, 40));

        cashflow_statement.setBackground(new java.awt.Color(153, 153, 255));
        cashflow_statement.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cashflow_statement.setForeground(new java.awt.Color(0, 0, 51));
        cashflow_statement.setText("Cashflow Statement");
        cashflow_statement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cashflow_statement.setMultiClickThreshhold(1L);
        cashflow_statement.setSelected(true);
        cashflow_statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashflow_statementActionPerformed(evt);
            }
        });
        getContentPane().add(cashflow_statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 180, 40));

        finance_statement.setBackground(new java.awt.Color(153, 153, 255));
        finance_statement.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        finance_statement.setForeground(new java.awt.Color(0, 0, 51));
        finance_statement.setText("Financial Statement");
        finance_statement.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        finance_statement.setMultiClickThreshhold(1L);
        finance_statement.setSelected(true);
        finance_statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finance_statementActionPerformed(evt);
            }
        });
        getContentPane().add(finance_statement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 190, 40));

        balance_sheet.setBackground(new java.awt.Color(153, 153, 255));
        balance_sheet.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        balance_sheet.setForeground(new java.awt.Color(0, 0, 51));
        balance_sheet.setText("Balance Sheet");
        balance_sheet.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balance_sheet.setMultiClickThreshhold(1L);
        balance_sheet.setSelected(true);
        balance_sheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_sheetActionPerformed(evt);
            }
        });
        getContentPane().add(balance_sheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 190, 40));

        mainframe.setBackground(new java.awt.Color(255, 255, 255));
        mainframe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainframe.setPreferredSize(new java.awt.Dimension(1290, 590));

        miniBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main_panel.jpg"))); // NOI18N

        mainframe.setLayer(miniBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainframeLayout = new javax.swing.GroupLayout(mainframe);
        mainframe.setLayout(mainframeLayout);
        mainframeLayout.setHorizontalGroup(
            mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miniBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1286, Short.MAX_VALUE)
        );
        mainframeLayout.setVerticalGroup(
            mainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miniBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 586, Short.MAX_VALUE)
        );

        getContentPane().add(mainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1290, 590));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 100));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Main_back.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        MainPage main = new MainPage();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void income_statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_income_statementActionPerformed
        mainframe.removeAll();
        IncomeStatement_UI is = new IncomeStatement_UI();
        mainframe.add(is).setVisible(true);
    }//GEN-LAST:event_income_statementActionPerformed

    private void cashflow_statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashflow_statementActionPerformed
        mainframe.removeAll();
        CashFlowStatement_UI cs = new CashFlowStatement_UI();
        mainframe.add(cs).setVisible(true);
    }//GEN-LAST:event_cashflow_statementActionPerformed

    private void balance_sheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance_sheetActionPerformed
        mainframe.removeAll();
        BalanceSheet_UI bs = new BalanceSheet_UI();
        mainframe.add(bs).setVisible(true);
    }//GEN-LAST:event_balance_sheetActionPerformed

    private void finance_statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finance_statementActionPerformed
      mainframe.removeAll();
       FinancialStatement_UI fs = new FinancialStatement_UI();
      mainframe.add(fs).setVisible(true);
    }//GEN-LAST:event_finance_statementActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton balance_sheet;
    private javax.swing.JButton cashflow_statement;
    private javax.swing.JButton finance_statement;
    private javax.swing.JButton home;
    private javax.swing.JButton income_statement;
    private javax.swing.JLabel logo;
    private javax.swing.JDesktopPane mainframe;
    private javax.swing.JLabel miniBackground;
    // End of variables declaration//GEN-END:variables
}
