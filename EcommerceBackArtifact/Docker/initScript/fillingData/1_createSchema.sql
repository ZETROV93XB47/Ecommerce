CREATE DATABASE IF NOT EXISTS novatech;

#DROP TABLE IF EXISTS clients;
#DROP TABLE IF EXISTS commandes;
#DROP TABLE IF EXISTS orders;
#DROP TABLE IF EXISTS produits;
#DROP TABLE IF EXISTS commandDetails;

use novatech;


CREATE TABLE clients (
	clientId INT UNSIGNED AUTO_INCREMENT,
	Nom VARCHAR(100) NOT NULL,
    Prenom VARCHAR(100) NOT NULL,
	Sexe INT(1) NOT NULL,
    Adresse CHAR(100),
	Dt DATE,
    Email VARCHAR(100) UNIQUE NOT NULL,
	Mdp VARCHAR(100) NOT NULL,
    Role INT(1) NOT NULL DEFAULT 1,
	PRIMARY KEY (clientId)
    );


    CREATE TABLE orders (
    	orderId INT UNSIGNED NOT NULL AUTO_INCREMENT,
    	clientId INT UNSIGNED NOT NULL,
    	orderDate DATE NOT NULL,

    	PRIMARY KEY (orderId),

    	CONSTRAINT fk_clientId
    	FOREIGN KEY (clientId)
    	REFERENCES clients(clientId)

        );


CREATE TABLE produits (
	productId INT UNSIGNED NOT NULL,
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
    Photo Varchar(100) NOT NULL,
    Stock INT NOT NULL,
    productDescription Text,
    AssociatedOrderID INT UNSIGNED,

	PRIMARY KEY (productId),

    CONSTRAINT fk_orderId
    FOREIGN KEY (AssociatedOrderID)
    REFERENCES orders(orderId)
    );


CREATE TABLE commandes (
	commandId INT UNSIGNED NOT NULL AUTO_INCREMENT,
	clientId INT UNSIGNED NOT NULL,
	Dte DATETIME NOT NULL,

	PRIMARY KEY (commandId),

	CONSTRAINT fk_numero_client
	FOREIGN KEY (clientId)
	REFERENCES clients(clientId)

    );


CREATE TABLE commandDetails(
    commandDetailsId INT UNSIGNED NOT NULL AUTO_INCREMENT,
    CommandeID INT UNSIGNED NOT NULL,
    ProduitsID INT UNSIGNED NOT NULL,
    Quantite INT NOT NULL,

    PRIMARY KEY(commandDetailsId),

    CONSTRAINT fk_commande_id
    FOREIGN KEY (CommandeID)
    REFERENCES commandes(commandId),

    CONSTRAINT fk_produits_id
    FOREIGN KEY (ProduitsID)
    REFERENCES produits(productId)

    );
