--Create Schema
CREATE SCHEMA geps;

--Criando tabela de usuarios

CREATE TABLE geps.usuarios
(
  id serial NOT NULL,
  nome character varying(255) NOT NULL,
  email character varying(255) NOT NULL,
  senha text NOT NULL,
  CONSTRAINT usuarios_pkey PRIMARY KEY (id),
  CONSTRAINT usuarios_email_key UNIQUE (email)
)
WITH (
  OIDS=FALSE
);

--Criando usuário admin. Você pode criar um outro usuário
INSERT INTO geps.usuarios(nome, email, senha) 
    VALUES ( 'Administrador', 'admin@minhaempresa.com', md5('admin'));

