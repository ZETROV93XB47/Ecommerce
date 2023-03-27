package com.example.ecommerce.EcommerceBackArtifact.Controller;

import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/products/pc/getAllProducts", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produit>> getAllPc() {
        List<Produit> produits = productsService.getAllProducts();
        return ok(produits);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/products/pc/getHomeProducts", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produit>> getHomePc() {
        List<Produit> produits = productsService.getHomeProducts(PageRequest.of(0,10));
        return ok(produits);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value = "/products/pc/{pcId}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Produit> getPcById(@PathVariable long pcId) throws Exception {
        Produit produit = productsService.getProductsById(pcId);
        return ok(produit);
    }

}
