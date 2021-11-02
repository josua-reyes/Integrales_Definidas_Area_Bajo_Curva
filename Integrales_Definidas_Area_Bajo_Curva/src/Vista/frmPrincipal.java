package Vista;

import Controlador.Evaluador;
import Controlador.Funcion;
import Modelo.ParametrosIntegracion;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtFuncion = new javax.swing.JTextField();
        lblLimiteSuperior = new javax.swing.JLabel();
        lblLimiteInferior = new javax.swing.JLabel();
        txtLimiteSuperior = new javax.swing.JTextField();
        txtLimiteInferior = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        lblSignoIntegracion = new javax.swing.JLabel();
        lblValorLimiteSuperior = new javax.swing.JLabel();
        lblValorLimiteInferior = new javax.swing.JLabel();
        lblValorFuncion = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Integral Definida");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Calcular Integral de...");

        txtFuncion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFuncion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFuncionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFuncionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuncionKeyTyped(evt);
            }
        });

        lblLimiteSuperior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLimiteSuperior.setText("Límite superior (hasta):");

        lblLimiteInferior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLimiteInferior.setText("Límite inferior (desde):");

        txtLimiteSuperior.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLimiteSuperior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLimiteSuperiorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLimiteSuperiorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLimiteSuperiorKeyTyped(evt);
            }
        });

        txtLimiteInferior.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLimiteInferior.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLimiteInferiorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLimiteInferiorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLimiteInferiorKeyTyped(evt);
            }
        });

        btnProcesar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProcesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ejecutar.png"))); // NOI18N
        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        lblSignoIntegracion.setFont(new java.awt.Font("Cambria Math", 0, 60)); // NOI18N
        lblSignoIntegracion.setText("∫");

        lblValorLimiteSuperior.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblValorLimiteSuperior.setText("Sup");

        lblValorLimiteInferior.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblValorLimiteInferior.setText("Inf");

        lblValorFuncion.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        lblValorFuncion.setText("Fun");

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("Resultado:");

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtResultadoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResultadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLimiteInferior, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLimiteSuperior, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLimiteInferior)
                                    .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblTitulo))
                        .addGap(18, 18, 18)
                        .addComponent(lblValorLimiteInferior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSignoIntegracion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorLimiteSuperior)
                            .addComponent(lblValorFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLimiteSuperior)
                                    .addComponent(txtLimiteSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLimiteInferior)
                                    .addComponent(txtLimiteInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtFuncion))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSignoIntegracion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValorLimiteSuperior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lblValorLimiteInferior)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnProcesar))
                .addGap(31, 31, 31)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFuncionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionKeyPressed
        MostrarValoresIntegral();

    }//GEN-LAST:event_txtFuncionKeyPressed

    private void txtFuncionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionKeyReleased
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtFuncionKeyReleased

    private void txtFuncionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncionKeyTyped
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtFuncionKeyTyped

    private void txtLimiteSuperiorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteSuperiorKeyPressed
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteSuperiorKeyPressed

    private void txtLimiteSuperiorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteSuperiorKeyReleased
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteSuperiorKeyReleased

    private void txtLimiteSuperiorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteSuperiorKeyTyped
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteSuperiorKeyTyped

    private void txtLimiteInferiorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteInferiorKeyPressed
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteInferiorKeyPressed

    private void txtLimiteInferiorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteInferiorKeyReleased
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteInferiorKeyReleased

    private void txtLimiteInferiorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimiteInferiorKeyTyped
        MostrarValoresIntegral();
    }//GEN-LAST:event_txtLimiteInferiorKeyTyped

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed

        if (ValidarParametrosIntegral()) {
            ParametrosIntegracion parametros = new ParametrosIntegracion();
            Double dResultado = null;

            parametros.Funcion = txtFuncion.getText();
            parametros.LimiteSuperior = Double.valueOf(txtLimiteSuperior.getText());
            parametros.LimiteInferior = Double.valueOf(txtLimiteInferior.getText());

            Funcion f = new Funcion(parametros);
            dResultado = new Evaluador().evaluar(f);

            if (dResultado != null) {
                txtResultado.setText(String.valueOf(Redondear(dResultado, 6)));
            } else {
                JOptionPane.showMessageDialog(null, String.format("La funcion introducida \"%s\" no es válida", parametros.Funcion), "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                txtFuncion.requestFocus();
                txtFuncion.selectAll();
            }
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtFuncion.setText("");
        txtLimiteSuperior.setText("");
        txtLimiteInferior.setText("");
        txtResultado.setText("");
        txtFuncion.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtResultadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoKeyPressed

    private void txtResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoKeyReleased

    private void txtResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel lblLimiteInferior;
    private javax.swing.JLabel lblLimiteSuperior;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblSignoIntegracion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorFuncion;
    private javax.swing.JLabel lblValorLimiteInferior;
    private javax.swing.JLabel lblValorLimiteSuperior;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtLimiteInferior;
    private javax.swing.JTextField txtLimiteSuperior;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    private void MostrarValoresIntegral() {
        lblValorFuncion.setText("(" + txtFuncion.getText() + ")" + " dx");
        lblValorLimiteSuperior.setText(txtLimiteSuperior.getText());
        lblValorLimiteInferior.setText(txtLimiteInferior.getText());
    }

    private boolean ValidarParametrosIntegral() {

        if (txtFuncion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Función es Obligatorio.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtFuncion.requestFocus();
            return false;
        }
        if (txtLimiteSuperior.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Límite Superior es Obligatorio.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtLimiteSuperior.requestFocus();
            return false;
        }
        if (txtLimiteInferior.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Límite Inferior es Obligatorio.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtLimiteInferior.requestFocus();
            return false;
        }
        return true;
    }

    public double Redondear(double Num, int Decimales) {
        int aux = 1;
        for (int i = 0; i < Decimales; i++) {
            aux = aux * 10;
        }
        Num = Num * aux;
        Num = (double) Math.round(Num);
        Num = Num / aux;
        return (Num);
    }

}
