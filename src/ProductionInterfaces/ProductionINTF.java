/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductionInterfaces;

import DBConnect.DBconnect;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import com.itextpdf.text.Image;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import net.proteanit.sql.DbUtils;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import javax.swing.UIManager;
import mainInterface.MainPage;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author PRADEEP
 */
public class ProductionINTF extends javax.swing.JFrame {

    
   //--conect to the db---//
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //--end---//
   
    /**
     * Creates new form All
     */
    public ProductionINTF() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        //--conect to the db---//
        con = DBconnect.getConnection();
        
        //---table Load----//
        tableLoadProduction();
        tableLoadPacking();
        tableLoadSupplier();
        tableLoadBroker();
        clearProductionForm();
        tableLoadPackingHistory();
        
    }
    
    //****************************************************************************************************//
    //----------------------------------ALL TABLE LOAD CODE----------------------------------//
    //****************************************************************************************************//
    public void tableLoadProduction()
    {
    
        try {
            
            String productionTableLoad = "SELECT * FROM production ";
            pst = con.prepareStatement(productionTableLoad);
            rs = pst.executeQuery();
            
            product_details_display_table.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception e) {
             System.out.println(e);
        }
       
    }
    
    public void tableLoadSupplier()
    {
        try {
           
            String s = "SELECT  prd_id as 'ID', Date, Weight  FROM pro_supplied ";
            pst = con.prepareStatement(s);
            rs = pst.executeQuery();
            
            product_supplier_details_display_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void tableLoadBroker()
    {
        try {
            
            String s = "SELECT od_id as 'ID', Date, Grade, Quantity FROM pro_oder ";
            pst = con.prepareStatement(s);
            rs = pst.executeQuery();
            
            product_broker_details_display_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    
    }
    
    public void tableLoadPacking()
    {
    
        try {
            
            String packingTableLoad = "SELECT * FROM packing ";
            pst = con.prepareStatement(packingTableLoad);
            rs = pst.executeQuery();
           
            packing_detsils_display_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void tableLoadPackingHistory()
    {
    
        try {
            
            String packingTableLoad = "SELECT * FROM packing_history ";
            pst = con.prepareStatement(packingTableLoad);
            rs = pst.executeQuery();
           
            packing_detsils_display_table1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    //****************************************************************************************************//
    //----------------------------------CLEAR FROM CODE----------------------------------//
    //****************************************************************************************************//
    public void clearPackingForm(){
        
        packing_id.setText(" ");
        packing_date.setDate(null);
        packing_grade.setSelectedItem("select");
        packing_bundle.setSelectedItem("select");
        packing_type.setText(" ");
        packing_sample_allowed.setText(" ");
    
    }
    
    public void clearProductionForm(){
        product_id.setText(" ");
        product_date.setDate(null);
        product_supplier_weight.setText(" ");
        product_w_qty.setText(" ");
        product_r_qty.setText(" ");
        product_d_qty.setText(" ");
        product_grade_1.setText("0");
        product_grade_2.setText("0");
        product_grade_3.setText("0");
        product_grade_4.setText("0");
        product_grade_5.setText("0");
        product_grade_6.setText("0");
        product_grade_7.setText("0");
    }
     
    
    //****************************************************************************************************//
    //----------------------------------TABLE DESING  CODE----------------------------------//
    //****************************************************************************************************//
    public void tablePacking(){
    
        initComponents();
        setBackground(new Color(0,0,0));
        
        packing_detsils_display_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        packing_detsils_display_table.getTableHeader().setOpaque(false);
        packing_detsils_display_table.getTableHeader().setBackground(new Color(32,136,203));
        packing_detsils_display_table.getTableHeader().setForeground(new Color(255,255,255));
        packing_detsils_display_table.setRowHeight(25);
    }
    
     public void product_details_display_table(){
    
        initComponents();
        setBackground(new Color(0,0,0));
        
        packing_detsils_display_table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));
        packing_detsils_display_table.getTableHeader().setOpaque(false);
        packing_detsils_display_table.getTableHeader().setBackground(new Color(0,120,215));
        packing_detsils_display_table.getTableHeader().setForeground(new Color(255,255,255));
        packing_detsils_display_table.setRowHeight(25);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        btn_production = new javax.swing.JLabel();
        btn_packing = new javax.swing.JLabel();
        prd_home = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        prduction_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        product_supplier_weight = new javax.swing.JTextField();
        product_r_qty = new javax.swing.JTextField();
        product_grade_1 = new javax.swing.JTextField();
        product_w_qty = new javax.swing.JTextField();
        product_d_qty = new javax.swing.JTextField();
        product_grade_2 = new javax.swing.JTextField();
        product_grade_3 = new javax.swing.JTextField();
        product_grade_4 = new javax.swing.JTextField();
        product_grade_5 = new javax.swing.JTextField();
        product_grade_6 = new javax.swing.JTextField();
        product_grade_7 = new javax.swing.JTextField();
        product_date = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_details_display_table = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_broker_details_display_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        product_supplier_details_display_table = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        product_btn_update = new javax.swing.JLabel();
        product_btn_insert1 = new javax.swing.JLabel();
        product_btn_report = new javax.swing.JLabel();
        product_btn_delete = new javax.swing.JLabel();
        product_btn_search = new javax.swing.JLabel();
        product_search_field1 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        product_id = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        supplier_weight_delete_btn = new javax.swing.JLabel();
        orders_delete_btn = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        packing_panel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        packing_search_field = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        packing_date = new com.toedter.calendar.JDateChooser();
        packing_grade = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        packing_bundle = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        packing_type = new javax.swing.JTextField();
        packing_sample_allowed = new javax.swing.JTextField();
        packing_btn_update = new javax.swing.JLabel();
        packing_btn_insert = new javax.swing.JLabel();
        packing_btn_report = new javax.swing.JLabel();
        packing_btn_delete = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        packing_detsils_display_table = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        packing_btn_search = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        packing_id = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        packing_detsils_display_table1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 600));

        header.setBackground(new java.awt.Color(0, 99, 46));
        header.setPreferredSize(new java.awt.Dimension(1000, 30));

        btn_production.setBackground(new java.awt.Color(0, 33, 15));
        btn_production.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btn_production.setForeground(new java.awt.Color(255, 255, 255));
        btn_production.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_production.setText("PRODUCTION");
        btn_production.setOpaque(true);
        btn_production.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_productionMouseClicked(evt);
            }
        });

        btn_packing.setBackground(new java.awt.Color(0, 163, 76));
        btn_packing.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        btn_packing.setForeground(new java.awt.Color(255, 255, 255));
        btn_packing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_packing.setText("PACKING");
        btn_packing.setOpaque(true);
        btn_packing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_packingMouseClicked(evt);
            }
        });

        prd_home.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        prd_home.setForeground(new java.awt.Color(102, 0, 0));
        prd_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-home-48ppt.png"))); // NOI18N
        prd_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prd_homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prd_home)
                .addGap(32, 32, 32)
                .addComponent(btn_production, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_packing, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_packing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_production, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prd_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        body.setLayout(new java.awt.CardLayout());

        prduction_panel.setBackground(new java.awt.Color(127, 168, 146));
        prduction_panel.setPreferredSize(new java.awt.Dimension(1150, 570));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel1.setText("Product ID");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel2.setText("Start Date");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel3.setText("Supplied Weight(kg)");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel4.setText("Rolling Qty.(kg)");

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setText("Withering Qty.(kg)");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setText("BOP");

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel8.setText("FBOPF");

        jLabel9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 18, 8));
        jLabel9.setText("GRADING(kg)");

        jLabel10.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel10.setText("Drying Qty.(kg)");

        jLabel11.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel11.setText("BOPF");

        jLabel12.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel12.setText("OP");

        jLabel13.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel13.setText("GC");

        jLabel14.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel14.setText("DUST");

        jLabel15.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel15.setText("FBOP");

        product_supplier_weight.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_supplier_weight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_supplier_weight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_supplier_weight.setOpaque(false);
        product_supplier_weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_supplier_weightKeyPressed(evt);
            }
        });

        product_r_qty.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_r_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_r_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_r_qty.setOpaque(false);
        product_r_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_r_qtyKeyPressed(evt);
            }
        });

        product_grade_1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_1.setOpaque(false);
        product_grade_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_1KeyPressed(evt);
            }
        });

        product_w_qty.setBackground(new java.awt.Color(127, 168, 146));
        product_w_qty.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_w_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_w_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_w_qty.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        product_w_qty.setOpaque(false);
        product_w_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_w_qtyKeyPressed(evt);
            }
        });

        product_d_qty.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_d_qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_d_qty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_d_qty.setOpaque(false);
        product_d_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_d_qtyKeyPressed(evt);
            }
        });

        product_grade_2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_2.setOpaque(false);
        product_grade_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_2KeyPressed(evt);
            }
        });

        product_grade_3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_3.setOpaque(false);
        product_grade_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_3KeyPressed(evt);
            }
        });

        product_grade_4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_4.setOpaque(false);
        product_grade_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_4KeyPressed(evt);
            }
        });

        product_grade_5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_5.setOpaque(false);
        product_grade_5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_5KeyPressed(evt);
            }
        });

        product_grade_6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_6.setOpaque(false);
        product_grade_6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_6KeyPressed(evt);
            }
        });

        product_grade_7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_grade_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_grade_7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_grade_7.setOpaque(false);
        product_grade_7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_grade_7KeyPressed(evt);
            }
        });

        product_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_date.setDateFormatString("yyyy-MM-dd");
        product_date.setOpaque(false);

        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        product_details_display_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        product_details_display_table.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        product_details_display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Date", "Supplied Weight", "Withering Qty(kg)", "Rolling Qty(kg)", "Drying Qty(kg)", "BOP(kg)", "BOPF(kg)", "FBOPF(kg)", "FBOP(kg)", "DUST(kg)", "GC(kg)", "OP(kg)"
            }
        ));
        product_details_display_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        product_details_display_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        product_details_display_table.setFocusable(false);
        product_details_display_table.setGridColor(new java.awt.Color(102, 255, 204));
        product_details_display_table.setIntercellSpacing(new java.awt.Dimension(2, 0));
        product_details_display_table.setRowHeight(25);
        product_details_display_table.setShowVerticalLines(false);
        product_details_display_table.getTableHeader().setReorderingAllowed(false);
        product_details_display_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_details_display_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(product_details_display_table);

        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        product_broker_details_display_table.setBackground(new java.awt.Color(240, 240, 240));
        product_broker_details_display_table.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        product_broker_details_display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Grade", "Order Qty(kg)"
            }
        ));
        product_broker_details_display_table.setFocusable(false);
        product_broker_details_display_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        product_broker_details_display_table.setRowHeight(20);
        product_broker_details_display_table.setShowVerticalLines(false);
        jScrollPane2.setViewportView(product_broker_details_display_table);

        product_supplier_details_display_table.setBackground(new java.awt.Color(240, 240, 240));
        product_supplier_details_display_table.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        product_supplier_details_display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Supplide date", "Weight(kg)"
            }
        ));
        product_supplier_details_display_table.setFocusable(false);
        product_supplier_details_display_table.setIntercellSpacing(new java.awt.Dimension(0, 1));
        product_supplier_details_display_table.setRowHeight(20);
        product_supplier_details_display_table.setShowVerticalLines(false);
        jScrollPane3.setViewportView(product_supplier_details_display_table);

        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        product_btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updat0.png"))); // NOI18N
        product_btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_btn_updateMouseClicked(evt);
            }
        });

        product_btn_insert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert0.png"))); // NOI18N
        product_btn_insert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_btn_insert1MouseClicked(evt);
            }
        });

        product_btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report0.png"))); // NOI18N
        product_btn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_btn_reportMouseClicked(evt);
            }
        });

        product_btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete0.png"))); // NOI18N
        product_btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_btn_deleteMouseClicked(evt);
            }
        });

        product_btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchtt.png"))); // NOI18N
        product_btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_btn_searchMouseClicked(evt);
            }
        });

        product_search_field1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        product_search_field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        product_search_field1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        product_search_field1.setOpaque(false);
        product_search_field1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                product_search_field1KeyPressed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Date");

        product_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        product_id.setText("        ");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(205, 227, 244));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\tPRODUCTION PROCESS\n\n(01)\n\n~~ Tea Plucking ~~\n     Only the two tender leaves and bud is plucked. The\n process of gathering the leaves is done totally by hand,\n by hundreds of plantation workers, making it a very labor\n intensive process. This exercise makes certain that only \n the finest leaves go into the making of wholesome Pure \n Ceylon Tea.\n\n(02)\n\n~~ Withering ~~\n     Next the plucked leaves are spread out on long trays\n with warm air passing through the leaves for close to 18 \n hours. This helps to remove the moisture making the leaves\n soft and supple while facilitating bio-chemical alterations\n that gives the tea its character.\n\n(03)\n\n~~ Rolling ~~\n    Now the leaves are ready to be rolled using rolling\n machines. This process breaks the leaves into pieces, thereby\n crushing the leaf cells. This releases the natural chemical\n compounds and natural fluids that promote fermentation. The\n rolling process is repeated a few times more so as to break\n the leaves into still smaller pieces.\n\n(04)\n\n~~ Fermentation ~~\n    Next the leaves are spread out on open trays in cool,\n airy, humid rooms so as to facilitate oxidation. This process\n of fermentation is the most important in the tea process as\n it aids in developing the aroma and flavor of the tea. This\n process should be carefully controlled as too long or\n insufficient fermentation can weaken the tea.\n\n(05)\n\n~~ Firing ~~\n    Next the fermentation is stopped by drying the leaves\n in ovens so as to stop the fermentation process. It also helps\n keep the moisture at a low level, thereby preventing the tea\n acquiring a musty taste and smell. The firing too must be\n controlled or the tea would get burnt up.\n\n(06)\n\n~~ Sorting/Grading ~~\n    Now the leaves are sorted by size of leaf and categorized\n by tea types. This consists of leaf grades that result in higher\n prices in contrast to dust grades amongst others.\n\n(07)\n\n~~ Bulk Packing ~~\n     Thereafter the teas are packed in bulk form and stored to\n be transported.\n\t");
        jTextArea1.setBorder(null);
        jTextArea1.setOpaque(false);
        jScrollPane5.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setText("NEW");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        supplier_weight_delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete0.png"))); // NOI18N
        supplier_weight_delete_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        supplier_weight_delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplier_weight_delete_btnMouseClicked(evt);
            }
        });

        orders_delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete0.png"))); // NOI18N
        orders_delete_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        orders_delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orders_delete_btnMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setText("VIEW DEMO");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(85, 20));
        jButton3.setMinimumSize(new java.awt.Dimension(85, 20));
        jButton3.setOpaque(false);
        jButton3.setPreferredSize(new java.awt.Dimension(85, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Dally Supplied weight");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 51));
        jLabel19.setText("Dally Orders Quantity");

        javax.swing.GroupLayout prduction_panelLayout = new javax.swing.GroupLayout(prduction_panel);
        prduction_panel.setLayout(prduction_panelLayout);
        prduction_panelLayout.setHorizontalGroup(
            prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prduction_panelLayout.createSequentialGroup()
                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)))
                                .addGap(14, 14, 14))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(product_r_qty)
                            .addComponent(product_w_qty)
                            .addComponent(product_supplier_weight)
                            .addComponent(product_d_qty)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_date, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel8)
                            .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)))
                        .addGap(24, 24, 24)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(product_grade_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(product_grade_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product_btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(product_btn_insert1))
                        .addGap(24, 24, 24)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_btn_report)
                            .addComponent(product_btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prduction_panelLayout.createSequentialGroup()
                                .addComponent(supplier_weight_delete_btn)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prduction_panelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(orders_delete_btn))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prduction_panelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1))
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(product_search_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(product_btn_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        prduction_panelLayout.setVerticalGroup(
            prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prduction_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(product_id)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addComponent(product_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(product_supplier_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(product_r_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(product_w_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(product_d_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(product_grade_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addComponent(product_grade_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(product_grade_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(product_grade_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(product_grade_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(product_grade_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(product_grade_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(product_btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(product_btn_insert1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(product_btn_report)
                            .addComponent(product_btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(prduction_panelLayout.createSequentialGroup()
                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(product_btn_search)
                                        .addComponent(product_search_field1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                        .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(prduction_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(supplier_weight_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(prduction_panelLayout.createSequentialGroup()
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(orders_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(prduction_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60))))
        );

        body.add(prduction_panel, "card2");

        packing_panel.setBackground(new java.awt.Color(127, 168, 146));

        jLabel21.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel21.setText("Packing No");

        packing_search_field.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        packing_search_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packing_search_field.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        packing_search_field.setOpaque(false);
        packing_search_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                packing_search_fieldKeyPressed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel25.setText("Date ");

        packing_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        packing_date.setDateFormatString("yyyy-MM-dd");
        packing_date.setOpaque(false);

        packing_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "BOP", "BOPF", "FBOPF", "FBOP", "DUST", "GC", "OP" }));

        jLabel26.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel26.setText("Garde");

        jLabel27.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel27.setText("Bundle Type");

        packing_bundle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Half          50kg", "Full         100kg" }));

        jLabel28.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel28.setText("Sample Allowed");

        jLabel29.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel29.setText("Packing Type");

        packing_type.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        packing_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packing_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        packing_type.setOpaque(false);
        packing_type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                packing_typeKeyPressed(evt);
            }
        });

        packing_sample_allowed.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        packing_sample_allowed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        packing_sample_allowed.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        packing_sample_allowed.setOpaque(false);
        packing_sample_allowed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                packing_sample_allowedKeyPressed(evt);
            }
        });

        packing_btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/updat0.png"))); // NOI18N
        packing_btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_btn_updateMouseClicked(evt);
            }
        });

        packing_btn_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert0.png"))); // NOI18N
        packing_btn_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_btn_insertMouseClicked(evt);
            }
        });

        packing_btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report0.png"))); // NOI18N
        packing_btn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_btn_reportMouseClicked(evt);
            }
        });

        packing_btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete0.png"))); // NOI18N
        packing_btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_btn_deleteMouseClicked(evt);
            }
        });

        jLabel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        jLabel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        packing_detsils_display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Packing No", "Date", "Grade", "Bundle type", "Type of Packing", "Sample(kg)"
            }
        ));
        packing_detsils_display_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        packing_detsils_display_table.setRowHeight(25);
        packing_detsils_display_table.setSelectionBackground(new java.awt.Color(232, 57, 95));
        packing_detsils_display_table.getTableHeader().setReorderingAllowed(false);
        packing_detsils_display_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_detsils_display_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(packing_detsils_display_table);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Grade");

        packing_btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchtt.png"))); // NOI18N
        packing_btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_btn_searchMouseClicked(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5ss.png"))); // NOI18N

        packing_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        packing_id.setText("        ");

        jButton2.setBackground(new java.awt.Color(0, 255, 255));
        jButton2.setText("NEW");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea3.setBackground(new java.awt.Color(205, 227, 244));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Perpetua", 0, 15)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(51, 0, 0));
        jTextArea3.setRows(5);
        jTextArea3.setText("\t\n\t~~ 5S ~~\n\n5S represents Japanese words that describe the steps of a workplace organization process. English equivalent words are shown in parenthesis\n\t01.Seiri (Sort)\n\t02.Seiton (Straighten, Set)\n\t03.Seiso (Shine, Sweep)\n\t04.Seiketsu (Standardize)\n\t05.Shitsuke (Sustain)\n\n\tIn simple terms, the five S methodology helps a workplace remove items that are no longer needed (sort), organize the items to optimize\n\tefficiency and flow (straighten), clean the area in order to more easily identify problems (shine), implement color coding and labels \n\tto stay consistent with other areas (standardize) and develop behaviors that keep the workplace organized over the long term (sustain).\n\n01 - Sort (seiri) \n\tDistinguishing between necessary and unnecessary things, and getting rid of what you do not need\n\n\t* Remove items not used in area – outdated materials, broken equipment, redundant equipment, files on the computer, measurements which \n\t  you no longer use \n\t* Ask staff to tag all items which they don’t think are needed – this improves understanding about need and use \n\t* Classify all equipment and materials by frequency of use to help decide if it should be removed – place ‘Red Tag’ on items to be removed \n\t* Establish a ‘holding area’ for items that are difficult to classify – hold item for allotted period to enable others not on 5S team to\n\t  review.\n\n02 - Straighten (seiton)\n\tThe practice of orderly storage so the right item can be picked efficiently (without waste) at the right time, easy to access for everyone.\n\tA place for everything and everything in its place.\n\n\t* Identify and allocate a place for all the materials needed for your work\n\t* Assign fixed places and fixed quantity\n\t* Make it compact\n\t* Place heavy objects at a height where they are easy to pick from\n\t* Decide how things should be put away, and obey those rules\n\n03 - Shine (seiso)\n\tCreate a clean worksite without garbage, dirt and dust, so problems can be more easily identified (leaks, spills, excess, damage, etc)\n\n\t* Identify root causes of dirtiness, and correct process\n\t* Only one work activity on a workspace at any given time\n\t* Keep tools and equipment clean and in top condition, ready for use at any time\n\t* Cleanliness should be a daily activity – at least 5 minutes per day\n\t* Use chart with signatures/initials shows that the action or review has taken place\n\t* Ensure proper lighting – it can be hard to see dirt and dust\n\n04 - Standardize (seiketsu)\n\tSetting up standards for a neat, clean, workplace\n\n\t* Standardization of best practices through ‘visual management’\n\t* Make abnormalities visible to management\n\t* Keep each area consistent with one another\n\t* Standards make it easy to move workers into different areas\n\t* Create process of how to maintain the standard with defined roles and responsibilities\n\t* Make it easy for everyone to identify the state of normal or abnormal conditions – place photos on the walls, to provide visual reminder\n\n05 - Sustain (shitsuke)\n\tImplementing behaviors and habits to maintain the established standards over the long term, and making the workplace organization the key\n\tto managing the process for success\n\n\t* Toughest phase is to Sustain – many fall short of this goal\n\t* Establish and maintain responsibilities – requires leader commitment to follow through\n\t* Every one sticks to the rules and makes it a habit\n\t* Participation of everyone in developing good habits and buy-in\n\t* Regular audits and reviews\n\t* Get to root cause of issues\n\t* Aim for higher 5S levels – continuous improvement");
        jScrollPane7.setViewportView(jTextArea3);

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setText("VIEW DEMO");
        jButton4.setMaximumSize(new java.awt.Dimension(85, 20));
        jButton4.setMinimumSize(new java.awt.Dimension(85, 20));
        jButton4.setPreferredSize(new java.awt.Dimension(85, 20));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        packing_detsils_display_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Packing No", "Date", "Grade", "Bundle type", "Type of Packing", "Sample(kg)"
            }
        ));
        packing_detsils_display_table1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        packing_detsils_display_table1.setRowHeight(25);
        packing_detsils_display_table1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        packing_detsils_display_table1.getTableHeader().setReorderingAllowed(false);
        packing_detsils_display_table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packing_detsils_display_table1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(packing_detsils_display_table1);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("History");

        javax.swing.GroupLayout packing_panelLayout = new javax.swing.GroupLayout(packing_panel);
        packing_panel.setLayout(packing_panelLayout);
        packing_panelLayout.setHorizontalGroup(
            packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packing_panelLayout.createSequentialGroup()
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(packing_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(packing_panelLayout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(packing_panelLayout.createSequentialGroup()
                                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(packing_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(36, 36, 36)
                                        .addComponent(packing_id)
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28))
                                .addGap(34, 34, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packing_panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packing_sample_allowed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packing_type, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packing_bundle, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packing_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packing_date, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(packing_panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packing_btn_insert, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(packing_btn_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(42, 42, 42)
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packing_btn_update)
                            .addComponent(packing_btn_report))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(packing_panelLayout.createSequentialGroup()
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, packing_panelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(packing_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(packing_btn_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE))
                        .addGap(60, 60, 60))
                    .addGroup(packing_panelLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        packing_panelLayout.setVerticalGroup(
            packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packing_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(packing_id)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(packing_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(packing_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(packing_bundle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packing_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(packing_sample_allowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packing_btn_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packing_btn_update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packing_btn_report)
                    .addComponent(packing_btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packing_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(packing_panelLayout.createSequentialGroup()
                        .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(packing_panelLayout.createSequentialGroup()
                                .addGroup(packing_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(packing_panelLayout.createSequentialGroup()
                                        .addComponent(packing_search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addComponent(packing_btn_search, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(69, 69, 69))
        );

        body.add(packing_panel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1140, 1140, 1140))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //****************************************************************************************************//
    //----------------------------------HEADER PANEL SHIFT CODE----------------------------------//
    //****************************************************************************************************//
    private void btn_productionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productionMouseClicked
       
        setBtnColour(btn_production);
        resetBtnColour(btn_packing);
        
        prduction_panel.setVisible(true);
        packing_panel.setVisible(false);
         
    }//GEN-LAST:event_btn_productionMouseClicked

    private void btn_packingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_packingMouseClicked
       
        setBtnColour(btn_packing);
        resetBtnColour(btn_production);
        
        prduction_panel.setVisible(false);
        packing_panel.setVisible(true);
        
    }//GEN-LAST:event_btn_packingMouseClicked
    
    
    
    //****************************************************************************************************//
    //----------------------------------PACKING PANAL INSERT BUTTON CODE----------------------------------//
    //****************************************************************************************************//
    private void packing_btn_insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_btn_insertMouseClicked
        
        String pac_date = "";
       
        try {
              
        Date date =  packing_date.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         pac_date = dateFormat.format(date);

        } catch (ArithmeticException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "plz correct the date field");
            return;
        }
        
        String pac_grade = packing_grade.getSelectedItem().toString();
        String pac_bundle = packing_bundle.getSelectedItem().toString();
        String pac_type = packing_type.getText();
        String pac_sample = packing_sample_allowed.getText();
        
        
        if(packing_grade.getSelectedItem().toString().equals("select")){
            JOptionPane.showMessageDialog(null, "Plz select grade");
            return;
        }else if(packing_bundle.getSelectedItem().toString().equals("select")){
            JOptionPane.showMessageDialog(null, "Plz select bundle type");
            return;
        }else if(packing_type.getText().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Plz enter packing type");
            return;
        }else if(packing_sample_allowed.getText().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Plz enter sample allowed");
            return;
        }
        
        try {
            
            String packingData = "INSERT INTO packing( Date, Grade, Bundle, Type, Sample) VALUES ('"+ pac_date +"','"+ pac_grade +"','"+ pac_bundle +"','"+ pac_type +"','"+ pac_sample +"')";
            pst = con.prepareStatement(packingData);
            pst.execute();
            
            String packingData1 = "INSERT INTO packing_history( Date, Grade, Bundle, Type, Sample) VALUES ('"+ pac_date +"','"+ pac_grade +"','"+ pac_bundle +"','"+ pac_type +"','"+ pac_sample +"')";
            pst = con.prepareStatement(packingData1);
            pst.execute();
            
            tableLoadPacking();
            tableLoadPackingHistory();
            
            String prdData = "INSERT INTO production_stock( ptype, pdate) VALUES ('"+ pac_grade +"','"+ pac_date +"')";
            pst = con.prepareStatement(prdData);
            pst.execute();
            
            
        } catch (Exception e) {
            System.out.println("Data Insert Erro-- packing" );
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Tea grade cannot be repeated");
            return;
            
        }
        clearPackingForm();
        
        
    }//GEN-LAST:event_packing_btn_insertMouseClicked

    
    //****************************************************************************************************//
    //----------------------------------PACKING PANAL TABLE DISPLAY CODE----------------------------------//
    //****************************************************************************************************//
    private void packing_detsils_display_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_detsils_display_tableMouseClicked
       
        int x = packing_detsils_display_table.getSelectedRow();
        
        String pac_id = packing_detsils_display_table.getValueAt(x, 0).toString();
        //get a date
        Date pac_date = (Date) packing_detsils_display_table.getValueAt(x, 1);
        
        String pac_grade = packing_detsils_display_table.getValueAt(x, 2).toString();
        String pac_bundle = packing_detsils_display_table.getValueAt(x, 3).toString();
        String pac_type = packing_detsils_display_table.getValueAt(x, 4).toString();
        String pac_sample = packing_detsils_display_table.getValueAt(x, 5).toString();
        
        packing_id.setText(pac_id);
        packing_date.setDate(pac_date);
        packing_grade.setSelectedItem(pac_grade);
        packing_bundle.setSelectedItem(pac_bundle);
        packing_type.setText(pac_type);
        packing_sample_allowed.setText(pac_sample);
        
        packing_btn_insert.setEnabled(false);
    }//GEN-LAST:event_packing_detsils_display_tableMouseClicked

    
    //*******************************************************************************************************//
    //----------------------------------PACKING PANAL UPDATE BUTTON CODE----------------------------------//
    //*******************************************************************************************************//
    private void packing_btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_btn_updateMouseClicked
       
        int x = JOptionPane.showConfirmDialog(null, "Do You Want To Update.");
            
            if(x==0){
                
                String pac_noU = packing_id.getText();
                
                Date dateU1 =  packing_date.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String pac_dateU = dateFormat.format(dateU1);

                String pac_gradeU =  packing_grade.getSelectedItem().toString();
                String pac_bundleU =  packing_bundle.getSelectedItem().toString();
                String pac_typeU = packing_type.getText();
                String pac_sampleU = packing_sample_allowed.getText();
                
                    if(packing_grade.getSelectedItem().toString().equals("select")){
                       JOptionPane.showMessageDialog(null, "Plz select grade");
                        return;
                    }else if(packing_bundle.getSelectedItem().toString().equals("select")){
                        JOptionPane.showMessageDialog(null, "Plz select bundle type");
                        return;
                    }else if(packing_type.getText().toString().equals("")){
                        JOptionPane.showMessageDialog(null, "Plz enter packing type");
                        return;
                    }else if(packing_sample_allowed.getText().toString().equals("")){
                        JOptionPane.showMessageDialog(null, "Plz enter sample allowed");
                        return;
                    }
               
        try {
            
            String packingDataUpdate = "UPDATE packing SET Date = '"+ pac_dateU +"',  Grade = '"+ pac_gradeU +"', Bundle = '"+ pac_bundleU +"', Type =  '"+ pac_typeU +"',  Sample =  '"+ pac_sampleU +"' WHERE packing_no = '"+ pac_noU +"' ";                                                                                                                                                                                                                                                                                                                                                                                                                             
            pst = con.prepareStatement(packingDataUpdate);
            pst.execute();
            
            String packingDataUpdate1 = "UPDATE packing_history SET Date = '"+ pac_dateU +"',  Grade = '"+ pac_gradeU +"', Bundle = '"+ pac_bundleU +"', Type =  '"+ pac_typeU +"',  Sample =  '"+ pac_sampleU +"' WHERE packing_no = '"+ pac_noU +"' ";                                                                                                                                                                                                                                                                                                                                                                                                                             
            pst = con.prepareStatement(packingDataUpdate1);
            pst.execute();
            
            tableLoadPacking();
            clearPackingForm();
            tableLoadPackingHistory();
            
        } catch (Exception e) {
            System.out.println("Data Update Erro--packing" );
            System.out.println(e);
        }
        
            }
            packing_btn_insert.setEnabled(true);
    }//GEN-LAST:event_packing_btn_updateMouseClicked

//GEN-FIRST:event_product_btn_insertMouseClicked

//GEN-LAST:event_product_btn_insertMouseClicked

    //****************************************************************************************************//
    //--------------------------------NEW FEILDS GET CODE----------------------------------------//
    //****************************************************************************************************//
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
       clearPackingForm();
    }//GEN-LAST:event_jButton2MouseClicked

    //****************************************************************************************************//
    //--------------------------------PACKING REPORT GENARATE CODE----------------------------------------//
    //****************************************************************************************************//
    private void packing_btn_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_btn_reportMouseClicked

        try {
            
            String r2 = "SELECT * FROM packing ";
            pst = con.prepareStatement(r2);
            rs = pst.executeQuery(r2);
            
            ResultSetMetaData rsm1 = rs.getMetaData();
            
            int colNum = rsm1.getColumnCount();
            int rowNum = 0;
            while(rs.next()){
            rowNum++;
            }
            rs.first();
            
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("Packing_Report.pdf"));
            
            document.open();
            
            Image image =  Image.getInstance("reporthead.png");
            image.scaleToFit(500, 2500);
            document.add(image);
            
            document.add(new Paragraph("                                                                                               Date :" +new Date().toString())); 
            document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph("                                                     "));
            document.add(new Paragraph("                        Packing Report Details", FontFactory.getFont(FontFactory.TIMES_BOLD, 22, Font.BOLD, BaseColor.BLUE)));
            document.add(new Paragraph("                                                                                                                      "));

 
            PdfPTable table = new PdfPTable(6);
            
            table.addCell("pack NO");
            table.addCell("Date");
            table.addCell("Grade");
            table.addCell("Bundle");
            table.addCell("Type");
            table.addCell("Sample");
            
            
            for(int i = 0 ; i < rowNum; i++){
            
                table.addCell(""+rs.getString(1));
                table.addCell(""+rs.getString(2));
                table.addCell(""+rs.getString(3));
                table.addCell(""+rs.getString(4));
                table.addCell(""+rs.getString(5));
                table.addCell(""+rs.getString(6));
                
                rs.next();
                       
            }
            document.add(table);
            document.close();
            
            JOptionPane.showMessageDialog(null, "Report Saved");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        packing_btn_insert.setEnabled(true);
    }//GEN-LAST:event_packing_btn_reportMouseClicked
    
    //****************************************************************************************************//
    //--------------------------------DEMO BUTTON CODE----------------------------------------//
    //****************************************************************************************************//
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        packing_id.setText(" ");
        packing_date.setDate(null);
        packing_grade.setSelectedItem("BOP");
        packing_bundle.setSelectedItem("Full         100kg");
        packing_type.setText("LOCAL");
        packing_sample_allowed.setText("YES");
     
        packing_btn_insert.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    //****************************************************************************************************//
    //--------------------------------VALIDATION "Enter Lettters Only" CODE---------------------------------//
    //****************************************************************************************************//
    private void packing_sample_allowedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packing_sample_allowedKeyPressed
         char c = evt.getKeyChar();
        if(Character.isLetter(c)){
             packing_sample_allowed.setEditable(true);
               
        }else if(Character.isDigit(c)){
               packing_sample_allowed.setEditable(false);
               JOptionPane.showMessageDialog(null, "Enter Lettters Only");
        }     
    }//GEN-LAST:event_packing_sample_allowedKeyPressed

    //****************************************************************************************************//
    //----------------------------------PACKING PANAL DELETE BUTTON CODE----------------------------------//
    //****************************************************************************************************//    
    private void packing_btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_btn_deleteMouseClicked
 
        int x = JOptionPane.showConfirmDialog(null, "Do You Want To Delete");

        if(x==0){

            String packing_idD = packing_id.getText();

            String packingDataDelete = "DELETE from packing where packing_no = '"+ packing_idD +"' ";

            try {

                pst = con.prepareStatement(packingDataDelete);
                pst.execute();
                tableLoadPacking();
                clearPackingForm();

            } catch (Exception e) {
                System.out.println("Data delete Erro--packing" );
                System.out.println(e);
            }
        }
        packing_btn_insert.setEnabled(true);
    }//GEN-LAST:event_packing_btn_deleteMouseClicked

    
    //****************************************************************************************************//
    //--------------------------------DEMO BUTTON CODE----------------------------------------//
    //****************************************************************************************************//
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        product_id.setText(" ");
        product_date.setDate(null);
        product_supplier_weight.setText("1000");
        product_w_qty.setText("990");
        product_r_qty.setText("900");
        product_d_qty.setText("800");
        product_grade_1.setText("700");
        product_grade_2.setText("100");
        product_grade_3.setText("0");
        product_grade_4.setText("0");
        product_grade_5.setText("0");
        product_grade_6.setText("0");
        product_grade_7.setText("0");
        
        product_btn_insert1.setEnabled(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    //****************************************************************************************************//
    //--------------------------------ORDES DELETE BUTTON CODE----------------------------------------//
    //****************************************************************************************************//
    private void orders_delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orders_delete_btnMouseClicked
        
        int raw = product_broker_details_display_table.getSelectedRow();
         String tcid=product_broker_details_display_table.getValueAt(raw, 0).toString();
            
            try{
                
                 String sql="DELETE from pro_oder where od_id ='" +tcid+ "'";
                 pst=con.prepareStatement(sql);
                 pst.execute();
                 tableLoadBroker();
            }
            catch(Exception e){
                System.out.println(e);
            }
    }//GEN-LAST:event_orders_delete_btnMouseClicked

    //****************************************************************************************************//
    //--------------------------------SUPPLIED WEIGHT DELETE BUTTON CODE----------------------------------------//
    //****************************************************************************************************//
    private void supplier_weight_delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplier_weight_delete_btnMouseClicked
         
        
         int raw = product_supplier_details_display_table.getSelectedRow();
         String tcid=product_supplier_details_display_table.getValueAt(raw, 0).toString();
            
            try{
                
                 String sql="DELETE from pro_supplied where prd_id ='" +tcid+ "'";
                 pst=con.prepareStatement(sql);
                 pst.execute();
                 tableLoadSupplier();
                
            }
            catch(Exception e){
                System.out.println("Delete Button Error");
            }
       
    }//GEN-LAST:event_supplier_weight_delete_btnMouseClicked

    //****************************************************************************************************//
    //--------------------------------NEW FEILDS GET CODE-------------------------------------//
    //****************************************************************************************************//
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        product_id.setText(" ");
        product_date.setDate(null);
        product_supplier_weight.setText(" ");
        product_w_qty.setText(" ");
        product_r_qty.setText(" ");
        product_d_qty.setText(" ");
        product_grade_1.setText("0");
        product_grade_2.setText("0");
        product_grade_3.setText("0");
        product_grade_4.setText("0");
        product_grade_5.setText("0");
        product_grade_6.setText("0");
        product_grade_7.setText("0");
    }//GEN-LAST:event_jButton1MouseClicked

    //****************************************************************************************************//
    //----------------------------------PRODUCTION PANAL DELETE BUTTON CODE----------------------------------//
    //****************************************************************************************************//   
    private void product_btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_btn_deleteMouseClicked

        int x = JOptionPane.showConfirmDialog(null, "Do You Want To Delete");

        if(x==0){

            String production_idD = product_id.getText();

            String prdDataDelete = "DELETE from production where production_id = '"+ production_idD +"' ";

            try {

                pst = con.prepareStatement(prdDataDelete);
                pst.execute();
                tableLoadProduction();
                clearProductionForm();

            } catch (Exception e) {
                System.out.println("Data delete Erro--production" );
                System.out.println(e);
            }
        }
        product_btn_insert1.setEnabled(true);

    }//GEN-LAST:event_product_btn_deleteMouseClicked

    //****************************************************************************************************//
    //--------------------------------PRODUCTION REPORT GENARATE CODE-------------------------------------//
    //****************************************************************************************************//
    private void product_btn_reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_btn_reportMouseClicked

        try {

            String r1 = "SELECT * FROM production ";
            pst = con.prepareStatement(r1);
            rs = pst.executeQuery(r1);

            ResultSetMetaData rsm = rs.getMetaData();

            int colNumber = rsm.getColumnCount();
            int rowNumber = 0;
            while(rs.next()){
                rowNumber++;
            }
            rs.first();

            Document document = new Document(PageSize.A4.rotate());
            PdfWriter.getInstance(document, new FileOutputStream("ProductionReport.pdf"));

            document.open();

            Image image =  Image.getInstance("reporthead.png");
            image.scaleToFit(500, 2500);
            document.add(image);

            document.add(new Paragraph("                                                                                                                                                                 Date :" +new Date().toString()));
            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph("                                                                                                                      "));
            document.add(new Paragraph("                                                    Production Report Details", FontFactory.getFont(FontFactory.TIMES_BOLD, 22, Font.BOLD, BaseColor.BLUE)));
            document.add(new Paragraph("                                                                                                                      "));

            PdfPTable table = new PdfPTable(13);

            table.addCell("ID");
            table.addCell("Date");
            table.addCell("Weight (kg)");
            table.addCell("Withing qty(kg)");
            table.addCell("Rolling qty(kg)");
            table.addCell("Dring qty(kg)");
            table.addCell("BOP     (kg)");
            table.addCell("BOPF    (kg)");
            table.addCell("FBOPF   (kg)");
            table.addCell("FBOP    (kg)");
            table.addCell("DUST    (kg)");
            table.addCell("GC      (kg)");
            table.addCell("OP      (kg)");

            for(int i = 0 ; i < rowNumber; i++){

                table.addCell(""+rs.getString(1));
                table.addCell(""+rs.getString(2));
                table.addCell(""+rs.getString(3));
                table.addCell(""+rs.getString(4));
                table.addCell(""+rs.getString(5));
                table.addCell(""+rs.getString(6));
                table.addCell(""+rs.getString(7));
                table.addCell(""+rs.getString(8));
                table.addCell(""+rs.getString(9));
                table.addCell(""+rs.getString(10));
                table.addCell(""+rs.getString(11));
                table.addCell(""+rs.getString(12));
                table.addCell(""+rs.getString(13));
                rs.next();

            }
            document.add(table);
            document.close();

            JOptionPane.showMessageDialog(null, "Report Saved");

        } catch (Exception e) {
            System.out.println(e);
        }
        product_btn_insert1.setEnabled(true);
    }//GEN-LAST:event_product_btn_reportMouseClicked

    //****************************************************************************************************//
    //----------------------------------PRODUCTION PANAL INSERT BUTTON CODE----------------------------------//
    //****************************************************************************************************//
    private void product_btn_insert1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_btn_insert1MouseClicked

        String prd_date = "";

        try {

            Date date =  product_date.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            prd_date = dateFormat.format(date);

        } catch (ArithmeticException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "plz correct the date field");
            return;
        }

        double prd_s_w = 0;
        double prd_w_q = 0;
        double prd_r_q = 0;
        double prd_d_q = 0;
        try {

            prd_s_w = Double.parseDouble(product_supplier_weight.getText());
            if(prd_s_w < 0){
                JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
                return;
            }
            prd_w_q = Double.parseDouble(product_w_qty.getText());
            if(prd_w_q < 0){
                JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
                return;
            }
            prd_r_q = Double.parseDouble(product_r_qty.getText());
            if(prd_r_q < 0){
                JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
                return;
            }
            prd_d_q = Double.parseDouble(product_d_qty.getText());
            if(prd_d_q < 0){
                JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
                return;
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty");
            return;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Fields must be Number Format");
            return;
        }

        double prd_bop = 0;
        prd_bop = Double.parseDouble(product_grade_1.getText());
        if(prd_bop < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_bopf = 0;
        prd_bopf = Double.parseDouble(product_grade_2.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_fbopf = 0;
        prd_fbopf = Double.parseDouble(product_grade_3.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_fbop = 0;
        prd_fbop = Double.parseDouble(product_grade_4.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_dust = 0;
        prd_dust = Double.parseDouble(product_grade_5.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_gc = 0;
        prd_gc = Double.parseDouble(product_grade_6.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        double prd_op = 0;
        prd_op = Double.parseDouble(product_grade_7.getText());
        if(prd_bopf < 0){
            JOptionPane.showMessageDialog(null, "plz Enter Valide Number");
            return;
        }

        try {

            String prdData = "INSERT INTO production( Date, Weight, Withering_qty, Rolling_qty, Dring_qty, BOP, BOPF, FBOPF, FBOP, DUST, GC, OP) VALUES ('"+ prd_date +"','"+ prd_s_w +"','"+ prd_w_q +"','"+ prd_r_q +"','"+ prd_d_q +"','"+ prd_bop +"','"+ prd_bopf +"','"+ prd_fbopf +"','"+ prd_fbop +"','"+ prd_dust +"','"+ prd_gc +"','"+ prd_op +"')";
            pst = con.prepareStatement(prdData);
            pst.execute();
            tableLoadProduction();

        } catch (Exception e) {
            System.out.println("Data Insert Erro-- production" );
            System.out.println(e);
        }
        clearProductionForm();

    }//GEN-LAST:event_product_btn_insert1MouseClicked

    //*******************************************************************************************************//
    //----------------------------------PRODUCTION PANAL UPDATE BUTTON CODE----------------------------------//
    //*******************************************************************************************************//
    private void product_btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_btn_updateMouseClicked

        int x = JOptionPane.showConfirmDialog(null, "Do You Want To Update.");

        if(x==0){

            String prd_idU = product_id.getText();

            java.util.Date dateU =  product_date.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
            String prd_dateU = dateFormat.format(dateU);

            double prd_s_w = Double.parseDouble(product_supplier_weight.getText());
            double prd_w_q = Double.parseDouble(product_w_qty.getText());
            double prd_r_q = Double.parseDouble(product_r_qty.getText());
            double prd_d_q = Double.parseDouble(product_d_qty.getText());
            double prd_bop = Double.parseDouble(product_grade_1.getText());
            double prd_bopf = Double.parseDouble(product_grade_2.getText());
            double prd_fbopf = Double.parseDouble(product_grade_3.getText());
            double prd_fbop = Double.parseDouble(product_grade_4.getText());
            double prd_dust = Double.parseDouble(product_grade_5.getText());
            double prd_gc = Double.parseDouble(product_grade_6.getText());
            double prd_op = Double.parseDouble(product_grade_7.getText());

            try {

                String prdDataUpdate = "UPDATE production SET Date = '"+ prd_dateU +"',  Weight = '"+ prd_s_w +"', Withering_qty = '"+ prd_w_q +"', Rolling_qty =  '"+ prd_r_q +"',  Dring_qty =  '"+ prd_d_q +"',  BOP =  '"+ prd_bop +"',  BOPF =  '"+ prd_bopf +"',  FBOPF =  '"+ prd_fbopf +"',  FBOP =  '"+ prd_fbop +"',  DUST =  '"+ prd_dust +"',  GC =  '"+ prd_gc +"',  OP =  '"+ prd_op +"'  WHERE production_id = '"+ prd_idU +"' ";

                pst = con.prepareStatement(prdDataUpdate);
                pst.execute();
                tableLoadProduction();
                clearProductionForm();

            } catch (Exception e) {
                System.out.println("Data Update Erro--production" );
                System.out.println(e);
            }
            product_btn_insert1.setEnabled(true);
        }

    }//GEN-LAST:event_product_btn_updateMouseClicked

    //****************************************************************************************************//
    //----------------------------------PRODUCTION PANAL TABLE DISPLAY CODE----------------------------------//
    //****************************************************************************************************//
    private void product_details_display_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_details_display_tableMouseClicked

        int x = product_details_display_table.getSelectedRow();

        String prd_id = product_details_display_table.getValueAt(x, 0).toString();
        //get a date
        Date prd_date = (Date) product_details_display_table.getValueAt(x, 1);
        String prd_sw = product_details_display_table.getValueAt(x, 2).toString();
        String prd_wq = product_details_display_table.getValueAt(x, 3).toString();
        String prd_rq = product_details_display_table.getValueAt(x, 4).toString();
        String prd_dq = product_details_display_table.getValueAt(x, 5).toString();
        String prd_1 = product_details_display_table.getValueAt(x, 6).toString();
        String prd_2 = product_details_display_table.getValueAt(x, 7).toString();
        String prd_3 = product_details_display_table.getValueAt(x, 8).toString();
        String prd_4 = product_details_display_table.getValueAt(x, 9).toString();
        String prd_5 = product_details_display_table.getValueAt(x, 10).toString();
        String prd_6 = product_details_display_table.getValueAt(x, 11).toString();
        String prd_7 = product_details_display_table.getValueAt(x, 12).toString();

        product_id.setText(prd_id);

        product_date.setDate(prd_date);
        product_supplier_weight.setText(prd_sw);
        product_w_qty.setText(prd_wq);
        product_r_qty.setText(prd_rq);
        product_d_qty.setText(prd_dq);
        product_grade_1.setText(prd_1);
        product_grade_2.setText(prd_2);
        product_grade_3.setText(prd_3);
        product_grade_4.setText(prd_4);
        product_grade_5.setText(prd_5);
        product_grade_6.setText(prd_6);
        product_grade_7.setText(prd_7);
        
        product_btn_insert1.setEnabled(false);

    }//GEN-LAST:event_product_details_display_tableMouseClicked

    //****************************************************************************************************//
    //--------------------------------VALIDATION "Enter Number Only" CODE---------------------------------//
    //****************************************************************************************************//
    private void product_grade_7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_7KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_7.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_7.setEditable(true);
        }
    }//GEN-LAST:event_product_grade_7KeyPressed

    private void product_grade_6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_6KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_6.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_6.setEditable(true);
        }
    }//GEN-LAST:event_product_grade_6KeyPressed

    private void product_grade_5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_5KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_5.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_5.setEditable(true);
        }
    }//GEN-LAST:event_product_grade_5KeyPressed

    private void product_grade_4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_4KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_4.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_4.setEditable(true);
        }

    }//GEN-LAST:event_product_grade_4KeyPressed

    private void product_grade_3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_3KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_3.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_3.setEditable(true);
        }

    }//GEN-LAST:event_product_grade_3KeyPressed

    private void product_grade_2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_2KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_2.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_2.setEditable(true);
        }
    }//GEN-LAST:event_product_grade_2KeyPressed

    private void product_d_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_d_qtyKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_d_qty.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_d_qty.setEditable(true);
        }
    }//GEN-LAST:event_product_d_qtyKeyPressed

    private void product_w_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_w_qtyKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_w_qty.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_w_qty.setEditable(true);
        }
    }//GEN-LAST:event_product_w_qtyKeyPressed

    private void product_grade_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_grade_1KeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_grade_1.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_grade_1.setEditable(true);
        }
    }//GEN-LAST:event_product_grade_1KeyPressed

    private void product_r_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_r_qtyKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_r_qty.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_r_qty.setEditable(true);
        }
    }//GEN-LAST:event_product_r_qtyKeyPressed

    private void product_supplier_weightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_supplier_weightKeyPressed

        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            product_supplier_weight.setEditable(false);
            JOptionPane.showMessageDialog(null, "Enter number Only");
        }else{
            product_supplier_weight.setEditable(true);
        }
    }//GEN-LAST:event_product_supplier_weightKeyPressed

    private void packing_search_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packing_search_fieldKeyPressed

       tableLoadPacking();
    }//GEN-LAST:event_packing_search_fieldKeyPressed

    
    //****************************************************************************************************//
    //----------------------------------SEARCH BUTTON CODE----------------------------------//
    //****************************************************************************************************//  
    private void packing_btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_btn_searchMouseClicked
       
        String grade = packing_search_field.getText();
        
        try {
            
            String ss = "SELECT * FROM packing WHERE Grade LIKE '%"+grade+"%' ";
            pst = con.prepareStatement(ss);
            rs = pst.executeQuery();
           
            packing_detsils_display_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_packing_btn_searchMouseClicked

    //****************************************************************************************************//
    //----------------------------------SEARCH BUTTON CODE----------------------------------//
    //****************************************************************************************************//  
    private void product_btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_btn_searchMouseClicked
        
        
        String date = product_search_field1.getText();
        
        
        
        try {
            
            String sss = "SELECT * FROM production WHERE Date LIKE '%"+date+"%' ";
            pst = con.prepareStatement(sss);
            rs = pst.executeQuery();
           
            product_details_display_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }

            // TODO add your handling code here:
    }//GEN-LAST:event_product_btn_searchMouseClicked

    private void product_search_field1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_product_search_field1KeyPressed
         tableLoadProduction();
    }//GEN-LAST:event_product_search_field1KeyPressed

    private void packing_typeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packing_typeKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
             packing_type.setEditable(true);
               
        }else if(Character.isDigit(c)){
               packing_type.setEditable(false);
               JOptionPane.showMessageDialog(null, "Enter Lettters Only");
        }             // TODO add your handling code here:
    }//GEN-LAST:event_packing_typeKeyPressed

    private void prd_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prd_homeMouseClicked
        MainPage main = new MainPage();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prd_homeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        product_btn_insert1.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        packing_btn_insert.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void packing_detsils_display_table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packing_detsils_display_table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_packing_detsils_display_table1MouseClicked

    

//------ wsitch between colers for active/ inactive button ------//
    
    public void setBtnColour(JLabel jLabel){
    
        jLabel.setBackground(new Color(0,33,15));
    }
    public void resetBtnColour(JLabel jLabel){
    
        jLabel.setBackground(new Color(0,163,76));
    }
    
    //---------------end--------------//
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductionINTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductionINTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductionINTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductionINTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductionINTF().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel btn_packing;
    private javax.swing.JLabel btn_production;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel orders_delete_btn;
    private javax.swing.JLabel packing_btn_delete;
    private javax.swing.JLabel packing_btn_insert;
    private javax.swing.JLabel packing_btn_report;
    private javax.swing.JLabel packing_btn_search;
    private javax.swing.JLabel packing_btn_update;
    private javax.swing.JComboBox<String> packing_bundle;
    private com.toedter.calendar.JDateChooser packing_date;
    private javax.swing.JTable packing_detsils_display_table;
    private javax.swing.JTable packing_detsils_display_table1;
    private javax.swing.JComboBox<String> packing_grade;
    private javax.swing.JLabel packing_id;
    private javax.swing.JPanel packing_panel;
    private javax.swing.JTextField packing_sample_allowed;
    private javax.swing.JTextField packing_search_field;
    private javax.swing.JTextField packing_type;
    private javax.swing.JLabel prd_home;
    private javax.swing.JPanel prduction_panel;
    private javax.swing.JTable product_broker_details_display_table;
    private javax.swing.JLabel product_btn_delete;
    private javax.swing.JLabel product_btn_insert1;
    private javax.swing.JLabel product_btn_report;
    private javax.swing.JLabel product_btn_search;
    private javax.swing.JLabel product_btn_update;
    private javax.swing.JTextField product_d_qty;
    private com.toedter.calendar.JDateChooser product_date;
    private javax.swing.JTable product_details_display_table;
    private javax.swing.JTextField product_grade_1;
    private javax.swing.JTextField product_grade_2;
    private javax.swing.JTextField product_grade_3;
    private javax.swing.JTextField product_grade_4;
    private javax.swing.JTextField product_grade_5;
    private javax.swing.JTextField product_grade_6;
    private javax.swing.JTextField product_grade_7;
    private javax.swing.JLabel product_id;
    private javax.swing.JTextField product_r_qty;
    private javax.swing.JTextField product_search_field1;
    private javax.swing.JTable product_supplier_details_display_table;
    private javax.swing.JTextField product_supplier_weight;
    private javax.swing.JTextField product_w_qty;
    private javax.swing.JLabel supplier_weight_delete_btn;
    // End of variables declaration//GEN-END:variables
}
