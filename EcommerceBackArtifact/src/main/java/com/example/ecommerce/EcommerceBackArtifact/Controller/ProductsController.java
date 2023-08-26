package com.example.ecommerce.EcommerceBackArtifact.Controller;

import com.example.ecommerce.EcommerceBackArtifact.Dto.ProduitDto;
import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Service.ProductsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping(value = "/products/pc/getAllProducts", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Produit>> getAllPc() {
        List<Produit> produits = productsService.getAllProducts();
        return ok(produits);
    }

    @GetMapping(value = "/products/pc/getHomeProducts", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProduitDto>> getHomePc() {
        List<ProduitDto> produits = productsService.getHomeProducts(PageRequest.of(0,10));
        return ok(produits);
    }

    @GetMapping(value = "/products/pc/{pcId}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ProduitDto> getPcById(@PathVariable long pcId) throws Exception {
        ProduitDto produit = productsService.getProductsById(pcId);
        return ok(produit);
    }

    @GetMapping(value = "/products/pc/name/{pcName}", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProduitDto>> getPcByNameLike(@PathVariable String pcName) {
        List<ProduitDto> produits = productsService.getProductsByNameLike(pcName);
        log.info(pcName);
        System.out.println(pcName);
        return ok(produits);
    }

}
