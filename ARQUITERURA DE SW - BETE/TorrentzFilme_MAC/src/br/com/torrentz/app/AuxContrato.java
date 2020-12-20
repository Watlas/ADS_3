package br.com.torrentz.app;

import br.com.torrentz.bll.*;
import br.com.torrentz.model.*;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

public class AuxContrato extends javax.swing.JFrame {

// -----------------------------------------------------------------------------
//                                                               [[[ATRIBUTOS]]]
// -----------------------------------------------------------------------------
    private DefaultTableModel tbl = new DefaultTableModel();
    private ContratoBll bllContrato = new ContratoBll();
    private Contrato modelContrato = new Contrato();
    private PlanoBll bllPlano = new PlanoBll();
    private Plano modelPlano = new Plano();
    private Usuario modelUsuario = new Usuario();
    private String auxBtnConfirmar = "";
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

// -----------------------------------------------------------------------------
//                                                              [[[CONSTRUTOR]]]
// -----------------------------------------------------------------------------    
    public AuxContrato() throws Exception {
        CriarTbl();
        initComponents();
        this.setLocationRelativeTo(rootPane);
        jTable.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
        readComboPlano();
        resetCampos();
    }

// -----------------------------------------------------------------------------
//                                                             [[[COMPONENTES]]]
// -----------------------------------------------------------------------------    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnContratoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtContratoPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnContratoEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboContratoStatus = new javax.swing.JComboBox<>();
        btnContratoIncluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboContratoPlano = new javax.swing.JComboBox<>();
        btnContratoLinkPlano = new javax.swing.JButton();
        btnContratoCancelar = new javax.swing.JButton();
        btnContratoConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtContratoIdUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtContratoNomeUsuario = new javax.swing.JTextField();
        dataFim = new com.toedter.calendar.JDateChooser();
        dataInicio = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Fimes | Gerenciar contratos usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Dialog", 0, 16));
        jTable.setModel(tbl);
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable.setAutoscrolls(false);
        jTable.setRowHeight(25);
        jTable.setShowHorizontalLines(false);
        jTable.setShowVerticalLines(false);
        jTable.getTableHeader().setResizingAllowed(false);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnContratoExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoExcluir.setText("Excluir");
        btnContratoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Pesquisar");

        txtContratoPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Início");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Campos");

        btnContratoEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoEditar.setText("Editar");
        btnContratoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Fim");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Status");

        comboContratoStatus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        comboContratoStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<selecione>>", "ativo", "inativo", "suspenso" }));

        btnContratoIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoIncluir.setText("Incluir");
        btnContratoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoIncluirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Plano");

        comboContratoPlano.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btnContratoLinkPlano.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoLinkPlano.setText("...");
        btnContratoLinkPlano.setPreferredSize(new java.awt.Dimension(54, 35));
        btnContratoLinkPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoLinkPlanoActionPerformed(evt);
            }
        });

        btnContratoCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoCancelar.setText("Cancelar");
        btnContratoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoCancelarActionPerformed(evt);
            }
        });

        btnContratoConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnContratoConfirmar.setText("Confirmar");
        btnContratoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoConfirmarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Nome Usuário");

        txtContratoIdUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContratoIdUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("ID Usuário");

        txtContratoNomeUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContratoNomeUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        dataFim.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        dataInicio.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dataInicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dataInicio.setPreferredSize(new java.awt.Dimension(100, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnContratoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnContratoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContratoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(21, 21, 21)
                                .addComponent(txtContratoIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtContratoNomeUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(txtContratoPesquisar)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboContratoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnContratoLinkPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContratoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboContratoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(btnContratoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtContratoIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtContratoNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContratoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContratoExcluir)
                    .addComponent(btnContratoEditar)
                    .addComponent(btnContratoIncluir))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboContratoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(comboContratoPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnContratoLinkPlano, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnContratoCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(btnContratoConfirmar)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -----------------------------------------------------------------------------
//                                                                 [[[MÉTODOS]]]
// -----------------------------------------------------------------------------
    public void setIdUser(String id) {
        txtContratoIdUsuario.setText(id);
    }

    public void setNomeUser(String nome) {
        txtContratoNomeUsuario.setText(nome);
    }

    private void read() throws Exception {
        try {
            tbl.setNumRows(0);
            List<Contrato> array = bllContrato.read(Integer.parseInt(txtContratoIdUsuario.getText()));
            Object[] contrato;
            for (Contrato con : array) {
                contrato = new Object[]{
                    con.getIden(),
                    con.getStatus(),
                    dateFormat.format(con.getInicio()),
                    dateFormat.format(con.getFim()),
                    con.getPlano().getIden() + "-" + con.getPlano().getNome()
                };

                tbl.addRow(contrato);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void CriarTbl() {
        jTable = new JTable(tbl);
        tbl.addColumn("Código");
        tbl.addColumn("Status");
        tbl.addColumn("Início");
        tbl.addColumn("Fim");
        tbl.addColumn("Plano");
    }

    private void readComboPlano() throws Exception {
        try {

            List<Plano> array = new ArrayList<>();
            array = bllPlano.read();

            comboContratoPlano.removeAllItems();
            comboContratoPlano.addItem("<<Selecione>>");

            for (int i = 0; i < array.size(); i++) {
                comboContratoPlano.addItem(array.get(i).getIden()
                        + "-" + array.get(i).getNome());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void resetCampos() {
        //Campos de textos
        txtContratoIdUsuario.setEnabled(false);
        txtContratoNomeUsuario.setEnabled(false);

        dataFim.setEnabled(false);
        dataFim.setDate(null);

        dataInicio.setEnabled(false);
        dataInicio.setDate(null);

        //Combo box
        comboContratoStatus.setEnabled(false);
        comboContratoStatus.setSelectedIndex(0);

        comboContratoPlano.setEnabled(false);
        comboContratoPlano.setSelectedIndex(0);

        // Botões
        btnContratoIncluir.setEnabled(true);
        btnContratoEditar.setEnabled(false);
        btnContratoExcluir.setEnabled(false);
        btnContratoLinkPlano.setEnabled(false);
        btnContratoConfirmar.setEnabled(false);
        btnContratoCancelar.setEnabled(false);
    }

    private void disableCampos() {
        //Campos de textos
        dataFim.setEnabled(false);
        dataInicio.setEnabled(false);

        //Combo box
        comboContratoStatus.setEnabled(false);

        comboContratoPlano.setEnabled(false);

        // Botões
        btnContratoLinkPlano.setEnabled(false);
        btnContratoConfirmar.setEnabled(false);
        btnContratoCancelar.setEnabled(false);
    }

    private void enabledCampos() {
        //Campos de textos
        dataFim.setEnabled(true);
        dataInicio.setEnabled(true);

        //Combo box
        comboContratoStatus.setEnabled(true);

        comboContratoPlano.setEnabled(true);

        // Botões
        btnContratoIncluir.setEnabled(false);
        btnContratoEditar.setEnabled(false);
        btnContratoExcluir.setEnabled(false);
        btnContratoLinkPlano.setEnabled(true);
        btnContratoConfirmar.setEnabled(true);
        btnContratoCancelar.setEnabled(true);
    }

    private void insertDadosCampos() {
        try {
            comboContratoStatus.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 1).toString());
            dataInicio.setDate(dateFormat.parse(jTable.getValueAt(jTable.getSelectedRow(), 2).toString()));
            dataFim.setDate(dateFormat.parse(jTable.getValueAt(jTable.getSelectedRow(), 3).toString()));
            comboContratoPlano.setSelectedItem(jTable.getValueAt(jTable.getSelectedRow(), 4).toString());

        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean contratoAtivo() {
        boolean contratoAtivo = false;
        int i = 0;
        while (contratoAtivo != true && i < jTable.getRowCount()) {
            if ((jTable.getValueAt(i, 1).toString()).equalsIgnoreCase("ativo")) {
                contratoAtivo = true;
            }
            i++;
        }
        return contratoAtivo;
    }

// -----------------------------------------------------------------------------
//                                                                 [[[EVENTOS]]]
// -----------------------------------------------------------------------------
    private void jTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMousePressed
        btnContratoEditar.setEnabled(true);
        btnContratoExcluir.setEnabled(true);
        insertDadosCampos();
    }//GEN-LAST:event_jTableMousePressed

    private void btnContratoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoIncluirActionPerformed
        try {
            if (!contratoAtivo()) {
                read();
                resetCampos();
                enabledCampos();
                auxBtnConfirmar = "incluir";
            } else {
                JOptionPane.showMessageDialog(rootPane, "Esse usuários já tem 1 contrato ativo!");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoIncluirActionPerformed

    private void btnContratoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoConfirmarActionPerformed
        try {

            String mensagem = "";

            if (auxBtnConfirmar.equals("editar")) {

                // Verifica se tem contrato ativo
                if (((comboContratoStatus.getSelectedItem().toString()).equalsIgnoreCase("ativo")) && contratoAtivo()) {
                    mensagem = "Esse usuários já tem 1 contrato ativo!";
                } else {
                    // atributos simples
                    modelContrato.setIden(Integer.parseInt(jTable.getValueAt(jTable.getSelectedRow(), 0).toString()));
                    modelContrato.setInicio(new java.sql.Date(new java.util.Date(dataInicio.getDate().getTime()).getTime()));
                    modelContrato.setFim(new java.sql.Date(new java.util.Date(dataFim.getDate().getTime()).getTime()));
                    modelContrato.setStatus(comboContratoStatus.getSelectedItem() + "");

                    // atributos compostos
                    String itemCombo = comboContratoPlano.getSelectedItem() + "";
                    String[] splItemCombo = itemCombo.split("-");
                    modelPlano.setIden(Integer.parseInt(splItemCombo[0]));
                    modelContrato.setPlano(modelPlano);

                    modelUsuario.setIden(Integer.parseInt(txtContratoIdUsuario.getText()));
                    modelContrato.setUsuario(modelUsuario);

                    // update
                    bllContrato.update(modelContrato);
                    mensagem = "\nContrato editado com sucesso!";

                }

            }

            if (auxBtnConfirmar.equals("incluir")) {

                // atributos simples
                modelContrato.setInicio(new java.sql.Date(new java.util.Date(dataInicio.getDate().getTime()).getTime()));
                modelContrato.setFim(new java.sql.Date(new java.util.Date(dataFim.getDate().getTime()).getTime()));
                modelContrato.setStatus(comboContratoStatus.getSelectedItem() + "");

                // atributos compostos
                String itemCombo = comboContratoPlano.getSelectedItem() + "";
                String[] splItemCombo = itemCombo.split("-");
                modelPlano.setIden(Integer.parseInt(splItemCombo[0]));
                modelContrato.setPlano(modelPlano);

                modelUsuario.setIden(Integer.parseInt(txtContratoIdUsuario.getText()));
                modelContrato.setUsuario(modelUsuario);

                bllContrato.create(modelContrato);

                mensagem = "\nContrato incluso com sucesso!";

            }

            JOptionPane.showMessageDialog(rootPane, mensagem);
            resetCampos();
            disableCampos();
            read();
            auxBtnConfirmar = "";

        } catch (Exception e) {
            e.getMessage();

        }
    }//GEN-LAST:event_btnContratoConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            read();
            readComboPlano();
        } catch (Exception ex) {
            Logger.getLogger(AuxContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnContratoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoEditarActionPerformed
        enabledCampos();
        auxBtnConfirmar = "editar";
    }//GEN-LAST:event_btnContratoEditarActionPerformed

    private void btnContratoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoExcluirActionPerformed

        try {
            modelContrato.setIden(Integer.parseInt(jTable.getValueAt(
                    jTable.getSelectedRow(), 0).toString()));

            Object[] options = {"Confirmar", "Cancelar"};
            int opcao = JOptionPane.
                    showOptionDialog(
                            null,
                            "Excluir Contrato código: \n"
                            + modelContrato.getIden(),
                            "ATENÇÃO",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]);

            if (opcao == 0) {
                bllContrato.delete(modelContrato);

            }
            disableCampos();
            resetCampos();
            read();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnContratoExcluirActionPerformed

    private void btnContratoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoCancelarActionPerformed
        try {
            resetCampos();
            read();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnContratoCancelarActionPerformed

    private void btnContratoLinkPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoLinkPlanoActionPerformed
        try {
            AuxPlano tela = new AuxPlano();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnContratoLinkPlanoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            readComboPlano();
            insertDadosCampos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(AuxContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuxContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuxContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuxContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new AuxContrato().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AuxContrato.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

// -----------------------------------------------------------------------------
//                                                        [[[NOME COMPONENTES]]]
// -----------------------------------------------------------------------------    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContratoCancelar;
    private javax.swing.JButton btnContratoConfirmar;
    private javax.swing.JButton btnContratoEditar;
    private javax.swing.JButton btnContratoExcluir;
    private javax.swing.JButton btnContratoIncluir;
    private javax.swing.JButton btnContratoLinkPlano;
    private javax.swing.JComboBox<String> comboContratoPlano;
    private javax.swing.JComboBox<String> comboContratoStatus;
    private com.toedter.calendar.JDateChooser dataFim;
    private com.toedter.calendar.JDateChooser dataInicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtContratoIdUsuario;
    private javax.swing.JTextField txtContratoNomeUsuario;
    private javax.swing.JTextField txtContratoPesquisar;
    // End of variables declaration//GEN-END:variables
}
