package com.example.ecommerce.EcommerceBackArtifact.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@Table(name = "orders")
public class Orders {//childEntity

    @Id
    @Column(name = "orderId",  nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(name = "orderDate", columnDefinition = "DATE")
    private LocalDate orderDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Produit> productsList;

}