DROP TABLE IF EXISTS
	mensagens_colaborador,
	mensagens,
	colaboradores
;

CREATE TABLE colaboradores
(
	colaborador_id SERIAL PRIMARY KEY,
	colaborador_nome VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE mensagens
(
	mensagem_id SERIAL PRIMARY KEY,
	mensagem_texto VARCHAR NOT NULL
);

CREATE TABLE mensagens_colaborador
(
	mensagem_colaborador_colaborador_id INTEGER NOT NULL,
	mensagem_colaborador_mensagem_id INTEGER NOT NULL,
	FOREIGN KEY (mensagem_colaborador_colaborador_id) REFERENCES colaboradores (colaborador_id),
	FOREIGN KEY (mensagem_colaborador_mensagem_id) REFERENCES mensagens (mensagem_id),
	PRIMARY KEY (mensagem_colaborador_colaborador_id, mensagem_colaborador_mensagem_id)
);

INSERT INTO colaboradores (colaborador_nome) VALUES
	('Watlas'),
	('Lucas'),
	('Vinicius')
;

INSERT INTO mensagens (mensagem_texto) VALUES
	('Mussum Ipsum, cacilds vidis litro abertis. Si num tem leite então bota uma pinga aí cumpadi! Quem num gosta di mim que vai caçá sua turmis! Admodum accumsan disputationi eu sit. Vide electram sadipscing et per. Praesent malesuada urna nisi, quis volutpat erat hendrerit non. Nam vulputate dapibus.'),
	('Todo mundo vê os porris que eu tomo, mas ninguém vê os tombis que eu levo! Quem manda na minha terra sou euzis! Cevadis im ampola pa arma uma pindureta. Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.'),
	('Nullam volutpat risus nec leo commodo, ut interdum diam laoreet. Sed non consequat odio. Viva Forevis aptent taciti sociosqu ad litora torquent. Não sou faixa preta cumpadi, sou preto inteiris, inteiris. Atirei o pau no gatis, per gatis num morreus.')
;

INSERT INTO mensagens_colaborador VALUES 
	(1, 1),
	(1, 2),
	(1, 3),
	(2, 1),
	(2, 2),
	(2, 3),
	(3, 1),
	(3, 2),
	(3, 3)
;

SELECT c.colaborador_nome, m.mensagem_id, m.mensagem_texto FROM mensagens_colaborador mc
JOIN colaboradores c ON mc.mensagem_colaborador_colaborador_id = c.colaborador_id
JOIN mensagens m ON mc.mensagem_colaborador_mensagem_id = m.mensagem_id
WHERE c.colaborador_nome LIKE 'L%';

SELECT c.colaborador_nome, c.colaborador_id, m.mensagem_id, m.mensagem_texto FROM mensagens_colaborador mc
JOIN colaboradores c ON mc.mensagem_colaborador_colaborador_id = c.colaborador_id
JOIN mensagens m ON mc.mensagem_colaborador_mensagem_id = m.mensagem_id
WHERE c.colaborador_nome LIKE 'L%'
ORDER BY mensagem_id;

--INSERT INTO mensagens_colaborador VALUES (1,2);

SELECT * FROM mensagens_colaborador
