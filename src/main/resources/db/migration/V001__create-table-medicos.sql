CREATE TABLE medicos (
    id bigint identity(1,1) not null,
    nome NVARCHAR(100) not null,
    email NVARCHAR(100) not null unique,
    crm NVARCHAR(6) not null unique,
    especialidade NVARCHAR(100) not null,
    logradouro NVARCHAR(100) not null,
    bairro NVARCHAR(100) not null,
    cep VARCHAR(9) not null,
    complemento NVARCHAR(100),
    numero VARCHAR(20),
    uf CHAR(2) not null,
    cidade NVARCHAR(100) not null,
    
    primary key(id)
);