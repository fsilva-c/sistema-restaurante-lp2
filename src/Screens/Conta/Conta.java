/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Conta;

import Banco.Cadastros.Bill_DAO;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Bill;
import Negocio.Servicos.Order;
import Negocio.Servicos.Order_Item;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author qwerty
 */
public class Conta extends javax.swing.JFrame {
    int xMouse, yMouse;
    private Bill conta;
    private Client cliente;
    private JFrame tela_FormaPagamento;

    /**
     * Creates new form conta
     */
    public Conta() {
        initComponents();
    }
    
    public Conta(Bill c1) {
        initComponents();
        Bill_DAO bill_dao = new Bill_DAO();
        this.cliente = bill_dao.BuscarClient(c1.getId());
        this.conta = bill_dao.CarregarItems(this.conta);
        
        
        text_total.setText(Float.toString(this.conta.CalcBill()));
        text_cliente.setText(cliente.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        label_nomeRestaurante = new javax.swing.JLabel();
        label_iconConta = new javax.swing.JLabel();
        label_conta1 = new javax.swing.JLabel();
        label_valor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_info = new javax.swing.JTable();
        label_pagar = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();
        label_data = new javax.swing.JLabel();
        text_data = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        text_cliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(70, 0, 110));

        barra_ferramentas.setBackground(new java.awt.Color(255, 255, 255));
        barra_ferramentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseDragged(evt);
            }
        });
        barra_ferramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_ferramentasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseReleased(evt);
            }
        });

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

        label_nomeRestaurante.setBackground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_nomeRestaurante.setForeground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setText("Restaurante Lombinho de Porco II");
        label_nomeRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_iconConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-conta-96.png"))); // NOI18N
        label_iconConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_conta1.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        label_conta1.setForeground(new java.awt.Color(204, 204, 204));
        label_conta1.setText("Conta");

        label_valor.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_valor.setForeground(new java.awt.Color(204, 204, 204));
        label_valor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-notas-de-dinheiro-35.png"))); // NOI18N
        label_valor.setText("Total : ");
        label_valor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_valorMouseClicked(evt);
            }
        });

        table_info.setBackground(new java.awt.Color(225, 222, 222));
        table_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Pedido", "Descrição", "Qntd", "Valor", "Total"
            }
        ));
        table_info.setPreferredSize(new java.awt.Dimension(477, 537));
        table_info.setSelectionBackground(new java.awt.Color(123, 48, 165));
        jScrollPane1.setViewportView(table_info);

        label_pagar.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_pagar.setForeground(new java.awt.Color(204, 204, 204));
        label_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-solicitar-dinheiro-35.png"))); // NOI18N
        label_pagar.setText("Pagar");
        label_pagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_pagarMouseClicked(evt);
            }
        });

        text_total.setEditable(false);

        label_data.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_data.setForeground(new java.awt.Color(204, 204, 204));
        label_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-login-arredondado-à-direita-30.png"))); // NOI18N
        label_data.setText("Data : ");
        label_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_dataMouseClicked(evt);
            }
        });

        text_data.setEditable(false);

        label_nome.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_nome.setForeground(new java.awt.Color(204, 204, 204));
        label_nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-pesquisar-35.png"))); // NOI18N
        label_nome.setText("Cliente : ");
        label_nome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        label_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_nomeMouseClicked(evt);
            }
        });

        text_cliente.setEditable(false);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_ferramentas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_iconConta)
                                .addGap(166, 166, 166))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_nomeRestaurante)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(label_conta1)
                                .addGap(178, 178, 178))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(label_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_cliente)
                        .addContainerGap())
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(label_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_data, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_valor)
                        .addGap(3, 3, 3)
                        .addComponent(text_total, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(11, 11, 11))))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(182, Short.MAX_VALUE)
                    .addComponent(label_pagar)
                    .addGap(170, 170, 170)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nomeRestaurante)
                .addGap(18, 18, 18)
                .addComponent(label_iconConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_conta1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nome)
                    .addComponent(text_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_data)
                    .addComponent(text_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label_valor)
                        .addComponent(text_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(688, Short.MAX_VALUE)
                    .addComponent(label_pagar)
                    .addGap(22, 22, 22)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        Conta.this.dispose();
    }//GEN-LAST:event_label_fecharMouseClicked

    private void barra_ferramentasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_barra_ferramentasMouseDragged

    private void barra_ferramentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra_ferramentasMousePressed

    private void barra_ferramentasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_barra_ferramentasMouseReleased

    private void label_valorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_valorMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_label_valorMouseClicked

    private void label_pagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_pagarMouseClicked
        // TODO add your handling code here:
         if(tela_FormaPagamento == null)
            tela_FormaPagamento = new Conta_formaPagamento();
            
            
        tela_FormaPagamento.setVisible(true);
        tela_FormaPagamento.setLocationRelativeTo(null);
    }//GEN-LAST:event_label_pagarMouseClicked

    private void label_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_dataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_dataMouseClicked

    private void label_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_nomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_nomeMouseClicked

    public void Carregar_tabela(){
        DefaultTableModel modelo = (DefaultTableModel) table_info.getModel();
        modelo.setNumRows(0);
        float total = 0.0f;

        List<Order> pedidos = conta.getOrders();
        for (Order pedido : pedidos){
            total += pedido.CalcValue();
            List<Order_Item> produtos = pedido.ItensPedido();
            for(Order_Item item: produtos){
                modelo.addRow(new Object[]{
                    pedido.getId(),
                    item.getItem().getName(),
                    item.getQuantity(),
                    item.getItem().getPrice(),
                    (item.getItem().getPrice() * item.getQuantity())
                });
            }
        }
        text_total.setText(Float.toString(total));
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
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_conta1;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_iconConta;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_nomeRestaurante;
    private javax.swing.JLabel label_pagar;
    private javax.swing.JLabel label_valor;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JTable table_info;
    private javax.swing.JTextField text_cliente;
    private javax.swing.JTextField text_data;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
