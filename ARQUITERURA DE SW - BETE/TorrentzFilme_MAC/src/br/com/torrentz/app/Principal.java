package br.com.torrentz.app;

import br.com.torrentz.bll.*;
import br.com.torrentz.model.*;
import java.awt.Font;
import java.text.DateFormat;
import java.text.DecimalFormat;
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

public class Principal extends javax.swing.JFrame {

// -----------------------------------------------------------------------------
//                                                               [[[ATRIBUTOS]]]
// -----------------------------------------------------------------------------
    // Escopo Filmes
    private String auxBtnFilmesConfirmar;
    private DefaultTableModel tblFilmesModelo = new DefaultTableModel();
    private Filme modelFilme = new Filme();
    private FilmeBll bllFilme = new FilmeBll();
    private Categoria modelCategoria = new Categoria();
    private CategoriaBll bllCategoria = new CategoriaBll();
    private Visualizacao modelVisualizacao = new Visualizacao();
    private VisualizacaoBll bllVisualizacao = new VisualizacaoBll();
    private DecimalFormat df = new DecimalFormat("0.##");

    // Escopo Usuarios
    private String auxBtnUsuariosConfirmar;
    private DefaultTableModel tblUsuariosModelo = new DefaultTableModel();
    private Usuario modelUsuario = new Usuario();
    private UsuarioBll bllUsuario = new UsuarioBll();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

// -----------------------------------------------------------------------------
//                                                              [[[CONSTRUTOR]]]
// -----------------------------------------------------------------------------    
    public Principal() throws Exception {
        criarTblFilmes();
        criarTblUsuarios();
        readFilmes();
        readUsuarios();
        initComponents();
        this.setLocationRelativeTo(rootPane);
        tblFilmes.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
        tblUsuarios.getTableHeader().setFont(new java.awt.Font("Dialog", 0, 18));
        readComboFilmesCategorias();
        resetFilmesCampos();
        resetUsuariosCampos();

    }

// -----------------------------------------------------------------------------
//                                                             [[[COMPONENTES]]]
// -----------------------------------------------------------------------------    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedOpcoes = new javax.swing.JTabbedPane();
        panelFilmes = new javax.swing.JPanel();
        scrollFilmes = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        btnFilmesIncluir = new javax.swing.JButton();
        btnFilmesEditar = new javax.swing.JButton();
        btnFilmesExcluir = new javax.swing.JButton();
        btnFilmesConfirmar = new javax.swing.JButton();
        btnFilmesLinkCategoria = new javax.swing.JButton();
        txtFilmesPesquisar = new javax.swing.JTextField();
        txtFilmesAno = new javax.swing.JTextField();
        txtFilmesTitulo = new javax.swing.JTextField();
        comboFilmesCategoria = new javax.swing.JComboBox<>();
        scrollFilmesSinopse = new javax.swing.JScrollPane();
        txtFilmesSinopse = new javax.swing.JTextArea();
        labelFilmesCampos = new javax.swing.JLabel();
        labelFilmesAno = new javax.swing.JLabel();
        labelFilmesTitulo = new javax.swing.JLabel();
        labelFilmesPesquisar = new javax.swing.JLabel();
        labelFilmesCategoria = new javax.swing.JLabel();
        labelFilmesSinopse = new javax.swing.JLabel();
        separatorFilmes = new javax.swing.JSeparator();
        btnFilmesCancelar = new javax.swing.JButton();
        labelLinkVisualizações = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        scrollUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnUsuariosIncluir = new javax.swing.JButton();
        btnUsuariosEditar = new javax.swing.JButton();
        btnUsuariosExcluir = new javax.swing.JButton();
        btnUsuariosLinkContratos = new javax.swing.JButton();
        btnUsuariosCancelar = new javax.swing.JButton();
        btnUsuariosConfirmar = new javax.swing.JButton();
        txtUsuariosPesquisar = new javax.swing.JTextField();
        txtUsuariosNome = new javax.swing.JTextField();
        txtUsuariosCpf = new javax.swing.JTextField();
        txtUsuariosEmail = new javax.swing.JTextField();
        labelUsuariosCampos = new javax.swing.JLabel();
        labelUsuariosCpf = new javax.swing.JLabel();
        labelUsuariosPesquisar = new javax.swing.JLabel();
        labelUsuariosEmail = new javax.swing.JLabel();
        labelUsuariosSenha = new javax.swing.JLabel();
        labelUsuariosNome = new javax.swing.JLabel();
        separatorUsuarios = new javax.swing.JSeparator();
        txtUsuariosSenha = new javax.swing.JPasswordField();
        labelLinkPlanos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Torrentz Filmes | Cadastro Principal");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedOpcoes.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        tblFilmes.setFont(new java.awt.Font("Dialog", 0, 16));
        tblFilmes.setModel(tblFilmesModelo);
        tblFilmes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblFilmes.setAutoscrolls(false);
        tblFilmes.setRowHeight(25);
        tblFilmes.setShowHorizontalLines(false);
        tblFilmes.setShowVerticalLines(false);
        tblFilmes.getTableHeader().setResizingAllowed(false);
        tblFilmes.getTableHeader().setReorderingAllowed(false);
        tblFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblFilmesMousePressed(evt);
            }
        });
        scrollFilmes.setViewportView(tblFilmes);

        btnFilmesIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesIncluir.setText("Incluir");
        btnFilmesIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesIncluirActionPerformed(evt);
            }
        });

        btnFilmesEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesEditar.setText("Editar");
        btnFilmesEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesEditarActionPerformed(evt);
            }
        });

        btnFilmesExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesExcluir.setText("Excluir");
        btnFilmesExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesExcluirActionPerformed(evt);
            }
        });

        btnFilmesConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesConfirmar.setText("Confirmar");
        btnFilmesConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesConfirmarActionPerformed(evt);
            }
        });

        btnFilmesLinkCategoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesLinkCategoria.setText("...");
        btnFilmesLinkCategoria.setPreferredSize(new java.awt.Dimension(54, 35));
        btnFilmesLinkCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesLinkCategoriaActionPerformed(evt);
            }
        });

        txtFilmesPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtFilmesAno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFilmesAno.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        txtFilmesTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFilmesTitulo.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        comboFilmesCategoria.setBackground(new java.awt.Color(255, 255, 255));
        comboFilmesCategoria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        comboFilmesCategoria.setForeground(new java.awt.Color(255, 255, 255));
        comboFilmesCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtFilmesSinopse.setColumns(20);
        txtFilmesSinopse.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtFilmesSinopse.setRows(5);
        txtFilmesSinopse.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        scrollFilmesSinopse.setViewportView(txtFilmesSinopse);

        labelFilmesCampos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFilmesCampos.setText("Campos");

        labelFilmesAno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFilmesAno.setText("Ano");

        labelFilmesTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFilmesTitulo.setText("Título");

        labelFilmesPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFilmesPesquisar.setText("Pesquisar");

        labelFilmesCategoria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFilmesCategoria.setText("Categ.");

        labelFilmesSinopse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelFilmesSinopse.setText("Sinopse");

        btnFilmesCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFilmesCancelar.setText("Cancelar");
        btnFilmesCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesCancelarActionPerformed(evt);
            }
        });

        labelLinkVisualizações.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelLinkVisualizações.setText("Inserir Visualições de Filmes");
        labelLinkVisualizações.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelLinkVisualizaçõesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelFilmesLayout = new javax.swing.GroupLayout(panelFilmes);
        panelFilmes.setLayout(panelFilmesLayout);
        panelFilmesLayout.setHorizontalGroup(
            panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilmesLayout.createSequentialGroup()
                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelFilmesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFilmesCampos)
                            .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFilmesLayout.createSequentialGroup()
                                    .addComponent(labelFilmesPesquisar)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFilmesPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelLinkVisualizações, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelFilmesLayout.createSequentialGroup()
                                    .addComponent(btnFilmesIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFilmesEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFilmesExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(scrollFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelFilmesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFilmesSinopse)
                            .addGroup(panelFilmesLayout.createSequentialGroup()
                                .addComponent(labelFilmesAno)
                                .addGap(20, 20, 20)
                                .addComponent(txtFilmesAno, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(labelFilmesTitulo)
                                .addGap(18, 18, 18)
                                .addComponent(txtFilmesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(labelFilmesCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(comboFilmesCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFilmesLinkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFilmesLayout.createSequentialGroup()
                                .addComponent(scrollFilmesSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFilmesConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFilmesCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelFilmesLayout.setVerticalGroup(
            panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFilmesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFilmesPesquisar)
                    .addComponent(txtFilmesPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLinkVisualizações))
                .addGap(28, 28, 28)
                .addComponent(scrollFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilmesExcluir)
                    .addComponent(btnFilmesEditar)
                    .addComponent(btnFilmesIncluir))
                .addGap(20, 20, 20)
                .addComponent(separatorFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelFilmesCampos)
                .addGap(20, 20, 20)
                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilmesAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFilmesAno)
                    .addComponent(labelFilmesTitulo)
                    .addComponent(txtFilmesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFilmesCategoria)
                    .addComponent(comboFilmesCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilmesLinkCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelFilmesSinopse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilmesLayout.createSequentialGroup()
                        .addComponent(btnFilmesCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(btnFilmesConfirmar))
                    .addComponent(scrollFilmesSinopse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jTabbedOpcoes.addTab("Filmes", panelFilmes);

        tblUsuarios.setFont(new java.awt.Font("Dialog", 0, 16));
        tblUsuarios.setModel(tblUsuariosModelo);
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblUsuarios.setAutoscrolls(false);
        tblUsuarios.setRowHeight(25);
        tblUsuarios.setShowHorizontalLines(false);
        tblUsuarios.setShowVerticalLines(false);
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUsuariosMousePressed(evt);
            }
        });
        scrollUsuarios.setViewportView(tblUsuarios);

        btnUsuariosIncluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosIncluir.setText("Incluir");
        btnUsuariosIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosIncluirActionPerformed(evt);
            }
        });

        btnUsuariosEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosEditar.setText("Editar");
        btnUsuariosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosEditarActionPerformed(evt);
            }
        });

        btnUsuariosExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosExcluir.setText("Excluir");
        btnUsuariosExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosExcluirActionPerformed(evt);
            }
        });

        btnUsuariosLinkContratos.setBackground(new java.awt.Color(102, 102, 102));
        btnUsuariosLinkContratos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosLinkContratos.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuariosLinkContratos.setText("Gerenciar Contratos");
        btnUsuariosLinkContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosLinkContratosActionPerformed(evt);
            }
        });

        btnUsuariosCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosCancelar.setText("Cancelar");
        btnUsuariosCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosCancelarActionPerformed(evt);
            }
        });

        btnUsuariosConfirmar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnUsuariosConfirmar.setText("Confirmar");
        btnUsuariosConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosConfirmarActionPerformed(evt);
            }
        });

        txtUsuariosPesquisar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtUsuariosNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuariosNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtUsuariosCpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuariosCpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtUsuariosEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuariosEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        labelUsuariosCampos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelUsuariosCampos.setText("Campos");

        labelUsuariosCpf.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelUsuariosCpf.setText("CPF");

        labelUsuariosPesquisar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelUsuariosPesquisar.setText("Pesquisar");

        labelUsuariosEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelUsuariosEmail.setText("Email");

        labelUsuariosSenha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelUsuariosSenha.setText("Senha");

        labelUsuariosNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelUsuariosNome.setText("Nome");

        txtUsuariosSenha.setText("jPasswordField1");

        labelLinkPlanos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelLinkPlanos.setText("Atalho Cadastro Planos");
        labelLinkPlanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelLinkPlanosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsuariosCampos)
                    .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelUsuariosLayout.createSequentialGroup()
                            .addComponent(labelUsuariosPesquisar)
                            .addGap(18, 18, 18)
                            .addComponent(txtUsuariosPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLinkPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(separatorUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelUsuariosLayout.createSequentialGroup()
                            .addComponent(btnUsuariosLinkContratos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUsuariosIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUsuariosEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUsuariosExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 1217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelUsuariosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                    .addComponent(labelUsuariosNome)
                                    .addGap(20, 20, 20))
                                .addGroup(panelUsuariosLayout.createSequentialGroup()
                                    .addComponent(labelUsuariosEmail)
                                    .addGap(23, 23, 23)))
                            .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuariosEmail)
                                .addComponent(txtUsuariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                                    .addComponent(labelUsuariosSenha)
                                    .addGap(18, 18, 18))
                                .addGroup(panelUsuariosLayout.createSequentialGroup()
                                    .addComponent(labelUsuariosCpf)
                                    .addGap(31, 31, 31)))
                            .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsuariosCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUsuariosSenha))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnUsuariosConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnUsuariosCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuariosPesquisar)
                    .addComponent(txtUsuariosPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLinkPlanos))
                .addGap(28, 28, 28)
                .addComponent(scrollUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuariosLinkContratos)
                    .addComponent(btnUsuariosEditar)
                    .addComponent(btnUsuariosIncluir)
                    .addComponent(btnUsuariosExcluir))
                .addGap(20, 20, 20)
                .addComponent(separatorUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelUsuariosCampos)
                .addGap(22, 22, 22)
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuariosNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUsuariosNome)
                    .addComponent(labelUsuariosCpf)
                    .addComponent(txtUsuariosCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUsuariosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuariosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUsuariosEmail)
                            .addComponent(labelUsuariosSenha)
                            .addComponent(txtUsuariosSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btnUsuariosCancelar)
                        .addGap(14, 14, 14)
                        .addComponent(btnUsuariosConfirmar)
                        .addGap(22, 22, 22))))
        );

        jTabbedOpcoes.addTab("Usuários", panelUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jTabbedOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// -----------------------------------------------------------------------------
//                                                   [[[MÉTODOS ESCOPO FILMES]]]
// -----------------------------------------------------------------------------
    private void readFilmes() throws Exception {
        try {
            tblFilmesModelo.setNumRows(0);
            List<Filme> arrayFilmes = bllFilme.read();
            Object[] filme;
            for (Filme fil : arrayFilmes) {

                List<Visualizacao> arrayVisualizacao = bllVisualizacao.read(fil.getIden());
                float visCompleta = 0.0f;
                for (Visualizacao vis : arrayVisualizacao) {
                    if (vis.getCompleto()) {
                        visCompleta++;
                    }
                }

                filme = new Object[]{
                    fil.getIden(),
                    fil.getAno(),
                    fil.getTitulo(),
                    fil.getCategoria().getIden() + "-" + fil.getCategoria().getNome(),
                    df.format((visCompleta / arrayVisualizacao.size()) * 100) + "%"
                };

                tblFilmesModelo.addRow(filme);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void criarTblFilmes() {
        tblFilmes = new JTable(tblFilmesModelo);
        tblFilmesModelo.addColumn("Código");
        tblFilmesModelo.addColumn("Ano");
        tblFilmesModelo.addColumn("Título");
        tblFilmesModelo.addColumn("Categoria");
        tblFilmesModelo.addColumn("Relevância");
    }

    private void readComboFilmesCategorias() throws Exception {
        try {

            List<Categoria> array = new ArrayList<>();
            array = bllCategoria.read();

            comboFilmesCategoria.removeAllItems();
            comboFilmesCategoria.addItem("<<Selecione>>");

            for (int i = 0; i < array.size(); i++) {
                comboFilmesCategoria.addItem(array.get(i).getIden()
                        + "-" + array.get(i).getNome());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void resetFilmesCampos() {
        //Campos de textos
        txtFilmesAno.setEnabled(false);
        txtFilmesAno.setText("");

        txtFilmesTitulo.setEnabled(false);
        txtFilmesTitulo.setText("");

        txtFilmesSinopse.setEnabled(false);
        txtFilmesSinopse.setText("");

        //Combo box
        comboFilmesCategoria.setEnabled(false);
        comboFilmesCategoria.setSelectedIndex(0);

        // Botões
        btnFilmesIncluir.setEnabled(true);
        btnFilmesEditar.setEnabled(false);
        btnFilmesExcluir.setEnabled(false);
        btnFilmesLinkCategoria.setEnabled(false);
        btnFilmesConfirmar.setEnabled(false);
        btnFilmesCancelar.setEnabled(false);
    }

    private void disabledFilmesCampos() {
        //Campos de textos
        txtFilmesAno.setEnabled(false);
        txtFilmesTitulo.setEnabled(false);
        txtFilmesSinopse.setEnabled(false);

        //Combo box
        comboFilmesCategoria.setEnabled(false);

        // Botões
        btnFilmesConfirmar.setEnabled(false);
        btnFilmesCancelar.setEnabled(false);
        btnFilmesLinkCategoria.setEnabled(false);
    }

    private void enabledFilmesCampos() {
        //Campos de textos
        txtFilmesAno.setEnabled(true);
        txtFilmesTitulo.setEnabled(true);
        txtFilmesSinopse.setEnabled(true);

        //Combo box
        comboFilmesCategoria.setEnabled(true);

        // Botões
        btnFilmesIncluir.setEnabled(false);
        btnFilmesEditar.setEnabled(false);
        btnFilmesExcluir.setEnabled(false);
        btnFilmesLinkCategoria.setEnabled(true);
        btnFilmesConfirmar.setEnabled(true);
        btnFilmesCancelar.setEnabled(true);
    }

// -----------------------------------------------------------------------------
//                                                 [[[MÉTODOS ESCOPO USUÁRIOS]]]
// -----------------------------------------------------------------------------
    private void readUsuarios() throws Exception {
        try {
            tblUsuariosModelo.setNumRows(0);
            List<Usuario> arrayUsuarios = bllUsuario.read();
            Object[] usuario;
            for (Usuario usu : arrayUsuarios) {
                usuario = new Object[]{
                    usu.getIden(),
                    usu.getNome(),
                    usu.getCpf(),
                    usu.getEmail(),
                    usu.getPercentCupom() + "%",
                    dateFormat.format(usu.getDataGeracaoCupom())
                };
                tblUsuariosModelo.addRow(usuario);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void criarTblUsuarios() {
        tblUsuarios = new JTable(tblUsuariosModelo);
        tblUsuariosModelo.addColumn("Código");
        tblUsuariosModelo.addColumn("Nome");
        tblUsuariosModelo.addColumn("CPF");
        tblUsuariosModelo.addColumn("Email");
        tblUsuariosModelo.addColumn("% Cupom");
        tblUsuariosModelo.addColumn("Geração Cupom");
    }

    private void resetUsuariosCampos() {
        //Campos de textos
        txtUsuariosCpf.setEnabled(false);
        txtUsuariosCpf.setText("");

        txtUsuariosEmail.setEnabled(false);
        txtUsuariosEmail.setText("");

        txtUsuariosNome.setEnabled(false);
        txtUsuariosNome.setText("");

        txtUsuariosSenha.setEnabled(false);
        txtUsuariosSenha.setText("");

        // Botões
        btnUsuariosIncluir.setEnabled(true);
        btnUsuariosEditar.setEnabled(false);
        btnUsuariosExcluir.setEnabled(false);
        btnUsuariosLinkContratos.setEnabled(false);
        btnUsuariosCancelar.setEnabled(false);
        btnUsuariosConfirmar.setEnabled(false);
    }

    private void disabledUsuariosCampos() {
        //Campos de textos
        txtUsuariosNome.setEnabled(false);
        txtUsuariosCpf.setEnabled(false);
        txtUsuariosEmail.setEnabled(false);
        txtUsuariosSenha.setEnabled(false);

        // Botões
        btnUsuariosCancelar.setEnabled(false);
        btnUsuariosConfirmar.setEnabled(false);
    }

    private void enabledUsuariosCampos() {
        //Campos de textos
        txtUsuariosNome.setEnabled(true);
        txtUsuariosCpf.setEnabled(true);
        txtUsuariosEmail.setEnabled(true);
        txtUsuariosSenha.setEnabled(true);

        // Botões
        btnUsuariosIncluir.setEnabled(false);
        btnUsuariosEditar.setEnabled(false);
        btnUsuariosExcluir.setEnabled(false);
        btnUsuariosLinkContratos.setEnabled(false);
        btnUsuariosCancelar.setEnabled(true);
        btnUsuariosConfirmar.setEnabled(true);
    }

// -----------------------------------------------------------------------------
//                                                    [[[EVENTOS ESCOPO GERAL]]]
// -----------------------------------------------------------------------------
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            readFilmes();
            readUsuarios();
            readComboFilmesCategorias();
            resetFilmesCampos();
            resetUsuariosCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_formWindowActivated

// -----------------------------------------------------------------------------
//                                                   [[[EVENTOS ESCOPO FILMES]]]
// -----------------------------------------------------------------------------

    private void btnFilmesIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesIncluirActionPerformed
        try {
            readFilmes();
            resetFilmesCampos();
            enabledFilmesCampos();
            auxBtnFilmesConfirmar = "incluir";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFilmesIncluirActionPerformed

    private void btnFilmesLinkCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesLinkCategoriaActionPerformed
        try {
            AuxCategoria tela = new AuxCategoria();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnFilmesLinkCategoriaActionPerformed

    private void btnFilmesEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesEditarActionPerformed
        enabledFilmesCampos();
        auxBtnFilmesConfirmar = "editar";
    }//GEN-LAST:event_btnFilmesEditarActionPerformed

    private void btnFilmesConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesConfirmarActionPerformed
        try {

            String mensagem = "";

            if (auxBtnFilmesConfirmar.equals("editar")) {

                // atributos simples
                modelFilme.setIden(Integer.parseInt(tblFilmes.getValueAt(tblFilmes.getSelectedRow(), 0).toString()));
                modelFilme.setAno(Integer.parseInt(txtFilmesAno.getText()));
                modelFilme.setTitulo(txtFilmesTitulo.getText());
                modelFilme.setSinopse(txtFilmesSinopse.getText());

                // atributos compostos
                String itemCombo = comboFilmesCategoria.getSelectedItem() + "";
                String[] splItemCombo = itemCombo.split("-");
                modelCategoria.setIden(Integer.parseInt(splItemCombo[0]));
                modelFilme.setCategoria(modelCategoria);

                // update
                bllFilme.update(modelFilme);
                mensagem = "\nEditado com sucesso!";

            }

            if (auxBtnFilmesConfirmar.equals("incluir")) {

                // atributos simples
                modelFilme.setAno(Integer.parseInt(txtFilmesAno.getText()));
                modelFilme.setTitulo(txtFilmesTitulo.getText());
                modelFilme.setSinopse(txtFilmesSinopse.getText());

                // atributos compostos
                String itemCombo = comboFilmesCategoria.getSelectedItem() + "";
                String[] splItemCombo = itemCombo.split("-");
                modelCategoria.setIden(Integer.parseInt(splItemCombo[0]));
                modelFilme.setCategoria(modelCategoria);

                bllFilme.create(modelFilme);
                mensagem = "\nIncluso com sucesso!";

            }

            JOptionPane.showMessageDialog(rootPane, modelFilme.getTitulo() + mensagem);
            resetFilmesCampos();
            disabledFilmesCampos();
            readFilmes();
            auxBtnFilmesConfirmar = "";

        } catch (Exception e) {

            e.getMessage();

        }
    }//GEN-LAST:event_btnFilmesConfirmarActionPerformed

    private void btnFilmesExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesExcluirActionPerformed
        try {
            modelFilme.setIden(Integer.parseInt(tblFilmes.getValueAt(
                    tblFilmes.getSelectedRow(), 0).toString()));

            Object[] options = {"Confirmar", "Cancelar"};
            int opcao = JOptionPane.
                    showOptionDialog(
                            null,
                            "Excluir Filme: \n"
                            + bllFilme.readToID(modelFilme.getIden()).getTitulo(),
                            "ATENÇÃO",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]);

            if (opcao == 0) {
                bllFilme.delete(modelFilme);

            }
            disabledFilmesCampos();
            resetFilmesCampos();
            readFilmes();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
    }//GEN-LAST:event_btnFilmesExcluirActionPerformed

    private void tblFilmesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFilmesMousePressed
        try {
            btnFilmesEditar.setEnabled(true);
            btnFilmesExcluir.setEnabled(true);

            txtFilmesAno.setText(tblFilmes.getValueAt(tblFilmes.getSelectedRow(), 1).toString());
            txtFilmesTitulo.setText(tblFilmes.getValueAt(tblFilmes.getSelectedRow(), 2).toString());
            comboFilmesCategoria.setSelectedItem(tblFilmes.getValueAt(tblFilmes.getSelectedRow(), 3).toString());
            int id = Integer.parseInt(tblFilmes.getValueAt(tblFilmes.getSelectedRow(), 0).toString());
            txtFilmesSinopse.setText(bllFilme.readToID(id).getSinopse());

        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_tblFilmesMousePressed

    private void btnFilmesCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesCancelarActionPerformed
        try {
            resetFilmesCampos();
            readFilmes();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnFilmesCancelarActionPerformed

// -----------------------------------------------------------------------------
//                                                 [[[EVENTOS ESCOPO USUÁRIOS]]]
// -----------------------------------------------------------------------------

    private void btnUsuariosLinkContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosLinkContratosActionPerformed
        try {
            AuxContrato tela = new AuxContrato();
            tela.setIdUser(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0).toString());
            tela.setNomeUser(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1).toString());
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnUsuariosLinkContratosActionPerformed

    private void btnUsuariosCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosCancelarActionPerformed
        try {
            resetUsuariosCampos();
            readUsuarios();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUsuariosCancelarActionPerformed

    private void btnUsuariosConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosConfirmarActionPerformed
        try {

            String mensagem = "";

            if (auxBtnUsuariosConfirmar.equals("editar")) {

                // atributos simples
                modelUsuario.setIden(Integer.parseInt(tblUsuarios.getValueAt(
                        tblUsuarios.getSelectedRow(), 0).toString()));
                modelUsuario.setNome(txtUsuariosNome.getText());
                modelUsuario.setCpf(txtUsuariosCpf.getText());
                modelUsuario.setEmail(txtUsuariosEmail.getText());
                modelUsuario.setSenha(txtUsuariosSenha.getText());

                // update
                bllUsuario.update(modelUsuario);
                mensagem = "\nEditado com sucesso!";

            }

            if (auxBtnUsuariosConfirmar.equals("incluir")) {

                // atributos simples
                modelUsuario.setNome(txtUsuariosNome.getText());
                modelUsuario.setCpf(txtUsuariosCpf.getText());
                modelUsuario.setEmail(txtUsuariosEmail.getText());
                modelUsuario.setSenha(txtUsuariosSenha.getText());
                modelUsuario.setPercentCupom(modelUsuario.gerarPercentCupom());
                modelUsuario.setDataGeracaoCupom(new java.sql.Date(new java.util.Date().getTime()));

                bllUsuario.create(modelUsuario);
                mensagem = "\nIncluso com sucesso!";

            }

            JOptionPane.showMessageDialog(rootPane, modelUsuario.getNome() + mensagem);
            resetUsuariosCampos();
            disabledUsuariosCampos();
            readUsuarios();
            auxBtnUsuariosConfirmar = "";

        } catch (Exception e) {

            e.getMessage();

        }
    }//GEN-LAST:event_btnUsuariosConfirmarActionPerformed

    private void btnUsuariosIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosIncluirActionPerformed
        try {
            readUsuarios();
            resetUsuariosCampos();
            enabledUsuariosCampos();
            auxBtnUsuariosConfirmar = "incluir";
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnUsuariosIncluirActionPerformed

    private void tblUsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMousePressed
        try {

            btnUsuariosEditar.setEnabled(true);
            btnUsuariosExcluir.setEnabled(true);
            btnUsuariosLinkContratos.setEnabled(true);

            txtUsuariosNome.setText(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 1).toString());
            txtUsuariosCpf.setText(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 2).toString());
            txtUsuariosEmail.setText(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 3).toString());
            int id = Integer.parseInt(tblUsuarios.getValueAt(tblUsuarios.getSelectedRow(), 0).toString());
            txtUsuariosSenha.setText(bllUsuario.readToID(id).getSenha());

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_tblUsuariosMousePressed

    private void btnUsuariosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosEditarActionPerformed
        enabledUsuariosCampos();
        auxBtnUsuariosConfirmar = "editar";
    }//GEN-LAST:event_btnUsuariosEditarActionPerformed

    private void btnUsuariosExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosExcluirActionPerformed
        try {
            modelUsuario.setIden(Integer.parseInt(tblUsuarios.getValueAt(
                    tblUsuarios.getSelectedRow(), 0).toString()));

            Object[] options = {"Confirmar", "Cancelar"};
            int opcao = JOptionPane.
                    showOptionDialog(
                            null,
                            "Excluir Usuário: \n"
                            + bllUsuario.readToID(modelUsuario.getIden()).getNome(),
                            "ATENÇÃO",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]);

            if (opcao == 0) {
                bllUsuario.delete(modelUsuario);

            }
            disabledUsuariosCampos();
            resetUsuariosCampos();
            readUsuarios();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);

        }
    }//GEN-LAST:event_btnUsuariosExcluirActionPerformed

// -----------------------------------------------------------------------------
//                                                     [[[EVENTOS LABEL LINKS]]]
// -----------------------------------------------------------------------------

    private void labelLinkPlanosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkPlanosMousePressed
        try {
            AuxPlano tela = new AuxPlano();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_labelLinkPlanosMousePressed

    private void labelLinkVisualizaçõesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLinkVisualizaçõesMousePressed
        try {
            AuxVisualizacoes tela = new AuxVisualizacoes();
            tela.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_labelLinkVisualizaçõesMousePressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("DIALOG", Font.PLAIN, 20)));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

// -----------------------------------------------------------------------------
//                                                        [[[NOME COMPONENTES]]]
// -----------------------------------------------------------------------------    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilmesCancelar;
    private javax.swing.JButton btnFilmesConfirmar;
    private javax.swing.JButton btnFilmesEditar;
    private javax.swing.JButton btnFilmesExcluir;
    private javax.swing.JButton btnFilmesIncluir;
    private javax.swing.JButton btnFilmesLinkCategoria;
    private javax.swing.JButton btnUsuariosCancelar;
    private javax.swing.JButton btnUsuariosConfirmar;
    private javax.swing.JButton btnUsuariosEditar;
    private javax.swing.JButton btnUsuariosExcluir;
    private javax.swing.JButton btnUsuariosIncluir;
    private javax.swing.JButton btnUsuariosLinkContratos;
    private javax.swing.JComboBox<String> comboFilmesCategoria;
    private javax.swing.JTabbedPane jTabbedOpcoes;
    private javax.swing.JLabel labelFilmesAno;
    private javax.swing.JLabel labelFilmesCampos;
    private javax.swing.JLabel labelFilmesCategoria;
    private javax.swing.JLabel labelFilmesPesquisar;
    private javax.swing.JLabel labelFilmesSinopse;
    private javax.swing.JLabel labelFilmesTitulo;
    private javax.swing.JLabel labelLinkPlanos;
    private javax.swing.JLabel labelLinkVisualizações;
    private javax.swing.JLabel labelUsuariosCampos;
    private javax.swing.JLabel labelUsuariosCpf;
    private javax.swing.JLabel labelUsuariosEmail;
    private javax.swing.JLabel labelUsuariosNome;
    private javax.swing.JLabel labelUsuariosPesquisar;
    private javax.swing.JLabel labelUsuariosSenha;
    private javax.swing.JPanel panelFilmes;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JScrollPane scrollFilmes;
    private javax.swing.JScrollPane scrollFilmesSinopse;
    private javax.swing.JScrollPane scrollUsuarios;
    private javax.swing.JSeparator separatorFilmes;
    private javax.swing.JSeparator separatorUsuarios;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtFilmesAno;
    private javax.swing.JTextField txtFilmesPesquisar;
    private javax.swing.JTextArea txtFilmesSinopse;
    private javax.swing.JTextField txtFilmesTitulo;
    private javax.swing.JTextField txtUsuariosCpf;
    private javax.swing.JTextField txtUsuariosEmail;
    private javax.swing.JTextField txtUsuariosNome;
    private javax.swing.JTextField txtUsuariosPesquisar;
    private javax.swing.JPasswordField txtUsuariosSenha;
    // End of variables declaration//GEN-END:variables
}
