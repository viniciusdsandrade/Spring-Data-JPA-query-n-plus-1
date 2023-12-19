DROP SCHEMA IF EXISTS db_spring_data_jpa_n_plus_1_query;
CREATE SCHEMA IF NOT EXISTS db_spring_data_jpa_n_plus_1_query;
USE db_spring_data_jpa_n_plus_1_query;

SELECT * FROM tb_product LIMIT 5,5;

SELECT *
FROM tb_product
		 INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
		 INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
LIMIT 0,5;

SELECT * FROM tb_product WHERE id IN (1, 2, 3, 4, 5, 6, 7)
LIMIT 0,5;

SELECT *
FROM tb_product
		 INNER JOIN tb_product_category ON tb_product.id = tb_product_category.product_id
		 INNER JOIN tb_category ON tb_category.id = tb_product_category.category_id
WHERE tb_product.id IN (1, 2, 3, 4, 5, 6, 7);
	
CREATE TABLE IF NOT EXISTS tb_category
(
	id   BIGINT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(255),

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_product
(
	id   BIGINT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(255),

	PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_product_category
(
	product_id  BIGINT UNSIGNED NULL,
	category_id BIGINT UNSIGNED NULL,

	PRIMARY KEY (product_id, category_id)
);

-- Inserções para tb_category
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Moda Masculina');
INSERT INTO tb_category (name) VALUES ('Moda Feminina');
INSERT INTO tb_category (name) VALUES ('Calçados');
INSERT INTO tb_category (name) VALUES ('Beleza e Cuidados Pessoais');
INSERT INTO tb_category (name) VALUES ('Casa e Decoração');
INSERT INTO tb_category (name) VALUES ('Esportes e Fitness');
INSERT INTO tb_category (name) VALUES ('Livros e Entretenimento');
INSERT INTO tb_category (name) VALUES ('Alimentos e Bebidas');
INSERT INTO tb_category (name) VALUES ('Acessórios');


-- Inserções para tb_product
INSERT INTO tb_product (name) VALUES ('Smartphone Galaxy S21');
INSERT INTO tb_product (name) VALUES ('Notebook Dell XPS 13');
INSERT INTO tb_product (name) VALUES ('Camiseta Polo Lacoste');
INSERT INTO tb_product (name) VALUES ('Tênis Nike Air Max');
INSERT INTO tb_product (name) VALUES ('Kit de Maquiagem MAC');
INSERT INTO tb_product (name) VALUES ('Sofá Retrátil de Couro');
INSERT INTO tb_product (name) VALUES ('Bicicleta de Montanha Scott');
INSERT INTO tb_product (name) VALUES ('Livro "Cem Anos de Solidão"');
INSERT INTO tb_product (name) VALUES ('Vinho Tinto Reserva Cabernet Sauvignon');
INSERT INTO tb_product (name) VALUES ('Bolsa de Couro Louis Vuitton');
INSERT INTO tb_product (name) VALUES ('Smartwatch Apple Watch Series 7');
INSERT INTO tb_product (name) VALUES ('Ultrabook HP Spectre x360');
INSERT INTO tb_product (name) VALUES ('Blusa de Moletom Adidas');
INSERT INTO tb_product (name) VALUES ('Sapato Social Clarks');
INSERT INTO tb_product (name) VALUES ('Paleta de Sombras Urban Decay');
INSERT INTO tb_product (name) VALUES ('Cadeira de Escritório Ergonômica');
INSERT INTO tb_product (name) VALUES ('Mountain Bike Trek Fuel EX');
INSERT INTO tb_product (name) VALUES ('Livro "A Culpa é das Estrelas"');
INSERT INTO tb_product (name) VALUES ('Champagne Veuve Clicquot');
INSERT INTO tb_product (name) VALUES ('Mochila de Couro Michael Kors');
INSERT INTO tb_product (name) VALUES ('Fone de Ouvido Sony WH-1000XM4');
INSERT INTO tb_product (name) VALUES ('Tablet Apple iPad Pro');
INSERT INTO tb_product (name) VALUES ('Jaqueta de Couro Calvin Klein');
INSERT INTO tb_product (name) VALUES ('Sapatênis Ferracini');
INSERT INTO tb_product (name) VALUES ('Perfume Chanel N°5');
INSERT INTO tb_product (name) VALUES ('Tapete Persa de Seda');
INSERT INTO tb_product (name) VALUES ('Bola de Futebol Adidas Tango');
INSERT INTO tb_product (name) VALUES ('HQ Batman: O Cavaleiro das Trevas');
INSERT INTO tb_product (name) VALUES ('Whisky Johnnie Walker Black Label');
INSERT INTO tb_product (name) VALUES ('Óculos de Sol Ray-Ban');


INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 6);
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 7);
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 8);
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 9);
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 10);
INSERT INTO tb_product_category (product_id, category_id) VALUES (11, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (13, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (16, 6);
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 7);
INSERT INTO tb_product_category (product_id, category_id) VALUES (18, 8);
INSERT INTO tb_product_category (product_id, category_id) VALUES (19, 9);
INSERT INTO tb_product_category (product_id, category_id) VALUES (20, 10);
INSERT INTO tb_product_category (product_id, category_id) VALUES (21, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (22, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (23, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (24, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (25, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (26, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (27, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (28, 4);
INSERT INTO tb_product_category (product_id, category_id) VALUES (29, 5);
INSERT INTO tb_product_category (product_id, category_id) VALUES (30, 5);