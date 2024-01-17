package com.example.ecommerce.EcommerceBackArtifact.Model;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Category;
import com.example.ecommerce.EcommerceBackArtifact.Model.enums.DISPLAY_TYPE;
import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Marque;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Table(name = "produits")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId", nullable = false)
    private Long productId;

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
    private String photo;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "productDescription", nullable = false)
    private String description;

    @Column(name = "AssociatedOrderID")
    private Long associatedOrderID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "orderId")
    private Orders order;
}
