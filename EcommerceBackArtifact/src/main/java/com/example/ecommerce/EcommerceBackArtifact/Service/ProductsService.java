package com.example.ecommerce.EcommerceBackArtifact.Service;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Repository.ProductsRepository;
import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Data
@Service
@Transactional
public class ProductsService {

private final ProductsRepository productsRepository;

    public List<Produit> getAllProducts() {
        return productsRepository.findAll();
    }

    public Produit getProductsById(long pcId) throws Exception {
        Optional<Produit> pc = productsRepository.findById(pcId);
        return pc.orElseThrow(()-> new Exception("Id de pc inconnu"));
    }

}
