/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens;

/**
 *
 * @author qwerty
 */
public class screen_fazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form screen_fazerPedido
     */
    public screen_fazerPedido() {
        initComponents();
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
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        label_iconBebida = new javax.swing.JLabel();
        label_nomeRestaurante = new javax.swing.JLabel();
        label_comida = new javax.swing.JLabel();
        label_iconBife = new javax.swing.JLabel();
        label_icon2 = new javax.swing.JLabel();
        label_realPedido = new javax.swing.JLabel();
        label_bebida = new javax.swing.JLabel();
        label_numPedido = new javax.swing.JLabel();
        texto_numPedido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        label_numPedido1 = new javax.swing.JLabel();
        label_iconFecharPedido = new javax.swing.JLabel();
        label_numPedido2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barra_ferramentas.setBackground(new java.awt.Color(255, 255, 255));

        panel_fechar.setBackground(new java.awt.Color(255, 255, 255));
        panel_fechar.setPreferredSize(new java.awt.Dimension(30, 30));

        label_fechar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label_fechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_fechar.setText("X");
        label_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_fecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_fecharLayout = new javax.swing.GroupLayout(panel_fechar);
        panel_fechar.setLayout(panel_fecharLayout);
        panel_fecharLayout.setHorizontalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_fecharLayout.createSequentialGroup()
                .addComponent(label_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_fecharLayout.setVerticalGroup(
            panel_fecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_fechar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panel_minimizar.setBackground(new java.awt.Color(255, 255, 255));

        label_minimizar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_minimizar.setText("-");

        javax.swing.GroupLayout panel_minimizarLayout = new javax.swing.GroupLayout(panel_minimizar);
        panel_minimizar.setLayout(panel_minimizarLayout);
        panel_minimizarLayout.setHorizontalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panel_minimizarLayout.setVerticalGroup(
            panel_minimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_minimizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra_ferramentasLayout = new javax.swing.GroupLayout(barra_ferramentas);
        barra_ferramentas.setLayout(barra_ferramentasLayout);
        barra_ferramentasLayout.setHorizontalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_ferramentasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_ferramentasLayout.setVerticalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(70, 0, 110));

        label_iconBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-coquetel-96.png"))); // NOI18N

        label_nomeRestaurante.setBackground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_nomeRestaurante.setForeground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setText("Restaurante Lombinho de Porco II");
        label_nomeRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_comida.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_comida.setForeground(new java.awt.Color(204, 204, 204));
        label_comida.setText("Comida");

        label_iconBife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-bife-96.png"))); // NOI18N

        label_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-equity-security-96.png"))); // NOI18N

        label_realPedido.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_realPedido.setForeground(new java.awt.Color(204, 204, 204));
        label_realPedido.setText("Realizar Pedido");

        label_bebida.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_bebida.setForeground(new java.awt.Color(204, 204, 204));
        label_bebida.setText("Bebida");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(label_bebida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_comida)
                .addGap(49, 49, 49))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(label_nomeRestaurante))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(label_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(label_realPedido)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_iconBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_iconBife, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nomeRestaurante)
                .addGap(18, 18, 18)
                .addComponent(label_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(label_realPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(label_bebida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_iconBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_comida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_iconBife, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        label_numPedido.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_numPedido.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido.setText("Nº");

        texto_numPedido.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        texto_numPedido.setForeground(new java.awt.Color(102, 102, 102));
        texto_numPedido.setText("3");
        texto_numPedido.setBorder(null);
        texto_numPedido.setPreferredSize(new java.awt.Dimension(0, 15));
        texto_numPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_numPedidoActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        label_numPedido1.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_numPedido1.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido1.setText("Itens");

        label_iconFecharPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-finalizar-pedido-35.png"))); // NOI18N

        label_numPedido2.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_numPedido2.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido2.setText("Finalizar Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_ferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_numPedido1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 119, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_numPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto_numPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_numPedido2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_iconFecharPedido)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_numPedido)
                            .addComponent(texto_numPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(label_numPedido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_iconFecharPedido)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label_numPedido2)
                                .addGap(21, 21, 21))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_fecharMouseClicked

    private void texto_numPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_numPedidoActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_texto_numPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(screen_fazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(screen_fazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(screen_fazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(screen_fazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new screen_fazerPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_bebida;
    private javax.swing.JLabel label_comida;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_icon2;
    private javax.swing.JLabel label_iconBebida;
    private javax.swing.JLabel label_iconBife;
    private javax.swing.JLabel label_iconFecharPedido;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nomeRestaurante;
    private javax.swing.JLabel label_numPedido;
    private javax.swing.JLabel label_numPedido1;
    private javax.swing.JLabel label_numPedido2;
    private javax.swing.JLabel label_realPedido;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JTextField texto_numPedido;
    // End of variables declaration//GEN-END:variables
}