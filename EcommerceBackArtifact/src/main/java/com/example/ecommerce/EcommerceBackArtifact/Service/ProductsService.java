package com.example.ecommerce.EcommerceBackArtifact.Service;

import com.example.ecommerce.EcommerceBackArtifact.Dto.ProduitDto;
import com.example.ecommerce.EcommerceBackArtifact.Mappers.ProduitMapper;
import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import com.example.ecommerce.EcommerceBackArtifact.Repository.ProductsRepository;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
private final ProduitMapper produitMapper;

    public List<Produit> getAllProducts() {
        return productsRepository.findAll();
    }

    public List<ProduitDto> getHomeProducts(Pageable pageable) {

        Page<Produit> pagedResult = productsRepository.findAll(pageable);

        if(pagedResult.hasContent()) {
            return pagedResult
                    .getContent()
                    .stream()
                    .map(produitMapper::mapToProduitDto)
                    .toList();
        } else {
            return new ArrayList<>();
        }
    }

    public ProduitDto getProductsById(long pcId) throws Exception {
        Optional<Produit> pc = productsRepository.findById(pcId);
        return produitMapper.mapToProduitDto(pc.orElseThrow(()-> new Exception("Id de pc inconnu")));
    }

    public List<ProduitDto> getProductsByNameLike(String pcName) {
        List<Produit> produits = productsRepository.findByNameLike(pcName);
        return produits.stream().map(produitMapper::mapToProduitDto).toList();
    }

    //Avec le peu de pc dans la base, on ne devrait avoir qu'une seule occurence mais dans le rare cas où on pourrait en avoir pusieurs, on renvoie le premier, ce sera corrigé plus tard pour faire une recherche plus approfondie
    public ProduitDto getProductsByNameAndPrice(String name, long price) {
        List<Produit> produits = productsRepository.findByNameLikeAndPrice(name, price);
        return produits.stream().map(produitMapper::mapToProduitDto).toList().get(0);
    }

}
