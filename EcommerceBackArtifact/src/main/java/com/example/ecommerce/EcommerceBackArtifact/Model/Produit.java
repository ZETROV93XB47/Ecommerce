package com.example.ecommerce.EcommerceBackArtifact.Model;

import com.example.ecommerce.EcommerceBackArtifact.Constants.Category;
import com.example.ecommerce.EcommerceBackArtifact.Constants.DISPLAY_TYPE;
import com.example.ecommerce.EcommerceBackArtifact.Constants.Marque;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_pt", nullable = false)
    private Long id;

    @Column(name = "Nom", nullable = false)
    private String name;

    @Column(name = "Prix", nullable = false)
    private float price;

    @Column(name = "Marque", nullable = false)
    private Marque brand;

    @Column(name = "Categorie", nullable = false)
    private Category category;

    @Column(name = "CPU", nullable = false)
    private String cpu;

    @Column(name = "GPU", nullable = false, columnDefinition = "char(50)")
    private String gpu;

    @Column(name = "RAM", nullable = false, columnDefinition = "char(50)")
    private String ram;

    @Column(name = "DD", nullable = false, columnDefinition = "char(50)")
    private String hardDrive;

    @Column(name = "SSD", nullable = false, columnDefinition = "char(50)")
    private String ssd;

    @Column(name = "Ecran")
    private DISPLAY_TYPE dalle;

    @Column(name = "Diagonale")
    private int diagonale;

    @Column(name = "OS", nullable = false, columnDefinition = "char(20)")
    private String os;

    @Column(name = "Connectivite")
    private String Connectivite;

    @Column(name = "Photo")
    private String photoPath;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "Description_Pt", nullable = false)
    private String description;

    /*
    	Nom VARCHAR(100) NOT NULL,
	Prix FLOAT NOT NULL,
	Marque Varchar(100) NOT NULL,
	Categorie Varchar(100) NOT NULL,
	CPU Varchar(100) NOT NULL,
    GPU Varchar(100) NOT NULL,
    RAM Varchar(100) NOT NULL,
    DD Varchar(100) NOT NULL,
    SSD Varchar(100),
    Ecran Varchar(100) NOT NULL,
    Diagonale INT NOT NULL,
    OS Varchar(100) NULL,
    Connectivite Varchar(100) NOT NULL,
    Photo Varchar(255) NOT NULL,
    Stock INT NOT NULL,
    Description_Pt Text,
	PRIMARY KEY (Id_pt)

    * */

}
