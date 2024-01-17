package com.example.ecommerce.EcommerceBackArtifact.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Commandes")
public class OrderDetails {

    @Id
    @Column(name = "Id_cm")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "Id_cl")
    private Long clientId;

    @Column(name = "Dte", columnDefinition = "TIMESTAMP")
    private LocalDateTime orderDate;
}
