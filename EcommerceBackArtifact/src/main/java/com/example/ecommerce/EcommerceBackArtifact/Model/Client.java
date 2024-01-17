package com.example.ecommerce.EcommerceBackArtifact.Model;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Role;
import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Sexe;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "clients")
public class Client {//ParentEntity

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id_cl", nullable = false)
    private Long clientId;

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

    @Column(name = "Role", nullable = false)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Orders> orders;

}
