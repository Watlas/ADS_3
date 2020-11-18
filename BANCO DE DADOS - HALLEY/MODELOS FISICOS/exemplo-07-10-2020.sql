CREATE TABLE teste_constrainsts(
	tco_iden SERIAL PRIMARY KEY,
	tco_valor NUMERIC(7,2) CONSTRAINT valor_maior CHECK (tco_valor > 0),  --(7,2) é o tamnho ex: 1234567,12  maior que zero
	tco_desconto NUMERIC(7,2)CONSTRAINT desconto_maior CHECK (tco_desconto > 0), --maior que zero
	tco_status CHAR(1) CHECK (tco_status IN ('A', 'I','S')), --ATIVO A, INATIVO I, SUSPENSO S
	tco_contato VARCHAR(80) NOT NULL CHECK (tco_contato <> ''), -- nao pode ser difirente de zero
	tco_valor_desejado NUMERIC(7,2)NOT NULL CHECK (tco_valor_desejado > 0),
	tco_matricula INTEGER CONSTRAINT matricula_unica UNIQUE,
	CONSTRAINT valor_maior_desconto CHECK (tco_valor > tco_desconto)
)
SELECT * FROM teste_constrainsts
DELETE FROM teste_constrainsts
INSERT INTO teste_constrainsts(tco_valor,tco_contato,tco_valor_desejado,tco_desconto) VALUES (444,'OI',89998,77);

--------------------------------------------------------------------
--ALTER TALBE
CREATE TABLE tabela1(
	tab_iden SERIAL PRIMARY KEY,
	tab_nome VARCHAR(5)
);
CREATE TABLE tabela2(
	tab2_iden SERIAL PRIMARY KEY,
	tab2_nome VARCHAR(5)
);
SELECT * FROM tabela1
SELECT * FROM tabela2
--ADICIONAR
ALTER TABLE tabela1 ADD COLUMN tab_descricao TEXT CHECK(tab_descricao <> '')
ALTER TABLE tabela1 ADD COLUMN tab_descricao2 TEXT CHECK(tab_descricao <> '')
--APAGAR COLUNA
ALTER TABLE tabela1 DROP COLUMN tab_descricao2 
--apagar CONSTRAINT
ALTER TABLE tabela1 DROP CONSTRAINT tab2_iden

--CHECK 
ALTER TABLE tabela1 ADD CHECK (tab_nome <> '');
ALTER TABLE tabela1 ADD COLUMN tab_codigo INTEGER;
--DEFAULT
ALTER TABLE tabela1 ALTER COLUMN tab_nome SET DEFAULT 'VAZIO';
ALTER TABLE tabela1 ALTER COLUMN tab_nome DROP DEFAULT
--MUDAR TIPOS 
	--alterar tamnho do varchar
ALTER TABLE tabela1 ALTER COLUMN tab_nome TYPE VARCHAR(10)
    --alterar tipo de variavel
ALTER TABLE tabela1 ALTER COLUMN tab_nome TYPE INTEGER USING tab_nome::INTEGER
    --alterar nome da table
ALTER TABLE tabela1 RENAME TO tabela01
    --ALTER TABLE tabela1 ADD FOREIGN KEY (tab2_tab_iden) REFERENCES ...
	








