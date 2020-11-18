--DDL
CREATE TABLE alunos (
	alu_iden SERIAL PRIMARY KEY,
	alu_nome VARCHAR(100),
	alu_cpf VARCHAR(12)
);

CREATE TABLE disciplinas (
	dis_iden SERIAL PRIMARY KEY,
	dis_nome VARCHAR(80)
);

CREATE TABLE contatos (
	con_iden SERIAL PRIMARY KEY,
	con_telefone VARCHAR(80),
	con_alu_iden INTEGER,
	FOREIGN KEY (con_alu_iden) REFERENCES alunos (alu_iden)
);

CREATE TABLE alunos_disciplinas (
 	adi_iden SERIAL PRIMARY KEY,
	adi_carga_horaria INTEGER,
	adi_alu_iden INTEGER,
	adi_dis_iden INTEGER,
	FOREIGN KEY (adi_alu_iden) REFERENCES alunos (alu_iden),
	FOREIGN KEY (adi_dis_iden) REFERENCES disciplinas (dis_iden)
);

SELECT * FROM alunos
SELECT * FROM contatos
SELECT * from alunos_disciplinas
select * from disciplinas
--SELECT DISTINCT * From alunos.alu_cpf


--SELECT DISTINCT * FROM alunos

INSERT INTO  alunos(alu_iden,alu_nome,alu_cpf) values (DEFAULT,'Watlas','02851104105')
Insert into contatos values (DEFAULT, '6666666666', '1')
insert into alunos_disciplinas(adi_iden,adi_carga_horaria,adi_alu_iden,adi_dis_iden)values(DEFAULT, '22','1','1')
insert into disciplinas(dis_iden, dis_nome)values (DEFAULT,'matematica')
--remover
delete from alunos
delete from alunos_disciplinas
delete from contatos
delete from disciplinas
--
select * from alunos, contatos

SELECT alu.alu_nome, con.con_telefone, dis.dis_nome
FROM alunos alu JOIN contatos con ON alu.alu_iden = con.con_alu_iden
                  JOIN alunos_disciplinas adi ON alu.alu_iden = adi.adi_alu_iden
                  JOIN disciplinas dis ON adi.adi_dis_iden = dis.dis_iden


