package com.example.ecommerce.EcommerceBackArtifact.Mappers;

import com.example.ecommerce.EcommerceBackArtifact.Dto.ProduitDto;
import com.example.ecommerce.EcommerceBackArtifact.Model.Produit;
import org.springframework.stereotype.Component;

@Component
public class ProduitMapper {

    public ProduitDto mapToProduitDto(Produit produit) {
        return ProduitDto.builder()
                .id(produit.getId())
                .name(produit.getName())
                .gpu(produit.getGpu())
                .ssd(produit.getSsd())
                .Connectivite(produit.getConnectivite())
                .description(produit.getDescription())
                .hardDrive(produit.getHardDrive())
                .photo(produit.getPhoto())
                .stock(produit.getStock())
                .diagonale(produit.getDiagonale())
                .price(produit.getPrice())
                .dalle(produit.getDalle())
                .os(produit.getOs())
                .category(produit.getCategory())
                .ram(produit.getRam())
                .cpu(produit.getCpu())
                .brand(produit.getBrand())
                .build();
    }
}
