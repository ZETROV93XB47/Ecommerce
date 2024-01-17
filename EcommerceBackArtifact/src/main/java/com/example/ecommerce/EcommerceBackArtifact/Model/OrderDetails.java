package com.example.ecommerce.EcommerceBackArtifact.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "commandes")
public class OrderDetails {

    @Id
    @Column(name = "comandId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "clientId")
    private Long clientId;

    @Column(name = "Dte", columnDefinition = "TIMESTAMP")
    private LocalDateTime orderDate;
}
