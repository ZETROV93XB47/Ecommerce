CREATE DATABASE IF NOT EXISTS novatech;

#DROP TABLE IF EXISTS Clients;
#DROP TABLE IF EXISTS Commandes;
#DROP TABLE IF EXISTS Produits;
#DROP TABLE IF EXISTS Details_cmd;

use novatech;


CREATE TABLE clients (
	Id_cl INT UNSIGNED AUTO_INCREMENT,
	Nom VARCHAR(100) NOT NULL,
    Prenom VARCHAR(100) NOT NULL,
	Sexe INT(1) NOT NULL,
    Adresse CHAR(100),
	Dt DATE,
    Email VARCHAR(100) UNIQUE NOT NULL,
	Mdp VARCHAR(100) NOT NULL,
	PRIMARY KEY (Id_cl)
    );


CREATE TABLE produits (
	Id_pt INT UNSIGNED NOT NULL,
	Nom VARCHAR(100) NOT NULL,
	Prix FLOAT NOT NULL,
	Marque INT NOT NULL,
	Categorie INT NOT NULL,
	CPU Varchar(100) NOT NULL,
    GPU Varchar(100) NOT NULL,
    RAM Varchar(100) NOT NULL,
    DD Varchar(100) NOT NULL,
    SSD Varchar(100),
    Ecran INT NOT NULL,
    Diagonale INT NOT NULL,
    OS Varchar(100) NULL,
    Connectivite Varchar(100) NOT NULL,
    Photo MEDIUMBLOB NOT NULL,
    Stock INT NOT NULL,
    Description_Pt Text,
	PRIMARY KEY (Id_pt)
    );


CREATE TABLE commandes (
	Id_cm INT UNSIGNED NOT NULL AUTO_INCREMENT,
	Id_client INT UNSIGNED NOT NULL,
	Dte DATETIME NOT NULL,
	PRIMARY KEY (Id_cm),

	CONSTRAINT fk_numero_client
	FOREIGN KEY (Id_client)
	REFERENCES clients(Id_cl)

    );


CREATE TABLE details_cmd(
    Id_li INT UNSIGNED NOT NULL AUTO_INCREMENT,
    CommandeID INT UNSIGNED NOT NULL,
    ProduitsID INT UNSIGNED NOT NULL,
    Quantite INT NOT NULL,
    PRIMARY KEY(Id_li),

    CONSTRAINT fk_commande_id
    FOREIGN KEY (CommandeID)
    REFERENCES commandes(Id_cm),

    CONSTRAINT fk_produits_id
    FOREIGN KEY (ProduitsID)
    REFERENCES produits(Id_pt)

    );



