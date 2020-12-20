package br.com.torrentz.app;

import br.com.torrentz.bll.*;
import br.com.torrentz.model.*;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class AuxCategoria extends javax.swing.JFrame {

// -----------------------------------------------------------------------------
//                                                               [[[ATRIBUTOS]]]
// -----------------------------------------------------------------------------    
    private DefaultTableModel tbl = new DefaultTableModel();
    private CategoriaBll bll = new CategoriaBll();
    private Categoria model = new Categoria();
    private String auxBtnConfirmar = "";

// -----------------------------------------------------------------------------
//                                                              [[[CONSTRUTOR]]]
// -----------------------------------------------------------------------------     
    public AuxCategoria() throws Exception {
        CriarTable();
        read();
        initComponents();
        this.setLocationRelativeTo(rootPane);
        tblGrid.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
        resetCampos();
    }

// -----------------------------------------------------------------------------
//                                                             [[[COMPONENTES]]]
// -----------------------------------------------------------------------------      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPaneGrid = new javax.swing.JScrollPane();
        tblGrid = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        labelPesquisar = new javax.swing.JLabel();
        labelCampos = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Fimes | Cadastro Categorias");

        tblGrid.setFont(new java.awt.Font("Dialog", 0, 16));
        tblGrid.setModel(tbl);
        tblGrid.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblGrid.setAutoscrolls(false);
        tblGrid.setRowHeight(50);
        tblGrid.setShowHorizontalLines(false);
        tblGrid.setShowVerticalLines(false);
        tblGrid.getTableHeader().setResizingAllowed(false);
        tblGrid.getTableHeader().setReorderingAllowed(false);
        tblGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblGridMousePressed(evt);
            }
        });
        scrollPaneGrid.setViewportView(tblGrid);

        txtPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        labelPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPesquisar.setText("Pesquisar");

        labelCampos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCampos.setText("Campos");

        labelNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelNome.setText("Nome");

        btnCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelPesquisar)
                .addGap(18, 18, 18)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCampos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(scrollPaneGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(scrollPaneGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnIncluir))
                .addGap(66, 66, 66)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(btnConfirmar)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -----------------------------------------------------------------------------
//                                                                 [[[MÉTODOS]]]
// -----------------------------------------------------------------------------
    public void read() throws Exception {
        try {
            tbl.setNumRows(0);
            List<Categoria> array = bll.read();
            Object[] categoria;
            for (Categoria cat : array) {
                categoria = new Object[]{
                    cat.getIden(),
                    cat.getNome()
                };
                tbl.addRow(categoria);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void CriarTable() {
        tblGrid = new JTable(tbl);
        tbl.addColumn("Código");
        tbl.addColumn("Nome");
    }

    public void resetCampos() {
        //Campos de textos
        txtNome.setEnabled(false);
        txtNome.setText("");

        // Botões
        btnIncluir.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void disabledCampos() {
        //Campos de textos
        txtNome.setEnabled(false);

        // Botões
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void enabledCampos() {
        //Campos de textos
        txtNome.setEnabled(true);

        // Botões
        btnIncluir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnConfirmar.setEnabled(true);
    }

// -----------------------------------------------------------------------------
//                                                                 [[[EVENTOS]]]
// -----------------------------------------------------------------------------

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            model.setIden(Integer.parseInt(tblGrid.getValueAt(
                    tblGrid.getSelectedRow(), 0).toString()));

            Object[] options = {"Confirmar", "Cancelar"};
            int opcao = JOptionPane.
                    showOptionDialog(
                            null,
                            "Excluir Plano: \n"
                            + bll.readToID(model.getIden()).getNome(),
                            "ATENÇÃO",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]);

            if (opcao == 0) {
                bll.delete(model);

            }
            disabledCampos();
            resetCampos();
            read();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        enabledCampos();
        auxBtnConfirmar = "editar";
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tblGridMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridMousePressed
        try {
            btnEditar.setEnabled(true);
            btnExcluir.setEnabled(true);
            txtNome.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString());

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_tblGridMousePressed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            String mensagem = "";
            if (auxBtnConfirmar.equals("editar")) {
                // atributos simples
                model.setIden(Integer.parseInt(tblGrid.getValueAt(
                        tblGrid.getSelectedRow(), 0).toString()));
                model.setNome(txtNome.getText());

                // update
                bll.update(model);
                mensagem = "\nEditado com sucesso!";

            }
            if (auxBtnConfirmar.equals("incluir")) {
                // atributos simples
                model.setNome(txtNome.getText());

                bll.create(model);
                mensagem = "\nIncluso com sucesso!";
            }

            JOptionPane.showMessageDialog(rootPane, model.getNome() + mensagem);
            resetCampos();
            disabledCampos();
            read();
            auxBtnConfirmar = "";

        } catch (Exception e) {

            e.getMessage();

        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try {
            read();
            resetCampos();
            enabledCampos();
            auxBtnConfirmar = "incluir";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            resetCampos();
            read();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AuxCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuxCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuxCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuxCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("DIALOG", Font.PLAIN, 20)));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AuxCategoria().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AuxCategoria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

// -----------------------------------------------------------------------------
//                                                        [[[NOME COMPONENTES]]]
// -----------------------------------------------------------------------------    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelCampos;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPesquisar;
    private javax.swing.JScrollPane scrollPaneGrid;
    private javax.swing.JTable tblGrid;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
