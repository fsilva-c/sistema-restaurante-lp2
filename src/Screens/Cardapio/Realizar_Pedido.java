/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screens.Cardapio;

import Negocio.Servicos.Bill;
import Negocio.Servicos.Order;
import Negocio.Servicos.Order_Item;
import Screens.Pedido.Pedido_Bebida;
import Screens.Pedido.Pedido_Comida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author qwerty
 */
public class Realizar_Pedido extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    private Order pedido = new Order();
    private Bill conta;
    /**
     * Creates new form screen_fazerPedido
     */
    public Realizar_Pedido() {
        initComponents();
        text_num.setText(Integer.toString(pedido.getNumero()));
    }
    
    public Realizar_Pedido(Bill c1) {
        initComponents();
        this.conta = c1;
        pedido.setId_conta(conta.getId());
        text_num.setText(Integer.toString(this.pedido.getNumero()));
    }
    
    public void Add_List(Order_Item prod){
        pedido.AddItem(prod);
    }
    
    
    public void Carregar_tabela(){
        DefaultTableModel modelo = (DefaultTableModel) table_itens.getModel();
        modelo.setNumRows(0);
        ArrayList<Order_Item> produtos = pedido.ItensPedido();
        for(Order_Item item: produtos){
            modelo.addRow(new Object[]{
                item.getItem().getName(),
                item.getQuantity(),
                item.getItem().getPrice()
            });
        }
        text_total.setText(Float.toString(pedido.CalcValue()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label_sair = new javax.swing.JLabel();
        label_numPedido3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barra_ferramentas = new javax.swing.JPanel();
        panel_fechar = new javax.swing.JPanel();
        label_fechar = new javax.swing.JLabel();
        panel_minimizar = new javax.swing.JPanel();
        label_minimizar = new javax.swing.JLabel();
        label_numPedido = new javax.swing.JLabel();
        text_num = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        label_iconBebida = new javax.swing.JLabel();
        label_nomeRestaurante = new javax.swing.JLabel();
        label_comida = new javax.swing.JLabel();
        label_iconBife = new javax.swing.JLabel();
        label_icon2 = new javax.swing.JLabel();
        label_pedidos = new javax.swing.JLabel();
        label_bebida = new javax.swing.JLabel();
        label_cardapios1 = new javax.swing.JLabel();
        label_numPedido1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_itens = new javax.swing.JTable();
        excluir = new javax.swing.JLabel();
        label_Total = new javax.swing.JLabel();
        text_total = new javax.swing.JTextField();
        finalizar = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        label_sair.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        label_sair.setForeground(new java.awt.Color(226, 221, 221));
        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-sair-35.png"))); // NOI18N
        label_sair.setText("Sair");
        label_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_sairMouseClicked(evt);
            }
        });

        label_numPedido3.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_numPedido3.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido3.setText("Itens Selecionados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        barra_ferramentas.setBackground(new java.awt.Color(255, 255, 255));
        barra_ferramentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                barra_ferramentasMouseMoved(evt);
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

        label_numPedido.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_numPedido.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido.setText("Nº");

        text_num.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        text_num.setForeground(new java.awt.Color(102, 102, 102));
        text_num.setText("****");

        javax.swing.GroupLayout barra_ferramentasLayout = new javax.swing.GroupLayout(barra_ferramentas);
        barra_ferramentas.setLayout(barra_ferramentasLayout);
        barra_ferramentasLayout.setHorizontalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_ferramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_numPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barra_ferramentasLayout.setVerticalGroup(
            barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_ferramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(label_numPedido)
                .addComponent(text_num))
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(70, 0, 110));

        label_iconBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-coquetel-96.png"))); // NOI18N
        label_iconBebida.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconBebidaMouseClicked(evt);
            }
        });

        label_nomeRestaurante.setBackground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setFont(new java.awt.Font("Ubuntu Light", 0, 14)); // NOI18N
        label_nomeRestaurante.setForeground(new java.awt.Color(204, 204, 204));
        label_nomeRestaurante.setText("Restaurante Lombinho de Porco II");
        label_nomeRestaurante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_comida.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_comida.setForeground(new java.awt.Color(204, 204, 204));
        label_comida.setText("Comidas");

        label_iconBife.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-bife-96.png"))); // NOI18N
        label_iconBife.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label_iconBife.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_iconBifeMouseClicked(evt);
            }
        });

        label_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-equity-security-96.png"))); // NOI18N
        label_icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_pedidos.setFont(new java.awt.Font("Ubuntu Light", 1, 20)); // NOI18N
        label_pedidos.setForeground(new java.awt.Color(204, 204, 204));
        label_pedidos.setText("Fazer Pedido");

        label_bebida.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_bebida.setForeground(new java.awt.Color(204, 204, 204));
        label_bebida.setText("Bebidas");

        label_cardapios1.setFont(new java.awt.Font("Ubuntu Light", 1, 20)); // NOI18N
        label_cardapios1.setForeground(new java.awt.Color(204, 204, 204));
        label_cardapios1.setText("Cardapios");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(label_nomeRestaurante))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_icon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_pedidos)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cardapios1)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label_comida))
                    .addComponent(label_iconBife)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(label_bebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(label_iconBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nomeRestaurante)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(label_pedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_cardapios1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_iconBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_bebida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_iconBife, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_comida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        label_numPedido1.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_numPedido1.setForeground(new java.awt.Color(102, 102, 102));
        label_numPedido1.setText("Itens Selecionados");

        table_itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Descricao", "Qntd", "Valor"
            }
        ));
        jScrollPane3.setViewportView(table_itens);

        excluir.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        excluir.setForeground(new java.awt.Color(102, 102, 102));
        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-excluir-35.png"))); // NOI18N
        excluir.setText("Excluir");
        excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excluirMouseClicked(evt);
            }
        });

        label_Total.setFont(new java.awt.Font("Ubuntu Light", 0, 20)); // NOI18N
        label_Total.setForeground(new java.awt.Color(102, 102, 102));
        label_Total.setText("Total");

        text_total.setEditable(false);

        finalizar.setFont(new java.awt.Font("Ubuntu Light", 1, 16)); // NOI18N
        finalizar.setForeground(new java.awt.Color(102, 102, 102));
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screens/icons/icons8-finalizar-pedido-35.png"))); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barra_ferramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_numPedido1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_Total)
                                .addGap(181, 181, 181)
                                .addComponent(text_total, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(finalizar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barra_ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_numPedido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text_total)
                                .addGap(1, 1, 1))
                            .addComponent(label_Total))
                        .addGap(20, 20, 20)
                        .addComponent(finalizar))))
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

    private void label_fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_fecharMouseClicked
        Realizar_Pedido.this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_label_fecharMouseClicked

    private void barra_ferramentasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseDragged
        // TODO add your handling code here:
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();
        this.setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_barra_ferramentasMouseDragged

    private void barra_ferramentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_ferramentasMouseMoved
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra_ferramentasMouseMoved

    private void label_iconBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconBebidaMouseClicked
        // TODO add your handling code here:
        Pedido_Bebida pedido_bebida = new Pedido_Bebida(this);
        pedido_bebida.setVisible(true); 
 
    }//GEN-LAST:event_label_iconBebidaMouseClicked

    private void label_iconBifeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_iconBifeMouseClicked
        // TODO add your handling code here:
        Pedido_Comida pedido_comida = new Pedido_Comida(this);
        pedido_comida.setVisible(true); 
    }//GEN-LAST:event_label_iconBifeMouseClicked

    private void label_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseClicked

    }//GEN-LAST:event_label_sairMouseClicked

    private void excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirMouseClicked
        if(table_itens.getSelectedRow() != -1){
            DefaultTableModel modelo = (DefaultTableModel) table_itens.getModel();
            pedido.RemoveItem(table_itens.getSelectedRow());
            modelo.removeRow(table_itens.getSelectedRow());
            text_total.setText(Float.toString(pedido.CalcValue()));
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um item para exclui-lo");
        }
    }//GEN-LAST:event_excluirMouseClicked

    private void finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseClicked

        if(pedido.Inserir()){
            JOptionPane.showMessageDialog(null, "Pedido enviado a cozinha");
            Realizar_Pedido.this.dispose();
        }
    }//GEN-LAST:event_finalizarMouseClicked

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
            java.util.logging.Logger.getLogger(Realizar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Realizar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Realizar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Realizar_Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Realizar_Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_ferramentas;
    private javax.swing.JLabel excluir;
    private javax.swing.JLabel finalizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel label_Total;
    private javax.swing.JLabel label_bebida;
    private javax.swing.JLabel label_cardapios1;
    private javax.swing.JLabel label_comida;
    private javax.swing.JLabel label_fechar;
    private javax.swing.JLabel label_icon2;
    private javax.swing.JLabel label_iconBebida;
    private javax.swing.JLabel label_iconBife;
    private javax.swing.JLabel label_minimizar;
    private javax.swing.JLabel label_nomeRestaurante;
    private javax.swing.JLabel label_numPedido;
    private javax.swing.JLabel label_numPedido1;
    private javax.swing.JLabel label_numPedido3;
    private javax.swing.JLabel label_pedidos;
    private javax.swing.JLabel label_sair;
    private javax.swing.JPanel panel_fechar;
    private javax.swing.JPanel panel_minimizar;
    private javax.swing.JTable table_itens;
    private javax.swing.JLabel text_num;
    private javax.swing.JTextField text_total;
    // End of variables declaration//GEN-END:variables
}
