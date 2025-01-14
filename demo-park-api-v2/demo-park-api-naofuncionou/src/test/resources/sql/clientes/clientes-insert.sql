INSERT INTO USUARIOS (id, username, password, role)
	VALUES (100, 'ana@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_ADMIN');
	
INSERT INTO USUARIOS (id, username, password, role)
	VALUES (101, 'bia@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_CLIENTE');
	
INSERT INTO USUARIOS (id, username, password, role)
	VALUES (102, 'bob@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_CLIENTE');
	
INSERT INTO USUARIOS (id, username, password, role)
	VALUES (103, 'toby@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_CLIENTE');

	
INSERT INTO CLIENTES (id, nome, cpf, id_usuario)
	VALUES (10, 'Bianca Silva', '29956802077', 101);

INSERT INTO CLIENTES (id, nome, cpf, id_usuario)
	VALUES (20, 'Roberto Gomes', '55292558095', 102);