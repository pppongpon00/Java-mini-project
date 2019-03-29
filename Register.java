package Project;


import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Pongpon
 */
public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        getConnection();
    }
    
    public Connection getConnection()
    {
        Connection con = null;
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/register_project?zeroDateTimeBehavior=convertToNull","root","");
            System.out.println("Connected database : Register");
            return con;
        }catch(SQLException ex){
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Not Connect database : Register");
            return null;
        }

    }

    // Check input field
    public boolean checkInputs(){
        if(FirstName.getText() == null 
            || LastName.getText() == null
            || UserName.getText() == null
            || person_id.getText() == null
            || PassWord.getText() == null
            || PassWord2.getText() == null
        ){
            return false;
        }else{
            return true;
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fName4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lName = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        fName2 = new javax.swing.JLabel();
        reType = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        UserName = new javax.swing.JTextField();
        PassWord = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        PassWord2 = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        confirm1 = new javax.swing.JButton();
        backTologin = new javax.swing.JLabel();
        Pass1 = new javax.swing.JLabel();
        person_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        fName4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fName4.setForeground(new java.awt.Color(255, 255, 255));
        fName4.setText("Password :");

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN IN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("Last Name :");

        Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Usrename :");

        fName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fName2.setForeground(new java.awt.Color(255, 255, 255));
        fName2.setText("First Name :");

        reType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reType.setForeground(new java.awt.Color(255, 255, 255));
        reType.setText("Retype Password :");

        Pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setText("Password :");

        FirstName.setBackground(new java.awt.Color(102, 102, 102));
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        UserName.setBackground(new java.awt.Color(102, 102, 102));
        UserName.setForeground(new java.awt.Color(255, 255, 255));

        PassWord.setBackground(new java.awt.Color(102, 102, 102));
        PassWord.setForeground(new java.awt.Color(255, 255, 255));

        LastName.setBackground(new java.awt.Color(102, 102, 102));
        LastName.setForeground(new java.awt.Color(255, 255, 255));

        PassWord2.setBackground(new java.awt.Color(102, 102, 102));
        PassWord2.setForeground(new java.awt.Color(255, 255, 255));

        cancel.setBackground(new java.awt.Color(255, 0, 0));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        confirm1.setBackground(new java.awt.Color(0, 204, 102));
        confirm1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirm1.setForeground(new java.awt.Color(255, 255, 255));
        confirm1.setText("CONFIRM");
        confirm1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm1ActionPerformed(evt);
            }
        });

        backTologin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backTologin.setForeground(new java.awt.Color(255, 255, 255));
        backTologin.setText("Click here to Login");
        backTologin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backTologin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTologinMouseClicked(evt);
            }
        });

        Pass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pass1.setForeground(new java.awt.Color(255, 255, 255));
        Pass1.setText("Personal ID :");

        person_id.setBackground(new java.awt.Color(102, 102, 102));
        person_id.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(confirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fName2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pass1)
                                    .addComponent(reType))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PassWord2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(person_id, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backTologin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassWord2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(person_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(backTologin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("-");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void backTologinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTologinMouseClicked
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backTologinMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.setState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ActionPerformed
        String FName , LName , user , Password ,RePassword, id;
        FName = FirstName.getText();
        LName = LastName.getText();
        user = UserName.getText();
        id = person_id.getText();
        Password = PassWord.getText();
        RePassword = PassWord2.getText();
        Connection con = getConnection();
        String insertQuery = "INSERT INTO register_project.information (username, person_id, first_name, last_name, password)"
                        +"values(?,?,?,?,?)";
        String selectUser = "SELECT Username FROM information WHERE Username = '"+user+"'";
        String selectPass = "SELECT Password FROM information WHERE Password = '"+Password+"'";
        String selectid = "SELECT person_id FROM information WHERE person_id = '"+id+"'";
        String selectfname = "SELECT First_Name FROM information WHERE First_Name = '"+FName+"'";
        String selectlname = "SELECT Last_Name FROM information WHERE Last_Name = '"+LName+"'";
        try{
            Statement stat1 = con.createStatement();
            Statement stat2 = con.createStatement();
            Statement stat3 = con.createStatement();
            Statement stat4 = con.createStatement();
            Statement stat5 = con.createStatement();
            ResultSet rs_user = stat1.executeQuery(selectUser);
            ResultSet rs_id = stat2.executeQuery(selectid);
            ResultSet rs_pass = stat3.executeQuery(selectPass);
            ResultSet rs_fname = stat4.executeQuery(selectfname);
            ResultSet rs_lname = stat5.executeQuery(selectlname);
            if(rs_fname.next() == true ){
                JOptionPane.showMessageDialog(this,"This First name is already used.");
            }else if(rs_lname.next() == true){
                JOptionPane.showMessageDialog(this, "This Last name is already used.");
            }else if(rs_user.next() == true){
                JOptionPane.showMessageDialog(this, "Username already used. " );
            }else if(rs_pass.next() == true){
                JOptionPane.showMessageDialog(this, "Password already used. " );
            }else if(rs_id.next() == true){
                JOptionPane.showMessageDialog(this, "This person ID already register. " );
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        if(Password.equals(RePassword)){    
            System.out.println("Personal ID : "+id);
            System.out.println("First Name : "+FName);
            System.out.println("Last Name : "+LName);
            System.out.println("Username : "+user);
            System.out.println("Password : "+Password);
            if(checkInputs() == true){
            try {
                PreparedStatement ps = con.prepareStatement(insertQuery);
                ps.setString(1, user);
                ps.setString(2, id);
                ps.setString(3, FName);
                ps.setString(4, LName);
                ps.setString(5, Password);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sign up Complete!! Hello " + FName + " " + LName + " Personal ID is " + id);
                Login log = new Login();
                log.setVisible(true);
                log.pack();
                log.setLocationRelativeTo(null);
                log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); 
            } catch (Exception ex) {
                System.out.println(ex);
            }
            }else{
                JOptionPane.showMessageDialog(null, "Please input all field.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Your password is not the same type. " );
        }
    }//GEN-LAST:event_confirm1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Pass;
    private javax.swing.JLabel Pass1;
    private javax.swing.JTextField PassWord;
    private javax.swing.JTextField PassWord2;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel backTologin;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm1;
    private javax.swing.JLabel fName2;
    private javax.swing.JLabel fName4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField person_id;
    private javax.swing.JLabel reType;
    // End of variables declaration//GEN-END:variables
}
