package vista;

import Controler.Metodos;
import java.util.Arrays;
import model.Usuario;
import org.json.simple.JSONObject;

public class LoginVista extends javax.swing.JFrame {

    public boolean ver = false;

    Metodos metodos = new Metodos();

    public LoginVista() {
        initComponents();
        visible.setVisible(false);
        oculto.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Base = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        visible = new javax.swing.JPasswordField();
        oculto = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        ContrasenaLogin1 = new javax.swing.JPasswordField();
        UsuarioLogin = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Registro = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButtonIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Constrasena = new javax.swing.JPasswordField();
        jButtonValidar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Base.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 18, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar.setBackground(new java.awt.Color(0, 18, 51));
        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Regístrate");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.setBorderPainted(false);
        jButtonRegistrar.setContentAreaFilled(false);
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Ingresar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 120, 50));

        Login.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 350, 540));

        jButtonLogin.setBackground(new java.awt.Color(95, 15, 64));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Ingresar");
        jButtonLogin.setBorder(null);
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        Login.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Usuario:");
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Contraseña:");
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 140, 30));

        visible.setBackground(new java.awt.Color(255, 204, 102));
        visible.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        visible.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        visible.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibleActionPerformed(evt);
            }
        });
        Login.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 30));

        oculto.setBackground(new java.awt.Color(255, 204, 102));
        oculto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        oculto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        oculto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocultoActionPerformed(evt);
            }
        });
        Login.add(oculto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nover.jpg"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setDefaultCapable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ver(evt);
            }
        });
        Login.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 30, 20));

        ContrasenaLogin1.setBackground(new java.awt.Color(255, 204, 102));
        ContrasenaLogin1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContrasenaLogin1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContrasenaLogin1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ContrasenaLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaLogin1ActionPerformed(evt);
            }
        });
        Login.add(ContrasenaLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 200, 30));

        UsuarioLogin.setBackground(new java.awt.Color(255, 204, 102));
        UsuarioLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsuarioLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioLoginActionPerformed(evt);
            }
        });
        Login.add(UsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 200, 30));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Login.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 180, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diseño sin título (1).png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setDefaultCapable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Login.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, 120));

        Base.add(Login, "card2");

        Registro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(0, 0, 51));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setDoubleBuffered(false);
        jPanel9.setEnabled(false);
        jPanel9.setFocusable(false);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 51));
        jButton9.setText("Regístrate");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setBorder(null);
        jButtonIngresar.setBorderPainted(false);
        jButtonIngresar.setContentAreaFilled(false);
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 219, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIngresar)
                .addGap(20, 20, 20))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButtonIngresar)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nombre Completo:");

        Correo.setBackground(new java.awt.Color(220, 186, 255));
        Correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Nombre.setBackground(new java.awt.Color(220, 186, 255));
        Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Usuario.setBackground(new java.awt.Color(220, 186, 255));
        Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Correo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Usuario:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña:");

        Constrasena.setBackground(new java.awt.Color(220, 186, 255));
        Constrasena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Constrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Constrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonValidar.setBackground(new java.awt.Color(95, 15, 64));
        jButtonValidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonValidar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonValidar.setText("Validar");
        jButtonValidar.setBorder(null);
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nover.jpg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6Ver(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(RegistroLayout.createSequentialGroup()
                                        .addComponent(Constrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Constrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButtonValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        Base.add(Registro, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Usuario datos = new Usuario();
        datos.usuario = UsuarioLogin.getText();
        datos.contrasena = oculto.getText();

        if (metodos.Login(datos)) {
            this.dispose();
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIngresarMouseClicked
        Registro.setVisible(false);
        Login.setVisible(true);
    }//GEN-LAST:event_jButtonIngresarMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked

    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void ocultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ocultoActionPerformed

    private void visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visibleActionPerformed

    private void ContrasenaLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaLogin1ActionPerformed

    private void UsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioLoginActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        Registro.setVisible(true);
        Login.setVisible(false);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void Ver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ver
        if (ver) {
            oculto.setVisible(true);
            visible.setVisible(false);
            oculto.setText(visible.getText());
            ver = false;

        } else {
            oculto.setVisible(false);
            visible.setVisible(true);
            visible.setText(oculto.getText());
            ver = true;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Ver

    private void jButton6Ver(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6Ver
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6Ver

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        JSONObject usuario = new JSONObject();
        usuario.put("nombre", Nombre.getText());
        usuario.put("correo", Correo.getText());
        usuario.put("usuario", Usuario.getText());
        char[] contraseñaChar = Constrasena.getPassword();
        String ConstrasenaString = String.valueOf(contraseñaChar);
        usuario.put("contrasena", ConstrasenaString);
        metodos.Escribir(usuario, "Personas", "Usuarios");
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JPasswordField Constrasena;
    private javax.swing.JPasswordField ContrasenaLogin1;
    private javax.swing.JTextField Correo;
    private javax.swing.JPanel Login;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel Registro;
    private javax.swing.JTextField Usuario;
    private javax.swing.JTextField UsuarioLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField oculto;
    private javax.swing.JPasswordField visible;
    // End of variables declaration//GEN-END:variables
}
