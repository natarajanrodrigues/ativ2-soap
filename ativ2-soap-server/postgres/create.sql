CREATE TABLE cliente (
  id bigint NOT NULL,
  cpf character varying(255),
  nome character varying(255),
  renda numeric(38,0),
  CONSTRAINT cliente_pkey PRIMARY KEY (id),
  CONSTRAINT cliente_cpf_key UNIQUE (cpf)
);

CREATE TABLE empresa (
  id bigint NOT NULL,
  nome character varying(255),
  CONSTRAINT empresa_pkey PRIMARY KEY (id)
);

CREATE TABLE hotel (
  id bigint NOT NULL,
  nome character varying(255),
  CONSTRAINT hotel_pkey PRIMARY KEY (id)
);

CREATE TABLE pacote (
  id bigint NOT NULL,
  idcliente bigint,
  reservahotel bigint,
  reservapassagem bigint,
  CONSTRAINT pacote_pkey PRIMARY KEY (id)
);

CREATE TABLE reservahotel(
  id bigint NOT NULL,
  cliente_id bigint,
  hotel_id bigint,
  CONSTRAINT reservahotel_pkey PRIMARY KEY (id)
);

CREATE TABLE reservapassagem (
  id bigint NOT NULL,
  cliente_id bigint,
  empresa_id bigint,
  CONSTRAINT reservapassagem_pkey PRIMARY KEY (id)
);