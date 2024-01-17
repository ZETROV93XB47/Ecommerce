package com.example.ecommerce.EcommerceBackArtifact.Dto;

import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Category;
import com.example.ecommerce.EcommerceBackArtifact.Model.enums.DISPLAY_TYPE;
import com.example.ecommerce.EcommerceBackArtifact.Model.enums.Marque;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProduitDto {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private float price;

    @JsonProperty
    private Marque brand;

    @JsonProperty
    private Category category;

    @JsonProperty
    private String cpu;

    @JsonProperty
    private String gpu;

    @JsonProperty
    private String ram;

    @JsonProperty
    private String hardDrive;

    @JsonProperty
    private String ssd;

    @JsonProperty
    private DISPLAY_TYPE dalle;

    @JsonProperty
    private int diagonale;

    @JsonProperty
    private String os;

    @JsonProperty
    private String Connectivite;

    @JsonProperty
    private String photo;

    @JsonProperty
    private int stock;

    @JsonProperty
    private String description;

}
