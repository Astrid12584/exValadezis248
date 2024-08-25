/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
//Librerias
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class Acceso extends javax.swing.JFrame {
    //Objetos de conexión
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
    
    public Acceso() {
        initComponents();
    }
    
     //Metodo para conectar a la base de datos
    public void conectarBase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/gestionar_equipos", "root", "");
            stmt = cn.createStatement();//genera sentencias sql
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA \nGuadalupe");
        } catch (SQLException ex) {//inicia exeption
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception e) {//inica exception errores generales
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnEntrarSistema = new javax.swing.JButton();
        panEntrada = new javax.swing.JPanel();
        lblUsuarioAcceso = new javax.swing.JLabel();
        lblPasswordAcceso = new javax.swing.JLabel();
        txtUsuarioAcceso = new javax.swing.JTextField();
        txtPasswordAcceso = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IS Valadez");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Acceso al Sistema - Valadez");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 530, 33));

        btnEntrarSistema.setBackground(new java.awt.Color(153, 204, 255));
        btnEntrarSistema.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen Acceso.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar al sistema");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        panEntrada.setBackground(new java.awt.Color(204, 255, 204));
        panEntrada.setOpaque(false);

        lblUsuarioAcceso.setBackground(new java.awt.Color(204, 255, 204));
        lblUsuarioAcceso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblUsuarioAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioAcceso.setText("Usuario");

        lblPasswordAcceso.setBackground(new java.awt.Color(204, 255, 204));
        lblPasswordAcceso.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblPasswordAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordAcceso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasswordAcceso.setText("Password");

        txtUsuarioAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioAccesoActionPerformed(evt);
            }
        });

        txtPasswordAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEntradaLayout = new javax.swing.GroupLayout(panEntrada);
        panEntrada.setLayout(panEntradaLayout);
        panEntradaLayout.setHorizontalGroup(
            panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntradaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuarioAcceso)
                    .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEntradaLayout.setVerticalGroup(
            panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntradaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordAcceso))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(panEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 85, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 210, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_azul.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioAccesoActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAcceso.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from usuarios");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("Usuario")) && pass.equals(rs.getString("password"))){
                        error = false;
                CRUDEquipos accesoSistema = new CRUDEquipos();//llamada a interface
               
     JOptionPane.showMessageDialog(null, "Bienvenido al Sistema\n Usuario :\n\n" + usuario );
                accesoSistema.setVisible(true);//muestra ventana
                this.hide();//oculta ventana anterior
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAcceso.setText(null);
            this.txtUsuarioAcceso.requestFocus();//pocisiona cursor a caja usuario
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void txtPasswordAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAccesoActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPasswordAcceso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioAcceso;
    private javax.swing.JPanel panEntrada;
    private javax.swing.JPasswordField txtPasswordAcceso;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
