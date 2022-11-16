package com.example.ecommerce.EcommerceBackArtifact.Repository;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Produit, Long> {
}
