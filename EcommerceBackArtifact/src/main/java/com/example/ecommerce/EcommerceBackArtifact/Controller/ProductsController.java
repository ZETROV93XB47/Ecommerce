package com.example.ecommerce.EcommerceBackArtifact.Controller;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping(value = "/users/getAllProducts", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produit>> geAllUsers() {
        List<Produit> produits = productsService.getAllProducts();
        return ok(produits);
    }

    @GetMapping(value = "/products/pc/{pcId}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Produit> geAllUsers(@PathVariable long pcId) throws Exception {
        Produit produit = productsService.getProductsById(pcId);
        return ok(produit);
    }

}
