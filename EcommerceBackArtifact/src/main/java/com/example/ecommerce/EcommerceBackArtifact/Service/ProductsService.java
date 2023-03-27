package com.example.ecommerce.EcommerceBackArtifact.Service;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Repository.ProductsRepository;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    public List<Produit> getHomeProducts(Pageable pageable) {

        Page<Produit> pagedResult = productsRepository.findAll(pageable);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<>();
        }
    }

    public Produit getProductsById(long pcId) throws Exception {
        Optional<Produit> pc = productsRepository.findById(pcId);
        return pc.orElseThrow(()-> new Exception("Id de pc inconnu"));
    }

}
