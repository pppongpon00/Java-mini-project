package Project;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Main_frame extends javax.swing.JFrame {
    ArrayList<Integer> block = new ArrayList<>(); // check whick block calculate
    ArrayList<String> sumGrade = new ArrayList<>(); // check all grade
    ArrayList<String> sumGrade2 = new ArrayList<>();
    public double sc1 = 0,sc2 = 0,sc3 = 0,sc4 = 0,sc5 = 0,sc6 = 0,sc7 = 0,sc8 = 0,sc9 = 0;
    public String mm1, mm2, mm3, mm4, mm5, mm6, mm7, mm8, mm9;
    public String hh1, hh2, hh3, hh4, hh5, hh6, hh7, hh8, hh9;
    public boolean def_g = false; //toggle change default grade to 40 or 50
    public double def = 50.0;
    public boolean ss1 = false; // |
    public boolean ss2 = false; // |
    public boolean ss3 = false; // |
    public boolean ss4 = false; // |
    public boolean ss5 = false; //  > boolean to check toggle which row to calculate
    public boolean ss6 = false; // |
    public boolean ss7 = false; // |
    public boolean ss8 = false; // |
    public boolean ss9 = false; // |
    public double real_grade;
    public Main_frame() {
        super("Grade Calculator");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Connection getConnection()
    {
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/register_project?zeroDateTimeBehavior=convertToNull","root","");
            System.out.println("Connected database : Main");
            return con;
        }catch(SQLException ex){
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Not Connected database : Main");
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        checkbox1 = new java.awt.Checkbox();
        jPanel1 = new javax.swing.JPanel();
        s4 = new javax.swing.JRadioButton();
        s3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s5 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        h7 = new javax.swing.JTextField();
        g9 = new javax.swing.JTextField();
        n9 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        h2 = new javax.swing.JTextField();
        g3 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        h4 = new javax.swing.JTextField();
        g4 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        g5 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        g8 = new javax.swing.JTextField();
        n8 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        g6 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        m7 = new javax.swing.JTextField();
        h8 = new javax.swing.JTextField();
        g7 = new javax.swing.JTextField();
        n7 = new javax.swing.JTextField();
        m9 = new javax.swing.JTextField();
        g2 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        Cal = new javax.swing.JButton();
        s1 = new javax.swing.JRadioButton();
        s6 = new javax.swing.JRadioButton();
        m1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        def40 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        value1 = new javax.swing.JTextField();
        value2 = new javax.swing.JTextField();
        value3 = new javax.swing.JTextField();
        value4 = new javax.swing.JTextField();
        value5 = new javax.swing.JTextField();
        value6 = new javax.swing.JTextField();
        value7 = new javax.swing.JTextField();
        value8 = new javax.swing.JTextField();
        value9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gradeSum = new javax.swing.JTextField();
        logOut = new javax.swing.JButton();
        line1 = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        s7 = new javax.swing.JRadioButton();
        s8 = new javax.swing.JRadioButton();
        s9 = new javax.swing.JRadioButton();
        m8 = new javax.swing.JTextField();
        h1 = new javax.swing.JTextField();
        h3 = new javax.swing.JTextField();
        h5 = new javax.swing.JTextField();
        h6 = new javax.swing.JTextField();
        h9 = new javax.swing.JTextField();
        g1 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();

        jButton2.setText("jButton1");

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        s4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s4ItemStateChanged(evt);
            }
        });

        s3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s3ItemStateChanged(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Midterm Score");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("HW/Class score");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Need score to increase grade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("You grade is");

        s5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s5ItemStateChanged(evt);
            }
        });

        s2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s2ItemStateChanged(evt);
            }
        });

        h7.setText("0");
        h7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h7ActionPerformed(evt);
            }
        });

        g9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g9ActionPerformed(evt);
            }
        });

        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        h2.setText("0");
        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });

        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        h4.setText("0");
        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });

        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        g8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g8ActionPerformed(evt);
            }
        });

        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });

        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });

        h8.setText("0");
        h8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h8ActionPerformed(evt);
            }
        });

        g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ActionPerformed(evt);
            }
        });

        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });

        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        Cal.setBackground(new java.awt.Color(0, 0, 204));
        Cal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cal.setForeground(new java.awt.Color(255, 255, 255));
        Cal.setText("CALCULATE");
        Cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalActionPerformed(evt);
            }
        });

        s1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s1ItemStateChanged(evt);
            }
        });

        s6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s6ItemStateChanged(evt);
            }
        });
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*This default of grade F is 50 press top left button to change minimum*");

        def40.setText("Grade F at 40");
        def40.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                def40ItemStateChanged(evt);
            }
        });
        def40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                def40ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*not fill");

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*not fill");

        value1.setText("3");
        value1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value1ActionPerformed(evt);
            }
        });

        value2.setText("3");
        value2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value2ActionPerformed(evt);
            }
        });

        value3.setText("3");
        value3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value3ActionPerformed(evt);
            }
        });

        value4.setText("3");
        value4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value4ActionPerformed(evt);
            }
        });

        value5.setText("3");
        value5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value5ActionPerformed(evt);
            }
        });

        value6.setText("3");
        value6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value6ActionPerformed(evt);
            }
        });

        value7.setText("3");
        value7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value7ActionPerformed(evt);
            }
        });

        value8.setText("3");
        value8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                value8ActionPerformed(evt);
            }
        });

        value9.setText("3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*หน่วยกิต default is 3*");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 204));
        jLabel9.setText("Sum Grade is :");

        gradeSum.setBackground(new java.awt.Color(255, 255, 153));
        gradeSum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        logOut.setBackground(new java.awt.Color(255, 0, 0));
        logOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("LOGOUT");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        line1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        line1.setForeground(new java.awt.Color(153, 153, 0));

        line2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        line2.setForeground(new java.awt.Color(153, 153, 0));

        line3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        line3.setForeground(new java.awt.Color(153, 153, 0));

        s7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s7ItemStateChanged(evt);
            }
        });
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        s8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s8ItemStateChanged(evt);
            }
        });
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });

        s9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                s9ItemStateChanged(evt);
            }
        });
        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });

        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });

        h1.setText("0");
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });

        h3.setText("0");
        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });

        h5.setText("0");
        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });

        h6.setText("0");
        h6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6ActionPerformed(evt);
            }
        });

        h9.setText("0");
        h9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h9ActionPerformed(evt);
            }
        });

        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(def40)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel8)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(528, 528, 528)
                        .addComponent(Cal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s9)
                                .addGap(27, 27, 27)
                                .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(value9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238)
                                .addComponent(g9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(s4)
                                            .addComponent(s5))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(value4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(value5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(s6)
                                        .addGap(27, 27, 27)
                                        .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(value6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(135, 135, 135)
                                        .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(logOut)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(s8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(s7)
                                        .addGap(27, 27, 27)
                                        .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(value7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)
                                                .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88)
                                                .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(value8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(99, 99, 99)
                                                .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88)
                                                .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s2)
                                .addGap(27, 27, 27)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(value2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s1)
                                .addGap(27, 27, 27)
                                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(value1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(s3)
                                .addGap(27, 27, 27)
                                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(value3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel9))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(gradeSum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(def40)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel7)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(value1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(value2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(h2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradeSum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(value4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(value5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(line2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(line3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(h6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(value6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(h4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(h5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(value7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(value8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(m8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(h8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(value9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(h9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(g9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Cal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1185, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void value8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value8ActionPerformed

    private void value7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value7ActionPerformed

    private void value5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value5ActionPerformed

    private void value4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value4ActionPerformed

    private void value2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value2ActionPerformed

    private void def40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_def40ActionPerformed

    }//GEN-LAST:event_def40ActionPerformed

    private void def40ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_def40ItemStateChanged
        if(def_g == false){
            def_g = true;
            def = 40.0;
        }else{
            def_g = false;
            def = 50.0;
        }
        System.out.println("default f = " + def);
    }//GEN-LAST:event_def40ItemStateChanged

    private void s6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s6ItemStateChanged
        if(ss6 == false){ss6 = true;}
        else{ss6 = false;}
        System.out.println("ss6 = "+ss6);
    }//GEN-LAST:event_s6ItemStateChanged

    private void s1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s1ItemStateChanged
        if(ss1 == false){ss1 = true;}
        else{ss1 = false;}
        System.out.println("ss1 = "+ss1);
    }//GEN-LAST:event_s1ItemStateChanged

    private void CalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalActionPerformed
        String m11,m22,m33,m44,m55,m66,m77,m88,m99;
        String h11,h22,h33,h44,h55,h66,h77,h88,h99;
        m11 = m1.getText(); h11 = h1.getText();
        m22 = m2.getText(); h22 = h2.getText();
        m33 = m3.getText(); h33 = h3.getText();
        m44 = m4.getText(); h44 = h4.getText();
        m55 = m5.getText(); h55 = h5.getText();
        m66 = m6.getText(); h66 = h6.getText();
        m77 = m7.getText(); h77 = h7.getText();
        m88 = m8.getText(); h88 = h8.getText();
        m99 = m9.getText(); h99 = h9.getText();
        Login lg = new Login();
        String selectUser = "SELECT username FROM information WHERE username = '"+ lg.getUser() +"'";
        Connection con = getConnection();
        System.out.println(lg.getUser());
        if(checkNull() == true){
            try{
                Statement stat1 = con.createStatement();
                ResultSet rs_user = stat1.executeQuery(selectUser);
                System.out.println("Doing when push");
                check();
            }catch(Exception e){
                System.out.println(e);
            }
        }else{System.out.println("checkNull() = false" );}
    }//GEN-LAST:event_CalActionPerformed

    private void s2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s2ItemStateChanged
        if(ss2 == false){ss2 = true;}
        else{ss2 = false;}
        System.out.println("ss2 = "+ss2);
    }//GEN-LAST:event_s2ItemStateChanged

    private void s5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s5ItemStateChanged
        if(ss5 == false){ss5 = true;}
        else{ss5 = false;}
        System.out.println("ss5 = "+ss5);
    }//GEN-LAST:event_s5ItemStateChanged

    private void s3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s3ItemStateChanged
        if(ss3 == false){ss3 = true;}
        else{ss3 = false;}
        System.out.println("ss3 = "+ss3);
    }//GEN-LAST:event_s3ItemStateChanged

    private void s4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s4ItemStateChanged
        if(ss4 == false){ss4 = true;}
        else{ss4 = false;}
        System.out.println("ss4 = "+ss4);
    }//GEN-LAST:event_s4ItemStateChanged

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s7ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ItemStateChanged

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s8ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ItemStateChanged

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s8ActionPerformed

    private void s9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_s9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_s9ItemStateChanged

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s9ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m7ActionPerformed

    private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m8ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m9ActionPerformed

    private void value1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value1ActionPerformed

    private void value3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value3ActionPerformed

    private void value6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_value6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_value6ActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h2ActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h1ActionPerformed

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h3ActionPerformed

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h4ActionPerformed

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h5ActionPerformed

    private void h6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h6ActionPerformed

    private void h7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h7ActionPerformed

    private void h8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h8ActionPerformed

    private void h9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h9ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g2ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g4ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g5ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g6ActionPerformed

    private void g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g7ActionPerformed

    private void g8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g8ActionPerformed

    private void g9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g9ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n9ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n8ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n7ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n6ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n5ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n4ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n3ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed
    
    public void showText(){
        double show = real_grade;
        System.out.println("show = " + show);
        if(show < 1.5 || show == 1.5){
            line1.setText("It's too bad,");
            line2.setText("Only pray and your intention");
            line3.setText("to help your grade!.");
        }
        if(show > 1.5 && show < 2.0 || show == 2.0){
            line1.setText("It's not good,");
            line2.setText("You still have one change!.");
            line3.setText("");
        }
        if(show > 2.0 && show < 2.5  || show == 2.5){
            line1.setText("So close,");
            line2.setText("Keep trying don't give up.");
            line3.setText("");
        }
        if(show > 2.5 && show < 3.0 || show == 3.0){
            line1.setText("You are doing fine,");
            line2.setText("but You can do this better.");
            line3.setText("");
        }
        if(show > 3.0 && show < 3.5  || show == 3.5){
            line1.setText("Not bad, You are doing good.");
            line2.setText("");
            line3.setText("");
        }
        if(show > 3.5 || show == 4.0){
            line1.setText("You are doing great keep going!.");
            line2.setText("");
            line3.setText("");
        }
    }
    
    public Double GPA(String grade, String val){
        double sumAll = 0.0; //ผลรวม
        int countSub = 0; //หน่วยกิตทั้งหมด
        //เกรด * หน่วยกิต = ผลลรวม
        //ผลรวม / จำนวนหน่วยกิตทั้งหมด
        System.out.println("Doing in if ");
        for(int i = 0; i < sumGrade.size() ; i++){
            System.out.println("sumGrade.get(i) = " + sumGrade.get(i));
            if(sumGrade.get(i) == "A"){
                countSub += Double.parseDouble(val);
                sumAll += (4.0 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "B+"){
                countSub += Double.parseDouble(val);
                sumAll += (3.5 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "B"){
                countSub += Double.parseDouble(val);
                sumAll += (3.0 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "C+"){
                countSub += Double.parseDouble(val);
                sumAll += (2.5 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "C"){
                countSub += Double.parseDouble(val);
                sumAll += (2.0 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "D+"){
                countSub += Double.parseDouble(val);
                sumAll += (1.5 * Double.parseDouble(val));
           }if(sumGrade.get(i) == "D"){
                countSub += Double.parseDouble(val);
                sumAll += Double.parseDouble(val);
           }if(sumGrade.get(i) == "F"){
                countSub += Double.parseDouble(val);
                sumAll += (0);
           }
            System.out.println("sumGrade = " + sumGrade.get(i));
        }
        System.out.println("Out from if ");
        double ans = sumAll / countSub;
        System.out.println("ans = " + ans);
        System.out.println("GPA " + ans);
        real_grade = ans;
        gradeSum.setText(String.format("%.2f",real_grade));
        System.out.println("*************************End************************");
        return ans;
    }
    
    public double needScore(double score,String grade){
        double sum = score;
        String g = grade;
        switch(g){
            case "A":
                sum = 0;
                break;
            case "B+":
                sum = 80.0 - score;
                break;
            case "B":
                sum = 75.0 - score;
                break;
            case "C+":
                sum = 70.0 - score;
                break;
            case "C":
                sum = 65.0 - score;
                break;
            case "D+":
                sum = 60.0 - score;
                break;
            case "D":
                sum = 55 - score;
                break;
            case "F":
                sum = def - score;
                break;
        }
        return sum;
    }
        
    public String Grade(double score){
        String gra = null;
        if(score < 100 && score > 80 || score == 100 || score == 80){
            gra = "A";
        }else if(score < 79.0 && score > 75.0 || score == 79.0 || score == 75.0){
            gra = "B+";
        }else if(score < 74.0 && score > 70.0 || score == 74.0 || score == 70.0){
            gra = "B";
        }else if(score < 69.0 && score > 65.0 || score == 69.0 || score == 65.0){
            gra = "C+";
        }else if(score < 64.0 && score > 60.0 || score == 64.0 || score == 60.0){
            gra = "C";
        }else if(score < 59.0 && score > 55.0 || score == 59.0 || score == 55.0){
            gra = "D+";
        }else if(score < 54.0 && score > def || score == 54.0 || score == def){
            gra = "D";
        }else if(score < def || score == def){
            gra = "F";
        }
        return gra;
    } // function to calculate grade
    
    public boolean checkNull(){
        if(ss1 == true){
            if(m1 == null || h1 == null){
                return false;
            }
        }if(ss2 == true){
            if(m2 == null || h2 == null){
                return false;
            }
        }if(ss3 == true){
            if(m3 == null || h3 == null){
                return false;
            }
        }if(ss4 == true){
            if(m4 == null || h4 == null){
                return false;
            } 
        }if(ss5 == true){
            if(m5 == null || h5 == null){
                return false;
            }
        }if(ss6 == true){
            if(m6 == null || h6 == null){
                return false;
            } 
        }if(ss7 == true){
            if(m7 == null || h7 == null){
                return false;
            }
        }if(ss8 == true){
            if(m8 == null || h8 == null){
                return false;
            }
        }if(ss9 == true){
            if(m9 == null || h9 == null){
                return false;
            }
        }
        return true;
    } // function to check which field is null
    
    public double sumScore(String mid, String hw){    
        if(ss1 == true && m1 != null && block.get(0) == 1){
            sc1 = Double.parseDouble(mm1) + Integer.parseInt(hh1);//cast to int before sum
            System.out.println(sc1);
            return (sc1);//sc = score of midterm score + hw score = simulator grade
        } 
        if(ss2 == true && m2 != null && block.get(0) == 2){
            sc2 = Double.parseDouble(mm2) + Integer.parseInt(hh2);
            System.out.println(sc2);
            return (sc2);}
        if(ss3 == true && m3 != null && block.get(0) == 3){
            sc3 = Double.parseDouble(mm3) + Integer.parseInt(hh3);
            System.out.println(sc3);
            return (sc3);}
        if(ss4 == true && m4 != null && block.get(0) == 4){
            sc4 = Double.parseDouble(mm4) + Integer.parseInt(hh4);
            System.out.println(sc4);
            return (sc4);}
        if(ss5 == true && m5 != null && block.get(0) == 5){
            sc5 = Double.parseDouble(mm5) + Integer.parseInt(hh5);
            System.out.println(sc5);
            return (sc5);}
        if(ss6 == true && m6 != null && block.get(0) == 6){
            sc6 = Double.parseDouble(mm6) + Integer.parseInt(hh7);
            System.out.println(sc6);
            return (sc6);}
        if(ss7 == true && m7 != null && block.get(0) == 7){
            sc7 = Double.parseDouble(mm7) + Integer.parseInt(hh7);
            System.out.println(sc7);
            return (sc7);}
        if(ss8 == true && m8 != null && block.get(0) == 8){
            sc8 = Double.parseDouble(mm8) + Integer.parseInt(hh8);
            System.out.println(sc8);
            return (sc8);}
        if(ss9 == true && m8 != null && block.get(0) == 9){
            sc9 = Double.parseDouble(mm9) + Integer.parseInt(hh9);
            System.out.println(sc9);
            return (sc9);}
        else{return (0);}
       
    } // function sum all score
    
    public void check(){
        double gpa1 = 0,gpa2 = 0,gpa3 = 0,gpa4 = 0,gpa5 = 0,gpa6 = 0,gpa7 = 0,gpa8 = 0,gpa9 = 0;
        String v1,v2,v3,v4,v5,v6,v7,v8,v9;
        v1 = value1.getText(); v2 = value2.getText(); v3 = value3.getText();
        v4 = value4.getText(); v5 = value5.getText(); v6 = value6.getText();
        v7 = value7.getText(); v8 = value8.getText(); v9 = value9.getText();
        
        double a,b,c,d,e,f,g,h,i;
        String aa,bb,cc,dd,ee,ff,gg,hh,ii;
        double need1,need2,need3,need4,need5,need6,need7,need8,need9;
        
        mm1 = m1.getText();            hh1 = h1.getText(); 
        mm2 = m2.getText();             hh2 = h2.getText();
        mm3 = m3.getText();             hh3 = h3.getText();
        mm4 = m4.getText();             hh4 = h4.getText();
        mm5 = m5.getText();             hh5 = h5.getText();
        mm6 = m6.getText();             hh6 = h6.getText();
        mm7 = m7.getText();             hh7 = h7.getText();
        mm8 = m8.getText();             hh8 = h8.getText();
        mm9 = m9.getText();             hh9 = h9.getText();
        
        
        if(ss1 == true && m1 != null && h1 != null){
            block.add(1);
            a = sumScore(mm1, hh1);
            aa = Grade(a);
            sumGrade.add(aa);
            sumGrade2.add(aa);
            System.out.println("Grade = " + aa);
            gpa1 = GPA(aa,v1);
            System.out.println("GPA 1 = " + gpa1);
            g1.setText("Your Grade is: " + aa);
            need1 = needScore(a,aa);
            n1.setText(String.format("You need %.2f score",need1));
            block.remove(0);
        }
        if(ss2 == true && m2 != null && h2 != null){
            block.add(2);
            b = sumScore(mm2, hh2);
            bb = Grade(b);
            sumGrade.add(bb);
            sumGrade2.add(bb);
            System.out.println("Grade = " + bb);
            gpa2 = GPA(bb,v2);
            System.out.println("GPA 2 = " + gpa2);
            g2.setText("Your Grade is: " + bb);
            need2 = needScore(b,bb);
            n2.setText(String.format("You need %.2f score",need2));
            block.remove(0);
        }
        if(ss3 == true && m3 != null && h3 != null){
            block.add(3);
            c = sumScore(mm3, hh3);
            cc = Grade(c);
            sumGrade.add(cc);
            sumGrade2.add(cc);
            System.out.println("Grade = " + cc);
            gpa3 = GPA(cc,v3);
            System.out.println("GPA 3 = " + gpa3);
            g3.setText("Your Grade is: " + cc);
            need3 = needScore(c,cc);
            n3.setText(String.format("You need %.2f score",need3));
            block.remove(0);
        }
        if(ss4 == true && m4 != null && h4 != null){
            block.add(4);
            d = sumScore(mm4, hh4);
            dd = Grade(d);
            sumGrade.add(dd);
            sumGrade2.add(dd);
            System.out.println("Grade = " + dd);
            gpa4 = GPA(dd,v4);
            System.out.println("GPA 4 = " + gpa4);
            g4.setText("Your Grade is: " + dd);
            need4 = needScore(d,dd);
            n4.setText(String.format("You need %.2f score",need4));
            block.remove(0);
        }
        
        if(ss5 == true && m5 != null && h5 != null){
            block.add(5);
            e = sumScore(mm5, hh5);
            ee = Grade(e);
            sumGrade.add(ee);
            sumGrade2.add(ee);
            System.out.println("Grade = " + ee);
            gpa5 = GPA(ee,v5);
            System.out.println("GPA 5 = " + gpa5);
            g5.setText("Your Grade is: " + ee);
            need5 = needScore(e,ee);
            n5.setText(String.format("You need %.2f score",need5));
            block.remove(0);
        }
        if(ss6 == true && m6 != null && h6 != null){
            block.add(6);
            f = sumScore(mm6, hh6);
            ff = Grade(f);
            sumGrade.add(ff);
            sumGrade2.add(ff);
            System.out.println("Grade = " + ff);
            gpa6 = GPA(ff,v6);
            System.out.println("GPA 6 = " + gpa6);
            g6.setText("Your Grade is: " + ff);
            need6 = needScore(f,ff);
            n6.setText(String.format("You need %.2f score",need6));
            block.remove(0);
        }
        if(ss7 == true && m7 != null && h7 != null){
            block.add(7);
            g = sumScore(mm7, hh7);
            gg = Grade(g);
            sumGrade.add(gg);
            sumGrade2.add(gg);
            System.out.println("Grade = " + gg);
            gpa7 = GPA(gg,v7);
            System.out.println("GPA 7 = " + gpa7);
            g7.setText("Your Grade is: " + gg);
            need7 = needScore(g,gg);
            n7.setText(String.format("You need %.2f score",need7));
            block.remove(0);
        }
        if(ss8 == true && m8 != null && h8 != null){
            block.add(8);
            h = sumScore(mm8, hh8);
            hh = Grade(h);
            sumGrade.add(hh);
            sumGrade2.add(hh);
            System.out.println("Grade = " + hh);
            gpa8 = GPA(hh,v8);
            System.out.println("GPA 8 = " + gpa8);
            g8.setText("Your Grade is: " + hh);
            need8 = needScore(h,hh);
            n8.setText(String.format("You need %.2f score",need8));
            block.remove(0);
        }
        if(ss9 == true && m9 != null && h9 != null){
            block.add(9);
            i = sumScore(mm9, hh9);
            ii = Grade(i);
            sumGrade.add(ii);
            sumGrade2.add(ii);
            System.out.println("Grade = " + ii);
            gpa9 = GPA(ii,v9);
            System.out.println("GPA 9 = " + gpa9);
            g9.setText("Your Grade is: " + ii);
            need9 = needScore(i,ii);
            n9.setText(ii);
            n9.setText(String.format("You need %.2f scoref",need9));
            block.remove(0);
        }
        showText();
        System.out.println("Finish");
        System.out.println(block);
        sumGrade.removeAll(sumGrade2);
        System.out.println(sumGrade);
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cal;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JCheckBox def40;
    private javax.swing.JTextField g1;
    private javax.swing.JTextField g2;
    private javax.swing.JTextField g3;
    private javax.swing.JTextField g4;
    private javax.swing.JTextField g5;
    private javax.swing.JTextField g6;
    private javax.swing.JTextField g7;
    private javax.swing.JTextField g8;
    private javax.swing.JTextField g9;
    private javax.swing.JTextField gradeSum;
    private javax.swing.JTextField h1;
    private javax.swing.JTextField h2;
    private javax.swing.JTextField h3;
    private javax.swing.JTextField h4;
    private javax.swing.JTextField h5;
    private javax.swing.JTextField h6;
    private javax.swing.JTextField h7;
    private javax.swing.JTextField h8;
    private javax.swing.JTextField h9;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JButton logOut;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField m7;
    private javax.swing.JTextField m8;
    private javax.swing.JTextField m9;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    private javax.swing.JTextField n9;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JRadioButton s4;
    private javax.swing.JRadioButton s5;
    private javax.swing.JRadioButton s6;
    private javax.swing.JRadioButton s7;
    private javax.swing.JRadioButton s8;
    private javax.swing.JRadioButton s9;
    private javax.swing.JTextField value1;
    private javax.swing.JTextField value2;
    private javax.swing.JTextField value3;
    private javax.swing.JTextField value4;
    private javax.swing.JTextField value5;
    private javax.swing.JTextField value6;
    private javax.swing.JTextField value7;
    private javax.swing.JTextField value8;
    private javax.swing.JTextField value9;
    // End of variables declaration//GEN-END:variables

}
