
package FormularioPrincipal;
import java.sql.Connection;
import Conexion.ConexionBD;
import FormulariosCompra.panel_cliente;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frmlogin extends javax.swing.JFrame {
    frmregistro fr=new frmregistro();
    ConexionBD cc=new ConexionBD();
    Connection con=cc.getConexion();
    
    public frmlogin() {
        initComponents();
        this.setLocationRelativeTo(this);
      
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
        txtusuario = new javax.swing.JTextField();
        btniniciarsesion = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 229, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 128, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 128, -1));

        txtusuario.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        txtusuario.setText("user");
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 201, 27));

        btniniciarsesion.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btniniciarsesion.setText("INICIAR SESION");
        btniniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarsesionActionPerformed(evt);
            }
        });
        jPanel1.add(btniniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 153, -1));

        btnregistrar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        btnsalir.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoiniciosesion.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 310, 250));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconopassword.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconouser.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, 40));

        txtpassword.setText("jPasswordField1");
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 201, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btniniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarsesionActionPerformed
        // TODO add your handling code here:
        VerificarDatos();
    }//GEN-LAST:event_btniniciarsesionActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        fr.setVisible(true);
           
    }//GEN-LAST:event_btnregistrarActionPerformed

    public void VerificarDatos(){
       String usuario=txtusuario.getText();
       String pass=txtpassword.getText(); 
       
    if(!usuario.equals("")||!pass.equals("")){
            try{
                String SQLemail="SELECT Email FROM RegistroClientes WHERE Email='"+usuario+"' and Clave='"+pass+"'";
                String SQLpass="SELECT Clave FROM RegistroClientes WHERE Email='"+usuario+"' and Clave='"+pass+"'";
                Statement stemail=con.createStatement();
                Statement stpass=con.createStatement();

                ResultSet rsemail=stemail.executeQuery(SQLemail);
                ResultSet rclave=stpass.executeQuery(SQLpass);
                
                if(rsemail.next() && rclave.next()){
                    String useremail=rsemail.getString("Email");
                    String userclave=rclave.getString("Clave");
                    if(useremail.equalsIgnoreCase(usuario) && userclave.equalsIgnoreCase(pass)){
                        JOptionPane.showMessageDialog(null,"USUARIO Y CLAVE V??LIDAS");
                        dispose();
                        panel_cliente pc=new panel_cliente();
                        pc.setVisible(true);
                    }
                }
                else{
                        JOptionPane.showMessageDialog(null,"USUARIO Y CLAVE NO REGISTRADA");
                    }
                
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"ERROR AL INICIAR SESION"+e);
                }
        } 
        else{
            JOptionPane.showMessageDialog(null,"DEBE COMPLETAR LOS DATOS");
        }
    }
        
    
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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btniniciarsesion;
    public javax.swing.JButton btnregistrar;
    public javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
