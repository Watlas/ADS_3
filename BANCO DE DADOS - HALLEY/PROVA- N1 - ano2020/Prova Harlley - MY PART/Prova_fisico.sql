CREATE TABLE Planos (
    pla_iden INTEGER PRIMARY KEY,
    pla_preco REAL NOT NULL,
    pla_nome VARCHAR NOT NULL UNIQUE,
    pla_acess_simut VARCHAR NOT NULL UNIQUE
);

CREATE TABLE Categorias (
    cate_iden INTEGER PRIMARY KEY,
    cate_nome VARCHAR NOT NULL UNIQUE
);

CREATE TABLE Usuario_Cupons (
    cup_usu_iden INTEGER PRIMARY KEY,
    cup_datGera TIMESTAMP NOT NULL,
    cup_porcen REAL NOT NULL,
    cup_senha VARCHAR NOT NULL,
    cup_nome VARCHAR NOT NULL,
    cup_email VARCHAR NOT NULL,
    cup_cpf VARCHAR NOT NULL UNIQUE
);


CREATE TABLE Filmes (
    film_iden INTEGER PRIMARY KEY,
    film_ano TIMESTAMP NOT NULL,
    film_titu VARCHAR NOT NULL UNIQUE,
    film_sintop VARCHAR NOT NULL,
    fil_cate_iden INTEGER,
	FOREIGN KEY (fil_cate_iden) REFERENCES Categorias (cate_iden) ON DELETE CASCADE
);

CREATE TABLE contrata (
	con_plan_iden INTEGER,
	con_sta BOOLEAN,
    con_fim VARCHAR  NOT NULL,
    con_inicio VARCHAR NOT NULL,
    con_cup_usu_iden INTEGER NOT NULL,
	FOREIGN KEY (con_plan_iden) REFERENCES Planos (pla_iden) ON DELETE CASCADE,
	FOREIGN KEY (con_cup_usu_iden) REFERENCES Usuario_Cupons(cup_usu_iden) ON DELETE CASCADE
);

CREATE TABLE vizualiza (
	vizu_film_iden INTEGER,
    vizu_dat_vizu TIMESTAMP NOT NULL,
    vizu_comple VARCHAR NOT NULL,
    vizu_cup_usu_iden INTEGER NOT NULL,
    FOREIGN KEY (vizu_cup_usu_iden) REFERENCES Usuario_Cupons(cup_usu_iden),
	FOREIGN KEY (vizu_film_iden) REFERENCES Filmes (film_iden)
);




 

 