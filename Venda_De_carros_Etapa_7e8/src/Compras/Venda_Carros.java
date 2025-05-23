/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Compras;

import Data.CarrosDAO;
import beans.Carros;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Venda_Carros extends javax.swing.JFrame {

    /**
     * Creates new form Venda_Carros
     */
    public Venda_Carros() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtPesquisarCarros = new javax.swing.JTextField();
        BtnPesquisarCarro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FormaPagamentoCarros = new javax.swing.JComboBox<>();
        ComboBoxCarros = new javax.swing.JComboBox<>();
        QuantidadeCarros = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnCalcularCarro = new javax.swing.JButton();
        BtnMotos = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TotalCarros = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        BrnComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(189, 196, 242));

        jPanel2.setBackground(new java.awt.Color(0, 140, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Veiculos Bones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Escolha seu carro");

        BtnPesquisarCarro.setText("Pesquisar");

        jLabel3.setText("Qual A forma de pagamento");

        FormaPagamentoCarros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cartão de Crédito", "Boleto Bancário", "PIX", "PicPay" }));

        ComboBoxCarros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jeep Renegade Sport 1.8 4x2 Flex 16v Aut", "Chevrolet Onix Hatch Joy 1.0 8v Flex 5p Mec", "Chevrolet Prisma Sed. Lt 1.4 8v Flexpower 4p", "Chevrolet Spin Activ7 1.8 8v Econo.flex 5p Aut", "Volvo S90", "Porsche 911 GT3 RS 992", "Chevrolet Camaro 6.2 SS", "Fiat Strada 1.4 Cd Hard Working", "Volkswagen Santana 1.8 Mi", "Fiat Siena 1.0/ex 1.0 Mpi Fire/fire Flex 8v", "Volkswagen Fusca Null", "Toyota Hilux Cd Srx 4x4 2.8 Tdi 16v Diesel Aut", "Ford F-1000 Ss", "Citroën Aircross Live 1.5 Flex 8v 5p Mec.", "Kia Sportage 4x2 Mt Lx 2.0 4p" }));

        jLabel4.setText("Quantidade");

        BtnCalcularCarro.setBackground(new java.awt.Color(0, 0, 153));
        BtnCalcularCarro.setForeground(new java.awt.Color(51, 255, 255));
        BtnCalcularCarro.setText("Calcular");
        BtnCalcularCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularCarroActionPerformed(evt);
            }
        });

        BtnMotos.setBackground(new java.awt.Color(0, 0, 153));
        BtnMotos.setForeground(new java.awt.Color(51, 255, 255));
        BtnMotos.setText("Motos");
        BtnMotos.setToolTipText("Se voce Preferir Motos");
        BtnMotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMotosActionPerformed(evt);
            }
        });

        jLabel5.setText("Total");

        BtnCancelar.setBackground(new java.awt.Color(0, 0, 153));
        BtnCancelar.setForeground(new java.awt.Color(51, 255, 255));
        BtnCancelar.setText("Cancelar compra");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BrnComprar.setBackground(new java.awt.Color(0, 0, 153));
        BrnComprar.setForeground(new java.awt.Color(51, 255, 255));
        BrnComprar.setText("Finalizar compra");
        BrnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ComboBoxCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(QuantidadeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, Short.MAX_VALUE)
                                .addGap(277, 277, 277))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtPesquisarCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPesquisarCarro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(FormaPagamentoCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BrnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCalcularCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnMotos))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TotalCarros))
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPesquisarCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisarCarro)
                    .addComponent(FormaPagamentoCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantidadeCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCalcularCarro)
                    .addComponent(BtnMotos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TotalCarros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BrnComprar)
                .addGap(21, 21, 21))
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

    private void BtnCalcularCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularCarroActionPerformed
       calc();
    }//GEN-LAST:event_BtnCalcularCarroActionPerformed

    private void BtnMotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMotosActionPerformed
    dispose();
    Venda_Motos Moto = new Venda_Motos();
    Moto.setVisible(true);
    }//GEN-LAST:event_BtnMotosActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BrnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrnComprarActionPerformed
String Produtos = ComboBoxCarros.getSelectedItem().toString();
String Pagamento = FormaPagamentoCarros.getSelectedItem().toString();

        Carros carros = new Carros();
            CarrosDAO carrosdao = new CarrosDAO();
            boolean status;
            int resposta;
            
            carros.setProduto(Produtos);
            carros.setQuantidade(QuantidadeCarros.getText());
            carros.setFormaDePagamento(Pagamento);
            carros.setTotal(TotalCarros.getText());
            carrosdao = new CarrosDAO();
            
            status = carrosdao.conectar();
            if(status == false){
                JOptionPane.showMessageDialog(null,"Erro de conexão");
            }else{
                resposta = carrosdao.salvar(carros);
                if(resposta == 1){
                    JOptionPane.showMessageDialog(null,"Dados incluidos com sucesso");
                    //limpar os campos
                    TotalCarros.setText("");
                    QuantidadeCarros.requestFocus();
                }else if (resposta ==1062){
                    JOptionPane.showMessageDialog(null,"A Compra já foi Feita");   
                }else{
                    JOptionPane.showMessageDialog(null,"Não foi possível inserir os dados! Por favor, verifique valores digitados!");
                }
                carrosdao.desconectar();
    } 
    calc();
    dispose();
    Comprar_efetuada_com_Suscesso compra = new Comprar_efetuada_com_Suscesso();
    compra.setVisible(true);
    }//GEN-LAST:event_BrnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(Venda_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda_Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda_Carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BrnComprar;
    private javax.swing.JButton BtnCalcularCarro;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnMotos;
    private javax.swing.JButton BtnPesquisarCarro;
    private javax.swing.JComboBox<String> ComboBoxCarros;
    private javax.swing.JComboBox<String> FormaPagamentoCarros;
    private javax.swing.JTextField QuantidadeCarros;
    private javax.swing.JTextField TotalCarros;
    private javax.swing.JTextField TxtPesquisarCarros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    public void calc(){
        double quantidade = Double.parseDouble(QuantidadeCarros.getText());  

        double produto1 = 72900.00;

         
        
    if(ComboBoxCarros.getSelectedItem().equals("Jeep Renegade Sport 1.8 4x2 Flex 16v Aut")){
       String Resultado1;
        double res1;
        res1 = (quantidade * produto1);
        Resultado1 = String.valueOf(res1);
        TotalCarros.setText(Resultado1);
        String add1 = String.valueOf(produto1);
        }
    }
    
    public int multiplicar(int quantidade, int produto1) {
        return quantidade * produto1;
    }
}


