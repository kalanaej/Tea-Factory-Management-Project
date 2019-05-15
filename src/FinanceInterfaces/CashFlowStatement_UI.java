
package FinanceInterfaces;

/**
 *
 * @author Vihanga
 */
import DBConnect.DBconnect;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;



public class CashFlowStatement_UI extends javax.swing.JInternalFrame {
                 Connection cons = null;
                 PreparedStatement ps = null;
                 ResultSet rs = null;
   
    public CashFlowStatement_UI() {
        initComponents();
        cons = DBconnect.getConnection();
        tableload();
    }

    public void tableload(){
        try{
            String sql ="SELECT csno,year,month,net_earnings,depreciation_and_Amortization,changes_in_working_capital,cash_from_Opertations,investment_in_proprty_and_equipment,cash_from_investing,issuance_of_debt,issuance_of_equity,cash_from_financing,net_increasing_in_cash,Opening_cash_balance,Closing_cash_balance FROM cashflow_statement";
            ps = cons.prepareStatement(sql);
            rs = ps.executeQuery();
            
            table3.setModel(DbUtils.resultSetToTableModel(rs));
            
                    }
        catch(Exception e){}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        cashflowStatement = new javax.swing.JLabel();
        csno = new javax.swing.JLabel();
        cfibox = new javax.swing.JTextField();
        nebox = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        yearbox = new javax.swing.JComboBox<>();
        monthbox = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        fill = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        monthsearch = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        month = new javax.swing.JLabel();
        closingCashBalance = new javax.swing.JLabel();
        opeingCashBalance = new javax.swing.JLabel();
        netIncreasingInCash = new javax.swing.JLabel();
        cashFromFinancing = new javax.swing.JLabel();
        issuanceOfEquity = new javax.swing.JLabel();
        issuanceOfDebt = new javax.swing.JLabel();
        CashFromInvesting = new javax.swing.JLabel();
        InvestmentInPropEquip = new javax.swing.JLabel();
        depreciationAndAmortization = new javax.swing.JLabel();
        changesInWorkingCapital = new javax.swing.JLabel();
        netEarnings = new javax.swing.JLabel();
        cashFromOperations = new javax.swing.JLabel();
        csnobox = new javax.swing.JLabel();
        iipebox = new javax.swing.JTextField();
        cfobox = new javax.swing.JTextField();
        ciwcbox = new javax.swing.JTextField();
        iodbox = new javax.swing.JTextField();
        ioebox = new javax.swing.JTextField();
        cffbox = new javax.swing.JTextField();
        nidicbox = new javax.swing.JTextField();
        ocbbox = new javax.swing.JTextField();
        ccbbox = new javax.swing.JTextField();
        dabox = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        da_L = new javax.swing.JLabel();
        cfi_L = new javax.swing.JLabel();
        iipe_L = new javax.swing.JLabel();
        cfo_L = new javax.swing.JLabel();
        ciwc_L = new javax.swing.JLabel();
        iod_L = new javax.swing.JLabel();
        ioe_L = new javax.swing.JLabel();
        cff_L = new javax.swing.JLabel();
        nidic_L = new javax.swing.JLabel();
        ocb_L = new javax.swing.JLabel();
        ccb_L = new javax.swing.JLabel();
        year_L = new javax.swing.JLabel();
        month_L = new javax.swing.JLabel();
        ne_L = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1290, 590));
        setMinimumSize(new java.awt.Dimension(1290, 590));
        setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setBackground(new java.awt.Color(0, 0, 51));
        top.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51)));
        top.setForeground(new java.awt.Color(255, 255, 255));

        cashflowStatement.setBackground(new java.awt.Color(204, 204, 255));
        cashflowStatement.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        cashflowStatement.setForeground(new java.awt.Color(255, 255, 255));
        cashflowStatement.setText("CASHFLOW STATEMENT");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(cashflowStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addComponent(cashflowStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        csno.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        csno.setForeground(new java.awt.Color(0, 0, 153));
        csno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        csno.setText(" CS No  :");
        getContentPane().add(csno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        cfibox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        cfibox.setForeground(new java.awt.Color(0, 0, 51));
        cfibox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cfiboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cfiboxKeyTyped(evt);
            }
        });
        getContentPane().add(cfibox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 110, -1));

        nebox.setBackground(new java.awt.Color(255, 255, 255));
        nebox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        nebox.setForeground(new java.awt.Color(0, 0, 51));
        nebox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 255)));
        nebox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                neboxPropertyChange(evt);
            }
        });
        getContentPane().add(nebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 110, 30));

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

        searchbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        searchbox.setForeground(new java.awt.Color(0, 0, 51));
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 110, -1));

        monthsearch.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        monthsearch.setForeground(new java.awt.Color(0, 0, 153));
        monthsearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        monthsearch.setText("Month :");
        getContentPane().add(monthsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 77, 20));

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

        closingCashBalance.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        closingCashBalance.setForeground(new java.awt.Color(0, 0, 153));
        closingCashBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        closingCashBalance.setText("Closing Cash Balance                Rs :");
        getContentPane().add(closingCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 340, -1));

        opeingCashBalance.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        opeingCashBalance.setForeground(new java.awt.Color(0, 0, 153));
        opeingCashBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opeingCashBalance.setText("Openning Cash Balance             Rs :");
        getContentPane().add(opeingCashBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 340, -1));

        netIncreasingInCash.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        netIncreasingInCash.setForeground(new java.awt.Color(0, 0, 153));
        netIncreasingInCash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        netIncreasingInCash.setText("Net Increase/Decrease In Cash   Rs :");
        getContentPane().add(netIncreasingInCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 350, -1));

        cashFromFinancing.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        cashFromFinancing.setForeground(new java.awt.Color(0, 0, 153));
        cashFromFinancing.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashFromFinancing.setText("Cash from Financing                  Rs:");
        getContentPane().add(cashFromFinancing, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 330, -1));

        issuanceOfEquity.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        issuanceOfEquity.setForeground(new java.awt.Color(0, 0, 153));
        issuanceOfEquity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        issuanceOfEquity.setText("Issuance Of Equity                     Rs :");
        getContentPane().add(issuanceOfEquity, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        issuanceOfDebt.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        issuanceOfDebt.setForeground(new java.awt.Color(0, 0, 153));
        issuanceOfDebt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        issuanceOfDebt.setText("Issuance Of Debt                       Rs:");
        getContentPane().add(issuanceOfDebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 330, -1));

        CashFromInvesting.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        CashFromInvesting.setForeground(new java.awt.Color(0, 0, 153));
        CashFromInvesting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CashFromInvesting.setText("Cash From Investing                Rs :");
        getContentPane().add(CashFromInvesting, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 320, -1));

        InvestmentInPropEquip.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        InvestmentInPropEquip.setForeground(new java.awt.Color(0, 0, 153));
        InvestmentInPropEquip.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InvestmentInPropEquip.setText("Investment in Prop/Equip         Rs :");
        getContentPane().add(InvestmentInPropEquip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 320, -1));

        depreciationAndAmortization.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        depreciationAndAmortization.setForeground(new java.awt.Color(0, 0, 153));
        depreciationAndAmortization.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        depreciationAndAmortization.setText("Depreciation & Amortization    Rs:");
        getContentPane().add(depreciationAndAmortization, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 320, -1));

        changesInWorkingCapital.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        changesInWorkingCapital.setForeground(new java.awt.Color(0, 0, 153));
        changesInWorkingCapital.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changesInWorkingCapital.setText("Changes In Working Capital     Rs :");
        getContentPane().add(changesInWorkingCapital, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 340, -1));

        netEarnings.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        netEarnings.setForeground(new java.awt.Color(0, 0, 153));
        netEarnings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        netEarnings.setText("Net Earnings                            Rs :");
        getContentPane().add(netEarnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 320, -1));

        cashFromOperations.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 21)); // NOI18N
        cashFromOperations.setForeground(new java.awt.Color(0, 0, 153));
        cashFromOperations.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cashFromOperations.setText("Cash From Operations              Rs :");
        getContentPane().add(cashFromOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        csnobox.setBackground(new java.awt.Color(255, 255, 255));
        csnobox.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        csnobox.setForeground(new java.awt.Color(0, 0, 51));
        csnobox.setText(" ID");
        csnobox.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 255)));
        getContentPane().add(csnobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 40, 30));

        iipebox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        iipebox.setForeground(new java.awt.Color(0, 0, 51));
        iipebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iipeboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iipeboxKeyTyped(evt);
            }
        });
        getContentPane().add(iipebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 110, -1));

        cfobox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        cfobox.setForeground(new java.awt.Color(0, 0, 51));
        cfobox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cfoboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cfoboxKeyTyped(evt);
            }
        });
        getContentPane().add(cfobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 110, -1));

        ciwcbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        ciwcbox.setForeground(new java.awt.Color(0, 0, 51));
        ciwcbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ciwcboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ciwcboxKeyTyped(evt);
            }
        });
        getContentPane().add(ciwcbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 110, -1));

        iodbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        iodbox.setForeground(new java.awt.Color(0, 0, 51));
        iodbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                iodboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iodboxKeyTyped(evt);
            }
        });
        getContentPane().add(iodbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 110, -1));

        ioebox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        ioebox.setForeground(new java.awt.Color(0, 0, 51));
        ioebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ioeboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ioeboxKeyTyped(evt);
            }
        });
        getContentPane().add(ioebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 110, -1));

        cffbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        cffbox.setForeground(new java.awt.Color(0, 0, 51));
        cffbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cffboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cffboxKeyTyped(evt);
            }
        });
        getContentPane().add(cffbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 110, -1));

        nidicbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        nidicbox.setForeground(new java.awt.Color(0, 0, 51));
        nidicbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nidicboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nidicboxKeyTyped(evt);
            }
        });
        getContentPane().add(nidicbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 110, -1));

        ocbbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        ocbbox.setForeground(new java.awt.Color(0, 0, 51));
        ocbbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ocbboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ocbboxKeyTyped(evt);
            }
        });
        getContentPane().add(ocbbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 110, -1));

        ccbbox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        ccbbox.setForeground(new java.awt.Color(0, 0, 51));
        ccbbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccbboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccbboxKeyTyped(evt);
            }
        });
        getContentPane().add(ccbbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 110, -1));

        dabox.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        dabox.setForeground(new java.awt.Color(0, 0, 51));
        dabox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                daboxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daboxKeyTyped(evt);
            }
        });
        getContentPane().add(dabox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 110, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1290, 10));

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
        table3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table3.setGridColor(new java.awt.Color(204, 204, 255));
        table3.setSelectionBackground(new java.awt.Color(204, 204, 255));
        table3.setSelectionForeground(new java.awt.Color(0, 0, 51));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1280, 150));

        da_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        da_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(da_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 50, 20));

        cfi_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cfi_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cfi_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 50, 20));

        iipe_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        iipe_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(iipe_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 20));

        cfo_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cfo_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cfo_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 50, 20));

        ciwc_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ciwc_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ciwc_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 50, 20));

        iod_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        iod_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(iod_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 50, 20));

        ioe_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ioe_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ioe_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 160, 50, 20));

        cff_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cff_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cff_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 50, 20));

        nidic_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        nidic_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(nidic_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 50, 20));

        ocb_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ocb_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ocb_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 250, 50, 20));

        ccb_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ccb_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ccb_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 50, 20));

        year_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        year_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(year_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 150, 20));

        month_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        month_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(month_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, 160, 20));

        ne_L.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ne_L.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ne_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 50, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1290, 590));
        background.setMinimumSize(new java.awt.Dimension(1290, 590));
        background.setPreferredSize(new java.awt.Dimension(1290, 590));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void neboxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_neboxPropertyChange
        ne_L.setText("");
    }//GEN-LAST:event_neboxPropertyChange

    private void yearboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearboxItemStateChanged
        year_L.setText("");
    }//GEN-LAST:event_yearboxItemStateChanged

    private void monthboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthboxItemStateChanged
        month_L.setText("");
    }//GEN-LAST:event_monthboxItemStateChanged

    private void iipeboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iipeboxKeyReleased
        iipe_L.setText("");
    }//GEN-LAST:event_iipeboxKeyReleased

    private void iipeboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iipeboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_iipeboxKeyTyped

    private void cfoboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfoboxKeyReleased
      cfo_L.setText("");
    }//GEN-LAST:event_cfoboxKeyReleased

    private void cfoboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfoboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_cfoboxKeyTyped

    private void ciwcboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciwcboxKeyReleased
        ciwc_L.setText("");
    }//GEN-LAST:event_ciwcboxKeyReleased

    private void ciwcboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciwcboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_ciwcboxKeyTyped

    private void iodboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iodboxKeyReleased
        iod_L.setText("");
    }//GEN-LAST:event_iodboxKeyReleased

    private void iodboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iodboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_iodboxKeyTyped

    private void ioeboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioeboxKeyReleased
       ioe_L.setText("");
    }//GEN-LAST:event_ioeboxKeyReleased

    private void ioeboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ioeboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_ioeboxKeyTyped

    private void cffboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cffboxKeyReleased
       cff_L.setText("");
    }//GEN-LAST:event_cffboxKeyReleased

    private void cffboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cffboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_cffboxKeyTyped

    private void nidicboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidicboxKeyReleased
       nidic_L.setText("");
    }//GEN-LAST:event_nidicboxKeyReleased

    private void nidicboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidicboxKeyTyped
       char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_nidicboxKeyTyped

    private void ocbboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ocbboxKeyReleased
      ocb_L.setText("");
    }//GEN-LAST:event_ocbboxKeyReleased

    private void ocbboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ocbboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_ocbboxKeyTyped

    private void ccbboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccbboxKeyReleased
        ccb_L.setText("");
    }//GEN-LAST:event_ccbboxKeyReleased

    private void ccbboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccbboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_ccbboxKeyTyped

    private void daboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daboxKeyReleased
       da_L.setText("");
    }//GEN-LAST:event_daboxKeyReleased

    private void daboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daboxKeyTyped
         char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_daboxKeyTyped

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        int r = table3.getSelectedRow();

        String csno = table3.getValueAt(r,0).toString();
        String year = table3.getValueAt(r,1).toString();
        String month = table3.getValueAt(r,2).toString();
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

        csnobox.setText(csno);
        yearbox.setSelectedItem(year);
        monthbox.setSelectedItem(month);
        nebox.setText(net_earnings);
        dabox.setText(depreciation_and_Amortization);
        ciwcbox.setText(changes_in_working_capital);
        cfobox.setText(cash_from_Opertations);
        iipebox.setText(investment_in_proprty_and_equipment);
        cfibox.setText(cash_from_investing);
        iodbox.setText(issuance_of_debt);
        ioebox.setText(issuance_of_equity);
        cffbox.setText(cash_from_financing);
        nidicbox.setText(net_increasing_in_cash);
        ocbbox.setText(Opening_cash_balance);
        ccbbox.setText(Closing_cash_balance);
        
        add.setEnabled(false);
    }//GEN-LAST:event_table3MouseClicked

    private void cfiboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfiboxKeyReleased
       cfi_L.setText("");
    }//GEN-LAST:event_cfiboxKeyReleased

    private void cfiboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfiboxKeyTyped
        char c = evt.getKeyChar();{
    if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
     evt.consume();
    }}
    }//GEN-LAST:event_cfiboxKeyTyped

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        
        String year = yearbox.getSelectedItem().toString();
        if(yearbox.getSelectedIndex()== 0){
            year_L.setText("Select a month");
            }
        String month = monthbox.getSelectedItem().toString();
        if(monthbox.getSelectedIndex()== 0){
            month_L.setText("Select a month");
            }
        String net_earnings  = nebox.getText();
        if(nebox.getText().trim().isEmpty()){
                ne_L.setText("Empty");
            }
        String depreciation_and_Amortization = dabox.getText();
        if(dabox.getText().trim().isEmpty()){
                da_L.setText("Empty");
            }
        String changes_in_working_capital = ciwcbox.getText();
         if(ciwcbox.getText().trim().isEmpty()){
                ciwc_L.setText("Empty");
            }
        String cash_from_Opertations = cfobox.getText();
        if(cfobox.getText().trim().isEmpty()){
                cfo_L.setText("Empty");
            }
        String investment_in_proprty_and_equipment = iipebox.getText();
        if(iipebox.getText().trim().isEmpty()){
                iipe_L.setText("Empty");
            }
        String cash_from_investing = cfibox.getText();
        if(cfibox.getText().trim().isEmpty()){
                cfi_L.setText("Empty");
            }
        String issuance_of_debt = iodbox.getText();
        if(iodbox.getText().trim().isEmpty()){
                iod_L.setText("Empty");
            }
        String issuance_of_equity  = ioebox.getText();
         if(ioebox.getText().trim().isEmpty()){
                ioe_L.setText("Empty");
            }
        String cash_from_financing = cffbox.getText();
         if(cffbox.getText().trim().isEmpty()){
                cff_L.setText("Empty");
            }
        String net_increasing_in_cash = nidicbox.getText();
         if(nidicbox.getText().trim().isEmpty()){
                nidic_L.setText("Empty");
            }
        String Opening_cash_balance = ocbbox.getText();
         if(ocbbox.getText().trim().isEmpty()){
                ocb_L.setText("Empty");
            }
        String Closing_cash_balance = ccbbox.getText();
        if(ccbbox.getText().trim().isEmpty()){
                ccb_L.setText("Empty");
            }
        try{

            String sql = "INSERT INTO cashflow_statement(year,month,net_earnings,depreciation_and_Amortization,changes_in_working_capital,cash_from_Opertations,investment_in_proprty_and_equipment,cash_from_investing,issuance_of_debt,issuance_of_equity,cash_from_financing,net_increasing_in_cash,Opening_cash_balance,Closing_cash_balance) VALUES('"+year+"','"+month+"','"+net_earnings+"','"+depreciation_and_Amortization+"','"+changes_in_working_capital+"','"+cash_from_Opertations+"','"+investment_in_proprty_and_equipment+"','"+cash_from_investing+"','"+issuance_of_debt+"','"+issuance_of_equity+"','"+cash_from_financing+"','"+net_increasing_in_cash+"','"+Opening_cash_balance+"','"+Closing_cash_balance+"')";
            ps = cons.prepareStatement(sql);
            ps.execute();
            tableload();
            
            yearbox.setSelectedIndex(0);
            monthbox.setSelectedIndex(0);
            nebox.setText("");
            dabox.setText("");
            ciwcbox.setText("");
            cfobox.setText("");
            iipebox.setText("");
            cfibox.setText("");
            iodbox.setText("");
            ioebox.setText("");
            cffbox.setText("");
            nidicbox.setText("");
            ocbbox.setText("");
            ccbbox.setText("");
        }
        catch(Exception e){}
                                        
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          int update1 = JOptionPane.showConfirmDialog(null,"Do you want to update this record?");

        if(update1 ==0){
            String csno = csnobox.getText();
            String year = yearbox.getSelectedItem().toString();
            String month = monthbox.getSelectedItem().toString();
            String net_earnings  = nebox.getText();
            String depreciation_and_Amortization = dabox.getText();
            String changes_in_working_capital = ciwcbox.getText();
            String cash_from_Opertations = cfobox.getText();
            String investment_in_proprty_and_equipment = iipebox.getText();
            String cash_from_investing = cfibox.getText();
            String issuance_of_debt = iodbox.getText();
            String issuance_of_equity  = ioebox.getText();
            String cash_from_financing = cffbox.getText();
            String net_increasing_in_cash = nidicbox.getText();
            String Opening_cash_balance = ocbbox.getText();
            String Closing_cash_balance = ccbbox.getText();
            
            
        if(yearbox.getSelectedIndex()== 0){
            year_L.setText("Select a month");
            }
        if(monthbox.getSelectedIndex()== 0){
            month_L.setText("Select a month");
            }
        if(nebox.getText().trim().isEmpty()){
                ne_L.setText("Empty");
            }
        if(dabox.getText().trim().isEmpty()){
                da_L.setText("Empty");
            }
         if(ciwcbox.getText().trim().isEmpty()){
                ciwc_L.setText("Empty");
            }
        if(cfobox.getText().trim().isEmpty()){
                cfo_L.setText("Empty");
            }
        if(iipebox.getText().trim().isEmpty()){
                iipe_L.setText("Empty");
            }
        if(cfibox.getText().trim().isEmpty()){
                cfi_L.setText("Empty");
            }
        if(iodbox.getText().trim().isEmpty()){
                iod_L.setText("Empty");
            }
         if(ioebox.getText().trim().isEmpty()){
                ioe_L.setText("Empty");
            }
         if(cffbox.getText().trim().isEmpty()){
                cff_L.setText("Empty");
            }
         if(nidicbox.getText().trim().isEmpty()){
                nidic_L.setText("Empty");
            }
         if(ocbbox.getText().trim().isEmpty()){
                ocb_L.setText("Empty");
            }
        if(ccbbox.getText().trim().isEmpty()){
                ccb_L.setText("Empty");}
            try{

                String sql=" UPDATE cashflow_statement SET year='"+year+"',month='"+month+"',net_earnings='"+net_earnings+"',depreciation_and_Amortization='"+depreciation_and_Amortization+"',changes_in_working_capital='"+changes_in_working_capital+"',cash_from_Opertations='"+cash_from_Opertations+"', investment_in_proprty_and_equipment='"+investment_in_proprty_and_equipment+"', cash_from_investing='"+cash_from_investing+"', issuance_of_debt='"+issuance_of_debt+"', issuance_of_equity='"+issuance_of_equity+"', cash_from_financing='"+cash_from_financing+"', net_increasing_in_cash='"+net_increasing_in_cash+"', Opening_cash_balance='"+Opening_cash_balance+"', Closing_cash_balance='"+Closing_cash_balance+"' where csno ='"+ csno+"'" ;

                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
    
                tableload();
                csnobox.setText("");
                yearbox.setSelectedIndex(0);
            monthbox.setSelectedIndex(0);
            nebox.setText("");
            dabox.setText("");
            ciwcbox.setText("");
            cfobox.setText("");
            iipebox.setText("");
            cfibox.setText("");
            iodbox.setText("");
            ioebox.setText("");
            cffbox.setText("");
            nidicbox.setText("");
            ocbbox.setText("");
            ccbbox.setText("");
            }

            catch(Exception e){}}
        add.setEnabled(true);
                                      
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int delete1 = JOptionPane.showConfirmDialog(null,"Do you want to Delete this record?");

        if(delete1 == 0){

            String csno = csnobox.getText();

            try{
                String sql = "DELETE from cashflow_statement Where csno ='"+ csno +"'";
                ps = cons.prepareStatement(sql);
                ps.execute();
                tableload();
            }
            catch(Exception e){}}
                                          
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
            csnobox.setText("");
            yearbox.setSelectedIndex(0);
            monthbox.setSelectedIndex(0);
            nebox.setText("");
            dabox.setText("");
            ciwcbox.setText("");
            cfobox.setText("");
            iipebox.setText("");
            cfibox.setText("");
            iodbox.setText("");
            ioebox.setText("");
            cffbox.setText("");
            nidicbox.setText("");
            ocbbox.setText("");
            ccbbox.setText("");
            
            
            year_L.setText("");
            month_L.setText("");
            ne_L.setText("");
            da_L.setText("");
            ciwc_L.setText("");
            cfo_L.setText("");
            iipe_L.setText("");
            cfi_L.setText("");
            iod_L.setText("");
            ioe_L.setText("");
            cff_L.setText("");
            nidic_L.setText("");
            ocb_L.setText("");
            ccb_L.setText("");
            
            add.setEnabled(true);
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
          String month = searchbox.getText();
        try{
            String sql ="SELECT csno,year,month,net_earnings,depreciation_and_Amortization,changes_in_working_capital,cash_from_Opertations,investment_in_proprty_and_equipment,cash_from_investing,issuance_of_debt,issuance_of_equity,cash_from_financing,net_increasing_in_cash,Opening_cash_balance,Closing_cash_balance FROM cashflow_statement where month LIKE '%"+ month +"%'";
            ps = cons.prepareStatement(sql);

            rs = ps.executeQuery();
            table3.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){}
    }//GEN-LAST:event_searchActionPerformed

    private void fillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillActionPerformed
            
        try{
            String sql ="SELECT * FROM income_statement where month=? AND year=?";
            ps = cons.prepareStatement(sql);
            ps.setString(1,(String)monthbox.getSelectedItem());
            ps.setString(2,(String)yearbox.getSelectedItem());
            rs = ps.executeQuery();
             while(rs.next()){
                    nebox.setText(rs.getString("net_earnings"));
             }
        }
        catch(Exception e){}
                               
          
           
            dabox.setText("13500.00");
            ciwcbox.setText("435000.00");
            cfobox.setText("1837394.00");
            iipebox.setText("34500.00");
            cfibox.setText("264000.00");
            iodbox.setText("25357.00");
            ioebox.setText("235347.00");
            cffbox.setText("34537.00");
            nidicbox.setText("23450.00");
            ocbbox.setText("2345.00");
            ccbbox.setText("32424.00");
    }//GEN-LAST:event_fillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CashFromInvesting;
    private javax.swing.JLabel InvestmentInPropEquip;
    private javax.swing.JButton add;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cashFromFinancing;
    private javax.swing.JLabel cashFromOperations;
    private javax.swing.JLabel cashflowStatement;
    private javax.swing.JLabel ccb_L;
    private javax.swing.JTextField ccbbox;
    private javax.swing.JLabel cff_L;
    private javax.swing.JTextField cffbox;
    private javax.swing.JLabel cfi_L;
    private javax.swing.JTextField cfibox;
    private javax.swing.JLabel cfo_L;
    private javax.swing.JTextField cfobox;
    private javax.swing.JLabel changesInWorkingCapital;
    private javax.swing.JLabel ciwc_L;
    private javax.swing.JTextField ciwcbox;
    private javax.swing.JButton clear;
    private javax.swing.JLabel closingCashBalance;
    private javax.swing.JLabel csno;
    private javax.swing.JLabel csnobox;
    private javax.swing.JLabel da_L;
    private javax.swing.JTextField dabox;
    private javax.swing.JButton delete;
    private javax.swing.JLabel depreciationAndAmortization;
    private javax.swing.JButton fill;
    private javax.swing.JLabel iipe_L;
    private javax.swing.JTextField iipebox;
    private javax.swing.JLabel iod_L;
    private javax.swing.JTextField iodbox;
    private javax.swing.JLabel ioe_L;
    private javax.swing.JTextField ioebox;
    private javax.swing.JLabel issuanceOfDebt;
    private javax.swing.JLabel issuanceOfEquity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel month;
    private javax.swing.JLabel month_L;
    private javax.swing.JComboBox<String> monthbox;
    private javax.swing.JLabel monthsearch;
    private javax.swing.JLabel ne_L;
    private javax.swing.JLabel nebox;
    private javax.swing.JLabel netEarnings;
    private javax.swing.JLabel netIncreasingInCash;
    private javax.swing.JLabel nidic_L;
    private javax.swing.JTextField nidicbox;
    private javax.swing.JLabel ocb_L;
    private javax.swing.JTextField ocbbox;
    private javax.swing.JLabel opeingCashBalance;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable table3;
    private javax.swing.JPanel top;
    private javax.swing.JButton update;
    private javax.swing.JLabel year;
    private javax.swing.JLabel year_L;
    private javax.swing.JComboBox<String> yearbox;
    // End of variables declaration//GEN-END:variables
}
