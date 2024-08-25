
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

public class CRUDEquipos extends javax.swing.JFrame {
        //Objetos de conexión
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
        
     public CRUDEquipos() {//Inicia Constructor
        initComponents();
        this.setTitle("Software CRUD VALADEZ EQUIPOS");
        this.setLocationRelativeTo(this);//Centrar 
        
    }//Termina constructor
     
     
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        panAltaEquipo = new javax.swing.JPanel();
        lblIdEquipo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtIdEquipo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrarEquipo = new javax.swing.JButton();
        btnLimpiarx = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblIdEquipo1 = new javax.swing.JLabel();
        txtIdEquipo1 = new javax.swing.JTextField();
        lblMarca1 = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JTextField();
        lblModelo1 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JTextField();
        lblPrecio1 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        btnBuscarEquipo = new javax.swing.JButton();
        btnLimpiarz = new javax.swing.JButton();
        btnEditarEquipo = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblEliminarEquipo = new javax.swing.JLabel();
        txtEliminarEquipo = new javax.swing.JTextField();
        btnEliminarEquipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 102, 255));
        lblTitulo.setText("Software IS CRUD Valadez Equipos");

        jtConsulta.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jtConsulta.setForeground(new java.awt.Color(102, 204, 255));
        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Equipo", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setBackground(new java.awt.Color(153, 204, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        panAltaEquipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Equipos"));

        lblIdEquipo.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblIdEquipo.setText("Id Equipo");

        lblMarca.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblMarca.setText("Marca");

        lblModelo.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblModelo.setText("Modelo");

        lblPrecio.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblPrecio.setText("Precio");

        txtIdEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEquipoActionPerformed(evt);
            }
        });

        btnRegistrarEquipo.setBackground(new java.awt.Color(153, 204, 255));
        btnRegistrarEquipo.setFont(new java.awt.Font("Segoe Script", 1, 10)); // NOI18N
        btnRegistrarEquipo.setText("Registrar Equipo");
        btnRegistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEquipoActionPerformed(evt);
            }
        });

        btnLimpiarx.setBackground(new java.awt.Color(153, 204, 255));
        btnLimpiarx.setFont(new java.awt.Font("Segoe Script", 1, 10)); // NOI18N
        btnLimpiarx.setText("Limpiar Datos");
        btnLimpiarx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaEquipoLayout = new javax.swing.GroupLayout(panAltaEquipo);
        panAltaEquipo.setLayout(panAltaEquipoLayout);
        panAltaEquipoLayout.setHorizontalGroup(
            panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaEquipoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdEquipo)
                            .addComponent(txtModelo)
                            .addComponent(txtPrecio)
                            .addComponent(txtMarca)))
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addComponent(btnRegistrarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addGap(20, 20, 20))
            .addGroup(panAltaEquipoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnLimpiarx, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        panAltaEquipoLayout.setVerticalGroup(
            panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaEquipoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEquipo)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblMarca))
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                    .addComponent(lblModelo))
                .addGap(18, 18, 18)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEquipo)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarx)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda - Editar Equipo"));
        jPanel1.setToolTipText("");

        lblIdEquipo1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblIdEquipo1.setText("Id Equipo");

        txtIdEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEquipo1ActionPerformed(evt);
            }
        });

        lblMarca1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblMarca1.setText("Marca");

        lblModelo1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblModelo1.setText("Modelo");

        lblPrecio1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblPrecio1.setText("Precio");

        btnBuscarEquipo.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscarEquipo.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        btnBuscarEquipo.setText("Buscar Equipo - ID");
        btnBuscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEquipoActionPerformed(evt);
            }
        });

        btnLimpiarz.setBackground(new java.awt.Color(153, 204, 255));
        btnLimpiarz.setFont(new java.awt.Font("Segoe Script", 1, 10)); // NOI18N
        btnLimpiarz.setText("Limpiar Datos");
        btnLimpiarz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarzActionPerformed(evt);
            }
        });

        btnEditarEquipo.setBackground(new java.awt.Color(153, 204, 255));
        btnEditarEquipo.setFont(new java.awt.Font("Segoe Script", 0, 10)); // NOI18N
        btnEditarEquipo.setText("Editar Equipo");
        btnEditarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarca1)
                                    .addComponent(lblModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtMarca1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdEquipo1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrecio1))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnEditarEquipo)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarz, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblIdEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarca1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarEquipo)
                    .addComponent(btnEditarEquipo))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarz)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3erParcialPanda.jpg"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrar Equipo"));
        jPanel2.setToolTipText("");

        lblEliminarEquipo.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        lblEliminarEquipo.setText("Id Equipo");

        txtEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarEquipoActionPerformed(evt);
            }
        });

        btnEliminarEquipo.setBackground(new java.awt.Color(153, 204, 255));
        btnEliminarEquipo.setFont(new java.awt.Font("Segoe Script", 1, 10)); // NOI18N
        btnEliminarEquipo.setText("Eliminar");
        btnEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarEquipo)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEliminarEquipo)
                    .addComponent(txtEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnEliminarEquipo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(panAltaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblTitulo)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panAltaEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // 
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsulta.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from equipo_valadez");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("Id_equipo ");
                 modeloDatos.addColumn("marca");
                 modeloDatos.addColumn("modelo");
                 modeloDatos.addColumn("precio");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD en consulta verifica\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtIdEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEquipoActionPerformed

    private void btnLimpiarxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarxActionPerformed

        this.txtIdEquipo.setText(null);
        this.txtMarca.setText(null);
        this.txtModelo.setText(null);
        this.txtPrecio.setText(null);
        
    }//GEN-LAST:event_btnLimpiarxActionPerformed

    private void btnRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEquipoActionPerformed
        
        conectarBase();
        //declaracion de variables de entrada
        int idequipo=Integer.parseInt(txtIdEquipo.getText());
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        int precio=Integer.parseInt(txtPrecio.getText());
        
       
        //proceso guardar en la base de datos
  String altaProducto="INSERT INTO equipo_valadez VALUES ('"+idequipo+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego el equipo de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD de Alta :\n"+ e);
        }//termina catch
        
    }//GEN-LAST:event_btnRegistrarEquipoActionPerformed

    private void txtIdEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEquipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEquipo1ActionPerformed

    private void btnBuscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEquipoActionPerformed
        
        try {//estructura de control de tratamiento de errores
            conectarBase();// Llamada a la conexión Base de Datos
            int idEquipoMod=Integer.parseInt(this.txtIdEquipo1.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM equipo_valadez where id_equipo='"+idEquipoMod+"'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next()==true) {
                this.txtMarca1.setText(rs.getString("marca"));
                this.txtModelo1.setText(rs.getString("modelo"));
                this.txtPrecio1.setText(rs.getString("precio"));
            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de libro\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en busqueda del equipo"+ e);
        }
    }//GEN-LAST:event_btnBuscarEquipoActionPerformed

    private void btnLimpiarzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarzActionPerformed
        
        this.txtIdEquipo1.setText(null);
        this.txtMarca1.setText(null);
        this.txtModelo1.setText(null);
        this.txtPrecio1.setText(null);
        
    }//GEN-LAST:event_btnLimpiarzActionPerformed

    private void btnEditarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipoActionPerformed
        String editarSQL="";  //Variable de tipo String iniciada en vacio
        try { //estructura de control de tratamiento de errores
            conectarBase();
            int idEquipoMod=Integer.parseInt(this.txtIdEquipo1.getText());
            String marca = this.txtMarca1.getText();
            String modelo = this.txtModelo1.getText();
            int precio=Integer.parseInt(txtPrecio1.getText());
           
editarSQL="UPDATE equipo_valadez SET marca = '"+marca+"',modelo = '"+modelo+"', precio='"+precio+"' where id_equipo = '"+idEquipoMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Registro actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD Al actualizar el equipo"+ e);
        }
    }//GEN-LAST:event_btnEditarEquipoActionPerformed

    private void txtEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarEquipoActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
        conectarBase();
        int confirmaBaja; //Variable Bandera 1 si elimino y 0 no elimino
        try {
           
            int productoBaja=Integer.parseInt(txtEliminarEquipo.getText());
            confirmaBaja=stmt.executeUpdate("DELETE FROM equipo_valadez WHERE Id_equipo = '"+productoBaja+"'");
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Id del producto : \n"+productoBaja);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID del equipo  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD de baja verifica el ID\n"+ e);
        }
        
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    
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
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarEquipo;
    private javax.swing.JButton btnEditarEquipo;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnLimpiarx;
    private javax.swing.JButton btnLimpiarz;
    private javax.swing.JButton btnRegistrarEquipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblEliminarEquipo;
    private javax.swing.JLabel lblIdEquipo;
    private javax.swing.JLabel lblIdEquipo1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panAltaEquipo;
    private javax.swing.JTextField txtEliminarEquipo;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtIdEquipo1;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables
}
