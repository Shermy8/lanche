/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import observa.Jframe1;
import dao.UsuarioDAO;
import factory.ConnectionFactory;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.ModeloJframe1;
import observa.cardp;
/**
 *
 * @author positivo
 */
public class LoginGUI extends javax.swing.JFrame {

    public String marrapais;

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
//            this.connection = new ConnectionFactory().getConnection();
    }
//        String mimdepapyto;
    public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetopizza","root","");
           ps = con.prepareStatement("select * from usuario where id = ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        apagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("OCR-B 10 BT", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("OCR-B 10 BT", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, 20));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 310, -1));

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 310, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bandeira2.PNG"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lufe.PNG"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("OCR-B 10 BT", 2, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Nao possuo cadastro");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 140, 10));

        apagar.setText("apagar depois");
        jPanel1.add(apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuarioDAO dao = new UsuarioDAO();
        String mimdepapyto;
/*        if (txtLogin.getText().equals("semxampp") && txtSenha.getText().equals("semxampp")) {
            JOptionPane.showMessageDialog(null, "Atenção, você fez login sem o xampp. Passível de bugs.");
                                                                            //realmente passível de bugs
            Jframe1 frmm = new Jframe1();
            frmm.setVisible(true);
            this.dispose();
        } */
//               possível solução               //
// https://www.youtube.com/watch?v=SBRmrFa89lw //
//https://1bestcsharp.blogspot.com/2015/02/java-how-to-search-and-set-values-from.html //


        if(dao.checkLogin(txtLogin.getText(), txtSenha.getText())){
//            cardp crd = new cardp();
//            crd.setVisible(true);
//    this.dispose();
            apagar.setText(dao.oxe);
        mimdepapyto = (dao.oxe);
        marrapais = mimdepapyto;
        ModeloJframe1 model = new ModeloJframe1();
        model.setNome(dao.oxe);
        Jframe1 frmm = new Jframe1();
        frmm.exportarNome(model);
        frmm.setVisible(true);
        this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto.");
        }
        

/*    Function f = new Function();
    ResultSet rs = null;
    String id = "id";
    String nm = "nome";
    
    rs = f.find(rs.getString(id));
    try{
      if(rs.next()){
          txtLogin.setText(rs.getString("nome"));
      }  else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UsuarioGUI usu = new UsuarioGUI();
        usu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
   if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        UsuarioDAO dao = new UsuarioDAO();
        String mimdepapyto;
/*        if (txtLogin.getText().equals("semxampp") && txtSenha.getText().equals("semxampp")) {
            JOptionPane.showMessageDialog(null, "Atenção, você fez login sem o xampp. Passível de bugs.");
                                                                            //realmente passível de bugs
            Jframe1 frmm = new Jframe1();
            frmm.setVisible(true);
            this.dispose();
        } */
//               possível solução               //
// https://www.youtube.com/watch?v=SBRmrFa89lw //
//https://1bestcsharp.blogspot.com/2015/02/java-how-to-search-and-set-values-from.html //


        if(dao.checkLogin(txtLogin.getText(), txtSenha.getText())){
//            cardp crd = new cardp();
//            crd.setVisible(true);
//    this.dispose();
            apagar.setText(dao.oxe);
        mimdepapyto = (dao.oxe);
        marrapais = mimdepapyto;
        ModeloJframe1 model = new ModeloJframe1();
        model.setNome(dao.oxe);
        Jframe1 frmm = new Jframe1();
        frmm.exportarNome(model);
        frmm.setVisible(true);
        this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto.");
        }
        

/*    Function f = new Function();
    ResultSet rs = null;
    String id = "id";
    String nm = "nome";
    
    rs = f.find(rs.getString(id));
    try{
      if(rs.next()){
          txtLogin.setText(rs.getString("nome"));
      }  else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
*/
   }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
             UsuarioGUI usu = new UsuarioGUI();
        usu.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
