package com.example.ecommerce.EcommerceBackArtifact.Repository;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Produit, Long> {

    @Query(value = "SELECT * FROM Produits WHERE Produits.Nom LIKE %:name%", nativeQuery = true)
    List<Produit> findByNameLike(@Param("name")String name);

    @Query(value = "SELECT * FROM Produits WHERE Produits.Nom LIKE %:name% AND Produits.Prix = :price", nativeQuery = true)
    List<Produit> findByNameLikeAndPrice(@Param("name")String name, @Param("price")long price);

}
