INSERT INTO USUARIOS (id, username, password, role)
	VALUES (100, 'ana@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_ADMIN');
	
INSERT INTO USUARIOS (id, username, password, role)
	VALUES (101, 'bia@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_CLIENTE');
	
INSERT INTO USUARIOS (id, username, password, role)
	VALUES (102, 'bob@email.com', '$2a$12$1J55DCBcO98QRV7SPeCOguOYmoe4hvQzmC9XnH3BMSx0iyCp8nIOK', 'ROLE_CLIENTE');

INSERT INTO VAGAS(id, codigo, status) VALUES (10, 'A-01', 'LIVRE');
INSERT INTO VAGAS(id, codigo, status) VALUES (20, 'A-02', 'LIVRE');
INSERT INTO VAGAS(id, codigo, status) VALUES (30, 'A-03', 'OCUPADA');
INSERT INTO VAGAS(id, codigo, status) VALUES (40, 'A-04', 'LIVRE');