CREATE TABLE Furnizor (
  idFurnizor INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  denFurnizor TEXT NULL,
  adresaFurnizor TEXT NULL,
  adresaEmailFurnizor TEXT NULL,
  telefon TEXT NULL,
  PRIMARY KEY(idFurnizor)
);

CREATE TABLE Salariati (
  idSalariat INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  numeSalariat TEXT NULL,
  PRIMARY KEY(idSalariat)
);

CREATE TABLE Rol (
  idRol INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  numeRol INTEGER UNSIGNED NULL,
  PRIMARY KEY(idRol)
);

CREATE TABLE Clienti (
  idClient INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  numeClient TEXT NULL,
  adresa TEXT NULL,
  adresaEmailClient TEXT NULL,
  telefon TEXT NULL,
  PRIMARY KEY(idClient)
);

CREATE TABLE ClaseMateriale (
  idClaseMateriale INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  denumireClasaMateriale TEXT NULL,
  PRIMARY KEY(idClaseMateriale)
);

CREATE TABLE ComandaClienti (
  idComandaClient INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Clienti_idClient INTEGER UNSIGNED NOT NULL,
  dataComanda DATE NOT NULL,
  numeComanda TEXT NULL,
  valoareComanda INTEGER UNSIGNED NULL,
  dataRezolvareComanda DATE NULL,
  PRIMARY KEY(idComandaClient),
  INDEX ComandaClienti_FKIndex1(Clienti_idClient),
  FOREIGN KEY(Clienti_idClient)
    REFERENCES Clienti(idClient)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Useri (
  idUser INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Salariati_idSalariat INTEGER UNSIGNED NOT NULL,
  wUser TEXT NULL,
  wPassword VARCHAR(45) NULL,
  PRIMARY KEY(idUser),
  INDEX Useri_FKIndex1(Salariati_idSalariat),
  FOREIGN KEY(Salariati_idSalariat)
    REFERENCES Salariati(idSalariat)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE RolUser (
  idRolUser INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Useri_idUser INTEGER UNSIGNED NOT NULL,
  Rol_idRol INTEGER UNSIGNED NOT NULL,
  PRIMARY KEY(idRolUser),
  INDEX RolUser_FKIndex1(Rol_idRol),
  INDEX RolUser_FKIndex2(Useri_idUser),
  FOREIGN KEY(Rol_idRol)
    REFERENCES Rol(idRol)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Useri_idUser)
    REFERENCES Useri(idUser)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE LansareComanda (
  idLansareComanda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Salariati_idSalariat INTEGER UNSIGNED NOT NULL,
  ComandaClienti_idComandaClient INTEGER UNSIGNED NOT NULL,
  dataLansare DATE NULL,
  dataFinalizare DATE NULL,
  timpDeLucru INTEGER UNSIGNED NULL,
  valoareMateriale INTEGER UNSIGNED NULL,
  valoareManopera INTEGER UNSIGNED NULL,
  totalValoare INTEGER UNSIGNED NULL,
  PRIMARY KEY(idLansareComanda),
  INDEX LansareComanda_FKIndex1(ComandaClienti_idComandaClient),
  INDEX LansareComanda_FKIndex2(Salariati_idSalariat),
  FOREIGN KEY(ComandaClienti_idComandaClient)
    REFERENCES ComandaClienti(idComandaClient)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Salariati_idSalariat)
    REFERENCES Salariati(idSalariat)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE Materiale (
  idMaterial INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  ClaseMateriale_idClaseMateriale INTEGER UNSIGNED NOT NULL,
  Furnizor_idFurnizor INTEGER UNSIGNED NOT NULL,
  denMaterial TEXT NULL,
  pretUnitar INTEGER UNSIGNED NULL,
  intrariMaterial FLOAT NULL,
  iesiriMaterial FLOAT NULL,
  stocMaterial FLOAT NULL,
  dataIntrare DATE NULL,
  PRIMARY KEY(idMaterial),
  INDEX Materiale_FKIndex1(Furnizor_idFurnizor),
  INDEX Materiale_FKIndex2(ClaseMateriale_idClaseMateriale),
  FOREIGN KEY(Furnizor_idFurnizor)
    REFERENCES Furnizor(idFurnizor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(ClaseMateriale_idClaseMateriale)
    REFERENCES ClaseMateriale(idClaseMateriale)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE IntrariMateriale (
  idIntrariMateriale INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Materiale_idMaterial INTEGER UNSIGNED NOT NULL,
  Furnizor_idFurnizor INTEGER UNSIGNED NOT NULL,
  pretUnitar INTEGER UNSIGNED NULL,
  denMaterial TEXT NULL,
  cantitate FLOAT NULL,
  valoare FLOAT NULL,
  dataIntrare DATE NULL,
  PRIMARY KEY(idIntrariMateriale),
  INDEX IntrariMateriale_FKIndex1(Furnizor_idFurnizor),
  INDEX IntrariMateriale_FKIndex2(Materiale_idMaterial),
  FOREIGN KEY(Furnizor_idFurnizor)
    REFERENCES Furnizor(idFurnizor)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Materiale_idMaterial)
    REFERENCES Materiale(idMaterial)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE MaterialeComanda (
  idMaterialeComanda INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  Materiale_idMaterial INTEGER UNSIGNED NOT NULL,
  LansareComanda_idLansareComanda INTEGER UNSIGNED NOT NULL,
  cantitate FLOAT NULL,
  valoare FLOAT NULL,
  PRIMARY KEY(idMaterialeComanda),
  INDEX MaterialeComanda_FKIndex1(LansareComanda_idLansareComanda),
  INDEX MaterialeComanda_FKIndex2(Materiale_idMaterial),
  FOREIGN KEY(LansareComanda_idLansareComanda)
    REFERENCES LansareComanda(idLansareComanda)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Materiale_idMaterial)
    REFERENCES Materiale(idMaterial)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


