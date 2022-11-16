package com.example.ecommerce.EcommerceBackArtifact.Model;

import com.example.ecommerce.EcommerceBackArtifact.Constants.Sexe;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_cl", nullable = false)
    private Long id;

    @Column(name = "Email", nullable = false, columnDefinition = "char(50)")
    private String email;

    @Column(name = "Nom", columnDefinition = "char(15)")
    private String nom;

    @Column(name = "Prenom", columnDefinition = "char(15)")
    private String prenom;

    @Column(name = "Sexe", nullable = false)
    private Sexe sexe;

    @Column(name = "Adresse", columnDefinition = "char(50)")
    private String adresse;

    @Column(name = "Dt", columnDefinition = "DATE")
    private Date birthDate;

    @Column(name = "Mdp", columnDefinition = "char(36)")
    private String password;

}
