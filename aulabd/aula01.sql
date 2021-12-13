-- isso é um comentario

-- criar uma nova "Base de Dados"
create database bd_itau;

-- tem que marcar o bando de dados como padrao
use bd_itau;

-- criar uma nova tabela no bando de dados
-- (nome da coluna)(tipo de dados)(qualificadores)
-- not nul = esta coluna nao pode ser deixada em branco
-- auto_incremente = numeração sera gerada pelo proprio BD 1,2,3,4,5 ..
-- varchar campo de texto com tamanho maximo de x..
-- primary key chave primaria, identificador na tabela, nao pode repetir
-- constraint seria a regra / restrição

create table cliente (
codigo integer not null auto_increment,
nome varchar(120) not null,
telefone varchar(20),
constraint pk_cliente primary key(codigo)
);

-- CUIDADO!! APAGA A ESTRUTURA E TODOS OS DADOS
-- drop table cliente;

-- descrever os detalhes da tabela
desc cliente;

-- inserir dados na tabela
-- pra mudar a ordem > insert into cliente (codigo,nome,telefone) values()
-- pra adicionar varios de uma unica vez values (null, 'Carlos Silva', '(19)99172 -3013'), 
-- (null, 'Carlos Silva', '(19)99172 -3013'), (null, 'Carlos Silva', '(19)99172 -3013');

insert into cliente (codigo, nome, telefone) values(null, 'Carlos Silva', '(19)99172 -3013');
insert into cliente values(null, 'Dayana Silva', '(19)99172 -3333');
insert into cliente values(null, 'Gustavo Silva', '(19)99110 -7588');
insert into cliente values(null, 'Maria Eduarda Basilio', '(19)99553 -5055');

-- buscar (select) as informaçoes no banco de dados
-- select (quais colunas) from(qual tabela) where(qual condição)
-- buscar todas informações de todos os cliente
select * from cliente; 

-- buscar o nome e telefone do cliente com codigo 2 
select nome, telefone  -- busque apenas nome e telefone
from cliente   -- na tabela criada cliente
where codigo = 2;  -- onde o codigo seja igual a 2

-- apagando dado
-- apagar o cliente  que tem o codigo 2
delete from cliente where codigo = 2;

-- atualizar dados/ mudar alguma dado de algum cliente
update cliente set telefone = '(11) 999999-3009' where codigo = 3;

-- criar tabela veiculo
-- foreign key = chave estrangeira, ligar com outra tabela
-- references = indica com qual tabela e campo a ligação é feita
-- pk ou fk seria um nome pra tabela
create table veiculo(
codigo integer not null auto_increment,
marca varchar(20),
modelo varchar(40),
proprietario integer,
constraint pk_veiculo primary key(codigo),
constraint fk_veiculo foreign key(proprietario) references cliente(codigo)
);
-- inserir dados dos veiculos

insert into veiculo value(null, 'Toyota', 'Corolla', 1);
insert into veiculo value(null, 'Peugeot', 'Cactus', 1);
insert into veiculo value(null, 'Fiat', 'Pulse', 3);
insert into veiculo value(null, 'Ford', 'Ranger', 4);

select * from veiculo;

-- quais os nomes dos proprietarios de cada veiculos// vai puxar da outra tabela
-- inner join = junção das tabelas onde os campos sao iguais/consulta
-- on seria pra comparar codigo do proprietario é igual ao codigo do veiculo

select marca, modelo, nome 
from veiculo inner join cliente on veiculo.proprietario = cliente.codigo;

