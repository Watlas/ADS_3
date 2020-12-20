package br.com.torrentz.app;

import br.com.torrentz.model.*;
import br.com.torrentz.bll.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AuxVisualizacoes extends javax.swing.JFrame {

// -----------------------------------------------------------------------------
//                                                               [[[ATRIBUTOS]]]
// -----------------------------------------------------------------------------
    private DefaultTableModel tbl = new DefaultTableModel();
    private VisualizacaoBll bllVisualizacao = new VisualizacaoBll();
    private Visualizacao modelVisualizacao = new Visualizacao();
    private UsuarioBll bllUsuario = new UsuarioBll();
    private Usuario modelUsuario = new Usuario();
    private FilmeBll bllFilme = new FilmeBll();
    private Filme modelFilme = new Filme();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

// -----------------------------------------------------------------------------
//                                                              [[[CONSTRUTOR]]]
// -----------------------------------------------------------------------------     
    public AuxVisualizacoes() throws Exception {
        CriarTbl();
        initComponents();
        this.setLocationRelativeTo(rootPane);
        jTable.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
        readComboFilmes();
        readComboUsuarios();
    }

// -----------------------------------------------------------------------------
//                                                             [[[COMPONENTES]]]
// -----------------------------------------------------------------------------    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVisualizacao = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox<>();
        comboVisualizacao = new javax.swing.JComboBox<>();
        comboFilmes = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Filmes | Inserir Visualizações de Filmes");
        setResizable(false);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Filme");

        btnInserir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setText("Visualização Completa?");

        comboUsuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        comboVisualizacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        comboVisualizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<selecione>>", "sim", "não" }));

        comboFilmes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Usuário");

        jTable.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jTable.setModel(tbl);
        jTable.setRowHeight(25);
        jScrollPane1.setViewportView(jTable);

        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVisualizacaoLayout = new javax.swing.GroupLayout(panelVisualizacao);
        panelVisualizacao.setLayout(panelVisualizacaoLayout);
        panelVisualizacaoLayout.setHorizontalGroup(
            panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                        .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVisualizacaoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(comboUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVisualizacaoLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(comboVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(comboFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelVisualizacaoLayout.setVerticalGroup(
            panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(comboVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelVisualizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelVisualizacaoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelVisualizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -----------------------------------------------------------------------------
//                                                                 [[[MÉTODOS]]]
// -----------------------------------------------------------------------------
    private void CriarTbl() {
        jTable = new JTable(tbl);
        tbl.addColumn("Código");
        tbl.addColumn("Data");
        tbl.addColumn("Completa?");
    }

    private void readComboFilmes() {
        try {
            List<Filme> array = new ArrayList<>();
            array = bllFilme.read();

            comboFilmes.removeAllItems();
            comboFilmes.addItem("<<Selecione>>");

            for (int i = 0; i < array.size(); i++) {
                comboFilmes.addItem(array.get(i).getIden()
                        + "-" + array.get(i).getTitulo());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void readComboUsuarios() {
        try {
            List<Usuario> array = new ArrayList<>();
            array = bllUsuario.read();

            comboUsuarios.removeAllItems();
            comboUsuarios.addItem("<<Selecione>>");

            for (int i = 0; i < array.size(); i++) {
                comboUsuarios.addItem(array.get(i).getIden()
                        + "-" + array.get(i).getNome());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }

    private void read() throws Exception {
        try {
            tbl.setNumRows(0);

            String itemFilme = comboFilmes.getSelectedItem() + "";
            String[] splFilme = itemFilme.split("-");
            int idFilme = Integer.parseInt(splFilme[0]);

            List<Visualizacao> array = bllVisualizacao.read(idFilme);
            Object[] visualizacao;
            for (Visualizacao vis : array) {
                visualizacao = new Object[]{
                    vis.getIden(),
                    dateFormat.format(vis.getData()),
                    (vis.getCompleto() + "").replaceAll("true", "sim").replaceAll("false", "não")
                };
                tbl.addRow(visualizacao);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

// -----------------------------------------------------------------------------
//                                                                 [[[EVENTOS]]]
// -----------------------------------------------------------------------------
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        try {
            // atributos simples
            modelVisualizacao.setData(new java.sql.Date(new java.util.Date().getTime()));

            if ((comboVisualizacao.getSelectedItem().toString()).equalsIgnoreCase("sim")) {
                modelVisualizacao.setCompleto(true);
            }

            if ((comboVisualizacao.getSelectedItem().toString()).equalsIgnoreCase("não")) {
                modelVisualizacao.setCompleto(false);
            }

            // atributos compostos
            String itemUsuario = comboUsuarios.getSelectedItem() + "";
            String[] splUsuario = itemUsuario.split("-");
            modelUsuario.setIden(Integer.parseInt(splUsuario[0]));
            modelVisualizacao.setUsuario(modelUsuario);

            String itemFilme = comboFilmes.getSelectedItem() + "";
            String[] splFilme = itemFilme.split("-");
            modelFilme.setIden(Integer.parseInt(splFilme[0]));
            modelVisualizacao.setFilme(modelFilme);

            bllVisualizacao.create(modelVisualizacao);

            JOptionPane.showMessageDialog(rootPane, "Visualização registrada!");
            read();
            comboUsuarios.setSelectedIndex(0);
            comboVisualizacao.setSelectedIndex(0);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            read();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

// -----------------------------------------------------------------------------
//                                                                    [[[MAIN]]]
// -----------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(AuxVisualizacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuxVisualizacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuxVisualizacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuxVisualizacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AuxVisualizacoes().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AuxVisualizacoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

// -----------------------------------------------------------------------------
//                                                        [[[NOME COMPONENTES]]]
// -----------------------------------------------------------------------------    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> comboFilmes;
    private javax.swing.JComboBox<String> comboUsuarios;
    private javax.swing.JComboBox<String> comboVisualizacao;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel panelVisualizacao;
    // End of variables declaration//GEN-END:variables
}
