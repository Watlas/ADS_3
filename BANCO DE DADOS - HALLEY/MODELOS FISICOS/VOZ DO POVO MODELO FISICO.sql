/* logico-voz-do-povo: */

CREATE TABLE Categorias (
    cat_iden SERIAL PRIMARY KEY,
    cat_nome VARCHAR,
    cat_ativo BOOLEAN,
    cat_sla INTEGER
);

CREATE TABLE Ocorrencias (
    oco_iden SERIAL PRIMARY KEY,
    oco_endereco VARCHAR,
    oco_cat_iden INTEGER,
    oco_sta_iden INTEGER
);

CREATE TABLE Mensagens (
    men_iden SERIAL PRIMARY KEY,
    men_texto VARCHAR,
    men_data DATE,
    men_oco_iden INTEGER
);

CREATE TABLE Perfis (
    per_iden SERIAL PRIMARY KEY,
    per_nome VARCHAR
);

CREATE TABLE Status (
    sta_iden SERIAL PRIMARY KEY,
    sta_nome VARCHAR
);

CREATE TABLE Pessoas (
    pes_iden SERIAL PRIMARY KEY,
    pes_nome VARCHAR,
    pes_cpf VARCHAR,
    pes_email VARCHAR,
    pes_ativo BOOLEAN,
    pes_senha VARCHAR,
    pes_per_iden INTEGER
);

CREATE TABLE Mantem (
    fk_Ocorrencias_iden INTEGER,
    fk_Pessoas_pessoa_id INTEGER
);

CREATE TABLE mantem (
    fk_Mensagens_iden INTEGER,
    fk_Pessoas_pessoa_id INTEGER
);

CREATE TABLE cadastra (
    fk_Categorias_iden INTEGER,
    fk_Pessoas_pessoa_id INTEGER
);
 
ALTER TABLE Ocorrencias ADD CONSTRAINT FK_Ocorrencias_2
    FOREIGN KEY (fk_Categorias_iden)
    REFERENCES Categorias (iden)
    ON DELETE CASCADE;
 
ALTER TABLE Ocorrencias ADD CONSTRAINT FK_Ocorrencias_3
    FOREIGN KEY (fk_Status_iden)
    REFERENCES Status (iden)
    ON DELETE CASCADE;
 
ALTER TABLE Mensagens ADD CONSTRAINT FK_Mensagens_2
    FOREIGN KEY (fk_Ocorrencias_iden)
    REFERENCES Ocorrencias (iden)
    ON DELETE CASCADE;
 
ALTER TABLE Pessoas ADD CONSTRAINT FK_Pessoas_2
    FOREIGN KEY (fk_Perfis_iden)
    REFERENCES Perfis (iden)
    ON DELETE CASCADE;
 
ALTER TABLE Mantem ADD CONSTRAINT FK_Mantem_1
    FOREIGN KEY (fk_Ocorrencias_iden)
    REFERENCES Ocorrencias (iden)
    ON DELETE SET NULL;
 
ALTER TABLE Mantem ADD CONSTRAINT FK_Mantem_2
    FOREIGN KEY (fk_Pessoas_pessoa_id)
    REFERENCES Pessoas (pessoa_id)
    ON DELETE SET NULL;
 
ALTER TABLE mantem ADD CONSTRAINT FK_mantem_1
    FOREIGN KEY (fk_Mensagens_iden)
    REFERENCES Mensagens (iden)
    ON DELETE RESTRICT;
 
ALTER TABLE mantem ADD CONSTRAINT FK_mantem_2
    FOREIGN KEY (fk_Pessoas_pessoa_id)
    REFERENCES Pessoas (pessoa_id)
    ON DELETE SET NULL;
 
ALTER TABLE cadastra ADD CONSTRAINT FK_cadastra_1
    FOREIGN KEY (fk_Categorias_iden)
    REFERENCES Categorias (iden)
    ON DELETE SET NULL;
 
ALTER TABLE cadastra ADD CONSTRAINT FK_cadastra_2
    FOREIGN KEY (fk_Pessoas_pessoa_id)
    REFERENCES Pessoas (pessoa_id)
    ON DELETE SET NULL;